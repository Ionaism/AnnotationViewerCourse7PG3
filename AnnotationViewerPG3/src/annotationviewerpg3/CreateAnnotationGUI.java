package annotationviewerpg3;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *This class functions to create the interface that allows the user to create annotations. Functions of all the buttons and fields in this interface are defined in this class.
 */
public class CreateAnnotationGUI extends javax.swing.JFrame {

    /**
     * Creates new form GeneGUI
     */
    private static String selectedSeq;
    Component frame = null;
    
    public CreateAnnotationGUI(String seq) {
        /*
         *This function initiates the creation of the GUI.
         */
        this.selectedSeq = seq;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAnnotationButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        selectSeqLabel = new javax.swing.JLabel();
        annotationDropDown = new javax.swing.JComboBox();
        selectTypeLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        annotationSequenceField = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        annotationNameField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addAnnotationButton.setText("Add the annotation");
        addAnnotationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnnotationButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name the annotation:");

        selectSeqLabel.setText("The selected sequence:");

        annotationDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gene", "Chromosome" }));

        selectTypeLabel.setText("Select the type of annotation:");

        annotationSequenceField.setColumns(20);
        annotationSequenceField.setRows(5);
        jScrollPane3.setViewportView(annotationSequenceField);
        annotationSequenceField.setText(selectedSeq);

        annotationNameField.setColumns(20);
        annotationNameField.setRows(5);
        jScrollPane1.setViewportView(annotationNameField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(selectTypeLabel)
                            .addComponent(annotationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSeqLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(addAnnotationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(selectTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annotationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(selectSeqLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(addAnnotationButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAnnotationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnnotationButtonActionPerformed
        /*
         *This function takes the annotation type, name and sequence input from the user and sends it back to the main GUI.
         */
        String annotationSeq = annotationSequenceField.getText();
        if (annotationSeq.matches("[ARNDCEQGHILKMFPSTWYV*]+")){
            String annotationType = (String) annotationDropDown.getSelectedItem();
            String annotationName = annotationNameField.getText();
            CreateGUI.createAnnotation(annotationSeq, annotationType, annotationName);
            dispose();
        }
        else {
        JOptionPane.showMessageDialog(frame,
                "This is not a valid protein sequence!",
                "Annotation Sequence Error",
                JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_addAnnotationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAnnotationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAnnotationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAnnotationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAnnotationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAnnotationGUI(selectedSeq).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnnotationButton;
    private javax.swing.JComboBox annotationDropDown;
    private javax.swing.JTextArea annotationNameField;
    private javax.swing.JTextArea annotationSequenceField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel selectSeqLabel;
    private javax.swing.JLabel selectTypeLabel;
    // End of variables declaration//GEN-END:variables
}
