/*
 * Copyright 2007 - 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.jailer.entitygraph.local;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jailer.database.Session;
import net.sf.jailer.database.StatementBuilder;
import net.sf.jailer.util.SqlUtil;

/**
 * Reads {@link ResultSet}s and builds inline-views according to the content.
 * 
 * @author Ralf Wisser
 */
public abstract class InlineViewBuilder implements Session.ResultSetReader {

	/**
	 * The Style.
	 */
	private final InlineViewStyle style;

	public static final String DEFAULT_NAME = "JAILER_IV";

	private static final int MAX_SIZE = 35;

	/**
	 * The name of the Inline-View.
	 */
	protected final String name;

	private final StatementBuilder statementBuilder;

	protected ResultSetMetaData resultSetMetaData = null;

	protected Map<Integer, Integer> typeCache = new HashMap<Integer, Integer>();

	protected final Session session;

	protected final String[] columnNames;
	
	/**
	 * Constructor.
	 * 
	 * @param style
	 *            the style
	 * @param name
	 *            the name
	 * @param columnNames 
	 */
	public InlineViewBuilder(InlineViewStyle style, String name, Session session, String[] columnNames) {
		this.name = name;
		this.style = style;
		this.session = session;
		this.columnNames = columnNames;
		statementBuilder = new StatementBuilder(MAX_SIZE);
	}

	/**
	 * Creates an {@link InlineViewBuilder} with DEFAULT_NAME.
	 * 
	 * @param style
	 *            the style
	 */
	public InlineViewBuilder(InlineViewStyle style, Session session, String[] columnNames) {
		this(style, DEFAULT_NAME, session, columnNames);
	}

	@Override
	public void readCurrentRow(ResultSet resultSet) throws SQLException {
		if (resultSetMetaData == null) {
			resultSetMetaData = resultSet.getMetaData();
		}

		String values[] = new String[resultSetMetaData.getColumnCount()];
		for (int i = 1; i <= resultSetMetaData.getColumnCount(); ++i) {
			values[i - 1] = sqlValue(resultSet, i);
		}
		
		String head = style.head(resultSet, resultSetMetaData, values, columnNames);
		
		if (!statementBuilder.isAppendable(head)) {
			process(statementBuilder.build());
		}

		String item = style.item(resultSet, resultSetMetaData, values, columnNames, statementBuilder.size());
		statementBuilder.append(
				head,
				item,
				style.separator(resultSet, resultSetMetaData),
				style.terminator(resultSet, resultSetMetaData, name, columnNames));
	}

	protected String sqlValue(ResultSet resultSet, int i) throws SQLException {
		return SqlUtil.toSql(SqlUtil.getObject(resultSet, resultSetMetaData, i, typeCache), session);
	}

	@Override
	public void close() throws SQLException {
		if (!statementBuilder.isEmpty()) {
			process(statementBuilder.build());
		}
	}

	/**
	 * Processes the inline-view
	 * @param inlineView the inline-view
	 */
	protected abstract void process(String inlineView) throws SQLException;

}
