/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coe618.dyna;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * Sets up the card view layout, including labels and text area.
 * @author Josh Williams, Sander Fels-Leong, Philip Feldman
 */
public class CardView extends javax.swing.JPanel {

    /**
     * The attack title label
     * @return a jlabel with "attack" text.
     */
    public JLabel getAttLabel() {
        return attLabel;
    }

    /**
     * The area where the card effect is placed.
     * @return a jtextarea with card effect.
     */
    public JTextArea getCardTextArea() {
        return cardTextArea;
    }

    /**
     * The title label for defence stat.
     * @return a jabel with "defence".
     */
    public JLabel getDefLabel() {
        return defLabel;
    }

    /**
     * The title label for support stat.
     * @return a jabel with "support".
     */
    public JLabel getSupLabel() {
        return supLabel;
    }

    /** 
     * The label for the support stat.
     * @return  supportLabel support label
     */
    public JLabel getSupportLabel() {
        return supportLabel;
    }
    /**
     * The label for the attack stat.
     * @return attack attack
     */
    public JLabel getAttack() {
        return attack;
    }
    /**
     * @return cardTextArea card information text area
     */ 
    public JTextArea getCardEffect() {
        return cardTextArea;
    }
    /**
     * @return cardImage card image area
     */
    public JLabel getCardImage() {
        return cardImage;
    }
    /**
     * @return cardName card name
     */
    public JLabel getCardName() {
        return cardName;
    }
    /**
     * @return cost cost
     */
    public JLabel getCost() {
        return cost;
    }
    /**
     * @return defense
     */
    public JLabel getDefense() {
        return defense;
    }
    /**
     * @return defense
     */
    public JLabel getSetNum() {
        return setNum;
    }

    /**
     * Creates new form CardView
     */
    public CardView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Sets the dimensions, restrains and positions of all the labels and text 
     * areas of this class.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardName = new javax.swing.JLabel();
        cardImage = new javax.swing.JLabel();
        setNum = new javax.swing.JLabel();
        attack = new javax.swing.JLabel();
        defense = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        supportLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardTextArea = new javax.swing.JTextArea();
        attLabel = new javax.swing.JLabel();
        defLabel = new javax.swing.JLabel();
        supLabel = new javax.swing.JLabel();

        cardName.setText("Name");

        cardImage.setToolTipText("");
        cardImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setNum.setText("set num");

        attack.setText("Attack");

        defense.setText("Defense");

        cost.setText("cost");

        supportLabel.setText("Support");

        cardTextArea.setEditable(false);
        cardTextArea.setColumns(20);
        cardTextArea.setLineWrap(true);
        cardTextArea.setRows(5);
        cardTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(cardTextArea);

        attLabel.setText("Attack");

        defLabel.setText("Defense");

        supLabel.setText("Support");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNum)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cardName, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(cardImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(cost))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(defense)
                                            .addComponent(supportLabel)
                                            .addComponent(attack)
                                            .addComponent(attLabel)
                                            .addComponent(defLabel)
                                            .addComponent(supLabel))
                                        .addGap(3, 3, 3)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardName)
                    .addComponent(cost))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cardImage, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(attLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(defLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(defense)
                        .addGap(28, 28, 28)
                        .addComponent(supLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supportLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(setNum)
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attLabel;
    private javax.swing.JLabel attack;
    private javax.swing.JLabel cardImage;
    private javax.swing.JLabel cardName;
    private javax.swing.JTextArea cardTextArea;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel defLabel;
    private javax.swing.JLabel defense;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel setNum;
    private javax.swing.JLabel supLabel;
    private javax.swing.JLabel supportLabel;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LibraryController controller= LibraryController.getIstance();
    }
}
