package coe618.dyna;

import coe618.dyna.models.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Sets up controls and GUI for the main interface of Dyna Stryfe, all 
 * action listeners are set up here for all the buttons and all of the actions
 * for the buttons and algorithms for search and sort functions.
 * @author Josh Williams, Sander Fels-Leong and Philip Feldman
 */
public class LibraryController {

    static private LibraryController instance = null;
    private ArrayList<Card> _cardList = new ArrayList<>();
    private ArrayList<Card> _visibleCards = new ArrayList<>();
    private Deck _currentdeck;
    private CardView cardView = new CardView();
    private LibraryUI _LibraryUI;

    /**
     * This creates the object only as a singleton and returns the same instance created.
     * @return an instance of the class.
     */
    public static LibraryController getIstance(){
        if (instance == null) {
            instance = new LibraryController();
        }
         return instance;
    }
    /**
     * Initializes GUI by setting action listeners, background dimensions and 
     * parameters, as well as positioning JPanels and restraints. It is private to 
     * stop initialization.
     */
   
   private LibraryController() {
        
        
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LibraryUI lib = new LibraryUI();
                cardView.setBounds(370, 10, 320, 500);
                lib.add(cardView);
                lib.setResizable(false);
                lib.setVisible(true);

                lib.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                       /* try {
                            didTapSave(null);
                            
                        } catch (IOException ex) {
                            Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                    }
                });
                lib.getSearchButton().addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        didTapSearch(evt);
                    }
                });
                lib.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            didTapSave(evt);
                        } catch (IOException ex) {
                            Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                lib.getCardsList().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent lse) {
                        if (!lse.getValueIsAdjusting()) {
                           
                            didSelectRowInList("card", _LibraryUI.cardsList.getSelectedIndex());
                        }
                    }
                });
                lib.getDeckList().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent lse) {
                        if (!lse.getValueIsAdjusting()) {
                            didSelectRowInList("deck", _LibraryUI.getDeckList().getSelectedIndex());
                        }
                    }
                });
                lib.getAdd().addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        didTapAddCard(evt);
                    }
                });
                lib.getRemoveButton().addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        didTapRemoveCard(evt);
                    }
                });
                _LibraryUI = lib;
                try {
                    loadDeck();
                } catch (IOException ex) {
                    Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    loadCardList();
                } catch (IOException ex) {
                    Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    /**
     * Handles searching the current deck when the search button is pressed
     * based on combo box and search criteria selected.
     * @param evt event handle variable created to handle event
     */
    private void didTapSearch(java.awt.event.ActionEvent evt) {
        String comboOption = (String) _LibraryUI.getSortComboBox().getSelectedItem();
        String searchParam = _LibraryUI.getSearchTextBox().getText();
        _visibleCards = search(comboOption, searchParam);
        String[] data = new String[_visibleCards.size()];
        for (int i = 0; i < _visibleCards.size(); i++) {
            data[i] = _visibleCards.get(i).getName();
        }
        _LibraryUI.getCardsList().setListData(data);
    }

    /**
     * Handles saving the current deck when the Save button is pressed.
     * @param evt event handle variable created to handle event
     * @throws IOException is thrown in the event a file is missing or cannot 
     *                     be read
     */
    private void didTapSave(java.awt.event.ActionEvent evt) throws IOException {

        PrintWriter writer = new PrintWriter("deck.txt", "UTF-8");
        writer.println(_currentdeck.getDeck_name());
        for (Card card : _currentdeck.getCards()) {

            writer.println(card.toString());
        }
        writer.close();

    }

    /**
     * Handles adding user selected cards when the Add button is pushed, if
     * no card is selected, method does nothing when add button is pressed.
     * @param evt event handle variable created to handle event
     */
    private void didTapAddCard(java.awt.event.ActionEvent evt) {
        int index = _LibraryUI.getCardsList().getSelectedIndex();
        if (index < 0) {
            return;
        }
        int total = Integer.parseInt((String) _LibraryUI.getQuantityComboBox().getSelectedItem());
        for (int i = 0; i < total; i++) {
            _currentdeck.addCard(_visibleCards.get(index));
        }
        String[] data = new String[_currentdeck.getCards().size()];
        for (int i = 0; i < _currentdeck.getCards().size(); i++) {
            data[i] = _currentdeck.getCards().get(i).getName();
        }
        _LibraryUI.getDeckList().setListData(data);
         _LibraryUI.getTotalCardsLabel().setText(String.valueOf(_currentdeck.getNumOfCards()));
    }

    /**
     * Handles removing user selected cards when the remove button is pushed, if
     * no card is selected, method does nothing when button is pressed.
     * @param evt event handle variable created to handle event
     */
    private void didTapRemoveCard(java.awt.event.ActionEvent evt) {
        int index = _LibraryUI.getDeckList().getSelectedIndex();
        if (index < 0) {
            return;
        }
        _currentdeck.removeCard(_currentdeck.getCards().get(index));
        String[] data = new String[_currentdeck.getCards().size()];
        for (int i = 0; i < _currentdeck.getCards().size(); i++) {
            data[i] = _currentdeck.getCards().get(i).getName();
        }
        _LibraryUI.getDeckList().setListData(data);
         _LibraryUI.getTotalCardsLabel().setText(String.valueOf(_currentdeck.getNumOfCards()));
    }

    /**
     * Handles display functions specific to cards when rows are selected by 
     * the user in the GUI JPanels
     * @param list specifies the list being used, specifically the deck or card
     *             list. 
     * @param index specifies the index of the list which the user has selected
     */
    private void didSelectRowInList(String list, int index) {
        Card card;
        if (index == -1) return;
        if (list.equalsIgnoreCase("deck")) {
            if(index >= _currentdeck.getNumOfCards()) return;
            
            card = _currentdeck.getCards().get(index >= 0 ? index : 0);


        } else {
             if(index >= _visibleCards.size()) return;
            card = _visibleCards.get(index >= 0 ? index : 0);
        }

        ImageIcon imgThisImg = new ImageIcon("images/" + card.getArtwork());
        cardView.getCardImage().setIcon(imgThisImg);
        cardView.getCardEffect().setText(card.getEffect());
        cardView.getCardName().setText(card.getName());
        cardView.getSetNum().setText(String.valueOf(card.getSetNumber()));
        cardView.getCost().setText(String.valueOf(card.getCost()));

        if (card instanceof CreatureCard) {
            CreatureCard monster = (CreatureCard) card;
            cardView.getAttack().setText(String.valueOf(monster.getAtk()));
            cardView.getSupportLabel().setText(String.valueOf(monster.getSupport()));
            cardView.getDefense().setText(String.valueOf(monster.getDef()));
            cardView.getAttack().setVisible(true);
            cardView.getAttLabel().setVisible(true);
            cardView.getDefLabel().setVisible(true);
            cardView.getDefense().setVisible(true);
            cardView.getSupLabel().setVisible(true);
            cardView.getSupportLabel().setVisible(true);
        }else{
         cardView.getAttack().setVisible(false);
            cardView.getAttLabel().setVisible(false);
            cardView.getDefLabel().setVisible(false);
            cardView.getDefense().setVisible(false);
            cardView.getSupLabel().setVisible(false);
            cardView.getSupportLabel().setVisible(false);
        }
    }
    /**
     * Reads text file "Deck.txt" and places content in the right JPanel GUI
     * @throws IOException is thrown in the event a file is missing or cannot 
     *                     be read
     */
    public void loadDeck() throws IOException {

        FileReader file = null;
        try {
            file = new FileReader("deck.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        _currentdeck = new Deck(line);
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(",");
            Card newCard = null;
            if (tokens[0].equalsIgnoreCase("creature")) {
                newCard = new CreatureCard(line);
            } else if (tokens[0].equalsIgnoreCase("power")) {
                newCard = new PowerCard(line);
            } else if (tokens[0].equalsIgnoreCase("reaction")) {
                newCard = new ReactionCard(line);
            } else if (tokens[0].equalsIgnoreCase("event")) {
                newCard = new EventCard(line);
            }
            _currentdeck.addCard(newCard);
        }
        file.close();
        String[] data = new String[_currentdeck.getCards().size()];
        for (int i = 0; i < _currentdeck.getCards().size(); i++) {
            data[i] = _currentdeck.getCards().get(i).getName();
        }
        _LibraryUI.getDeckList().setListData(data);
        _LibraryUI.getTotalCardsLabel().setText(String.valueOf(_currentdeck.getNumOfCards()));
    }

    /**
     * Loads internal array and displays card list on left JPanel in the GUI
     *
     * @throws IOException is thrown in the event a file is missing or cannot 
     *                     be read
     */
    public void loadCardList() throws IOException {
        FileReader file = null;
        try {
            file = new FileReader("cardList.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LibraryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(file);
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(",");
            Card newCard = null;
            if (tokens[0].equalsIgnoreCase("creature")) {
                newCard = new CreatureCard(line);
            } else if (tokens[0].equalsIgnoreCase("power")) {
                newCard = new PowerCard(line);
            } else if (tokens[0].equalsIgnoreCase("reaction")) {
                newCard = new ReactionCard(line);
            } else if (tokens[0].equalsIgnoreCase("event")) {
                newCard = new EventCard(line);
            }
            _cardList.add(newCard);
        }
        file.close();
        _visibleCards = _cardList;
        String[] data = new String[_cardList.size()];

        for (int i = 0; i < _cardList.size(); i++) {
            data[i] = _cardList.get(i).getName();
        }
        _LibraryUI.getCardsList().setListData(data);
    }

    /**
     * Returns a search result with the available cards based on the criteria in
     * the combo box and search box.
     *
     * @param type user selected type for filtering search criteria
     * @param name user selected string for filtering search criteria
     * @return search result
     */
    public ArrayList<Card> search(String type, String name) {

        ArrayList<Card> searched = new ArrayList<>();

        Card noResult = new EventCard(1, "No Results Found", 0, "", "");

        for (Card x : _cardList) {
            if (type.equalsIgnoreCase("all")) {
                if (x.getName().equalsIgnoreCase(name)) {
                    searched.add(x);
                } else if (x.getName().toLowerCase().startsWith(name.toLowerCase())) {
                    searched.add(x);
                }
            } else if (x.getType().equalsIgnoreCase(type)) {
                if (x.getName().equalsIgnoreCase(name)) {
                    searched.add(x);
                } else if (x.getName().toLowerCase().startsWith(name.toLowerCase())) {
                    searched.add(x);
                }
            }
        }
        if (searched.isEmpty()) {
            searched.add(noResult);
        }

        return searched;
    }


}
