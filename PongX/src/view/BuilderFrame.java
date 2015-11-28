package view;


public class BuilderFrame extends javax.swing.JFrame {

    
    public BuilderFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        singleButton = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        pongXLabel = new javax.swing.JLabel();
        singlePanel = new javax.swing.JPanel();
        singleReturn = new javax.swing.JButton();
        singlePlayButton = new javax.swing.JButton();
        aiSpinner = new javax.swing.JSpinner();
        aiLabel = new javax.swing.JLabel();
        frictionSpinner1 = new javax.swing.JSpinner();
        frictionLabel = new javax.swing.JLabel();
        singleMapButton = new javax.swing.JButton();
        multiPanel = new javax.swing.JPanel();
        multiReturn1 = new javax.swing.JButton();
        optionsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        soundsToggleButton1 = new javax.swing.JToggleButton();
        moveUp1Label = new javax.swing.JLabel();
        p1UpTextField = new javax.swing.JTextField();
        moveUp2Label = new javax.swing.JLabel();
        p2UpTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p1DownTextField = new javax.swing.JTextField();
        p2DownTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        optionsReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singleButton.setBackground(new java.awt.Color(255, 255, 255));
        singleButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        singleButton.setText("SinglePlayer");
        singleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleButtonActionPerformed(evt);
            }
        });
        menuPanel.add(singleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, -1));

        multiButton.setBackground(new java.awt.Color(255, 255, 255));
        multiButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        multiButton.setText("MultiPlayer");
        multiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiButtonActionPerformed(evt);
            }
        });
        menuPanel.add(multiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 160, -1));

        optionsButton.setBackground(new java.awt.Color(255, 255, 255));
        optionsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        optionsButton.setText("Options");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, -1));

        creditsButton.setBackground(new java.awt.Color(255, 255, 255));
        creditsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(creditsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 160, -1));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 0));
        exitButton.setText("EXIT");
        exitButton.setActionCommand("exitButton");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        menuPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 90, 30));

        pongXLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PONG-X.png"))); // NOI18N
        menuPanel.add(pongXLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        mainPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        singlePanel.setBackground(new java.awt.Color(0, 0, 0));
        singlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singleReturn.setBackground(new java.awt.Color(255, 255, 255));
        singleReturn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        singleReturn.setForeground(new java.awt.Color(255, 0, 51));
        singleReturn.setText("Main Menu");
        singleReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleReturnActionPerformed(evt);
            }
        });
        singlePanel.add(singleReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 110, 40));

        singlePlayButton.setBackground(new java.awt.Color(255, 255, 255));
        singlePlayButton.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        singlePlayButton.setText("Play!");
        singlePanel.add(singlePlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 90, -1));
        singlePanel.add(aiSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 40, 30));

        aiLabel.setFont(new java.awt.Font("Sylfaen", 0, 22)); // NOI18N
        aiLabel.setForeground(new java.awt.Color(255, 255, 255));
        aiLabel.setText("AI Level");
        singlePanel.add(aiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, 30));
        singlePanel.add(frictionSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 40, 30));

        frictionLabel.setFont(new java.awt.Font("Sylfaen", 0, 22)); // NOI18N
        frictionLabel.setForeground(new java.awt.Color(255, 255, 255));
        frictionLabel.setText("Friction");
        singlePanel.add(frictionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 90, 30));

        singleMapButton.setText("Next Map");
        singleMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleMapButtonActionPerformed(evt);
            }
        });
        singlePanel.add(singleMapButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        mainPanel.add(singlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        singlePanel.setVisible(false);

        multiPanel.setBackground(new java.awt.Color(204, 204, 204));

        multiReturn1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        multiReturn1.setForeground(new java.awt.Color(255, 0, 51));
        multiReturn1.setText("Main Menu");
        multiReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiReturn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout multiPanelLayout = new javax.swing.GroupLayout(multiPanel);
        multiPanel.setLayout(multiPanelLayout);
        multiPanelLayout.setHorizontalGroup(
            multiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, multiPanelLayout.createSequentialGroup()
                .addContainerGap(672, Short.MAX_VALUE)
                .addComponent(multiReturn1)
                .addGap(23, 23, 23))
        );
        multiPanelLayout.setVerticalGroup(
            multiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, multiPanelLayout.createSequentialGroup()
                .addContainerGap(549, Short.MAX_VALUE)
                .addComponent(multiReturn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(multiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        multiPanel.setVisible(false);

        optionsPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Options.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enable-Sounds (1).png"))); // NOI18N

        soundsToggleButton1.setText("Sounds");

        moveUp1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Move-Up.png"))); // NOI18N

        p1UpTextField.setBackground(new java.awt.Color(204, 204, 204));
        p1UpTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1UpTextField.setText("W");
        p1UpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1UpTextFieldActionPerformed(evt);
            }
        });

        moveUp2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Move-Up.png"))); // NOI18N

        p2UpTextField.setBackground(new java.awt.Color(204, 204, 204));
        p2UpTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2UpTextField.setText("O");
        p2UpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2UpTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Move-Down.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Move-Down.png"))); // NOI18N

        p1DownTextField.setBackground(new java.awt.Color(204, 204, 204));
        p1DownTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1DownTextField.setText("S");
        p1DownTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1DownTextFieldActionPerformed(evt);
            }
        });

        p2DownTextField.setBackground(new java.awt.Color(204, 204, 204));
        p2DownTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2DownTextField.setText("L");
        p2DownTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2DownTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P2.png"))); // NOI18N

        optionsReturn.setBackground(new java.awt.Color(255, 255, 255));
        optionsReturn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        optionsReturn.setForeground(new java.awt.Color(255, 0, 51));
        optionsReturn.setText("Main Menu");
        optionsReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2UpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2DownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(soundsToggleButton1)
                        .addGap(61, 61, 61)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moveUp2Label)
                                    .addComponent(jLabel3))
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p1UpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p1DownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(moveUp1Label)))))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(optionsReturn)
                .addContainerGap())
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(soundsToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1UpTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveUp2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p1DownTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2UpTextField)
                    .addComponent(moveUp1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(p2DownTextField))
                .addGap(5, 5, 5)
                .addComponent(optionsReturn)
                .addContainerGap())
        );

        mainPanel.add(optionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleButtonActionPerformed
        singlePanel.setVisible(true);
        menuPanel.setVisible(false);
    }//GEN-LAST:event_singleButtonActionPerformed

    private void singleReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleReturnActionPerformed
        singlePanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_singleReturnActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void multiReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiReturn1ActionPerformed
        multiPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_multiReturn1ActionPerformed

    private void multiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiButtonActionPerformed
        multiPanel.setVisible(true);
        menuPanel.setVisible(false);
    }//GEN-LAST:event_multiButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void singleMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleMapButtonActionPerformed
        
            
    }//GEN-LAST:event_singleMapButtonActionPerformed

    private void p1UpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1UpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1UpTextFieldActionPerformed

    private void p2UpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2UpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2UpTextFieldActionPerformed

    private void p1DownTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1DownTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1DownTextFieldActionPerformed

    private void p2DownTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2DownTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2DownTextFieldActionPerformed

    private void optionsReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsReturnActionPerformed
        menuPanel.setVisible(true);
        optionsPanel.setVisible(false);
    }//GEN-LAST:event_optionsReturnActionPerformed

    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        menuPanel.setVisible(false);
        optionsPanel.setVisible(true);
    }//GEN-LAST:event_optionsButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuilderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aiLabel;
    private javax.swing.JSpinner aiSpinner;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel frictionLabel;
    private javax.swing.JSpinner frictionSpinner1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel moveUp1Label;
    private javax.swing.JLabel moveUp2Label;
    private javax.swing.JButton multiButton;
    private javax.swing.JPanel multiPanel;
    private javax.swing.JButton multiReturn1;
    private javax.swing.JButton optionsButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JButton optionsReturn;
    private javax.swing.JTextField p1DownTextField;
    private javax.swing.JTextField p1UpTextField;
    private javax.swing.JTextField p2DownTextField;
    private javax.swing.JTextField p2UpTextField;
    private javax.swing.JLabel pongXLabel;
    private javax.swing.JButton singleButton;
    private javax.swing.JButton singleMapButton;
    private javax.swing.JPanel singlePanel;
    private javax.swing.JButton singlePlayButton;
    private javax.swing.JButton singleReturn;
    private javax.swing.JToggleButton soundsToggleButton1;
    // End of variables declaration//GEN-END:variables
}
