/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidiscussion01;

import javax.swing.JOptionPane;

/**
 *
 * @author frank lou
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }
    
    private double num1;
    private char operation;

    public void appendCharacters(char ch){
        String initText = this.outputTxt.getText() + ch;
        this.outputTxt.setText(initText);
        
      //  this.outputTxt.setText( this.outputTxt.getText() + ch);
    }
    
    public void operationSetup(char op){
                
        try {
            this.num1 = Double.parseDouble( this.outputTxt.getText() );
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please add a valid input.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        this.operation = op;
        
        this.outputTxt.setText("");
    }
    
    public void calculate(){
        double num2 = 0;
        try {
            num2 = Double.parseDouble( this.outputTxt.getText() );
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please add a valid input.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        double result = 0;
        switch (this.operation){
            case '+': result = this.num1 + num2; break;
            case '-': result = this.num1 - num2; break;
            case 'x': result = this.num1 * num2; break;
            case '/': result = this.num1 / num2; break;
            default:
              JOptionPane.showMessageDialog(this, "Please add a valid input.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        this.outputTxt.setText(String.format("%1.2f", result));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        outputTxt = new javax.swing.JTextField();
        nineBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        divisionBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        subtractrionBtn = new javax.swing.JButton();
        additionBtn = new javax.swing.JButton();
        clearAllBtn = new javax.swing.JButton();
        equalsBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outputTxt.setEditable(false);
        outputTxt.setBackground(new java.awt.Color(255, 255, 255));
        outputTxt.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        outputTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        outputTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(outputTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        nineBtn.setBackground(new java.awt.Color(255, 255, 255));
        nineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/9.png"))); // NOI18N
        nineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nineBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nineBtnMouseReleased(evt);
            }
        });
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 90, 80));

        sevenBtn.setBackground(new java.awt.Color(255, 255, 255));
        sevenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/7.png"))); // NOI18N
        sevenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sevenBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sevenBtnMouseReleased(evt);
            }
        });
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 80));

        eightBtn.setBackground(new java.awt.Color(255, 255, 255));
        eightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/8.png"))); // NOI18N
        eightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eightBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eightBtnMouseReleased(evt);
            }
        });
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 80));

        sixBtn.setBackground(new java.awt.Color(255, 255, 255));
        sixBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/6.png"))); // NOI18N
        sixBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sixBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sixBtnMouseReleased(evt);
            }
        });
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 80));

        fiveBtn.setBackground(new java.awt.Color(255, 255, 255));
        fiveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/5.png"))); // NOI18N
        fiveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fiveBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fiveBtnMouseReleased(evt);
            }
        });
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 80));

        fourBtn.setBackground(new java.awt.Color(255, 255, 255));
        fourBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/4.png"))); // NOI18N
        fourBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fourBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fourBtnMouseReleased(evt);
            }
        });
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 90, 80));

        zeroBtn.setBackground(new java.awt.Color(255, 255, 255));
        zeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/0.png"))); // NOI18N
        zeroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                zeroBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                zeroBtnMouseReleased(evt);
            }
        });
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        jPanel1.add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 180, 80));

        twoBtn.setBackground(new java.awt.Color(255, 255, 255));
        twoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/2.png"))); // NOI18N
        twoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                twoBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                twoBtnMouseReleased(evt);
            }
        });
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 90, 80));

        dotBtn.setBackground(new java.awt.Color(255, 255, 255));
        dotBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/dot.png"))); // NOI18N
        dotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dotBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dotBtnMouseReleased(evt);
            }
        });
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dotBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 90, 80));

        oneBtn.setBackground(new java.awt.Color(255, 255, 255));
        oneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/1.png"))); // NOI18N
        oneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                oneBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                oneBtnMouseReleased(evt);
            }
        });
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        jPanel1.add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 90, 80));

        threeBtn.setBackground(new java.awt.Color(255, 255, 255));
        threeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/3.png"))); // NOI18N
        threeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                threeBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                threeBtnMouseReleased(evt);
            }
        });
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, 80));

        divisionBtn.setBackground(new java.awt.Color(255, 255, 255));
        divisionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/divide.png"))); // NOI18N
        divisionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                divisionBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                divisionBtnMouseReleased(evt);
            }
        });
        divisionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(divisionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 90, 80));

        multiplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        multiplyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/times.png"))); // NOI18N
        multiplyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                multiplyBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                multiplyBtnMouseReleased(evt);
            }
        });
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(multiplyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 80));

        subtractrionBtn.setBackground(new java.awt.Color(255, 255, 255));
        subtractrionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/minus.png"))); // NOI18N
        subtractrionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subtractrionBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                subtractrionBtnMouseReleased(evt);
            }
        });
        subtractrionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractrionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(subtractrionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, 80));

        additionBtn.setBackground(new java.awt.Color(255, 255, 255));
        additionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/plus.png"))); // NOI18N
        additionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                additionBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                additionBtnMouseReleased(evt);
            }
        });
        additionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(additionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 90, 80));

        clearAllBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear-all.png"))); // NOI18N
        clearAllBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearAllBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearAllBtnMouseReleased(evt);
            }
        });
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 80));

        equalsBtn.setBackground(new java.awt.Color(255, 255, 255));
        equalsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/equals.png"))); // NOI18N
        equalsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equalsBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                equalsBtnMouseReleased(evt);
            }
        });
        equalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(equalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, 80));

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear.png"))); // NOI18N
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearBtnMouseReleased(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearAllBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllBtnMousePressed
        clearAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear-all-clicked.png")));
    }//GEN-LAST:event_clearAllBtnMousePressed

    private void clearAllBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllBtnMouseReleased
        clearAllBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear-all.png")));
    }//GEN-LAST:event_clearAllBtnMouseReleased

    private void clearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMousePressed
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear-clicked.png")));
    }//GEN-LAST:event_clearBtnMousePressed

    private void clearBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseReleased
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/clear.png")));
    }//GEN-LAST:event_clearBtnMouseReleased

    private void equalsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsBtnMousePressed
        equalsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/equals-clicked.png")));
    }//GEN-LAST:event_equalsBtnMousePressed

    private void equalsBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsBtnMouseReleased
        equalsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/equals.png")));
    }//GEN-LAST:event_equalsBtnMouseReleased

    private void sevenBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenBtnMousePressed
        sevenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/7-clicked.png")));
    }//GEN-LAST:event_sevenBtnMousePressed

    private void sevenBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenBtnMouseReleased
        sevenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/7.png")));
    }//GEN-LAST:event_sevenBtnMouseReleased

    private void eightBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightBtnMousePressed
        eightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/8-clicked.png")));
    }//GEN-LAST:event_eightBtnMousePressed

    private void eightBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightBtnMouseReleased
        eightBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/8.png")));
    }//GEN-LAST:event_eightBtnMouseReleased

    private void nineBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMousePressed
        nineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/9-clicked.png")));
    }//GEN-LAST:event_nineBtnMousePressed

    private void nineBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseReleased
        nineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/9.png")));
    }//GEN-LAST:event_nineBtnMouseReleased

    private void divisionBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionBtnMousePressed
        divisionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/divide-clicked.png")));
    }//GEN-LAST:event_divisionBtnMousePressed

    private void divisionBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionBtnMouseReleased
        divisionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/divide.png")));
    }//GEN-LAST:event_divisionBtnMouseReleased

    private void fourBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMousePressed
        fourBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/4-clicked.png")));
    }//GEN-LAST:event_fourBtnMousePressed

    private void fourBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseReleased
        fourBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/4.png")));
    }//GEN-LAST:event_fourBtnMouseReleased

    private void fiveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveBtnMousePressed
        fiveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/5-clicked.png")));
    }//GEN-LAST:event_fiveBtnMousePressed

    private void fiveBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveBtnMouseReleased
        fiveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/5.png")));
    }//GEN-LAST:event_fiveBtnMouseReleased

    private void sixBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixBtnMousePressed
        sixBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/6-clicked.png")));
    }//GEN-LAST:event_sixBtnMousePressed

    private void sixBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixBtnMouseReleased
        sixBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/6.png")));
    }//GEN-LAST:event_sixBtnMouseReleased

    private void multiplyBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyBtnMousePressed
        multiplyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/times-clicked.png")));
    }//GEN-LAST:event_multiplyBtnMousePressed

    private void multiplyBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyBtnMouseReleased
        multiplyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/times.png")));
    }//GEN-LAST:event_multiplyBtnMouseReleased

    private void oneBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneBtnMousePressed
        oneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/1-clicked.png")));
    }//GEN-LAST:event_oneBtnMousePressed

    private void oneBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneBtnMouseReleased
        oneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/1.png")));
    }//GEN-LAST:event_oneBtnMouseReleased

    private void twoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoBtnMousePressed
        twoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/2-clicked.png")));
    }//GEN-LAST:event_twoBtnMousePressed

    private void twoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoBtnMouseReleased
       twoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/2.png")));
    }//GEN-LAST:event_twoBtnMouseReleased

    private void threeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeBtnMousePressed
        threeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/3-clicked.png")));
    }//GEN-LAST:event_threeBtnMousePressed

    private void subtractrionBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtractrionBtnMousePressed
        subtractrionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/minus-clicked.png")));
    }//GEN-LAST:event_subtractrionBtnMousePressed

    private void zeroBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroBtnMousePressed
        zeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/0-clicked.png")));
    }//GEN-LAST:event_zeroBtnMousePressed

    private void subtractrionBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtractrionBtnMouseReleased
        subtractrionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/minus.png")));
    }//GEN-LAST:event_subtractrionBtnMouseReleased

    private void zeroBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroBtnMouseReleased
        zeroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/0.png")));
    }//GEN-LAST:event_zeroBtnMouseReleased

    private void dotBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMousePressed
        dotBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/dot-clicked.png")));
    }//GEN-LAST:event_dotBtnMousePressed

    private void dotBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMouseReleased
        dotBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/dot.png")));
    }//GEN-LAST:event_dotBtnMouseReleased

    private void additionBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additionBtnMousePressed
        additionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/plus-clicked.png")));
    }//GEN-LAST:event_additionBtnMousePressed

    private void additionBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additionBtnMouseReleased
        additionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/plus.png")));
    }//GEN-LAST:event_additionBtnMouseReleased

    private void threeBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeBtnMouseReleased
       threeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/3.png")));
    }//GEN-LAST:event_threeBtnMouseReleased

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        this.appendCharacters('0');
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        this.appendCharacters('.');
    }//GEN-LAST:event_dotBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        this.appendCharacters('1');
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        this.appendCharacters('2');
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        this.appendCharacters('3');
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        this.appendCharacters('4');
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        this.appendCharacters('5');
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        this.appendCharacters('6');
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        this.appendCharacters('7');
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        this.appendCharacters('8');
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        this.appendCharacters('9');
    }//GEN-LAST:event_nineBtnActionPerformed

    private void additionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionBtnActionPerformed
        this.operationSetup('+');
    }//GEN-LAST:event_additionBtnActionPerformed

    private void subtractrionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractrionBtnActionPerformed
        this.operationSetup('-');
    }//GEN-LAST:event_subtractrionBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        this.operationSetup('x');
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void divisionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionBtnActionPerformed
        this.operationSetup('/');
    }//GEN-LAST:event_divisionBtnActionPerformed

    private void equalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsBtnActionPerformed
        this.calculate();
    }//GEN-LAST:event_equalsBtnActionPerformed

    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        this.outputTxt.setText("");
    }//GEN-LAST:event_clearAllBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        String initText = this.outputTxt.getText();
        
        if (initText.length() > 0){
            initText = initText.substring(0, initText.length() - 1);

            this.outputTxt.setText(initText);
        }
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionBtn;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalsBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JTextField outputTxt;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton subtractrionBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
