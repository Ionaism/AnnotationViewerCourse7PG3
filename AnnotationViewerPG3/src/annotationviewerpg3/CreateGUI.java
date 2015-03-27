
package annotationviewerpg3;

import java.awt.Component;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *This class functions to create the main interface of the application. Functions of all the buttons and fields in this interface are defined in this class.
 */
public class CreateGUI extends javax.swing.JFrame {

    private JFileChooser fileChoose;
    private Component frame;

    public CreateGUI() {
        /*
         *This function initiates the creation of the GUI.
         */
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
        annotationPanel = new javax.swing.JScrollPane();
        annotationArea = new javax.swing.JTextArea();
        sequencePane = new javax.swing.JScrollPane();
        proteinSequenceArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        nucleotideSequenceArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        proteinSequenceArea2 = new javax.swing.JTextArea();
        annotationPanelToggle = new javax.swing.JToggleButton();
        proteinAreaToggle = new javax.swing.JToggleButton();
        nucleotideAreaToggle = new javax.swing.JToggleButton();
        hoverBar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileChooser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        saveEntryDatabase = new javax.swing.JMenuItem();
        saveEntryOptions = new javax.swing.JMenu();
        saveFASTA = new javax.swing.JMenuItem();
        saveGFF = new javax.swing.JMenuItem();
        saveGenbank = new javax.swing.JMenuItem();
        preferences = new javax.swing.JMenuItem();
        closeViewer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        undoAction = new javax.swing.JMenuItem();
        redoAction = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        deleteSelAnnotations = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        createAnnotation = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        viewSelAnnotations = new javax.swing.JMenuItem();
        viewNonSelAnnotations = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        highlightSeqGC = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        useBLAST = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        openHelp = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Annotation Viewer PG3");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        annotationArea.setColumns(20);
        annotationArea.setRows(5);
        annotationArea.setText("Annotation Type - Annotation Name - Annotation Sequence\n---------------------------------------------------------------------------------------------");
        annotationArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                annotationAreaMouseMoved(evt);
            }
        });
        annotationArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                annotationAreaMouseEntered(evt);
            }
        });
        annotationPanel.setViewportView(annotationArea);

        sequencePane.setBackground(new java.awt.Color(255, 255, 255));

        proteinSequenceArea1.setColumns(20);
        proteinSequenceArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        proteinSequenceArea1.setRows(3);
        proteinSequenceArea1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                proteinSequenceArea1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proteinSequenceArea1MouseMoved(evt);
            }
        });
        proteinSequenceArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proteinSequenceArea1MouseClicked(evt);
            }
        });
        sequencePane.setViewportView(proteinSequenceArea1);

        nucleotideSequenceArea.setColumns(20);
        nucleotideSequenceArea.setRows(2);
        nucleotideSequenceArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nucleotideSequenceAreaMouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(nucleotideSequenceArea);

        proteinSequenceArea2.setColumns(20);
        proteinSequenceArea2.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        proteinSequenceArea2.setRows(3);
        proteinSequenceArea2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proteinSequenceArea2MouseMoved(evt);
            }
        });
        jScrollPane4.setViewportView(proteinSequenceArea2);

        annotationPanelToggle.setText("Toggle");
        annotationPanelToggle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                annotationPanelToggleMouseMoved(evt);
            }
        });
        annotationPanelToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annotationPanelToggleActionPerformed(evt);
            }
        });

        proteinAreaToggle.setText("Toggle");
        proteinAreaToggle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proteinAreaToggleMouseMoved(evt);
            }
        });
        proteinAreaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinAreaToggleActionPerformed(evt);
            }
        });

        nucleotideAreaToggle.setText("Toggle");
        nucleotideAreaToggle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nucleotideAreaToggleMouseMoved(evt);
            }
        });
        nucleotideAreaToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nucleotideAreaToggleActionPerformed(evt);
            }
        });

        hoverBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hoverBar.setBorder(null);
        hoverBar.setOpaque(false);

        jMenu1.setText("File");

        fileChooser.setText("Show File Manager ...");
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        jMenu1.add(fileChooser);
        jMenu1.add(jSeparator1);

        saveEntryDatabase.setText("Save Entry Into Database");
        saveEntryDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEntryDatabaseActionPerformed(evt);
            }
        });
        jMenu1.add(saveEntryDatabase);

        saveEntryOptions.setText("Save All Entries As");

        saveFASTA.setText("FASTA File");
        saveFASTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFASTAActionPerformed(evt);
            }
        });
        saveEntryOptions.add(saveFASTA);

        saveGFF.setText("GFF File");
        saveGFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGFFActionPerformed(evt);
            }
        });
        saveEntryOptions.add(saveGFF);

        saveGenbank.setText("Genbank File");
        saveGenbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGenbankActionPerformed(evt);
            }
        });
        saveEntryOptions.add(saveGenbank);

        jMenu1.add(saveEntryOptions);

        preferences.setText("Preferences");
        preferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesActionPerformed(evt);
            }
        });
        jMenu1.add(preferences);

        closeViewer.setText("Close");
        closeViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeViewerActionPerformed(evt);
            }
        });
        jMenu1.add(closeViewer);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        undoAction.setText("Undo");
        undoAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionActionPerformed(evt);
            }
        });
        jMenu2.add(undoAction);

        redoAction.setText("Redo");
        redoAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionActionPerformed(evt);
            }
        });
        jMenu2.add(redoAction);
        jMenu2.add(jSeparator2);

        deleteSelAnnotations.setText("Delete Selected Annotations");
        deleteSelAnnotations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelAnnotationsActionPerformed(evt);
            }
        });
        jMenu2.add(deleteSelAnnotations);
        jMenu2.add(jSeparator4);

        createAnnotation.setText("Create Annotation");
        createAnnotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAnnotationActionPerformed(evt);
            }
        });
        jMenu2.add(createAnnotation);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        viewSelAnnotations.setText("Only Selected Annotations");
        viewSelAnnotations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSelAnnotationsActionPerformed(evt);
            }
        });
        jMenu3.add(viewSelAnnotations);

        viewNonSelAnnotations.setText("Only Non Selected Annotations");
        viewNonSelAnnotations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNonSelAnnotationsActionPerformed(evt);
            }
        });
        jMenu3.add(viewNonSelAnnotations);
        jMenu3.add(jSeparator3);

        highlightSeqGC.setText("Calculate GC% of Highlighted Nucleotide Sequence");
        highlightSeqGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highlightSeqGCActionPerformed(evt);
            }
        });
        jMenu3.add(highlightSeqGC);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("BLAST");

        useBLAST.setText("Run BLAST");
        useBLAST.setToolTipText("");
        useBLAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useBLASTActionPerformed(evt);
            }
        });
        jMenu4.add(useBLAST);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        openHelp.setText("Open Help Document");
        openHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openHelpActionPerformed(evt);
            }
        });
        jMenu5.add(openHelp);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sequencePane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annotationPanel)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proteinAreaToggle)
                    .addComponent(nucleotideAreaToggle)
                    .addComponent(annotationPanelToggle))
                .addContainerGap())
            .addComponent(hoverBar, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annotationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(annotationPanelToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(sequencePane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proteinAreaToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nucleotideAreaToggle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoverBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        /*
         *This function allows the user to load in a FASTA file containing a nucleotide sequence. The sequence is then read from the file,
         *and translated to a protein sequence in 6 frames by usage of the getTranslation function in the Sequence class. These protein 
         *sequences, and the nucleotide sequence, are made visible in text areas in the GUI.
         */
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
                    if (seqStart == true) {
                        sequence = sequence + line;
                    }
                    if (line.contains(">") == true) {
                        seqStart = true;
                    }
                }
                inFile.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CreateGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            String firstFrameProtein = Sequence.getTranslation(sequence);
            String secondFrameSequence = sequence.substring(1, sequence.length());
            String secondFrameProtein = Sequence.getTranslation(secondFrameSequence);
            String thirdFrameSequence = sequence.substring(2, sequence.length());
            String thirdFrameProtein = Sequence.getTranslation(thirdFrameSequence);
            String complementSeq = DNA.getComplement(sequence);
            proteinSequenceArea1.setText(firstFrameProtein + "\n" + secondFrameProtein + "\n" + thirdFrameProtein);
            nucleotideSequenceArea.setText(sequence + "\n" + complementSeq);
            proteinSequenceArea2.setText(new StringBuilder(firstFrameProtein).reverse().toString() + "\n" + new StringBuilder(secondFrameProtein).reverse().toString() + "\n" + new StringBuilder(thirdFrameProtein).reverse().toString());
        }

    }//GEN-LAST:event_fileChooserActionPerformed

    private void saveEntryDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEntryDatabaseActionPerformed
        /*
         *This function will allow the user to save the currently viewed sequence in the database, along with the created annotations.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Save Entries into Database",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_saveEntryDatabaseActionPerformed

    private void preferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferencesActionPerformed
        /*
         *This function will allow the user to alter his or her preferences for the application.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Preferences",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_preferencesActionPerformed

    private void undoActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionActionPerformed
        /*
         *This function will allow the user to undo his or her last action.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Undo Action",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_undoActionActionPerformed

    private void createAnnotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAnnotationActionPerformed
        /*
         *This function allows the user to create an annotation, by way of a seperate GUI. If a part of a protein sequence is highlighted in 
         *the designated text areas, this sequence will be automatically filled in in this GUI.
         */
        String selectedSeq = proteinSequenceArea1.getSelectedText();
        if (selectedSeq == null) {
            selectedSeq = proteinSequenceArea2.getSelectedText();
        }
        new CreateAnnotationGUI(selectedSeq).setVisible(true);
    }//GEN-LAST:event_createAnnotationActionPerformed

    private void viewSelAnnotationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSelAnnotationsActionPerformed
        /*
         *This function will allow the user to only view the selected annotations.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "View Selected Annotations",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewSelAnnotationsActionPerformed

    private void closeViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeViewerActionPerformed
        /*
         *This function allows the user to close the application.
         */
        System.exit(0);
    }//GEN-LAST:event_closeViewerActionPerformed

    private void openHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openHelpActionPerformed
        /*
         *This function allows the user to read the help file.
         */
        JOptionPane.showMessageDialog(frame,
                "Read the manual!",
                "Help",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_openHelpActionPerformed

    private void highlightSeqGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highlightSeqGCActionPerformed
        /*
         *This function allows the user to calculate the GC% of a highlighted part of the nucleotide sequence in the designated text area.
         */
        try {
            String highlightSeq = (nucleotideSequenceArea.getSelectedText()).toUpperCase();
            if (highlightSeq.matches("[ATGC]+") == true){
                float gcCount = (highlightSeq.length() - highlightSeq.replace("G", "").length()) + (highlightSeq.length() - highlightSeq.replace("C", "").length());
                float atCount = (highlightSeq.length() - highlightSeq.replace("A", "").length()) + (highlightSeq.length() - highlightSeq.replace("T", "").length());
                float totalCount = gcCount + atCount;
                float gcPerc = (gcCount / totalCount)*100;
                JOptionPane.showMessageDialog(frame,
                        "GC Percentage of Selected Sequence: " + gcPerc + "%",
                        "GC Percentage",
                        JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(frame,
                    "This is not a valid nucleotide sequence.",
                    "Error Message",
                    JOptionPane.PLAIN_MESSAGE);
            }
        }
        catch (NullPointerException ex){
            JOptionPane.showMessageDialog(frame,
                    "Please highlight a nucleotide sequence.",
                    "Error Message",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_highlightSeqGCActionPerformed

    private void useBLASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useBLASTActionPerformed
        /*
         *This function allows the user to BLAST their sequence.
         */
        try {
            
         String url = "http://blast.ncbi.nlm.nih.gov/Blast.cgi";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_useBLASTActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        /*
        We have no idea why this function exists, but we can't remove it so, so we dealt with it.
        */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Redo Action",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void deleteSelAnnotationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelAnnotationsActionPerformed
        /*
         *This function will allow the user to delete all selected annotations.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Delete Selected Annotations",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_deleteSelAnnotationsActionPerformed


    private void proteinAreaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinAreaToggleActionPerformed
        /*
         *This function allows the user to remove or add the text areas containing the protein sequences from view.
         */
        if (proteinSequenceArea1.isVisible() == true){
            proteinSequenceArea1.setVisible(false);
            proteinSequenceArea2.setVisible(false);
        }
        else {
            proteinSequenceArea1.setVisible(true);
            proteinSequenceArea2.setVisible(true);
        } 
    }//GEN-LAST:event_proteinAreaToggleActionPerformed

    private void nucleotideAreaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nucleotideAreaToggleActionPerformed
        /*
         *This function allows the user to remove or add the text area containing the nucleotide sequences from view.
         */
        if (nucleotideSequenceArea.isVisible() == true){
            nucleotideSequenceArea.setVisible(false);
        }
        else {
            nucleotideSequenceArea.setVisible(true);
        }
    }//GEN-LAST:event_nucleotideAreaToggleActionPerformed

    private void viewNonSelAnnotationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNonSelAnnotationsActionPerformed
        /*
         *This function will allow the user to only view the annotations that are not selected.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "View Non Selected Annotations",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewNonSelAnnotationsActionPerformed

    private void saveFASTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFASTAActionPerformed
        /*
         *This function will allow the user to save sequences in a FASTA file format.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Save as FASTA",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_saveFASTAActionPerformed

    private void saveGFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGFFActionPerformed
        /*
         *This function will allow the user to save sequences in a GFF file format.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Save as GFF",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_saveGFFActionPerformed

    private void saveGenbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGenbankActionPerformed
        /*
         *This function will allow the user to save sequences in a Genbank file format.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Save as Genbank",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_saveGenbankActionPerformed

    private void redoActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionActionPerformed
        /*
         *This function will allow the user to redo an action that was undone previously.
         */
        JOptionPane.showMessageDialog(frame,
                "Buy the full version to use this feature!",
                "Redo Action",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_redoActionActionPerformed

    private void annotationPanelToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annotationPanelToggleActionPerformed
        /*
         *This function allows the user to remove or add the text area containing the annotations from view.
         */
        if (annotationArea.isVisible() == true){
            annotationArea.setVisible(false);
        }
        else {
            annotationArea.setVisible(true);
        }
    }//GEN-LAST:event_annotationPanelToggleActionPerformed

    
    // set information to hoverBar 
    private void proteinSequenceArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinSequenceArea1MouseClicked

    }//GEN-LAST:event_proteinSequenceArea1MouseClicked

    private void proteinSequenceArea1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinSequenceArea1MouseDragged
        hoverBar.setText("select sequence and click create annotation");
    }//GEN-LAST:event_proteinSequenceArea1MouseDragged

    private void annotationAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annotationAreaMouseEntered
        hoverBar.setText("");
    }//GEN-LAST:event_annotationAreaMouseEntered

    private void annotationPanelToggleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annotationPanelToggleMouseMoved
        hoverBar.setText("Toggle gene information");
    }//GEN-LAST:event_annotationPanelToggleMouseMoved

    private void proteinAreaToggleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinAreaToggleMouseMoved
        hoverBar.setText("Toggle sequence information");
    }//GEN-LAST:event_proteinAreaToggleMouseMoved

    private void nucleotideAreaToggleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nucleotideAreaToggleMouseMoved
        hoverBar.setText("Toggle sequence information");
    }//GEN-LAST:event_nucleotideAreaToggleMouseMoved

    private void proteinSequenceArea1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinSequenceArea1MouseMoved
        hoverBar.setText("select sequence and click create annotation");
    }//GEN-LAST:event_proteinSequenceArea1MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        hoverBar.setText("");
    }//GEN-LAST:event_formMouseMoved

    private void proteinSequenceArea2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proteinSequenceArea2MouseMoved
        hoverBar.setText("select sequence and click create annotation");
    }//GEN-LAST:event_proteinSequenceArea2MouseMoved

    private void nucleotideSequenceAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nucleotideSequenceAreaMouseMoved
        hoverBar.setText("sequence");
    }//GEN-LAST:event_nucleotideSequenceAreaMouseMoved

    private void annotationAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annotationAreaMouseMoved
        hoverBar.setText("Gene annotation");
    }//GEN-LAST:event_annotationAreaMouseMoved
    //end information hoverBar
    
    public static void createAnnotation(String annotationSeq, String annotationType, String annotationName){
        /*
         *This function adds the created annotations (that were created in a seperate GUI) to the main GUI, in a text area.
         */
        annotationArea.append("\n" + annotationType + " - " + annotationName + " - " + annotationSeq);
    }

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
    private static javax.swing.JTextArea annotationArea;
    private javax.swing.JScrollPane annotationPanel;
    private javax.swing.JToggleButton annotationPanelToggle;
    private javax.swing.JMenuItem closeViewer;
    private javax.swing.JMenuItem createAnnotation;
    private javax.swing.JMenuItem deleteSelAnnotations;
    private javax.swing.JMenuItem fileChooser;
    private javax.swing.JMenuItem highlightSeqGC;
    private javax.swing.JTextField hoverBar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToggleButton nucleotideAreaToggle;
    private javax.swing.JTextArea nucleotideSequenceArea;
    private javax.swing.JMenuItem openHelp;
    private javax.swing.JMenuItem preferences;
    private javax.swing.JToggleButton proteinAreaToggle;
    private javax.swing.JTextArea proteinSequenceArea1;
    private javax.swing.JTextArea proteinSequenceArea2;
    private javax.swing.JMenuItem redoAction;
    private javax.swing.JMenuItem saveEntryDatabase;
    private javax.swing.JMenu saveEntryOptions;
    private javax.swing.JMenuItem saveFASTA;
    private javax.swing.JMenuItem saveGFF;
    private javax.swing.JMenuItem saveGenbank;
    private javax.swing.JScrollPane sequencePane;
    private javax.swing.JMenuItem undoAction;
    private javax.swing.JMenuItem useBLAST;
    private javax.swing.JMenuItem viewNonSelAnnotations;
    private javax.swing.JMenuItem viewSelAnnotations;
    // End of variables declaration//GEN-END:variables
}
