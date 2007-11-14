/*
 * RestrictionEditor.java
 *
 * Created on 14. November 2007, 13:29
 */

package org.jailer.ui;

/**
 *
 * @author  wisser
 */
public class RestrictionEditor extends javax.swing.JPanel {
    
    /** Creates new form RestrictionEditor */
    public RestrictionEditor() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Erzeugter Quelltext ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cardinality = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ignore = new javax.swing.JCheckBox();
        restriction = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        apply = new javax.swing.JButton();
        jump = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        joinCondition = new javax.swing.JTextArea();
        source = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        cardinality.setFont(new java.awt.Font("Dialog", 0, 12));
        cardinality.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(cardinality, gridBagConstraints);

        jLabel5.setText("Cardinality  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel5, gridBagConstraints);

        description.setText("Source (A)  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(description, gridBagConstraints);

        jLabel2.setText("Restricted by  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel2, gridBagConstraints);

        ignore.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ignore.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ignore.setText("ignore");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(ignore, gridBagConstraints);

        restriction.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(restriction, gridBagConstraints);

        apply.setText("apply");
        jPanel1.add(apply);

        jump.setText("select B");
        jPanel1.add(jump);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(jPanel1, gridBagConstraints);

        jLabel1.setText("Join Condition  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel1, gridBagConstraints);

        joinCondition.setColumns(20);
        joinCondition.setEditable(false);
        joinCondition.setLineWrap(true);
        joinCondition.setRows(5);
        joinCondition.setText("1111\n222\n333\n");
        joinCondition.setWrapStyleWord(true);
        jScrollPane1.setViewportView(joinCondition);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jScrollPane1, gridBagConstraints);

        source.setFont(new java.awt.Font("Dialog", 0, 12));
        source.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(source, gridBagConstraints);

        jLabel4.setText("Destination (B)  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel4, gridBagConstraints);

        destination.setFont(new java.awt.Font("Dialog", 0, 12));
        destination.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(destination, gridBagConstraints);

        jLabel8.setText("Type  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel8, gridBagConstraints);

        type.setFont(new java.awt.Font("Dialog", 0, 12));
        type.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(type, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variablendeklaration - nicht modifizieren//GEN-BEGIN:variables
    public javax.swing.JButton apply;
    public javax.swing.JLabel cardinality;
    public javax.swing.JLabel description;
    public javax.swing.JLabel destination;
    public javax.swing.JCheckBox ignore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea joinCondition;
    public javax.swing.JButton jump;
    public javax.swing.JTextField restriction;
    public javax.swing.JLabel source;
    public javax.swing.JLabel type;
    // Ende der Variablendeklaration//GEN-END:variables
    
}
