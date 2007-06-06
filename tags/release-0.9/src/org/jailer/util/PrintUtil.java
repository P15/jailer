/*
 * Copyright 2007 the original author or authors.
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

package org.jailer.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.jailer.datamodel.Table;


/**
 * Utility for printing.
 * 
 * @author Wisser
 */
public class PrintUtil {
    
    /**
     * Converts a set of tables into a string.
     * 
     * @param tables the set
     */
    public static String tableSetAsString(Set<Table> tables) {
        return tableSetAsString(tables, "      ");
    }
    
    /**
     * Converts a set of tables into a string.
     * 
     * @param tables the set
     */
    public static String tableSetAsString(Set<Table> tables, String linePrefix) {
        List<String> tableNames = new ArrayList<String>();
        for (Table table: tables) {
            tableNames.add(table.getName());
        }
        Collections.sort(tableNames);
        StringBuffer str = new StringBuffer();
        str.append(" { ");
        int i = 1;
        for (String tableName: tableNames) {
            if (i > 1) {
                str.append(", ");
            }
            if (i % 5 == 0 && linePrefix != null) {
                str.append("\n" + linePrefix);
            }
            str.append(tableName);
            ++i;
        }
        str.append(" }");
        return str.toString();
    }

}
