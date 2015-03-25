/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationviewerpg3;

import java.awt.Component;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *.
 * @author Rowan
 */
public class CreateGUI extends javax.swing.JFrame {

    /**
     * Creates new form CreateGUI
     */
    private JFileChooser fileChoose;
    private Component emptyLabel;
    private Component frame;
    
    public CreateGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        sequencePane = new javax.swing.JScrollPane();
        proteinSequenceArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        nucleotideSequenceArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        proteinSequenceArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileChooser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        closeViewer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sequencePane.setBackground(new java.awt.Color(255, 255, 255));

        proteinSequenceArea1.setColumns(20);
        proteinSequenceArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        proteinSequenceArea1.setRows(3);
        sequencePane.setViewportView(proteinSequenceArea1);

        nucleotideSequenceArea.setColumns(20);
        nucleotideSequenceArea.setRows(2);
        jScrollPane2.setViewportView(nucleotideSequenceArea);

        proteinSequenceArea2.setColumns(20);
        proteinSequenceArea2.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        proteinSequenceArea2.setRows(3);
        jScrollPane4.setViewportView(proteinSequenceArea2);

        jMenu1.setText("File");

        fileChooser.setText("Show File Manager ...");
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        jMenu1.add(fileChooser);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Save Entry Into Database");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu9.setText("Save All Entries As");

        jMenuItem1.setText("FASTA File");
        jMenu9.add(jMenuItem1);

        jMenuItem2.setText("GFF File");
        jMenu9.add(jMenuItem2);

        jMenuItem10.setText("Genbank File");
        jMenu9.add(jMenuItem10);

        jMenu1.add(jMenu9);

        jMenuItem9.setText("Preferences");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        closeViewer.setText("Close");
        closeViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeViewerActionPerformed(evt);
            }
        });
        jMenu1.add(closeViewer);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Undo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Redo");
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator2);

        jMenuItem7.setText("Delete Selected Annotations");
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator4);

        jMenuItem8.setText("Create Annotation");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        jMenuItem11.setText("Only Selected Annotations");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Only Non Selected Annotations");
        jMenu3.add(jMenuItem12);
        jMenu3.add(jSeparator3);

        jMenuItem13.setText("Annotation Statistics");
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("BLAST");

        jMenuItem14.setText("Run BLAST With Current Sequence");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuItem15.setText("Open Help Document");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(sequencePane)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sequencePane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        File selectedFile;
        int reply;
        BufferedReader inFile;
        String line;
        String sequence = "";
        fileChoose = new JFileChooser();
        boolean seqStart = false;
        reply = fileChoose.showOpenDialog(this);
        if (reply == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChoose.getSelectedFile();
            String fileName = selectedFile.getAbsolutePath();
            try {
                inFile = new BufferedReader(new FileReader(fileName));
                
                    while ((line = inFile.readLine()) != null) {                      
                        if (seqStart == true){
                            sequence = sequence + line;
                        }
                        if (line.contains(">") == true){
                            seqStart = true;
                        }
                    }
                inFile.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) {
                    Logger.getLogger(CreateGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            String firstFrameProtein = Sequence.getTranslation(sequence);
            String secondFrameSequence = sequence.substring(1, sequence.length());
            String secondFrameProtein = Sequence.getTranslation(secondFrameSequence);
            String thirdFrameSequence = sequence.substring(2, sequence.length());
            String thirdFrameProtein = Sequence.getTranslation(thirdFrameSequence);
            String complementSeq = DNA.getComplement(sequence);
            //String complementSeq = sequence.replace("A", "1");
//            complementSeq = complementSeq.replace("G", "2");
//            complementSeq = complementSeq.replace("T", "A");
//            complementSeq = complementSeq.replace("C", "G");
//            complementSeq = complementSeq.replace("1", "T");
//            complementSeq = complementSeq.replace("2", "C");
            proteinSequenceArea1.setText(firstFrameProtein + "\n" + secondFrameProtein + "\n" + thirdFrameProtein);
            nucleotideSequenceArea.setText(sequence + "\n" + complementSeq);
            proteinSequenceArea2.setText(new StringBuilder(firstFrameProtein).reverse().toString() + "\n" + new StringBuilder(secondFrameProtein).reverse().toString() + "\n" + new StringBuilder(thirdFrameProtein).reverse().toString());
        }
    
    }//GEN-LAST:event_fileChooserActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
     
        String selectedSeq = proteinSequenceArea1.getSelectedText();
        System.out.println(selectedSeq);
        if (selectedSeq == null){
            selectedSeq = proteinSequenceArea2.getSelectedText();
        }
        System.out.println(selectedSeq);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void closeViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeViewerActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeViewerActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        JOptionPane.showMessageDialog(frame,
        "Raadpleeg de manual!",
        "Help",
        JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeViewer;
    private javax.swing.JMenuItem fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea nucleotideSequenceArea;
    private javax.swing.JTextArea proteinSequenceArea1;
    private javax.swing.JTextArea proteinSequenceArea2;
    private javax.swing.JScrollPane sequencePane;
    // End of variables declaration//GEN-END:variables
}
