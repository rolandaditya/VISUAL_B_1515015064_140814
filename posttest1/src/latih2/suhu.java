/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latih2;

/**
 *
 * @author straight
 */
public class suhu extends javax.swing.JFrame {

    /**
     * Creates new form suhu
     */
    Float input,c,f,r,k;
    public suhu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrcelcius = new javax.swing.JRadioButton();
        jrreamur = new javax.swing.JRadioButton();
        jrfahrenheit = new javax.swing.JRadioButton();
        jrkelvin = new javax.swing.JRadioButton();
        inputan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        celcius = new javax.swing.JTextField();
        fahrenheit = new javax.swing.JTextField();
        reamur = new javax.swing.JTextField();
        kelvin = new javax.swing.JTextField();
        btnkonversi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        buttonGroup1.add(jrcelcius);
        jrcelcius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrcelcius.setText("Celcius");
        jrcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrcelciusActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrreamur);
        jrreamur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrreamur.setText("Reamur");
        jrreamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrreamurActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrfahrenheit);
        jrfahrenheit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrfahrenheit.setText("Fahrenheit");
        jrfahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrfahrenheitActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrkelvin);
        jrkelvin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrkelvin.setText("Kelvin");
        jrkelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrkelvinActionPerformed(evt);
            }
        });

        inputan.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputanCaretUpdate(evt);
            }
        });
        inputan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputanFocusLost(evt);
            }
        });
        inputan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputanMouseClicked(evt);
            }
        });
        inputan.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputanInputMethodTextChanged(evt);
            }
        });
        inputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputanActionPerformed(evt);
            }
        });
        inputan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputanKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Raavi", 0, 18)); // NOI18N
        jLabel1.setText("Suhu :");

        jTextField2.setBackground(new java.awt.Color(0, 204, 204));
        jTextField2.setText("Celcius");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 204, 204));
        jTextField3.setText("Fahrenheit");
        jTextField3.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(0, 204, 204));
        jTextField4.setText("Reamur");
        jTextField4.setBorder(null);

        jTextField5.setBackground(new java.awt.Color(0, 204, 204));
        jTextField5.setText("Kelvin");
        jTextField5.setBorder(null);

        celcius.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fahrenheit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        reamur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kelvin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnkonversi.setText("KONVERSI");
        btnkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrreamur)
                    .addComponent(jrfahrenheit))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jrcelcius)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnkonversi)
                        .addGap(35, 35, 35)
                        .addComponent(jrkelvin)
                        .addGap(127, 127, 127))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2))
                    .addComponent(celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jrcelcius)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(inputan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrfahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrreamur)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrkelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnkonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrcelciusActionPerformed
        // TODO add your handling code here:
        if(jrcelcius.isSelected())
        {
        c=input; r=(input*4)/5; f=((input*9)/5)+32; k=input+273;
        }
    }//GEN-LAST:event_jrcelciusActionPerformed

    private void jrreamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrreamurActionPerformed
        // TODO add your handling code here:
        if(jrreamur.isSelected())
        {
        c=(input*5)/4; r=input; f=((input*9)/4)+32; k=((input*5)/4)+273;
        }
    }//GEN-LAST:event_jrreamurActionPerformed

    private void jrfahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrfahrenheitActionPerformed
        // TODO add your handling code here:
        if(jrfahrenheit.isSelected())
        {
        c=((input-32)*5)/9; r=((input-32)*4)/9; f=input; k=(((input-32)*5)/9)+273;
        }
    }//GEN-LAST:event_jrfahrenheitActionPerformed

    private void jrkelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrkelvinActionPerformed
        // TODO add your handling code here:
        if(jrkelvin.isSelected())
        {
        c=(input-273); r=((input-273)*4)/5; f=((input-273)*9)/5; k=input;
        }
    }//GEN-LAST:event_jrkelvinActionPerformed

    private void inputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputanActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonversiActionPerformed
        // TODO add your handling code here:
        celcius.setText(Float.toString(c));
        fahrenheit.setText(Float.toString(f));
        reamur.setText(Float.toString(r));
        kelvin.setText(Float.toString(k));
    }//GEN-LAST:event_btnkonversiActionPerformed

    private void inputanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputanMouseClicked
  
    }//GEN-LAST:event_inputanMouseClicked

    private void inputanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputanFocusLost
        // TODO add your handling code here:
        input=Float.parseFloat(inputan.getText());
    }//GEN-LAST:event_inputanFocusLost

    private void inputanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputanInputMethodTextChanged
        // TODO add your handling code here:
//        input=Float.parseFloat(inputan.getText());
    }//GEN-LAST:event_inputanInputMethodTextChanged

    private void inputanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputanKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputanKeyTyped

    private void inputanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputanKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputanKeyPressed

    private void inputanCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputanCaretUpdate

    }//GEN-LAST:event_inputanCaretUpdate

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
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkonversi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField celcius;
    private javax.swing.JTextField fahrenheit;
    private javax.swing.JTextField inputan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton jrcelcius;
    private javax.swing.JRadioButton jrfahrenheit;
    private javax.swing.JRadioButton jrkelvin;
    private javax.swing.JRadioButton jrreamur;
    private javax.swing.JTextField kelvin;
    private javax.swing.JTextField reamur;
    // End of variables declaration//GEN-END:variables
}
