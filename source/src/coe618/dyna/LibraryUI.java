
package coe618.dyna;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * Creates, places and defines features for all the graphic user interface 
 * components visible, as well as creates getters to be accessed from other 
 * classes that define functionality of elements such as buttons.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class LibraryUI extends javax.swing.JFrame {
    
    /**
     * @return Add button 
     */
    public JButton getAdd() {
        return Add;
    }
    /**
     * @return quantityComboBox quantity combo box 
     */
    public JComboBox getQuantityComboBox() {
        return quantityComboBox;
    }
    /**
     * @return quantityLabel displays "Quantity" 
     */
    public JLabel getQuantityLabel() {
        return quantityLabel;
    }
    /**
     * @return removeButton remove button 
     */
    public JButton getRemoveButton() {
        return removeButton;
    }
    /**
     * @return saveButton save button
     */
    public JButton getSaveButton() {
        return saveButton;
    }
    /**
     * @return  searchButton search button
     */
    public JButton getSearchButton() {
        return searchButton;
    }
    /**
     * @return  sortComboBox sort combo box
     */
    public JComboBox getSortComboBox() {
        return sortComboBox;
    }
    /**
     * @return totalCardsTextLabel displays "Total Cards" in the deck
     */
    public JLabel getTotalCardsTextLabel() {
        return totalCardsTextLabel;
    }
    /**
     * @return totalCardsLabel displays the number for cards in the deck
     */
    public JLabel getTotalCardsLabel() {
        return totalCardsLabel;
    }
    /**
     * @return currentDeckLabel displays "Current Deck"
     */
    public JLabel getCurrentDeckLabel() {
        return currentDeckLabel;
    }
    /**
     * @return deckList deck list
     */
    public JList getDeckList() {
        return deckList;
    }
    /**
     * @return cardsList card list
     */
    public JList getCardsList() {
        return cardsList;
    }
    /**
     * @return  cardPanel card panel
     */
    public JPanel getCardPanel() {
        return cardPanel;
    }
    /**
     * @return currentDeckPanel Deck Panel
     */
    public JPanel getCurrentDeckPanel() {
        return currentDeckPanel;
    }
    /**
     * @return deckScrollPane Deck scroll pane
     */
    public JScrollPane getDeckScrollPane() {
        return deckScrollPane;
    }
    /**
     * @return  cardListPane card list pane
     */
    public JScrollPane getCardListPane() {
        return cardListPane;
    }
    /**
     * @return searchTextBox search box for used defined searches
     */
    public JTextField getSearchTextBox() {
        return searchTextBox;
    }

    /**
     * Creates new form LibraryUI
     */
    public LibraryUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * It sets up the specific layout of the panels, buttons, combo boxes, 
     * text boxes, scroll panes, lists and frames.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchTextBox = new javax.swing.JTextField();
        sortComboBox = new javax.swing.JComboBox();
        cardListPane = new javax.swing.JScrollPane();
        cardsList = new javax.swing.JList();
        quantityComboBox = new javax.swing.JComboBox();
        quantityLabel = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        currentDeckPanel = new javax.swing.JPanel();
        currentDeckLabel = new javax.swing.JLabel();
        deckScrollPane = new javax.swing.JScrollPane();
        deckList = new javax.swing.JList();
        totalCardsTextLabel = new javax.swing.JLabel();
        totalCardsLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dyna-Stryfe Deck Builder");

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchTextBox.setText("Search...");
        searchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextBoxActionPerformed(evt);
            }
        });

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Reaction", "Power", "Creature", "Event" }));

        cardsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "all", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        cardListPane.setViewportView(cardsList);

        quantityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        quantityLabel.setText("Quantity:");

        Add.setText("Add");

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPanelLayout.createSequentialGroup()
                        .addComponent(quantityLabel)
                        .addGap(18, 18, 18)
                        .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add))
                    .addComponent(cardListPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addGap(426, 426, 426))
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(Add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        currentDeckLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        currentDeckLabel.setText("Current Deck");

        deckList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        deckScrollPane.setViewportView(deckList);

        totalCardsTextLabel.setText("Total Cards:");

        totalCardsLabel.setText("100");

        removeButton.setText("Remove");

        saveButton.setText("Save");

        javax.swing.GroupLayout currentDeckPanelLayout = new javax.swing.GroupLayout(currentDeckPanel);
        currentDeckPanel.setLayout(currentDeckPanelLayout);
        currentDeckPanelLayout.setHorizontalGroup(
            currentDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deckScrollPane)
                    .addGroup(currentDeckPanelLayout.createSequentialGroup()
                        .addComponent(currentDeckLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addGroup(currentDeckPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(removeButton)
                        .addGap(24, 24, 24)
                        .addComponent(totalCardsTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCardsLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        currentDeckPanelLayout.setVerticalGroup(
            currentDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentDeckLabel)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deckScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(currentDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(totalCardsTextLabel)
                    .addComponent(totalCardsLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403)
                .addComponent(currentDeckPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(currentDeckPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextBoxActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseClicked

    /**
     * @param args the command line arguments
     */
 /*   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryUI().setVisible(true);
            }
        });
    }*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JScrollPane cardListPane;
    private javax.swing.JPanel cardPanel;
    public javax.swing.JList cardsList;
    private javax.swing.JLabel currentDeckLabel;
    private javax.swing.JPanel currentDeckPanel;
    private javax.swing.JList deckList;
    private javax.swing.JScrollPane deckScrollPane;
    private javax.swing.JComboBox quantityComboBox;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JComboBox sortComboBox;
    private javax.swing.JLabel totalCardsLabel;
    private javax.swing.JLabel totalCardsTextLabel;
    // End of variables declaration//GEN-END:variables
}
