package Main;

import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    static int indexOrder = 0, indexArticle = 0, indexShop = 0, orderArticleSelected = 1, ingressoArticleSelected = 1;
    Magazzino m;

    public Main() {

        //CREO L'OGGETTO MAGAZZINO
        m = new Magazzino();

        //INIZIALIZZO I COMPONENTI GRAFICI 
        initComponents();

        //CONFIGURO IL BUTTONGROUP DEGLI SPORT
        SportButtonGroup.add(nuotoRadioButton);
        SportButtonGroup.add(calcioRadioButton);
        SportButtonGroup.add(tennisRadioButton);
        SportButtonGroup.add(palestraRadioButton);
        SportButtonGroup.add(sciiRadioButton);
        SportButtonGroup.add(basketRadioButton);
        SportButtonGroup.add(pallavoloRadioButton);
        SportButtonGroup.add(raftingRadioButton);
        SportButtonGroup.add(ciclismoRadioButton);
        SportButtonGroup.add(rugbyRadioButton);
        SportButtonGroup.add(atleticaRadioButton);
        SportButtonGroup.add(hockeyRadioButton);
        SportButtonGroup.add(golfRadioButton);
        SportButtonGroup.add(danzaRadioButton);

        //CONFIGURO IL BUTTONGROUP DEI MATERIALI
        MaterialiBottonGroup.add(poliestereRadioButton);
        MaterialiBottonGroup.add(siliconeRadioButton);
        MaterialiBottonGroup.add(fintaPelleRadioButton);
        MaterialiBottonGroup.add(goreTexRadioButton);
        MaterialiBottonGroup.add(poliammideRadioButton);
        MaterialiBottonGroup.add(polietileneRadioButton);
        MaterialiBottonGroup.add(elastanRadioButton);

        //ISTANZIO UN PO DI OGGETTI DA USARE COME PROVA
        m.addUser(new Utente("ciao", "ciao", 1));

        Articolo a1 = new Articolo((float) 14, new TipoArticolo("nome1", "Desrizione1", 2, 1));
        Articolo a2 = new Articolo((float) 17, new TipoArticolo("nome2", "Desrizione2", 3, 3));
        Articolo a3 = new Articolo((float) 87, new TipoArticolo("nome3", "Desrizione3", 2, 1));
        Articolo a4 = new Articolo((float) 90, new TipoArticolo("nome4", "Desrizione4", 9, 2));
        Articolo a5 = new Articolo((float) 15, new TipoArticolo("nome5", "Desrizione5", 7, 1));
        Articolo a6 = new Articolo((float) 18, new TipoArticolo("nome6", "Desrizione6", 10, 4));
        Negozio n1 = new Negozio("codice fiscale1", "primo Negozio", "Indirizzo1", "City");
        Negozio n2 = new Negozio("codice fiscale2", "secondo Negozio", "Indirizzo2", "City");
        Negozio n3 = new Negozio("codice fiscale3", "terzo Negozio", "Indirizzo3", "City");
        Negozio n4 = new Negozio("codice fiscale4", "quarto Negozio", "Indirizzo4", "City");
        Ordine o1 = new Ordine(n1);
        o1.addArticle(a2, 10);
        o1.addArticle(a1, 4);
        o1.addArticle(a3, 4);
        o1.addArticle(a4, 10);
        Ordine o2 = new Ordine(n2);
        o2.addArticle(a2, 10);
        o2.addArticle(a1, 4);
        m.addArticolo(a1);
        m.addArticolo(a2);
        m.addNegozi(n1);
        m.addNegozi(n2);
        m.addNegozi(n3);
        m.addNegozi(n4);
        m.addOrdine(o1);
        m.addOrdine(o2);

        hideAll();
        loginPanel.setVisible(true);
        selezionaButton_NegozioPanel.setVisible(false);
        errorLabel_creaNuovoArticoloPanel.setVisible(false);
    }

    public final void hideAll() {
        newArticlePanel.setVisible(false);
        visualizzaOrdiniPanel.setVisible(false);
        loginPanel.setVisible(false);
        creaNuovoOrdinePanel.setVisible(false);
        negoziPanel.setVisible(false);
        visualizzaArticoliPanel.setVisible(false);
        adminPanel.setVisible(false);
        creaNegozioPanel.setVisible(false);
        creaIngressoPanel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        SportButtonGroup = new javax.swing.ButtonGroup();
        MaterialiBottonGroup = new javax.swing.ButtonGroup();
        adminPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        visualizzaOrdiniPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        negozioInfo_OrderPanel = new javax.swing.JButton();
        indietroButton_OrderPanel = new javax.swing.JButton();
        avantiButton_OrderPanel = new javax.swing.JButton();
        modificaButtonOrderPanel = new javax.swing.JButton();
        chiudiButtonOrderPanel = new javax.swing.JButton();
        searchFieldOrderPanel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        newOrderButton_orderViewPanel = new javax.swing.JButton();
        orderIDLabel = new javax.swing.JLabel();
        orderDataLabel = new javax.swing.JLabel();
        orderPrezzoLabel = new javax.swing.JLabel();
        orderNomeNegozioLabel = new javax.swing.JLabel();
        articoliQuantitaOrderPanel = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        creaNuovoOrdinePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        creaOrdineButton_orderViewPanel = new javax.swing.JButton();
        closeButton_newOrderPanel = new javax.swing.JButton();
        corriereField_NewOrderPanel = new javax.swing.JTextField();
        ComboBoxNegozio = new javax.swing.JComboBox<>();
        comboBoxArticoli1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        addArticleButton_newOrderPanel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboBoxArticoli2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboBoxArticoli3 = new javax.swing.JComboBox<>();
        comboBoxArticoli4 = new javax.swing.JComboBox<>();
        comboBoxArticoli5 = new javax.swing.JComboBox<>();
        comboBoxArticoli6 = new javax.swing.JComboBox<>();
        comboBoxArticoli7 = new javax.swing.JComboBox<>();
        comboBoxArticoli8 = new javax.swing.JComboBox<>();
        comboBoxArticoli9 = new javax.swing.JComboBox<>();
        comboBoxArticoli10 = new javax.swing.JComboBox<>();
        quantitaField10 = new javax.swing.JTextField();
        quantitaField2 = new javax.swing.JTextField();
        quantitaField1 = new javax.swing.JTextField();
        quantitaField3 = new javax.swing.JTextField();
        quantitaField4 = new javax.swing.JTextField();
        quantitaField5 = new javax.swing.JTextField();
        quantitaField6 = new javax.swing.JTextField();
        quantitaField7 = new javax.swing.JTextField();
        quantitaField8 = new javax.swing.JTextField();
        quantitaField9 = new javax.swing.JTextField();
        corniceArticoloLabel_newOrderPanel = new javax.swing.JLabel();
        creaNegozioPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        indirizzoField_newNegozioPanel = new javax.swing.JTextField();
        CodiceFiscaleField_NewNegozio = new javax.swing.JTextField();
        nomeField_newNegozioPanel = new javax.swing.JTextField();
        cittaField_NewNegozioPanel = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        creaFromCreaNegozioPanel = new javax.swing.JButton();
        closeButton_creaNegozioPanel = new javax.swing.JButton();
        modificaFromNewNegozioPanel = new javax.swing.JButton();
        negoziPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        avantiButton_NegozioPanel = new javax.swing.JButton();
        indietroButton_NegozioPanel = new javax.swing.JButton();
        searchField_NegozioPanel = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        modificaButton_NegozioPanel = new javax.swing.JButton();
        codiceFiscaleLabel_NegozioPanel = new javax.swing.JLabel();
        nomeNegozioLabel_NegozioPanel = new javax.swing.JLabel();
        indirizzoLabel_NegozioPanel = new javax.swing.JLabel();
        cittaNegozio_NegozioPanel = new javax.swing.JLabel();
        CreaNegozioButton_NegozioPanel = new javax.swing.JButton();
        selezionaButton_NegozioPanel = new javax.swing.JButton();
        closeButton_NegozioPanel1 = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        pinField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cancelPinButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        usrLabel = new javax.swing.JLabel();
        usrField = new javax.swing.JTextField();
        loginTitleLabel = new javax.swing.JLabel();
        visualizzaArticoliPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        IDLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        prezzoLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        dataLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        nomeLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        descrizioneLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        sportLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        materialiLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        avantiButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        indietroButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        modificaButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        creaNegozioButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        chiudiButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        cercaLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        newArticlePanel = new javax.swing.JPanel();
        calcioRadioButton = new javax.swing.JRadioButton();
        nuotoRadioButton = new javax.swing.JRadioButton();
        palestraRadioButton = new javax.swing.JRadioButton();
        tennisRadioButton = new javax.swing.JRadioButton();
        sciiRadioButton = new javax.swing.JRadioButton();
        ciclismoRadioButton = new javax.swing.JRadioButton();
        rugbyRadioButton = new javax.swing.JRadioButton();
        atleticaRadioButton = new javax.swing.JRadioButton();
        hockeyRadioButton = new javax.swing.JRadioButton();
        golfRadioButton = new javax.swing.JRadioButton();
        danzaRadioButton = new javax.swing.JRadioButton();
        pallavoloRadioButton = new javax.swing.JRadioButton();
        poliestereRadioButton = new javax.swing.JRadioButton();
        siliconeRadioButton = new javax.swing.JRadioButton();
        fintaPelleRadioButton = new javax.swing.JRadioButton();
        goreTexRadioButton = new javax.swing.JRadioButton();
        elastanRadioButton = new javax.swing.JRadioButton();
        polietileneRadioButton = new javax.swing.JRadioButton();
        poliammideRadioButton = new javax.swing.JRadioButton();
        basketRadioButton = new javax.swing.JRadioButton();
        raftingRadioButton = new javax.swing.JRadioButton();
        titolo_newArticlePanel = new javax.swing.JLabel();
        prezzoField_newArticlePanel = new javax.swing.JTextField();
        dayField_newArticlePanel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        monthField_newArticlePanel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yearField_newArticlePanel = new javax.swing.JTextField();
        dataOdierna_newArticlePanel = new javax.swing.JButton();
        cancellaButton_newArticlePanel = new javax.swing.JButton();
        inserisciButton_newArticlePanel = new javax.swing.JButton();
        descrizioneFieldTipoArticolo_newArticlePanel = new javax.swing.JTextField();
        nomeFieldTipoArticolo_newArticlePanel = new javax.swing.JTextField();
        sportLabelTipoArticolo_newArticlePanel = new javax.swing.JLabel();
        materialeTipoArticolo_newArticlePanel = new javax.swing.JLabel();
        dataLabel_newArticlePanel = new javax.swing.JLabel();
        TipoArticoloLabel_NewArticlePanel = new javax.swing.JLabel();
        modificaButton_newArticlePanel = new javax.swing.JButton();
        errorLabel_creaNuovoArticoloPanel = new javax.swing.JLabel();
        creaIngressoPanel = new javax.swing.JPanel();
        comboBoxIngressoArticoli4 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli5 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli6 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli7 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli8 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli9 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli10 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli3 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli2 = new javax.swing.JComboBox<>();
        comboBoxIngressoArticoli1 = new javax.swing.JComboBox<>();
        textFieldQuantita1 = new javax.swing.JTextField();
        textFieldQuantita2 = new javax.swing.JTextField();
        textFieldQuantita3 = new javax.swing.JTextField();
        textFieldQuantita4 = new javax.swing.JTextField();
        textFieldQuantita5 = new javax.swing.JTextField();
        textFieldQuantita6 = new javax.swing.JTextField();
        textFieldQuantita7 = new javax.swing.JTextField();
        textFieldQuantita9 = new javax.swing.JTextField();
        textFieldQuantita8 = new javax.swing.JTextField();
        textFieldQuantita10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        creaOrdineButton_orderViewPanel1 = new javax.swing.JButton();
        closeButton_newIngressoPanel = new javax.swing.JButton();
        addArticleButton_newIngressoPanel = new javax.swing.JButton();
        textFieldPosizioni1 = new javax.swing.JTextField();
        textFieldPosizioni2 = new javax.swing.JTextField();
        textFieldPosizioni3 = new javax.swing.JTextField();
        textFieldPosizioni4 = new javax.swing.JTextField();
        textFieldPosizioni5 = new javax.swing.JTextField();
        textFieldPosizioni6 = new javax.swing.JTextField();
        textFieldPosizioni7 = new javax.swing.JTextField();
        textFieldPosizioni8 = new javax.swing.JTextField();
        textFieldPosizioni9 = new javax.swing.JTextField();
        textFieldPosizioni10 = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Articoli");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jButton5.setText("Negozi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, -1));

        jToggleButton1.setText("Ingressi");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        adminPanel.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 90, -1));

        jToggleButton3.setText("Ordini");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        adminPanel.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, -1));

        getContentPane().add(adminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 150));

        visualizzaOrdiniPanel.setBackground(new java.awt.Color(255, 102, 102));
        visualizzaOrdiniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 30)); // NOI18N
        jLabel8.setText("Visualizza Ordini:");
        visualizzaOrdiniPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        negozioInfo_OrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        negozioInfo_OrderPanel.setText("Vedi info Negozio");
        visualizzaOrdiniPanel.add(negozioInfo_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        indietroButton_OrderPanel.setText("<");
        indietroButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_OrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(indietroButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 41, -1));

        avantiButton_OrderPanel.setText(">");
        avantiButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_OrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(avantiButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, -1));

        modificaButtonOrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        modificaButtonOrderPanel.setText("Modifica");
        visualizzaOrdiniPanel.add(modificaButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        chiudiButtonOrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        chiudiButtonOrderPanel.setText("Chiudi");
        chiudiButtonOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButtonOrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(chiudiButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        visualizzaOrdiniPanel.add(searchFieldOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 93, -1));

        jLabel13.setText("Cerca:");
        visualizzaOrdiniPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        newOrderButton_orderViewPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        newOrderButton_orderViewPanel.setText("Crea Nuovo Ordine");
        newOrderButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButton_orderViewPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(newOrderButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        orderIDLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderIDLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        orderIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizzaOrdiniPanel.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        orderDataLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderDataLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaOrdiniPanel.add(orderDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 60));

        orderPrezzoLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderPrezzoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaOrdiniPanel.add(orderPrezzoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 60));

        orderNomeNegozioLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderNomeNegozioLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaOrdiniPanel.add(orderNomeNegozioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 70));

        articoliQuantitaOrderPanel.setText("jLabel9");
        articoliQuantitaOrderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        visualizzaOrdiniPanel.add(articoliQuantitaOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 240, 130));

        jToggleButton2.setText("Genera Uscita");
        visualizzaOrdiniPanel.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        getContentPane().add(visualizzaOrdiniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 600, 400));

        creaNuovoOrdinePanel.setBackground(new java.awt.Color(255, 255, 0));
        creaNuovoOrdinePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel17.setText("Crea un nuovo ordine:");
        creaNuovoOrdinePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, 37));

        jLabel18.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13))); // NOI18N
        creaNuovoOrdinePanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        creaOrdineButton_orderViewPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        creaOrdineButton_orderViewPanel.setText("Crea");
        creaOrdineButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaOrdineButton_orderViewPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(creaOrdineButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, -1));

        closeButton_newOrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        closeButton_newOrderPanel.setText("Chiudi");
        closeButton_newOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_newOrderPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(closeButton_newOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, -1));

        corriereField_NewOrderPanel.setBackground(new java.awt.Color(255, 255, 0));
        corriereField_NewOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        corriereField_NewOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Corriere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13))); // NOI18N
        corriereField_NewOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corriereField_NewOrderPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(corriereField_NewOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 50));

        ComboBoxNegozio.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        ComboBoxNegozio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxNegozio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNegozioActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(ComboBoxNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        comboBoxArticoli1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13))); // NOI18N
        creaNuovoOrdinePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 60));

        addArticleButton_newOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        addArticleButton_newOrderPanel.setText("Aggiungi Articolo");
        addArticleButton_newOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArticleButton_newOrderPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(addArticleButton_newOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel4.setText("Quantità:");
        creaNuovoOrdinePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        comboBoxArticoli2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel7.setText("Articoli: ");
        creaNuovoOrdinePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        comboBoxArticoli3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        comboBoxArticoli4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        comboBoxArticoli5.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        comboBoxArticoli6.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        comboBoxArticoli7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        comboBoxArticoli8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        comboBoxArticoli9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        comboBoxArticoli10.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        quantitaField10.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField10.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField10ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, -1));

        quantitaField2.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField2ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, -1));

        quantitaField1.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField1ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 60, -1));

        quantitaField3.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField3ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 60, -1));

        quantitaField4.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField4ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, -1));

        quantitaField5.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField5.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField5ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 60, -1));

        quantitaField6.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField6.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField6ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, -1));

        quantitaField7.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField7ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, -1));

        quantitaField8.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField8ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, -1));

        quantitaField9.setBackground(new java.awt.Color(255, 255, 0));
        quantitaField9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantitaField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField9ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 60, -1));

        corniceArticoloLabel_newOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        corniceArticoloLabel_newOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13))); // NOI18N
        creaNuovoOrdinePanel.add(corniceArticoloLabel_newOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 360, 350));

        getContentPane().add(creaNuovoOrdinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 540, 430));

        creaNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        creaNegozioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel9.setText("CREA NEGOZIO");
        creaNegozioPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 43));

        indirizzoField_newNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        indirizzoField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        indirizzoField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indirizzoField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(indirizzoField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 224, -1));

        CodiceFiscaleField_NewNegozio.setBackground(new java.awt.Color(255, 204, 204));
        CodiceFiscaleField_NewNegozio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        CodiceFiscaleField_NewNegozio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceFiscaleField_NewNegozioActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(CodiceFiscaleField_NewNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 224, 40));

        nomeField_newNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        nomeField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        nomeField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(nomeField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 224, -1));

        cittaField_NewNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        cittaField_NewNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        cittaField_NewNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cittaField_NewNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(cittaField_NewNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 224, -1));

        jButton6.setText("Cancella");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        creaFromCreaNegozioPanel.setText("Crea");
        creaFromCreaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaFromCreaNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(creaFromCreaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        closeButton_creaNegozioPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        closeButton_creaNegozioPanel.setText("Chiudi");
        closeButton_creaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_creaNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(closeButton_creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        modificaFromNewNegozioPanel.setText("Modifica");
        modificaFromNewNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaFromNewNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(modificaFromNewNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 90, -1));

        getContentPane().add(creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 500, 180));

        negoziPanel.setBackground(new java.awt.Color(255, 0, 255));
        negoziPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel14.setText("Visualizza Negozio:");
        negoziPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel15.setText("Visualizza Ordine:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        negoziPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 720, 550, 340));

        avantiButton_NegozioPanel.setText(">");
        avantiButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(avantiButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 40, -1));

        indietroButton_NegozioPanel.setText("<");
        indietroButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(indietroButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 41, -1));
        negoziPanel.add(searchField_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 93, -1));

        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Cerca", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 200, 50));

        modificaButton_NegozioPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        modificaButton_NegozioPanel.setText("Modifica");
        modificaButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(modificaButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        codiceFiscaleLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        negoziPanel.add(codiceFiscaleLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 60));

        nomeNegozioLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        negoziPanel.add(nomeNegozioLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 60));

        indirizzoLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        negoziPanel.add(indirizzoLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, 60));

        cittaNegozio_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        negoziPanel.add(cittaNegozio_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 60));

        CreaNegozioButton_NegozioPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        CreaNegozioButton_NegozioPanel.setText("Crea Negozio");
        CreaNegozioButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaNegozioButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(CreaNegozioButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        selezionaButton_NegozioPanel.setText("Seleziona");
        selezionaButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(selezionaButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        closeButton_NegozioPanel1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        closeButton_NegozioPanel1.setText("Chiudi");
        closeButton_NegozioPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_NegozioPanel1ActionPerformed(evt);
            }
        });
        negoziPanel.add(closeButton_NegozioPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        getContentPane().add(negoziPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 550, 270));

        loginPanel.setBackground(new java.awt.Color(0, 153, 0));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 143, -1));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 60));

        cancelPinButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        cancelPinButton.setText("Cancel");
        cancelPinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPinButtonActionPerformed(evt);
            }
        });
        loginPanel.add(cancelPinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        loginButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        usrLabel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        usrLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        loginPanel.add(usrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 240, 60));

        usrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrFieldActionPerformed(evt);
            }
        });
        usrField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usrFieldKeyPressed(evt);
            }
        });
        loginPanel.add(usrField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 149, -1));

        loginTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        loginTitleLabel.setText("LOGIN");
        loginPanel.add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 260));

        visualizzaArticoliPanel.setBackground(new java.awt.Color(0, 255, 255));
        visualizzaArticoliPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Visualizza Articoli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Avenir", 0, 36))); // NOI18N
        visualizzaArticoliPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 60));

        IDLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        IDLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(IDLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 50));

        prezzoLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        prezzoLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(prezzoLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 50));

        dataLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        dataLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data inserimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(dataLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 50));

        nomeLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        nomeLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(nomeLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 200, 50));

        descrizioneLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        descrizioneLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(descrizioneLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 50));

        sportLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        sportLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sport", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(sportLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 50));

        materialiLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        materialiLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Materiale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(materialiLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 50));

        avantiButton_VisualizzaArticoloPanel.setText(">");
        avantiButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(avantiButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, 30));

        indietroButton_VisualizzaArticoloPanel.setText("<");
        indietroButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(indietroButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 41, -1));

        modificaButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        modificaButton_VisualizzaArticoloPanel.setText("Modifica");
        modificaButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(modificaButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        creaNegozioButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        creaNegozioButton_VisualizzaArticoloPanel.setText("Crea Articolo");
        creaNegozioButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaNegozioButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(creaNegozioButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        chiudiButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        chiudiButton_VisualizzaArticoloPanel.setText("Chiudi");
        chiudiButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(chiudiButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jLabel30.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 18))); // NOI18N
        visualizzaArticoliPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 280));

        cercaLabel_VisualizzaArticoloPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        visualizzaArticoliPanel.add(cercaLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 30, 30));

        jLabel35.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, 60));

        getContentPane().add(visualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 510, 400));

        newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        newArticlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcioRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        calcioRadioButton.setText("Calcio");
        newArticlePanel.add(calcioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        nuotoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        nuotoRadioButton.setText("Nuoto");
        newArticlePanel.add(nuotoRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        palestraRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        palestraRadioButton.setText("Palestra");
        newArticlePanel.add(palestraRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        tennisRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        tennisRadioButton.setText("Tennis");
        tennisRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tennisRadioButtonActionPerformed(evt);
            }
        });
        newArticlePanel.add(tennisRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        sciiRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        sciiRadioButton.setText("Scii");
        newArticlePanel.add(sciiRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        ciclismoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ciclismoRadioButton.setText("Ciclismo");
        newArticlePanel.add(ciclismoRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        rugbyRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        rugbyRadioButton.setText("Rugby");
        newArticlePanel.add(rugbyRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        atleticaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        atleticaRadioButton.setText("Atletica");
        newArticlePanel.add(atleticaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        hockeyRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        hockeyRadioButton.setText("Hockey");
        newArticlePanel.add(hockeyRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        golfRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        golfRadioButton.setText("Golf");
        newArticlePanel.add(golfRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        danzaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        danzaRadioButton.setText("Danza");
        newArticlePanel.add(danzaRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        pallavoloRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        pallavoloRadioButton.setText("Pallavolo");
        newArticlePanel.add(pallavoloRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        poliestereRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        poliestereRadioButton.setText("Poliestere");
        newArticlePanel.add(poliestereRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        siliconeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        siliconeRadioButton.setText("Silicone");
        newArticlePanel.add(siliconeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        fintaPelleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        fintaPelleRadioButton.setText("Finta Pelle");
        newArticlePanel.add(fintaPelleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        goreTexRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        goreTexRadioButton.setText("Gore-Tex");
        newArticlePanel.add(goreTexRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        elastanRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        elastanRadioButton.setText("Poliammide");
        newArticlePanel.add(elastanRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        polietileneRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        polietileneRadioButton.setText("Polietilene");
        newArticlePanel.add(polietileneRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        poliammideRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        poliammideRadioButton.setText("Elastan");
        newArticlePanel.add(poliammideRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        basketRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        basketRadioButton.setText("Basket");
        basketRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basketRadioButtonActionPerformed(evt);
            }
        });
        newArticlePanel.add(basketRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        raftingRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        raftingRadioButton.setText("Rufting");
        newArticlePanel.add(raftingRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        titolo_newArticlePanel.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        titolo_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        titolo_newArticlePanel.setText("Inserisci un nuovo Articolo");
        newArticlePanel.add(titolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 480, 46));

        prezzoField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        prezzoField_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        prezzoField_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        prezzoField_newArticlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prezzoField_newArticlePanelMouseClicked(evt);
            }
        });
        prezzoField_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prezzoField_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(prezzoField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 60));

        dayField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        dayField_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        dayField_newArticlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newArticlePanel.add(dayField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 20, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("/");
        newArticlePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        monthField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        monthField_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        monthField_newArticlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newArticlePanel.add(monthField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 27, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("/");
        newArticlePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        yearField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        yearField_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        yearField_newArticlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        newArticlePanel.add(yearField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 70, -1));

        dataOdierna_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        dataOdierna_newArticlePanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        dataOdierna_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        dataOdierna_newArticlePanel.setText("Data Odierna");
        dataOdierna_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOdierna_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(dataOdierna_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 180, -1));

        cancellaButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        cancellaButton_newArticlePanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        cancellaButton_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        cancellaButton_newArticlePanel.setText("Cancella");
        cancellaButton_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaButton_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(cancellaButton_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 200, 40));

        inserisciButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        inserisciButton_newArticlePanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        inserisciButton_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        inserisciButton_newArticlePanel.setText("Inserisci");
        inserisciButton_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciButton_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(inserisciButton_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 200, 50));

        descrizioneFieldTipoArticolo_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        descrizioneFieldTipoArticolo_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        descrizioneFieldTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        descrizioneFieldTipoArticolo_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descrizioneFieldTipoArticolo_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(descrizioneFieldTipoArticolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 450, 90));

        nomeFieldTipoArticolo_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        nomeFieldTipoArticolo_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        nomeFieldTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        nomeFieldTipoArticolo_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldTipoArticolo_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(nomeFieldTipoArticolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 60));

        sportLabelTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Sport", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(sportLabelTipoArticolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, 250));

        materialeTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Materiale", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(materialeTipoArticolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 250));

        dataLabel_newArticlePanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        dataLabel_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(dataLabel_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 100));

        TipoArticoloLabel_NewArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(TipoArticoloLabel_NewArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 450));

        modificaButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaButton_newArticlePanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        modificaButton_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaButton_newArticlePanel.setText("Modifica");
        modificaButton_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(modificaButton_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 200, 50));

        errorLabel_creaNuovoArticoloPanel.setBackground(new java.awt.Color(255, 204, 204));
        errorLabel_creaNuovoArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        errorLabel_creaNuovoArticoloPanel.setText("Error");
        errorLabel_creaNuovoArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true), "Errore!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 1, 20), new java.awt.Color(255, 51, 51))); // NOI18N
        newArticlePanel.add(errorLabel_creaNuovoArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 190, 110));

        getContentPane().add(newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 730, 540));

        creaIngressoPanel.setBackground(new java.awt.Color(204, 0, 204));
        creaIngressoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxIngressoArticoli4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 180, -1, -1));

        comboBoxIngressoArticoli5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxIngressoArticoli5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIngressoArticoli5ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(comboBoxIngressoArticoli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 213, -1, -1));

        comboBoxIngressoArticoli6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 246, -1, -1));

        comboBoxIngressoArticoli7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 279, -1, -1));

        comboBoxIngressoArticoli8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 312, -1, -1));

        comboBoxIngressoArticoli9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli9, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 345, -1, -1));

        comboBoxIngressoArticoli10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli10, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 378, -1, -1));

        comboBoxIngressoArticoli3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 147, -1, -1));

        comboBoxIngressoArticoli2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 114, -1, -1));

        comboBoxIngressoArticoli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 81, -1, -1));

        textFieldQuantita1.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita1.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 70, -1));

        textFieldQuantita2.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita2.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, -1));

        textFieldQuantita3.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita3.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textFieldQuantita3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantita3ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(textFieldQuantita3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 70, -1));

        textFieldQuantita4.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita4.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, -1));

        textFieldQuantita5.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita5.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textFieldQuantita5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantita5ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(textFieldQuantita5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 70, -1));

        textFieldQuantita6.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita6.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 70, -1));

        textFieldQuantita7.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita7.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textFieldQuantita7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantita7ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(textFieldQuantita7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 70, -1));

        textFieldQuantita9.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita9.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 70, -1));

        textFieldQuantita8.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita8.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, -1));

        textFieldQuantita10.setBackground(new java.awt.Color(204, 0, 204));
        textFieldQuantita10.setForeground(new java.awt.Color(255, 255, 255));
        textFieldQuantita10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldQuantita10, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 381, 70, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crea nuovo ingresso:");
        creaIngressoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 50));

        creaOrdineButton_orderViewPanel1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        creaOrdineButton_orderViewPanel1.setText("Crea");
        creaOrdineButton_orderViewPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaOrdineButton_orderViewPanel1ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(creaOrdineButton_orderViewPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 150, -1));

        closeButton_newIngressoPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        closeButton_newIngressoPanel.setText("Chiudi");
        closeButton_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(closeButton_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 150, -1));

        addArticleButton_newIngressoPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        addArticleButton_newIngressoPanel.setText("Aggiungi Articolo");
        addArticleButton_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArticleButton_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(addArticleButton_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        textFieldPosizioni1.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni1.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 80, -1));

        textFieldPosizioni2.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni2.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, -1));

        textFieldPosizioni3.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni3.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, -1));

        textFieldPosizioni4.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni4.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, -1));

        textFieldPosizioni5.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni5.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 80, -1));

        textFieldPosizioni6.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni6.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textFieldPosizioni6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPosizioni6ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(textFieldPosizioni6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, -1));

        textFieldPosizioni7.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni7.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, -1));

        textFieldPosizioni8.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni8.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, -1));

        textFieldPosizioni9.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni9.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 80, -1));

        textFieldPosizioni10.setBackground(new java.awt.Color(204, 0, 204));
        textFieldPosizioni10.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPosizioni10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(textFieldPosizioni10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 80, -1));

        getContentPane().add(creaIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 620, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    //ACTION PERFORMED
    //

    private void usrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrFieldActionPerformed

    //PULSANTE CANCELLA PANNELLO PIN
    private void cancelPinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPinButtonActionPerformed
        usrField.setText("");
        pinField.setText("");
    }//GEN-LAST:event_cancelPinButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        /*
        //CONTROLLO DA IMPLEMENTARE A PROGETTO FINITO
        String pin = pinField.getText();
        String user = usrField.getText();

        int type = m.login(new Utente(user, pin, 1));

        if (type == -1) {
            JOptionPane.showMessageDialog(null, "Impossibile effettuare il login; riprovare più tardi, se il problema persiste contattae l'amministratore di sistema il prima possibile");
            usrField.setText("");
            pinField.setText("");
        } else {
            usrField.setText("");
        }
        pinField.setText("");
        JOptionPane.showMessageDialog(null, "Login effettuato correttamente\nTipoAccount: " + type);
        hideAll();//nascondo tutti i pannelli
        adminPanel.setVisible(true);
         */
        hideAll();//nascondo tutti i pannelli
        adminPanel.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void chiudiButtonOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButtonOrderPanelActionPerformed
        exit();
    }//GEN-LAST:event_chiudiButtonOrderPanelActionPerformed

    private void usrFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usrFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrFieldKeyPressed

    private void avantiButton_OrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiButton_OrderPanelActionPerformed
        indexOrder++;
        ordini();
    }//GEN-LAST:event_avantiButton_OrderPanelActionPerformed

    private void indietroButton_OrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_OrderPanelActionPerformed
        indexOrder--;
        ordini();
    }//GEN-LAST:event_indietroButton_OrderPanelActionPerformed

    private void newOrderButton_orderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButton_orderViewPanelActionPerformed
        addArticleButton_newOrderPanel.setEnabled(true);
        ComboBoxNegozio.removeAllItems();
        comboBoxArticoli1.removeAllItems();
        comboBoxArticoli2.removeAllItems();
        comboBoxArticoli3.removeAllItems();
        comboBoxArticoli4.removeAllItems();
        comboBoxArticoli5.removeAllItems();
        comboBoxArticoli6.removeAllItems();
        comboBoxArticoli7.removeAllItems();
        comboBoxArticoli8.removeAllItems();
        comboBoxArticoli9.removeAllItems();
        comboBoxArticoli10.removeAllItems();
        comboBoxArticoli2.setEnabled(false);
        comboBoxArticoli3.setEnabled(false);
        comboBoxArticoli4.setEnabled(false);
        comboBoxArticoli5.setEnabled(false);
        comboBoxArticoli6.setEnabled(false);
        comboBoxArticoli7.setEnabled(false);
        comboBoxArticoli8.setEnabled(false);
        comboBoxArticoli9.setEnabled(false);
        comboBoxArticoli10.setEnabled(false);
        quantitaField2.setEnabled(false);
        quantitaField3.setEnabled(false);
        quantitaField4.setEnabled(false);
        quantitaField5.setEnabled(false);
        quantitaField6.setEnabled(false);
        quantitaField7.setEnabled(false);
        quantitaField8.setEnabled(false);
        quantitaField9.setEnabled(false);
        quantitaField10.setEnabled(false);
        orderArticleSelected = 1;
        hideAll();
        addArticleButton_newOrderPanel.setEnabled(true);
        creaNuovoOrdinePanel.setVisible(true);
        corriereField_NewOrderPanel.setText("");
        int i = 0;

        for (i = 0; i < m.negoziSize(); i++) {
            ComboBoxNegozio.addItem(m.getNegozi(i).getNome());
        }

        for (i = 0; i < m.articoliSize(); i++) {
            comboBoxArticoli1.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli2.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli3.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli4.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli5.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli6.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli7.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli8.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli9.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxArticoli9.addItem(m.getArticolo(i).getTipoArticolo().getName());
        }
    }//GEN-LAST:event_newOrderButton_orderViewPanelActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        hideAll();
        articoli();
        visualizzaArticoliPanel.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void closeButton_creaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_creaNegozioPanelActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_creaNegozioPanelActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        hideAll();
        creaIngressoPanel.setVisible(true);
        
        comboBoxIngressoArticoli1.removeAllItems();
        comboBoxIngressoArticoli2.removeAllItems();
        comboBoxIngressoArticoli3.removeAllItems();
        comboBoxIngressoArticoli4.removeAllItems();
        comboBoxIngressoArticoli5.removeAllItems();
        comboBoxIngressoArticoli6.removeAllItems();
        comboBoxIngressoArticoli7.removeAllItems();
        comboBoxIngressoArticoli8.removeAllItems();
        comboBoxIngressoArticoli9.removeAllItems();
        comboBoxIngressoArticoli10.removeAllItems();
        comboBoxIngressoArticoli2.setEnabled(false);
        comboBoxIngressoArticoli3.setEnabled(false);
        comboBoxIngressoArticoli4.setEnabled(false);
        comboBoxIngressoArticoli5.setEnabled(false);
        comboBoxIngressoArticoli6.setEnabled(false);
        comboBoxIngressoArticoli7.setEnabled(false);
        comboBoxIngressoArticoli8.setEnabled(false);
        comboBoxIngressoArticoli9.setEnabled(false);
        comboBoxIngressoArticoli10.setEnabled(false);
        textFieldPosizioni2.setEditable(false);
        textFieldPosizioni3.setEditable(false);
        textFieldPosizioni4.setEditable(false);
        textFieldPosizioni5.setEditable(false);
        textFieldPosizioni6.setEditable(false);
        textFieldPosizioni7.setEditable(false);
        textFieldPosizioni8.setEditable(false);
        textFieldPosizioni9.setEditable(false);
        textFieldPosizioni10.setEditable(false);
        textFieldQuantita2.setEditable(false);
        textFieldQuantita3.setEditable(false);
        textFieldQuantita4.setEditable(false);
        textFieldQuantita5.setEditable(false);
        textFieldQuantita6.setEditable(false);
        textFieldQuantita7.setEditable(false);
        textFieldQuantita8.setEditable(false);
        textFieldQuantita9.setEditable(false);
        textFieldQuantita10.setEditable(false);
        
        for (int i = 0; i < m.articoliSize(); i++) {
            comboBoxIngressoArticoli1.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli2.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli3.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli4.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli5.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli6.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli7.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli8.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli9.addItem(m.getArticolo(i).getTipoArticolo().getName());
            comboBoxIngressoArticoli10.addItem(m.getArticolo(i).getTipoArticolo().getName());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        hideAll();
        negoziPanel.setVisible(true);
        indexShop = 0;
        negozi();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void indietroButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_NegozioPanelActionPerformed
        indexShop--;
        negozi();
    }//GEN-LAST:event_indietroButton_NegozioPanelActionPerformed

    private void avantiButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiButton_NegozioPanelActionPerformed
        indexShop++;
        negozi();
    }//GEN-LAST:event_avantiButton_NegozioPanelActionPerformed

    private void indirizzoField_newNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indirizzoField_newNegozioPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indirizzoField_newNegozioPanelActionPerformed

    private void CodiceFiscaleField_NewNegozioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodiceFiscaleField_NewNegozioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodiceFiscaleField_NewNegozioActionPerformed

    private void nomeField_newNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeField_newNegozioPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeField_newNegozioPanelActionPerformed

    private void cittaField_NewNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cittaField_NewNegozioPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cittaField_NewNegozioPanelActionPerformed

    private void closeButton_NegozioPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_NegozioPanel1ActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_NegozioPanel1ActionPerformed

    private void CreaNegozioButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaNegozioButton_NegozioPanelActionPerformed
        hideAll();
        creaNegozioPanel.setVisible(true);
    }//GEN-LAST:event_CreaNegozioButton_NegozioPanelActionPerformed

    private void creaFromCreaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaFromCreaNegozioPanelActionPerformed
        String cf = CodiceFiscaleField_NewNegozio.getText();
        String nome = nomeField_newNegozioPanel.getText();
        String indirizzo = indirizzoField_newNegozioPanel.getText();
        String citta = cittaField_NewNegozioPanel.getText();
        m.addNegozi(new Negozio(cf, nome, indirizzo, citta));
        JOptionPane.showMessageDialog(null, "Utente creato con successo!");
        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        indexShop = m.negoziSize() - 1;
        negozi();
    }//GEN-LAST:event_creaFromCreaNegozioPanelActionPerformed

    private void closeButton_newOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_newOrderPanelActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_newOrderPanelActionPerformed

    private void chiudiButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButton_VisualizzaArticoloPanelActionPerformed
        exit();
    }//GEN-LAST:event_chiudiButton_VisualizzaArticoloPanelActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        ordini();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void modificaButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButton_NegozioPanelActionPerformed
        hideAll();
        creaNegozioPanel.setVisible(true);
        CodiceFiscaleField_NewNegozio.setText(m.getNegozi(indexShop).getCodiceFiscale());
        nomeField_newNegozioPanel.setText(m.getNegozi(indexShop).getNome());
        indirizzoField_newNegozioPanel.setText(m.getNegozi(indexShop).getindirizzo());
        cittaField_NewNegozioPanel.setText(m.getNegozi(indexShop).getCitta());
        modificaFromNewNegozioPanel.setVisible(true);
        creaFromCreaNegozioPanel.setVisible(false);
    }//GEN-LAST:event_modificaButton_NegozioPanelActionPerformed

    private void modificaFromNewNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaFromNewNegozioPanelActionPerformed
        String cf = CodiceFiscaleField_NewNegozio.getText();
        String nome = nomeField_newNegozioPanel.getText();
        String indirizzo = indirizzoField_newNegozioPanel.getText();
        String citta = cittaField_NewNegozioPanel.getText();

        m.getNegozi(indexShop).setCodiceFiscale(cf);
        m.getNegozi(indexShop).setNome(nome);
        m.getNegozi(indexShop).setIndirizzo(indirizzo);
        m.getNegozi(indexShop).setCitta(citta);

        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        negozi();
    }//GEN-LAST:event_modificaFromNewNegozioPanelActionPerformed

    private void selezionaButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaButton_NegozioPanelActionPerformed
        String corriere = corriereField_NewOrderPanel.getText();
        //Ordine n = m.addOrdine(new Ordine(m.getNegozi(indexShop)));
        //m.addUscita(m, n)
    }//GEN-LAST:event_selezionaButton_NegozioPanelActionPerformed

    private void avantiButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiButton_VisualizzaArticoloPanelActionPerformed
        indexArticle++;
        articoli();
    }//GEN-LAST:event_avantiButton_VisualizzaArticoloPanelActionPerformed

    private void indietroButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_VisualizzaArticoloPanelActionPerformed
        indexArticle--;
        articoli();
    }//GEN-LAST:event_indietroButton_VisualizzaArticoloPanelActionPerformed

    private void tennisRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tennisRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tennisRadioButtonActionPerformed

    private void inserisciButton_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciButton_newArticlePanelActionPerformed

        //di default si assume che il nuoto e il polestere siano rispettivamente lo sport e il materiale di default
        int tipoMateriale = 0;
        int sport = 0;

        //SPORT
        if (nuotoRadioButton.isSelected()) {
            sport = 0;
        }
        if (calcioRadioButton.isSelected()) {
            sport = 1;
        }
        if (palestraRadioButton.isSelected()) {
            sport = 2;
        }
        if (tennisRadioButton.isSelected()) {
            sport = 3;
        }
        if (sciiRadioButton.isSelected()) {
            sport = 4;
        }
        if (basketRadioButton.isSelected()) {
            sport = 5;
        }
        if (pallavoloRadioButton.isSelected()) {
            sport = 6;
        }
        if (raftingRadioButton.isSelected()) {
            sport = 7;
        }
        if (ciclismoRadioButton.isSelected()) {
            sport = 8;
        }
        if (rugbyRadioButton.isSelected()) {
            sport = 9;
        }
        if (atleticaRadioButton.isSelected()) {
            sport = 10;
        }
        if (hockeyRadioButton.isSelected()) {
            sport = 11;
        }
        if (golfRadioButton.isSelected()) {
            sport = 12;
        }
        if (danzaRadioButton.isSelected()) {
            sport = 13;
        }

        //Materiali 
        if (poliestereRadioButton.isSelected()) {
            tipoMateriale = 0;
        }
        if (siliconeRadioButton.isSelected()) {
            tipoMateriale = 1;
        }
        if (fintaPelleRadioButton.isSelected()) {
            tipoMateriale = 2;
        }
        if (goreTexRadioButton.isSelected()) {
            tipoMateriale = 3;
        }
        if (poliammideRadioButton.isSelected()) {
            tipoMateriale = 4;
        }
        if (polietileneRadioButton.isSelected()) {
            tipoMateriale = 5;
        }
        if (elastanRadioButton.isSelected()) {
            tipoMateriale = 6;
        }

        try {

            System.out.println("1");
            //prendo i dati inseriti
            String nome = nomeFieldTipoArticolo_newArticlePanel.getText();
            String descrizione = descrizioneFieldTipoArticolo_newArticlePanel.getText();
            int day = Integer.parseInt(dayField_newArticlePanel.getText());
            int month = Integer.parseInt(monthField_newArticlePanel.getText());
            int year = Integer.parseInt(yearField_newArticlePanel.getText());
            System.out.println("2");
            GregorianCalendar c = new GregorianCalendar(year, month, day);
            float prezzo = Float.parseFloat(prezzoField_newArticlePanel.getText());

            //aggiungo l'articolo alla lista in magazzino
            m.addArticolo(new Articolo(prezzo, c, new TipoArticolo(nome, descrizione, sport, tipoMateriale)));
            System.out.println("3");

            nomeFieldTipoArticolo_newArticlePanel.setText("");
            descrizioneFieldTipoArticolo_newArticlePanel.setText("");
            prezzoField_newArticlePanel.setText("");
            dayField_newArticlePanel.setText("");
            monthField_newArticlePanel.setText("");
            yearField_newArticlePanel.setText("");
            poliestereRadioButton.setSelected(true);
            nuotoRadioButton.setSelected(true);
            System.out.println("4");
            hideAll();//nascondo tutto 

            indexArticle = m.articoliSize() - 1;//faccio puntare all'ultimo prodotto creato
            articoli();//aggiorno la view degli articoli
            visualizzaArticoliPanel.setVisible(true);
            System.out.println("5");
        } catch (Exception e) {
            errorLabel_creaNuovoArticoloPanel.setText("Impossibile creare un nuovo Articolo!\n Controllare tutti i campi\n e correggere tutti gli eventuali errori!");
            errorLabel_creaNuovoArticoloPanel.setVisible(true);
            nomeFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            descrizioneFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            prezzoField_newArticlePanel.setBackground(Color.red);
        }

    }//GEN-LAST:event_inserisciButton_newArticlePanelActionPerformed

    private void creaNegozioButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaNegozioButton_VisualizzaArticoloPanelActionPerformed
        hideAll();
        modificaButton_newArticlePanel.setVisible(false);
        inserisciButton_newArticlePanel.setVisible(true);
        nuotoRadioButton.setSelected(true);
        poliestereRadioButton.setSelected(true);
        newArticlePanel.setVisible(true);
    }//GEN-LAST:event_creaNegozioButton_VisualizzaArticoloPanelActionPerformed

    private void basketRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basketRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basketRadioButtonActionPerformed

    private void prezzoField_newArticlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prezzoField_newArticlePanelMouseClicked
        Color a = new Color(0, 153, 255);
        prezzoField_newArticlePanel.setBackground(a);
    }//GEN-LAST:event_prezzoField_newArticlePanelMouseClicked

    private void modificaButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButton_VisualizzaArticoloPanelActionPerformed
        hideAll();//nascondo tutto

        newArticlePanel.setVisible(true);

        //configuro il testo in base ai valori dell'oggetto
        nomeFieldTipoArticolo_newArticlePanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getName());
        descrizioneFieldTipoArticolo_newArticlePanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getDescription());
        prezzoField_newArticlePanel.setText(m.getArticolo(indexArticle).getPrezzo() + "");
        dayField_newArticlePanel.setText(m.getArticolo(indexArticle).getDay());
        monthField_newArticlePanel.setText(m.getArticolo(indexArticle).getMonth());
        yearField_newArticlePanel.setText(m.getArticolo(indexArticle).getYear());
        inserisciButton_newArticlePanel.setVisible(false);
        modificaButton_newArticlePanel.setVisible(true);

        switch (m.getArticolo(indexArticle).getTipoArticolo().getSports()) {
            case "NUOTO":
                nuotoRadioButton.setSelected(true);
                break;
            case "Calcio":
                calcioRadioButton.setSelected(true);
                break;
            case "Palestra":
                palestraRadioButton.setSelected(true);
                break;
            case "Tennis":
                tennisRadioButton.setSelected(true);
                break;
            case "Scii":
                sciiRadioButton.setSelected(true);
                break;
            case "Basket":
                basketRadioButton.setSelected(true);
                break;
            case "Rafting":
                raftingRadioButton.setSelected(true);
                break;
            case "Ciclismo":
                ciclismoRadioButton.setSelected(true);
                break;
            case "Rugby":
                rugbyRadioButton.setSelected(true);
                break;
            case "Atletica":
                atleticaRadioButton.setSelected(true);
                break;
            case "Hockey":
                hockeyRadioButton.setSelected(true);
                break;
            case "Golf":
                golfRadioButton.setSelected(true);
                break;
            case "Pallavolo":
                pallavoloRadioButton.setSelected(true);
                break;
            case "Danza":
                danzaRadioButton.setSelected(true);
                break;
        }

        switch (m.getArticolo(indexArticle).getTipoArticolo().getMaterial()) {
            case "Poliestere":
                poliestereRadioButton.setSelected(true);
                break;
            case "Silicone":
                siliconeRadioButton.setSelected(true);
                break;
            case "Finta Pelle":
                fintaPelleRadioButton.setSelected(true);
                break;
            case "GORE-TEX":
                goreTexRadioButton.setSelected(true);
                break;
            case "Elastan":
                poliammideRadioButton.setSelected(true);
                break;
            case "Polietilene":
                polietileneRadioButton.setSelected(true);
                break;
            case "Poliammide":
                elastanRadioButton.setSelected(true);
                break;
        }


    }//GEN-LAST:event_modificaButton_VisualizzaArticoloPanelActionPerformed


    private void modificaButton_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButton_newArticlePanelActionPerformed
        int tipoMateriale = 0;
        int sport = 0;

        //SPORT
        if (nuotoRadioButton.isSelected()) {
            sport = 0;
        }
        if (calcioRadioButton.isSelected()) {
            sport = 1;
        }
        if (palestraRadioButton.isSelected()) {
            sport = 2;
        }
        if (tennisRadioButton.isSelected()) {
            sport = 3;
        }
        if (sciiRadioButton.isSelected()) {
            sport = 4;
        }
        if (basketRadioButton.isSelected()) {
            sport = 5;
        }
        if (pallavoloRadioButton.isSelected()) {
            sport = 6;
        }
        if (raftingRadioButton.isSelected()) {
            sport = 7;
        }
        if (ciclismoRadioButton.isSelected()) {
            sport = 8;
        }
        if (rugbyRadioButton.isSelected()) {
            sport = 9;
        }
        if (atleticaRadioButton.isSelected()) {
            sport = 10;
        }
        if (hockeyRadioButton.isSelected()) {
            sport = 11;
        }
        if (golfRadioButton.isSelected()) {
            sport = 12;
        }
        if (danzaRadioButton.isSelected()) {
            sport = 13;
        }

        //MATERIALI
        if (poliestereRadioButton.isSelected()) {
            tipoMateriale = 0;
        }
        if (siliconeRadioButton.isSelected()) {
            tipoMateriale = 1;
        }
        if (fintaPelleRadioButton.isSelected()) {
            tipoMateriale = 2;
        }
        if (goreTexRadioButton.isSelected()) {
            tipoMateriale = 3;
        }
        if (poliammideRadioButton.isSelected()) {
            tipoMateriale = 4;
        }
        if (polietileneRadioButton.isSelected()) {
            tipoMateriale = 5;
        }
        if (elastanRadioButton.isSelected()) {
            tipoMateriale = 6;
        }

        try {
            //prendo i dati inseriti
            String nome = nomeFieldTipoArticolo_newArticlePanel.getText();
            String descrizione = descrizioneFieldTipoArticolo_newArticlePanel.getText();
            int day = Integer.parseInt(dayField_newArticlePanel.getText());
            int month = Integer.parseInt(monthField_newArticlePanel.getText());
            int year = Integer.parseInt(yearField_newArticlePanel.getText());
            float prezzo = Float.parseFloat(prezzoField_newArticlePanel.getText());

            //per comodità modifico tutto
            m.getArticolo(indexArticle).setData(year, month, day);
            m.getArticolo(indexArticle).setPrezzo(prezzo);
            m.getArticolo(indexArticle).setTipoArticolo(new TipoArticolo(nome, descrizione, sport, tipoMateriale));
            System.out.println("sport: " + sport + "materiale: " + tipoMateriale);

            nomeFieldTipoArticolo_newArticlePanel.setText("");
            descrizioneFieldTipoArticolo_newArticlePanel.setText("");
            prezzoField_newArticlePanel.setText("");
            dayField_newArticlePanel.setText("");
            monthField_newArticlePanel.setText("");
            yearField_newArticlePanel.setText("");
            poliestereRadioButton.setSelected(true);
            nuotoRadioButton.setSelected(true);

            hideAll();//nascondo tutto
            articoli();//aggiorno la view di articoli
            //visualizzo gli articoli
            visualizzaArticoliPanel.setVisible(true);
            errorLabel_creaNuovoArticoloPanel.setVisible(false);
        } catch (NumberFormatException e) {
            errorLabel_creaNuovoArticoloPanel.setText("Impossibile creare un nuovo Articolo!\n Controllare tutti i campi\n e correggere tutti gli eventuali errori!");
            errorLabel_creaNuovoArticoloPanel.setVisible(true);
            nomeFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            descrizioneFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            prezzoField_newArticlePanel.setBackground(Color.red);
        }
    }//GEN-LAST:event_modificaButton_newArticlePanelActionPerformed

    private void dataOdierna_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOdierna_newArticlePanelActionPerformed
        GregorianCalendar c = new GregorianCalendar(); //prendo la data attuale
        //e stampo la data attuale
        dayField_newArticlePanel.setText("" + c.get(GregorianCalendar.DATE));
        monthField_newArticlePanel.setText("" + c.get(GregorianCalendar.MONTH));
        yearField_newArticlePanel.setText("" + c.get(GregorianCalendar.YEAR));
    }//GEN-LAST:event_dataOdierna_newArticlePanelActionPerformed

    //pulsante esci nel pannello per creare un articolo
    private void cancellaButton_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaButton_newArticlePanelActionPerformed
        exit();
    }//GEN-LAST:event_cancellaButton_newArticlePanelActionPerformed

    //Nel pannello creaArticolo quando si genera un'eccezzione i campi di testo si colorano da neri a rossi e quando clicco sui i campi per modificarne il valore li ricoloro di nero e cancello la scritta di errore
    private void nomeFieldTipoArticolo_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldTipoArticolo_newArticlePanelActionPerformed
        nomeFieldTipoArticolo_newArticlePanel.setBackground(Color.BLACK);
        errorLabel_creaNuovoArticoloPanel.setVisible(false);
    }//GEN-LAST:event_nomeFieldTipoArticolo_newArticlePanelActionPerformed

    private void descrizioneFieldTipoArticolo_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descrizioneFieldTipoArticolo_newArticlePanelActionPerformed
        descrizioneFieldTipoArticolo_newArticlePanel.setBackground(Color.BLACK);
        errorLabel_creaNuovoArticoloPanel.setVisible(false);
    }//GEN-LAST:event_descrizioneFieldTipoArticolo_newArticlePanelActionPerformed

    private void prezzoField_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prezzoField_newArticlePanelActionPerformed
        prezzoField_newArticlePanel.setBackground(Color.BLACK);
        errorLabel_creaNuovoArticoloPanel.setVisible(false);
    }//GEN-LAST:event_prezzoField_newArticlePanelActionPerformed

    private void corriereField_NewOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corriereField_NewOrderPanelActionPerformed
        Color c = new Color(255, 255, 0);
        corriereField_NewOrderPanel.setBackground(c);
    }//GEN-LAST:event_corriereField_NewOrderPanelActionPerformed

    private void creaOrdineButton_orderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaOrdineButton_orderViewPanelActionPerformed
        Color C = new Color(255, 255, 0);
        quantitaField1.setBackground(C);
        quantitaField2.setBackground(C);
        quantitaField3.setBackground(C);
        quantitaField4.setBackground(C);
        quantitaField5.setBackground(C);
        quantitaField6.setBackground(C);
        quantitaField7.setBackground(C);
        quantitaField8.setBackground(C);
        quantitaField9.setBackground(C);
        quantitaField10.setBackground(C);

        String corriere = corriereField_NewOrderPanel.getText();

        if (corriere.equals("") && corriere.equals(" ")) {//controllo che sia stato inserito un corriere valido
            JOptionPane.showMessageDialog(null, "Inserire un campo corriere valido! ");
            corriereField_NewOrderPanel.setBackground(Color.red);
            return;
        }

        String negozio = (String) ComboBoxNegozio.getSelectedItem();
        Negozio x = m.negozioContainedByName(negozio);
        Map<Articolo, Integer> articoliAndQuantita = new HashMap<>();
        
        int quantita1;
        int quantita2;
        int quantita3;
        int quantita4;
        int quantita5;
        int quantita6;
        int quantita7;
        int quantita8;
        int quantita9;
        int quantita10;
        
   
 
        String articolo1 = (String) comboBoxArticoli1.getSelectedItem();
        String articolo2 = (String) comboBoxArticoli2.getSelectedItem();
        String articolo3 = (String) comboBoxArticoli3.getSelectedItem();
        String articolo4 = (String) comboBoxArticoli4.getSelectedItem();
        String articolo5 = (String) comboBoxArticoli5.getSelectedItem();
        String articolo6 = (String) comboBoxArticoli6.getSelectedItem();
        String articolo7 = (String) comboBoxArticoli7.getSelectedItem();
        String articolo8 = (String) comboBoxArticoli8.getSelectedItem();
        String articolo9 = (String) comboBoxArticoli9.getSelectedItem();
        String articolo10 = (String) comboBoxArticoli10.getSelectedItem();

        
        
        //cerco gli articoli dal nome e mi faccio restituire l'oggetto di tipo articolo
        Articolo a1 = m.articoloContainedByName(articolo1);
        Articolo a2 = m.articoloContainedByName(articolo2);
        Articolo a3 = m.articoloContainedByName(articolo3);
        Articolo a4 = m.articoloContainedByName(articolo4);
        Articolo a5 = m.articoloContainedByName(articolo5);
        Articolo a6 = m.articoloContainedByName(articolo6);
        Articolo a7 = m.articoloContainedByName(articolo7);
        Articolo a8 = m.articoloContainedByName(articolo8);
        Articolo a9 = m.articoloContainedByName(articolo9);
        Articolo a10 = m.articoloContainedByName(articolo10);

        

        

        try {//raccolgo i dati di quantità per ogni articolo
            quantita1 = quantitaField1.getText().equals("") ? 0 : Integer.parseInt(quantitaField1.getText());
            quantita2 = quantitaField2.getText().equals("") ? 0 : Integer.parseInt(quantitaField2.getText());
            quantita3 = quantitaField3.getText().equals("") ? 0 : Integer.parseInt(quantitaField3.getText());
            quantita4 = quantitaField4.getText().equals("") ? 0 : Integer.parseInt(quantitaField4.getText());
            quantita5 = quantitaField5.getText().equals("") ? 0 : Integer.parseInt(quantitaField5.getText());
            quantita6 = quantitaField6.getText().equals("") ? 0 : Integer.parseInt(quantitaField6.getText());
            quantita7 = quantitaField7.getText().equals("") ? 0 : Integer.parseInt(quantitaField7.getText());
            quantita8 = quantitaField8.getText().equals("") ? 0 : Integer.parseInt(quantitaField8.getText());
            quantita9 = quantitaField9.getText().equals("") ? 0 : Integer.parseInt(quantitaField9.getText());
            quantita10 = quantitaField10.getText().equals("") ? 0 : Integer.parseInt(quantitaField10.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Errore nella raccolta dati, le quantità devono essere interi positivi\nNon sono ammessi altri tipi di caratteri!\n\n" + e);
            quantitaField1.setBackground(Color.red);
            quantitaField2.setBackground(Color.red);
            quantitaField3.setBackground(Color.red);
            quantitaField4.setBackground(Color.red);
            quantitaField5.setBackground(Color.red);
            quantitaField6.setBackground(Color.red);
            quantitaField7.setBackground(Color.red);
            quantitaField8.setBackground(Color.red);
            quantitaField9.setBackground(Color.red);
            quantitaField10.setBackground(Color.red);
            return;
        }
        
        if(quantita1 != 0)
        articoliAndQuantita.putIfAbsent(a1, quantita1);
        if(quantita2 != 0)
        articoliAndQuantita.putIfAbsent(a2, quantita2);
        if(quantita3 != 0)
        articoliAndQuantita.putIfAbsent(a3, quantita3);
        if(quantita4 != 0)
        articoliAndQuantita.putIfAbsent(a4, quantita4);
        if(quantita5 != 0)
        articoliAndQuantita.putIfAbsent(a5, quantita5);
        if(quantita6 != 0)
        articoliAndQuantita.putIfAbsent(a6, quantita6);
        if(quantita7 != 0)
        articoliAndQuantita.putIfAbsent(a7, quantita7);
        if(quantita8 != 0)
        articoliAndQuantita.putIfAbsent(a8, quantita8);
        if(quantita9 != 0)
        articoliAndQuantita.putIfAbsent(a9, quantita9);
        if(quantita10 != 0)
        articoliAndQuantita.putIfAbsent(a10, quantita10);

        Ordine o1 = new Ordine(x, new GregorianCalendar(), articoliAndQuantita);
        m.addOrdine(o1);
        indexOrder = m.ordineSize() - 1;
        System.out.println(m.ordineSize());
        System.out.println(indexOrder);
        hideAll();
        ordini();
        visualizzaOrdiniPanel.setVisible(true);

        corriereField_NewOrderPanel.setText("");
        quantitaField1.setBackground(C);
        quantitaField2.setBackground(C);
        quantitaField3.setBackground(C);
        quantitaField4.setBackground(C);
        quantitaField5.setBackground(C);
        quantitaField6.setBackground(C);
        quantitaField7.setBackground(C);
        quantitaField8.setBackground(C);
        quantitaField9.setBackground(C);
        quantitaField10.setBackground(C);
        quantitaField1.setText("");
        quantitaField2.setText("");
        quantitaField3.setText("");
        quantitaField4.setText("");
        quantitaField5.setText("");
        quantitaField6.setText("");
        quantitaField7.setText("");
        quantitaField8.setText("");
        quantitaField9.setText("");
        quantitaField10.setText("");

    }//GEN-LAST:event_creaOrdineButton_orderViewPanelActionPerformed

    private void ComboBoxNegozioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNegozioActionPerformed

    }//GEN-LAST:event_ComboBoxNegozioActionPerformed

    //ogni volta che l'utente preme aggiungi articolo per rendere visibile una seconda riga di articolo controllo se il primo è stato compilato correttamente
    private void addArticleButton_newOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArticleButton_newOrderPanelActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField1.setBackground(x);
        quantitaField2.setBackground(x);
        quantitaField3.setBackground(x);
        quantitaField4.setBackground(x);
        quantitaField5.setBackground(x);
        quantitaField6.setBackground(x);
        quantitaField7.setBackground(x);
        quantitaField8.setBackground(x);
        quantitaField9.setBackground(x);
        quantitaField10.setBackground(x);

        switch (orderArticleSelected) {
            case 1:
                try {
                    if (Integer.parseInt(quantitaField1.getText()) > 0) {
                        comboBoxArticoli2.setEnabled(true);
                        quantitaField2.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField1.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField1.setBackground(Color.red);
                } finally {
                    break;
                }

            case 2:
                try {
                    if (Integer.parseInt(quantitaField2.getText()) > 0) {
                        comboBoxArticoli3.setEnabled(true);
                        quantitaField3.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField2.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField2.setBackground(Color.red);
                } finally {
                    break;
                }
            case 3:
                try {
                    if (Integer.parseInt(quantitaField3.getText()) > 0) {
                        comboBoxArticoli4.setEnabled(true);
                        quantitaField4.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField3.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField3.setBackground(Color.red);
                } finally {
                    break;
                }
            case 4:
                try {
                    if (Integer.parseInt(quantitaField4.getText()) > 0) {
                        comboBoxArticoli5.setEnabled(true);
                        quantitaField5.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField4.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField4.setBackground(Color.red);
                } finally {
                    break;
                }
            case 5:
                try {
                    if (Integer.parseInt(quantitaField5.getText()) > 0) {
                        comboBoxArticoli6.setEnabled(true);
                        quantitaField6.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField5.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField5.setBackground(Color.red);
                } finally {
                    break;
                }
            case 6:
                try {
                    if (Integer.parseInt(quantitaField6.getText()) > 0) {
                        comboBoxArticoli7.setEnabled(true);
                        quantitaField7.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField6.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField6.setBackground(Color.red);
                } finally {
                    break;
                }
            case 7:
                try {
                    if (Integer.parseInt(quantitaField7.getText()) > 0) {
                        comboBoxArticoli8.setEnabled(true);
                        quantitaField8.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField7.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField7.setBackground(Color.red);
                } finally {
                    break;
                }
            case 8:
                try {
                    if (Integer.parseInt(quantitaField8.getText()) > 0) {
                        comboBoxArticoli9.setEnabled(true);
                        quantitaField9.setEnabled(true);
                        orderArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField8.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField8.setBackground(Color.red);
                } finally {
                    break;
                }
            case 9:
                try {
                    if (Integer.parseInt(quantitaField9.getText()) > 0) {
                        comboBoxArticoli10.setEnabled(true);
                        quantitaField10.setEnabled(true);
                        orderArticleSelected++;
                        addArticleButton_newOrderPanel.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        quantitaField9.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    quantitaField9.setBackground(Color.red);
                } finally {
                    break;
                }

        }
    }//GEN-LAST:event_addArticleButton_newOrderPanelActionPerformed

    private void quantitaField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField1ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField1.setBackground(x);
    }//GEN-LAST:event_quantitaField1ActionPerformed

    private void quantitaField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField2ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField2.setBackground(x);
    }//GEN-LAST:event_quantitaField2ActionPerformed

    private void quantitaField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField3ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField3.setBackground(x);
    }//GEN-LAST:event_quantitaField3ActionPerformed

    private void quantitaField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField4ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField4.setBackground(x);
    }//GEN-LAST:event_quantitaField4ActionPerformed

    private void quantitaField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField5ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField5.setBackground(x);
    }//GEN-LAST:event_quantitaField5ActionPerformed

    private void quantitaField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField6ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField6.setBackground(x);
    }//GEN-LAST:event_quantitaField6ActionPerformed

    private void quantitaField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField7ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField7.setBackground(x);
    }//GEN-LAST:event_quantitaField7ActionPerformed

    private void quantitaField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField8ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField8.setBackground(x);
    }//GEN-LAST:event_quantitaField8ActionPerformed

    private void quantitaField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField9ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField9.setBackground(x);
    }//GEN-LAST:event_quantitaField9ActionPerformed

    private void quantitaField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField10ActionPerformed
        Color x = new Color(255, 255, 0);
        quantitaField10.setBackground(x);
    }//GEN-LAST:event_quantitaField10ActionPerformed

    private void creaOrdineButton_orderViewPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaOrdineButton_orderViewPanel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creaOrdineButton_orderViewPanel1ActionPerformed

    private void closeButton_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_newIngressoPanelActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_newIngressoPanelActionPerformed

    private void addArticleButton_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArticleButton_newIngressoPanelActionPerformed
        Color x = new Color(204, 0, 204);
        textFieldPosizioni1.setBackground(x);
        textFieldPosizioni2.setBackground(x);
        textFieldPosizioni3.setBackground(x);
        textFieldPosizioni4.setBackground(x);
        textFieldPosizioni5.setBackground(x);
        textFieldPosizioni6.setBackground(x);
        textFieldPosizioni7.setBackground(x);
        textFieldPosizioni8.setBackground(x);
        textFieldPosizioni9.setBackground(x);
        textFieldPosizioni10.setBackground(x);

        switch (ingressoArticleSelected) {
            case 1:
                try {
                    if (Integer.parseInt(textFieldQuantita1.getText()) > 0) {
                        comboBoxIngressoArticoli2.setEnabled(true);
                        textFieldPosizioni2.setEditable(true);
                        textFieldQuantita2.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni1.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni1.setBackground(Color.red);
                } finally {
                    break;
                }

            case 2:
                try {
                    if (Integer.parseInt(textFieldQuantita2.getText()) > 0) {
                        comboBoxIngressoArticoli3.setEnabled(true);
                        textFieldPosizioni3.setEditable(true);
                        textFieldQuantita3.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni2.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni2.setBackground(Color.red);
                } finally {
                    break;
                }
            case 3:
                try {
                    if (Integer.parseInt(textFieldQuantita3.getText()) > 0) {
                        comboBoxIngressoArticoli4.setEnabled(true);
                        textFieldPosizioni4.setEditable(true);
                        textFieldQuantita4.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni3.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni3.setBackground(Color.red);
                } finally {
                    break;
                }
            case 4:
                try {
                    if (Integer.parseInt(textFieldQuantita4.getText()) > 0) {
                        comboBoxIngressoArticoli5.setEnabled(true);
                        textFieldPosizioni5.setEditable(true);
                        textFieldQuantita5.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni4.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni4.setBackground(Color.red);
                } finally {
                    break;
                }
            case 5:
                try {
                    if (Integer.parseInt(textFieldQuantita5.getText()) > 0) {
                        comboBoxIngressoArticoli6.setEnabled(true);
                        textFieldPosizioni6.setEditable(true);
                        textFieldQuantita6.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni5.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni5.setBackground(Color.red);
                } finally {
                    break;
                }
            case 6:
                try {
                    if (Integer.parseInt(textFieldQuantita6.getText()) > 0) {
                        comboBoxIngressoArticoli7.setEnabled(true);
                        textFieldPosizioni7.setEditable(true);
                        textFieldQuantita7.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni6.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni6.setBackground(Color.red);
                } finally {
                    break;
                }
            case 7:
                try {
                    if (Integer.parseInt(textFieldQuantita7.getText()) > 0) {
                        comboBoxIngressoArticoli8.setEnabled(true);
                        textFieldPosizioni8.setEditable(true);
                        textFieldQuantita8.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni7.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni7.setBackground(Color.red);
                } finally {
                    break;
                }
            case 8:
                try {
                    if (Integer.parseInt(textFieldQuantita8.getText()) > 0) {
                        comboBoxIngressoArticoli9.setEnabled(true);
                        textFieldPosizioni9.setEditable(true);
                        textFieldQuantita9.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni8.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni8.setBackground(Color.red);
                } finally {
                    break;
                }
            case 9:
                try {
                    if (Integer.parseInt(textFieldQuantita9.getText()) > 0) {
                        comboBoxIngressoArticoli10.setEnabled(true);
                        textFieldPosizioni10.setEditable(true);
                        textFieldQuantita10.setEditable(true);
                        ingressoArticleSelected++;
                        addArticleButton_newIngressoPanel.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo e la sua quantità per procedere!!");
                        textFieldPosizioni9.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in quantità!! \nNon sono accettati altri tipi di carattere!");
                    textFieldPosizioni9.setBackground(Color.red);
                } finally {
                    break;
                }

        }
    }//GEN-LAST:event_addArticleButton_newIngressoPanelActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        hideAll();
        visualizzaOrdiniPanel.setVisible(true);
        indexOrder = 0;
        ordini();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void comboBoxIngressoArticoli5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIngressoArticoli5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxIngressoArticoli5ActionPerformed

    private void textFieldPosizioni6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPosizioni6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPosizioni6ActionPerformed

    private void textFieldQuantita3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantita3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldQuantita3ActionPerformed

    private void textFieldQuantita5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantita5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldQuantita5ActionPerformed

    private void textFieldQuantita7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantita7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldQuantita7ActionPerformed

    void articoli() {
        if (m.articoliIsEmpty()) {
            avantiButton_VisualizzaArticoloPanel.setEnabled(false);
            indietroButton_VisualizzaArticoloPanel.setEnabled(false);
            modificaButton_VisualizzaArticoloPanel.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nessun Articolo ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {//esiste almeno un artiolo salvato

            if (indexArticle == 0) {
                indietroButton_VisualizzaArticoloPanel.setEnabled(false);
            } else {
                indietroButton_VisualizzaArticoloPanel.setEnabled(true);
            }
            if (indexArticle == m.articoliSize() - 1) {
                avantiButton_VisualizzaArticoloPanel.setEnabled(false);
            } else {
                avantiButton_VisualizzaArticoloPanel.setEnabled(true);
            }

            cercaLabel_VisualizzaArticoloPanel.setText("" + (indexArticle + 1));
            IDLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getID());
            prezzoLabel_VisualizzaArticoloPanel.setText("" + m.getArticolo(indexArticle).getPrezzo());
            dataLabel_VisualizzaArticoloPanel.setText("" + m.getArticolo(indexArticle).getData());
            nomeLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getName());
            descrizioneLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getDescription());
            sportLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getSports());
            materialiLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getMaterial());

        }
    }

    void negozi() {
        if (m.negoziIsEmpty()) {
            indexShop = 0;
            JOptionPane.showMessageDialog(null, "Nessun Negozio ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
            codiceFiscaleLabel_NegozioPanel.setText("");
            indirizzoLabel_NegozioPanel.setText("");
            nomeNegozioLabel_NegozioPanel.setText("");
            cittaNegozio_NegozioPanel.setText("");
            avantiButton_NegozioPanel.setEnabled(false);
            indietroButton_NegozioPanel.setEnabled(false);
            searchField_NegozioPanel.setEditable(false);
            modificaButton_NegozioPanel.setEnabled(false);
            selezionaButton_NegozioPanel.setEnabled(false);
        } else {
            if (indexShop == 0) {
                indietroButton_NegozioPanel.setEnabled(false);
            } else {
                indietroButton_NegozioPanel.setEnabled(true);
            }
            if (indexShop == m.negoziSize() - 1) {
                avantiButton_NegozioPanel.setEnabled(false);
            } else {
                avantiButton_NegozioPanel.setEnabled(true);
            }

            searchField_NegozioPanel.setText("" + (indexShop + 1));
            codiceFiscaleLabel_NegozioPanel.setText(m.getNegozi(indexShop).getCodiceFiscale());
            indirizzoLabel_NegozioPanel.setText(m.getNegozi(indexShop).getindirizzo());
            nomeNegozioLabel_NegozioPanel.setText(m.getNegozi(indexShop).getNome());
            cittaNegozio_NegozioPanel.setText(m.getNegozi(indexShop).getCitta());
        }
    }

    void ordini() {

        if (m.ordineIsEmpty()) {
            orderIDLabel.setText("");
            orderDataLabel.setText("");
            orderPrezzoLabel.setText("");
            orderNomeNegozioLabel.setText("");
            searchFieldOrderPanel.setText("");
            searchFieldOrderPanel.setEditable(false);
            indietroButton_OrderPanel.setEnabled(false);
            avantiButton_OrderPanel.setEnabled(false);
            negozioInfo_OrderPanel.setEnabled(false);
            modificaButtonOrderPanel.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nessun ordine ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {

            if (indexOrder == 0) {
                indietroButton_OrderPanel.setEnabled(false);
            } else {
                indietroButton_OrderPanel.setEnabled(true);
            }
            if (indexOrder == m.ordineSize() - 1) {
                avantiButton_OrderPanel.setEnabled(false);
            } else {
                avantiButton_OrderPanel.setEnabled(true);
            }
            searchFieldOrderPanel.setEditable(true);
            negozioInfo_OrderPanel.setEnabled(true);
            modificaButtonOrderPanel.setEnabled(true);
            searchFieldOrderPanel.setText("" + (indexOrder + 1));
            orderIDLabel.setText("" + m.getOrdine(indexOrder).getID());
            orderDataLabel.setText("" + m.getOrdine(indexOrder).getData());
            orderPrezzoLabel.setText("" + m.getOrdine(indexOrder).getTotalPrice());
            orderNomeNegozioLabel.setText("" + m.getOrdine(indexOrder).getNegozio().getNome());
            articoliQuantitaOrderPanel.setText("" + m.getOrdine(indexOrder).toString());
            System.out.println("" + m.getOrdine(indexOrder).toString());
        }

    }//resetOrder

    void exit() {

        Object[] options = {"Esci", "Annulla"};//dichiaro i tipi di opzioni nel prossimo JOptionPane

        if (JOptionPane.showOptionDialog(null,
                "Sei sicuro di voler uscire dalla sezione riservata?\nConfermano si esce e per effettuare ulteriori operazioni bisogna rieffettuare il login", "Logout",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]) == 0) {

            hideAll();
            usrField.setText("");
            pinField.setText("");
            loginPanel.setVisible(true);

        }//if JOPTIONPANE
    }//exit

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });

    }//fine main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodiceFiscaleField_NewNegozio;
    private javax.swing.JComboBox<String> ComboBoxNegozio;
    private javax.swing.JButton CreaNegozioButton_NegozioPanel;
    private javax.swing.JLabel IDLabel_VisualizzaArticoloPanel;
    private javax.swing.ButtonGroup MaterialiBottonGroup;
    private javax.swing.ButtonGroup SportButtonGroup;
    private javax.swing.JLabel TipoArticoloLabel_NewArticlePanel;
    private javax.swing.JButton addArticleButton_newIngressoPanel;
    private javax.swing.JButton addArticleButton_newOrderPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel articoliQuantitaOrderPanel;
    private javax.swing.JRadioButton atleticaRadioButton;
    private javax.swing.JButton avantiButton_NegozioPanel;
    private javax.swing.JButton avantiButton_OrderPanel;
    private javax.swing.JButton avantiButton_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton basketRadioButton;
    private javax.swing.JRadioButton calcioRadioButton;
    private javax.swing.JButton cancelPinButton;
    private javax.swing.JButton cancellaButton_newArticlePanel;
    private javax.swing.JLabel cercaLabel_VisualizzaArticoloPanel;
    private javax.swing.JButton chiudiButtonOrderPanel;
    private javax.swing.JButton chiudiButton_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton ciclismoRadioButton;
    private javax.swing.JTextField cittaField_NewNegozioPanel;
    private javax.swing.JLabel cittaNegozio_NegozioPanel;
    private javax.swing.JButton closeButton_NegozioPanel1;
    private javax.swing.JButton closeButton_creaNegozioPanel;
    private javax.swing.JButton closeButton_newIngressoPanel;
    private javax.swing.JButton closeButton_newOrderPanel;
    private javax.swing.JLabel codiceFiscaleLabel_NegozioPanel;
    private javax.swing.JComboBox<String> comboBoxArticoli1;
    private javax.swing.JComboBox<String> comboBoxArticoli10;
    private javax.swing.JComboBox<String> comboBoxArticoli2;
    private javax.swing.JComboBox<String> comboBoxArticoli3;
    private javax.swing.JComboBox<String> comboBoxArticoli4;
    private javax.swing.JComboBox<String> comboBoxArticoli5;
    private javax.swing.JComboBox<String> comboBoxArticoli6;
    private javax.swing.JComboBox<String> comboBoxArticoli7;
    private javax.swing.JComboBox<String> comboBoxArticoli8;
    private javax.swing.JComboBox<String> comboBoxArticoli9;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli1;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli10;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli2;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli3;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli4;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli5;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli6;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli7;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli8;
    private javax.swing.JComboBox<String> comboBoxIngressoArticoli9;
    private javax.swing.JLabel corniceArticoloLabel_newOrderPanel;
    private javax.swing.JTextField corriereField_NewOrderPanel;
    private javax.swing.JButton creaFromCreaNegozioPanel;
    private javax.swing.JPanel creaIngressoPanel;
    private javax.swing.JButton creaNegozioButton_VisualizzaArticoloPanel;
    private javax.swing.JPanel creaNegozioPanel;
    private javax.swing.JPanel creaNuovoOrdinePanel;
    private javax.swing.JButton creaOrdineButton_orderViewPanel;
    private javax.swing.JButton creaOrdineButton_orderViewPanel1;
    private javax.swing.JRadioButton danzaRadioButton;
    private javax.swing.JLabel dataLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel dataLabel_newArticlePanel;
    private javax.swing.JButton dataOdierna_newArticlePanel;
    private javax.swing.JTextField dayField_newArticlePanel;
    private javax.swing.JTextField descrizioneFieldTipoArticolo_newArticlePanel;
    private javax.swing.JLabel descrizioneLabel_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton elastanRadioButton;
    private javax.swing.JLabel errorLabel_creaNuovoArticoloPanel;
    private javax.swing.JRadioButton fintaPelleRadioButton;
    private javax.swing.JRadioButton golfRadioButton;
    private javax.swing.JRadioButton goreTexRadioButton;
    private javax.swing.JRadioButton hockeyRadioButton;
    private javax.swing.JButton indietroButton_NegozioPanel;
    private javax.swing.JButton indietroButton_OrderPanel;
    private javax.swing.JButton indietroButton_VisualizzaArticoloPanel;
    private javax.swing.JTextField indirizzoField_newNegozioPanel;
    private javax.swing.JLabel indirizzoLabel_NegozioPanel;
    private javax.swing.JButton inserisciButton_newArticlePanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JLabel materialeTipoArticolo_newArticlePanel;
    private javax.swing.JLabel materialiLabel_VisualizzaArticoloPanel;
    private javax.swing.JButton modificaButtonOrderPanel;
    private javax.swing.JButton modificaButton_NegozioPanel;
    private javax.swing.JButton modificaButton_VisualizzaArticoloPanel;
    private javax.swing.JButton modificaButton_newArticlePanel;
    private javax.swing.JButton modificaFromNewNegozioPanel;
    private javax.swing.JTextField monthField_newArticlePanel;
    private javax.swing.JPanel negoziPanel;
    private javax.swing.JButton negozioInfo_OrderPanel;
    private javax.swing.JPanel newArticlePanel;
    private javax.swing.JButton newOrderButton_orderViewPanel;
    private javax.swing.JTextField nomeFieldTipoArticolo_newArticlePanel;
    private javax.swing.JTextField nomeField_newNegozioPanel;
    private javax.swing.JLabel nomeLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel nomeNegozioLabel_NegozioPanel;
    private javax.swing.JRadioButton nuotoRadioButton;
    private javax.swing.JLabel orderDataLabel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel orderNomeNegozioLabel;
    private javax.swing.JLabel orderPrezzoLabel;
    private javax.swing.JRadioButton palestraRadioButton;
    private javax.swing.JRadioButton pallavoloRadioButton;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JRadioButton poliammideRadioButton;
    private javax.swing.JRadioButton poliestereRadioButton;
    private javax.swing.JRadioButton polietileneRadioButton;
    private javax.swing.JTextField prezzoField_newArticlePanel;
    private javax.swing.JLabel prezzoLabel_VisualizzaArticoloPanel;
    private javax.swing.JTextField quantitaField1;
    private javax.swing.JTextField quantitaField10;
    private javax.swing.JTextField quantitaField2;
    private javax.swing.JTextField quantitaField3;
    private javax.swing.JTextField quantitaField4;
    private javax.swing.JTextField quantitaField5;
    private javax.swing.JTextField quantitaField6;
    private javax.swing.JTextField quantitaField7;
    private javax.swing.JTextField quantitaField8;
    private javax.swing.JTextField quantitaField9;
    private javax.swing.JRadioButton raftingRadioButton;
    private javax.swing.JRadioButton rugbyRadioButton;
    private javax.swing.JRadioButton sciiRadioButton;
    private javax.swing.JTextField searchFieldOrderPanel;
    private javax.swing.JTextField searchField_NegozioPanel;
    private javax.swing.JButton selezionaButton_NegozioPanel;
    private javax.swing.JRadioButton siliconeRadioButton;
    private javax.swing.JLabel sportLabelTipoArticolo_newArticlePanel;
    private javax.swing.JLabel sportLabel_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton tennisRadioButton;
    private javax.swing.JTextField textFieldPosizioni1;
    private javax.swing.JTextField textFieldPosizioni10;
    private javax.swing.JTextField textFieldPosizioni2;
    private javax.swing.JTextField textFieldPosizioni3;
    private javax.swing.JTextField textFieldPosizioni4;
    private javax.swing.JTextField textFieldPosizioni5;
    private javax.swing.JTextField textFieldPosizioni6;
    private javax.swing.JTextField textFieldPosizioni7;
    private javax.swing.JTextField textFieldPosizioni8;
    private javax.swing.JTextField textFieldPosizioni9;
    private javax.swing.JTextField textFieldQuantita1;
    private javax.swing.JTextField textFieldQuantita10;
    private javax.swing.JTextField textFieldQuantita2;
    private javax.swing.JTextField textFieldQuantita3;
    private javax.swing.JTextField textFieldQuantita4;
    private javax.swing.JTextField textFieldQuantita5;
    private javax.swing.JTextField textFieldQuantita6;
    private javax.swing.JTextField textFieldQuantita7;
    private javax.swing.JTextField textFieldQuantita8;
    private javax.swing.JTextField textFieldQuantita9;
    private javax.swing.JLabel titolo_newArticlePanel;
    private javax.swing.JTextField usrField;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JPanel visualizzaArticoliPanel;
    private javax.swing.JPanel visualizzaOrdiniPanel;
    private javax.swing.JTextField yearField_newArticlePanel;
    // End of variables declaration//GEN-END:variables
}
