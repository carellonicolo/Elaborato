package Main;

import Exception.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static java.lang.Math.abs;
import javax.swing.table.DefaultTableModel;

public class Graphics extends javax.swing.JFrame {

    static int indexOrder = 0, indexArticle = 0, indexShop = 0, indexIngressi = 0, orderArticleSelected = 1, ingressoArticleSelected = 1, from = 0, index = 0, modificaOrCreaOrdine = 0;
    private static final Magazzino m = Magazzino.getInstance();
    public final Color C = new Color(0, 153, 255);//[0,153,255]
    boolean bool = false;

    public Graphics() {

        //CREO L'OGGETTO MAGAZZINO
        //Magazzino = new m();
        //INIZIALIZZO I COMPONENTI GRAFICI 
        initComponents();
        jFrame1.setResizable(false);

        adminPanel.setVisible(false);

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

        hideAll();
        loginPanel.setVisible(true);
        selezionaButton_NegozioPanel.setVisible(false);

        loginPanel.getRootPane().setDefaultButton(loginButton);
    }

    public final void hideAll() {
        newArticlePanel.setVisible(false);
        visualizzaOrdiniPanel.setVisible(false);
        loginPanel.setVisible(false);
        creaNuovoOrdinePanel.setVisible(false);
        negoziPanel.setVisible(false);
        visualizzaArticoliPanel.setVisible(false);
        creaNegozioPanel.setVisible(false);
        creaIngressoPanel.setVisible(false);
        visualizzaIngressiPanel.setVisible(false);
        storicoPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        SportButtonGroup = new javax.swing.ButtonGroup();
        MaterialiBottonGroup = new javax.swing.ButtonGroup();
        loginPanel = new javax.swing.JPanel();
        pinField = new javax.swing.JPasswordField();
        cancelPinButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        usrField = new javax.swing.JTextField();
        loginTitleLabel = new javax.swing.JLabel();
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
        orderIDLabel_OrderViewPanel = new javax.swing.JLabel();
        dataLabel_OrderViewPanel = new javax.swing.JLabel();
        prezzoLabel_OrderViewPanel = new javax.swing.JLabel();
        corriereLabel_OrderViewPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        articoliQuantitaTextArea_OrderViewPanel = new javax.swing.JTextArea();
        shippedLabel_OrderViewPanell = new javax.swing.JLabel();
        generaUscitaButton_OrderViewPanel = new javax.swing.JButton();
        negozioLabel_OrderViewPanel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabellaOrdini = new javax.swing.JTable();
        cancellaOrderButton_orderViewPanel = new javax.swing.JButton();
        duplicaOrderButton_orderViewPanel = new javax.swing.JButton();
        negoziPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
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
        eliminaNegozioButton_VisualizzaNegozioPanel = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabellaNegozi = new javax.swing.JTable();
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
        TipoArticoloLabel_NewArticlePanel = new javax.swing.JLabel();
        modificaButton_newArticlePanel = new javax.swing.JButton();
        dataLabel_newArticlePanel1 = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        articoliButtonAdminPanel = new javax.swing.JButton();
        negoziButtonAdminPanel = new javax.swing.JButton();
        ordiniButtonAdminPanel = new javax.swing.JButton();
        ingressiButtonAdminPanel = new javax.swing.JButton();
        logoutButtonAdminPanel = new javax.swing.JButton();
        saveButtonAdminPanel = new javax.swing.JButton();
        fineMeseButtonAdminPanel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        typeOfUserLabel_AdminPanel = new javax.swing.JLabel();
        storicoButton_AdminPanel = new javax.swing.JButton();
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
        quantitaField1_newIngressoPanel = new javax.swing.JTextField();
        quantitaField2_newIngressoPanel = new javax.swing.JTextField();
        quantitaField3_newIngressoPanel = new javax.swing.JTextField();
        quantitaField4_newIngressoPanel = new javax.swing.JTextField();
        quantitaField5_newIngressoPanel = new javax.swing.JTextField();
        quantitaField6_newIngressoPanel = new javax.swing.JTextField();
        quantitaField7_newIngressoPanel = new javax.swing.JTextField();
        quantitaField9_newIngressoPanel = new javax.swing.JTextField();
        quantitaField8_newIngressoPanel = new javax.swing.JTextField();
        quantitaField10_newIngressoPanel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        creaIngressoButtonIngressoPanel = new javax.swing.JButton();
        closeButton_newIngressoPanel = new javax.swing.JButton();
        addArticleButton_newIngressoPanel = new javax.swing.JButton();
        posizione1Field_newIngressoPanel = new javax.swing.JTextField();
        posizione2Field_newIngressoPanel = new javax.swing.JTextField();
        posizione3Field_newIngressoPanel = new javax.swing.JTextField();
        posizione4Field_newIngressoPanel = new javax.swing.JTextField();
        posizione5Field_newIngressoPanel = new javax.swing.JTextField();
        posizione6Field_newIngressoPanel = new javax.swing.JTextField();
        posizione7Field_newIngressoPanel = new javax.swing.JTextField();
        posizione8Field_newIngressoPanel = new javax.swing.JTextField();
        posizione9Field_newIngressoPanel = new javax.swing.JTextField();
        posizione10Field_newIngressoPanel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dataOdierna_newIngressoPanel = new javax.swing.JButton();
        dayField_newIngressoPanel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        monthField_newIngressoPanel = new javax.swing.JTextField();
        yearField_newIngressoPanel = new javax.swing.JTextField();
        dataLabel_newIngressoPanel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        visualizzaIngressiPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        indietroButton_IngressiPanel = new javax.swing.JButton();
        avantiButton_IngressiPanel = new javax.swing.JButton();
        chiudiButtonIngressiPanel = new javax.swing.JButton();
        searchFieldIngressiPanel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        newIngressoButton_IngressiPanel = new javax.swing.JButton();
        ingressiIDLabel_VisualizzaIngressiPanel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        articoliQuantitaPosizioneIngressiPanel = new javax.swing.JTextArea();
        dataLabel_VisualizzaIngressiPanel = new javax.swing.JLabel();
        creaNegozioPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        indirizzoField_newNegozioPanel = new javax.swing.JTextField();
        CodiceFiscaleField_NewNegozio = new javax.swing.JTextField();
        nomeField_newNegozioPanel = new javax.swing.JTextField();
        cittaField_NewNegozioPanel = new javax.swing.JTextField();
        creaNegozioButton_CreaNegozioPanel = new javax.swing.JButton();
        closeButton_creaNegozioPanel = new javax.swing.JButton();
        modificaNegozioButton_CreaNegozioPanel = new javax.swing.JButton();
        sfondo = new javax.swing.JPanel();
        storicoPanel = new javax.swing.JPanel();
        titleLabel_StoricoMensile = new javax.swing.JLabel();
        avantiButton_StoricoPanel = new javax.swing.JButton();
        cercaLAbel_StoricoPanel = new javax.swing.JTextField();
        indietroButton_StoricoPanel = new javax.swing.JButton();
        cercaBorderLabel_Pan = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        reportMensileTextArea_ReportPanel = new javax.swing.JTextArea();
        chiudiButton_reportPanel = new javax.swing.JButton();
        visualizzaArticoliPanel = new javax.swing.JPanel();
        IDLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        prezzoLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        posizioneLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        nomeLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        descrizioneLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        sportLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        materialiLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        avantiButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        indietroButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        modificaButton_cercaLabel__VisualizzaArticoliPanel = new javax.swing.JButton();
        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel = new javax.swing.JButton();
        chiudiButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        TipoArticoloLabel__VisualizzaArticoliPanel = new javax.swing.JLabel();
        cercaLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        cercaLabel__VisualizzaArticoliPanel = new javax.swing.JLabel();
        dataLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        quantitaLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        modificaPosizioneViewArticoliPanel = new javax.swing.JButton();
        titleLabel__VisualizzaArticoliPanel = new javax.swing.JLabel();
        eliminaButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaArticoli = new javax.swing.JTable();
        creaNuovoOrdinePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        creaOrdineButton_orderViewPanel = new javax.swing.JButton();
        closeButton_newOrderPanel = new javax.swing.JButton();
        corriereField_NewOrderPanel = new javax.swing.JTextField();
        ComboBoxNegozio = new javax.swing.JComboBox<>();
        comboBoxArticoli1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxArticoli2 = new javax.swing.JComboBox<>();
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
        quantitaLabel_NewOrderPanel = new javax.swing.JLabel();
        articoliLabel_NewOrderPanel = new javax.swing.JLabel();
        corniceArticoloLabel_newOrderPanel = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(0, 153, 255));
        loginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinField.setBackground(new java.awt.Color(0, 153, 255));
        pinField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        pinField.setForeground(new java.awt.Color(255, 255, 255));
        pinField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        loginPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, 50));

        cancelPinButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelPinButton.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        cancelPinButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelPinButton.setText("Cancel");
        cancelPinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPinButtonActionPerformed(evt);
            }
        });
        loginPanel.add(cancelPinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, -1));

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 230, 110, -1));

        usrField.setBackground(new java.awt.Color(0, 153, 255));
        usrField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        usrField.setForeground(new java.awt.Color(255, 255, 255));
        usrField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
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
        loginPanel.add(usrField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 50));

        loginTitleLabel.setFont(new java.awt.Font("Avenir Next", 0, 55)); // NOI18N
        loginTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginTitleLabel.setText("Login");
        loginPanel.add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 60));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 310));

        visualizzaOrdiniPanel.setBackground(new java.awt.Color(0, 153, 255));
        visualizzaOrdiniPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        visualizzaOrdiniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Visualizza Ordini:");
        visualizzaOrdiniPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        negozioInfo_OrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        negozioInfo_OrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        negozioInfo_OrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        negozioInfo_OrderPanel.setText("Vedi info Negozio");
        negozioInfo_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negozioInfo_OrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(negozioInfo_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 210, 30));

        indietroButton_OrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        indietroButton_OrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indietroButton_OrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        indietroButton_OrderPanel.setText("<");
        indietroButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_OrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(indietroButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 41, -1));

        avantiButton_OrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        avantiButton_OrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        avantiButton_OrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        avantiButton_OrderPanel.setText(">");
        avantiButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_OrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(avantiButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 40, -1));

        modificaButtonOrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaButtonOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaButtonOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaButtonOrderPanel.setText("Modifica");
        modificaButtonOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButtonOrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(modificaButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 180, 40));

        chiudiButtonOrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        chiudiButtonOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        chiudiButtonOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        chiudiButtonOrderPanel.setText("Chiudi");
        chiudiButtonOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButtonOrderPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(chiudiButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 160, 40));

        searchFieldOrderPanel.setEditable(false);
        searchFieldOrderPanel.setBackground(new java.awt.Color(0, 153, 255));
        searchFieldOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        searchFieldOrderPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        visualizzaOrdiniPanel.add(searchFieldOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 30, 20));

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 130, 60));

        newOrderButton_orderViewPanel.setBackground(new java.awt.Color(0, 0, 0));
        newOrderButton_orderViewPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        newOrderButton_orderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        newOrderButton_orderViewPanel.setText("Crea Nuovo Ordine");
        newOrderButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButton_orderViewPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(newOrderButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 220, 40));

        orderIDLabel_OrderViewPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderIDLabel_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        orderIDLabel_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        orderIDLabel_OrderViewPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizzaOrdiniPanel.add(orderIDLabel_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        dataLabel_OrderViewPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        dataLabel_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        dataLabel_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(dataLabel_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 60));

        prezzoLabel_OrderViewPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        prezzoLabel_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        prezzoLabel_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(prezzoLabel_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 60));

        corriereLabel_OrderViewPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        corriereLabel_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        corriereLabel_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Corriere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(corriereLabel_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 60));

        jScrollPane1.setBorder(null);

        articoliQuantitaTextArea_OrderViewPanel.setEditable(false);
        articoliQuantitaTextArea_OrderViewPanel.setBackground(new java.awt.Color(0, 153, 255));
        articoliQuantitaTextArea_OrderViewPanel.setColumns(20);
        articoliQuantitaTextArea_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        articoliQuantitaTextArea_OrderViewPanel.setRows(5);
        articoliQuantitaTextArea_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Articoli e Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane1.setViewportView(articoliQuantitaTextArea_OrderViewPanel);

        visualizzaOrdiniPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 260, 310));

        shippedLabel_OrderViewPanell.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        shippedLabel_OrderViewPanell.setForeground(new java.awt.Color(255, 255, 255));
        shippedLabel_OrderViewPanell.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Stato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(shippedLabel_OrderViewPanell, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 260, 60));

        generaUscitaButton_OrderViewPanel.setBackground(new java.awt.Color(0, 0, 0));
        generaUscitaButton_OrderViewPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        generaUscitaButton_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        generaUscitaButton_OrderViewPanel.setText("Genera Uscita");
        generaUscitaButton_OrderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaUscitaButton_OrderViewPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(generaUscitaButton_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 160, 40));

        negozioLabel_OrderViewPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        negozioLabel_OrderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        negozioLabel_OrderViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaOrdiniPanel.add(negozioLabel_OrderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 210, 60));

        tabellaOrdini.setBackground(new java.awt.Color(0, 153, 255));
        tabellaOrdini.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        tabellaOrdini.setForeground(new java.awt.Color(255, 255, 255));
        tabellaOrdini.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Prezzo", "Negozio", "Corriere", "Spedito", "n° Articoli"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaOrdini.setColumnSelectionAllowed(true);
        tabellaOrdini.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabellaOrdini.setSelectionForeground(new java.awt.Color(0, 153, 255));
        tabellaOrdini.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabellaOrdini.setShowGrid(true);
        tabellaOrdini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaOrdiniMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabellaOrdini);
        tabellaOrdini.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabellaOrdini.getColumnModel().getColumnCount() > 0) {
            tabellaOrdini.getColumnModel().getColumn(1).setMaxWidth(85);
            tabellaOrdini.getColumnModel().getColumn(5).setMaxWidth(50);
            tabellaOrdini.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        visualizzaOrdiniPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 660, 280));

        cancellaOrderButton_orderViewPanel.setBackground(new java.awt.Color(0, 0, 0));
        cancellaOrderButton_orderViewPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        cancellaOrderButton_orderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        cancellaOrderButton_orderViewPanel.setText("Elimina Ordine");
        cancellaOrderButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaOrderButton_orderViewPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(cancellaOrderButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 180, 40));

        duplicaOrderButton_orderViewPanel.setBackground(new java.awt.Color(0, 0, 0));
        duplicaOrderButton_orderViewPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        duplicaOrderButton_orderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        duplicaOrderButton_orderViewPanel.setText("Effettua di nuovo l'ordine");
        duplicaOrderButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicaOrderButton_orderViewPanelActionPerformed(evt);
            }
        });
        visualizzaOrdiniPanel.add(duplicaOrderButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 220, 40));

        getContentPane().add(visualizzaOrdiniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 1250, 460));

        negoziPanel.setBackground(new java.awt.Color(0, 153, 255));
        negoziPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        negoziPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Visualizza Negozio:");
        negoziPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        avantiButton_NegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        avantiButton_NegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        avantiButton_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        avantiButton_NegozioPanel.setText(">");
        avantiButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(avantiButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 40, -1));

        indietroButton_NegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        indietroButton_NegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indietroButton_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        indietroButton_NegozioPanel.setText("<");
        indietroButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(indietroButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 41, -1));
        negoziPanel.add(searchField_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 93, -1));

        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Cerca", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 200, 50));

        modificaButton_NegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaButton_NegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaButton_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaButton_NegozioPanel.setText("Modifica");
        modificaButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(modificaButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        codiceFiscaleLabel_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        codiceFiscaleLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Codice Fiscale ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(codiceFiscaleLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 60));

        nomeNegozioLabel_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        nomeNegozioLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(nomeNegozioLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 60));

        indirizzoLabel_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        indirizzoLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Indirizzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(indirizzoLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, 60));

        cittaNegozio_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        cittaNegozio_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Città", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        negoziPanel.add(cittaNegozio_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 60));

        CreaNegozioButton_NegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        CreaNegozioButton_NegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        CreaNegozioButton_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        CreaNegozioButton_NegozioPanel.setText("Crea Negozio");
        CreaNegozioButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaNegozioButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(CreaNegozioButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        selezionaButton_NegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        selezionaButton_NegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        selezionaButton_NegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        selezionaButton_NegozioPanel.setText("Seleziona");
        selezionaButton_NegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaButton_NegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(selezionaButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        closeButton_NegozioPanel1.setBackground(new java.awt.Color(0, 0, 0));
        closeButton_NegozioPanel1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        closeButton_NegozioPanel1.setForeground(new java.awt.Color(255, 255, 255));
        closeButton_NegozioPanel1.setText("Chiudi");
        closeButton_NegozioPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_NegozioPanel1ActionPerformed(evt);
            }
        });
        negoziPanel.add(closeButton_NegozioPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        eliminaNegozioButton_VisualizzaNegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        eliminaNegozioButton_VisualizzaNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        eliminaNegozioButton_VisualizzaNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        eliminaNegozioButton_VisualizzaNegozioPanel.setText("Elimina");
        eliminaNegozioButton_VisualizzaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaNegozioButton_VisualizzaNegozioPanelActionPerformed(evt);
            }
        });
        negoziPanel.add(eliminaNegozioButton_VisualizzaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 30));

        tabellaNegozi.setBackground(new java.awt.Color(0, 153, 255));
        tabellaNegozi.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        tabellaNegozi.setForeground(new java.awt.Color(255, 255, 255));
        tabellaNegozi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codice Fiscale", "Nome", "Indirizzo", "Città"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaNegozi.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabellaNegozi.setSelectionForeground(new java.awt.Color(0, 153, 255));
        tabellaNegozi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabellaNegozi.setShowGrid(true);
        tabellaNegozi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaNegoziMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabellaNegozi);
        if (tabellaNegozi.getColumnModel().getColumnCount() > 0) {
            tabellaNegozi.getColumnModel().getColumn(0).setMinWidth(180);
            tabellaNegozi.getColumnModel().getColumn(0).setMaxWidth(240);
            tabellaNegozi.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        negoziPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 230));

        getContentPane().add(negoziPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 1050, 280));

        newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        newArticlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        titolo_newArticlePanel.setText("Nuovo Articolo");
        newArticlePanel.add(titolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 60));

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
        dataOdierna_newArticlePanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        dataOdierna_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        dataOdierna_newArticlePanel.setText("Data Odierna");
        dataOdierna_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOdierna_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(dataOdierna_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 180, -1));

        cancellaButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        cancellaButton_newArticlePanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        cancellaButton_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        cancellaButton_newArticlePanel.setText("Cancella");
        cancellaButton_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaButton_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(cancellaButton_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 200, 40));

        inserisciButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        inserisciButton_newArticlePanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
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

        TipoArticoloLabel_NewArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(TipoArticoloLabel_NewArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 450));

        modificaButton_newArticlePanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaButton_newArticlePanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaButton_newArticlePanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaButton_newArticlePanel.setText("Modifica");
        modificaButton_newArticlePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_newArticlePanelActionPerformed(evt);
            }
        });
        newArticlePanel.add(modificaButton_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 200, 50));

        dataLabel_newArticlePanel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        dataLabel_newArticlePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(dataLabel_newArticlePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 100));

        getContentPane().add(newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 540));

        adminPanel.setBackground(new java.awt.Color(0, 153, 255));
        adminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Menù", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        articoliButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        articoliButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        articoliButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        articoliButtonAdminPanel.setText("Articoli");
        articoliButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articoliButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(articoliButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, -1));

        negoziButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        negoziButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        negoziButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        negoziButtonAdminPanel.setText("Negozi");
        negoziButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negoziButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(negoziButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));

        ordiniButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        ordiniButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        ordiniButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        ordiniButtonAdminPanel.setText("Ordini");
        ordiniButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordiniButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(ordiniButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, -1));

        ingressiButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        ingressiButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        ingressiButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        ingressiButtonAdminPanel.setText("Ingressi");
        ingressiButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingressiButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(ingressiButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, -1));

        logoutButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        logoutButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        logoutButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        logoutButtonAdminPanel.setText("Logout");
        logoutButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(logoutButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, -1));

        saveButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        saveButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        saveButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        saveButtonAdminPanel.setText("Salva");
        saveButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(saveButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 90, -1));

        fineMeseButtonAdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        fineMeseButtonAdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        fineMeseButtonAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        fineMeseButtonAdminPanel.setText("Fine Mese");
        fineMeseButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineMeseButtonAdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(fineMeseButtonAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Chiudi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        typeOfUserLabel_AdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        typeOfUserLabel_AdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        adminPanel.add(typeOfUserLabel_AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 230, 20));

        storicoButton_AdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        storicoButton_AdminPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        storicoButton_AdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        storicoButton_AdminPanel.setText("Storico Mensile");
        storicoButton_AdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storicoButton_AdminPanelActionPerformed(evt);
            }
        });
        adminPanel.add(storicoButton_AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        getContentPane().add(adminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1210, 70));

        creaIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        creaIngressoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        creaIngressoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxIngressoArticoli4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        comboBoxIngressoArticoli5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxIngressoArticoli5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIngressoArticoli5ActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(comboBoxIngressoArticoli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        comboBoxIngressoArticoli6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        comboBoxIngressoArticoli7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        comboBoxIngressoArticoli8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        comboBoxIngressoArticoli9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        comboBoxIngressoArticoli10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        comboBoxIngressoArticoli3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        comboBoxIngressoArticoli2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        comboBoxIngressoArticoli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaIngressoPanel.add(comboBoxIngressoArticoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        quantitaField1_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField1_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField1_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField1_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 30));

        quantitaField2_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField2_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField2_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField2_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 30));

        quantitaField3_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField3_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField3_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        quantitaField3_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField3_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(quantitaField3_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 70, 30));

        quantitaField4_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField4_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField4_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField4_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 30));

        quantitaField5_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField5_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField5_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        quantitaField5_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField5_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(quantitaField5_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 30));

        quantitaField6_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField6_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField6_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField6_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 70, 30));

        quantitaField7_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField7_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField7_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        quantitaField7_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField7_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(quantitaField7_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 70, 30));

        quantitaField9_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField9_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField9_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField9_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 70, 30));

        quantitaField8_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField8_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField8_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField8_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 70, 30));

        quantitaField10_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField10_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField10_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(quantitaField10_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 30));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crea nuovo ingresso:");
        creaIngressoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 50));

        creaIngressoButtonIngressoPanel.setBackground(new java.awt.Color(0, 0, 0));
        creaIngressoButtonIngressoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        creaIngressoButtonIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        creaIngressoButtonIngressoPanel.setText("Crea");
        creaIngressoButtonIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaIngressoButtonIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(creaIngressoButtonIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 200, 40));

        closeButton_newIngressoPanel.setBackground(new java.awt.Color(0, 0, 0));
        closeButton_newIngressoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        closeButton_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        closeButton_newIngressoPanel.setText("Chiudi");
        closeButton_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(closeButton_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 200, 40));

        addArticleButton_newIngressoPanel.setBackground(new java.awt.Color(0, 0, 0));
        addArticleButton_newIngressoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        addArticleButton_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        addArticleButton_newIngressoPanel.setText("Aggiungi Articolo");
        addArticleButton_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArticleButton_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(addArticleButton_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 270, -1));

        posizione1Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione1Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione1Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione1Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 30));

        posizione2Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione2Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione2Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione2Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 30));

        posizione3Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione3Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione3Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione3Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 30));

        posizione4Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione4Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione4Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione4Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, 30));

        posizione5Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione5Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione5Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione5Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 30));

        posizione6Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione6Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione6Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posizione6Field_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posizione6Field_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(posizione6Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 30));

        posizione7Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione7Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione7Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione7Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 80, 30));

        posizione8Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione8Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione8Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione8Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 80, 30));

        posizione9Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione9Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione9Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione9Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 30));

        posizione10Field_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        posizione10Field_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizione10Field_newIngressoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        creaIngressoPanel.add(posizione10Field_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 80, 30));

        jLabel4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantità:");
        creaIngressoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Posizioni:");
        creaIngressoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Articoli: ");
        creaIngressoPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        dataOdierna_newIngressoPanel.setBackground(new java.awt.Color(0, 0, 0));
        dataOdierna_newIngressoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        dataOdierna_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        dataOdierna_newIngressoPanel.setText("Data Odierna");
        dataOdierna_newIngressoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOdierna_newIngressoPanelActionPerformed(evt);
            }
        });
        creaIngressoPanel.add(dataOdierna_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 180, -1));

        dayField_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        dayField_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        dayField_newIngressoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        creaIngressoPanel.add(dayField_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 20, 20));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("/");
        creaIngressoPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("/");
        creaIngressoPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        monthField_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        monthField_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        monthField_newIngressoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        creaIngressoPanel.add(monthField_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 27, -1));

        yearField_newIngressoPanel.setBackground(new java.awt.Color(0, 153, 255));
        yearField_newIngressoPanel.setForeground(new java.awt.Color(255, 255, 255));
        yearField_newIngressoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        creaIngressoPanel.add(yearField_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 70, -1));

        dataLabel_newIngressoPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        dataLabel_newIngressoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        creaIngressoPanel.add(dataLabel_newIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, 100));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Quantità e Posizioni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        creaIngressoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 380));

        getContentPane().add(creaIngressoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 440, 530, 450));

        visualizzaIngressiPanel.setBackground(new java.awt.Color(0, 153, 255));
        visualizzaIngressiPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        visualizzaIngressiPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Avenir", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Visualizza Ingressi:");
        visualizzaIngressiPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        indietroButton_IngressiPanel.setBackground(new java.awt.Color(0, 0, 0));
        indietroButton_IngressiPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indietroButton_IngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        indietroButton_IngressiPanel.setText("<");
        indietroButton_IngressiPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_IngressiPanelActionPerformed(evt);
            }
        });
        visualizzaIngressiPanel.add(indietroButton_IngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 41, -1));

        avantiButton_IngressiPanel.setBackground(new java.awt.Color(0, 0, 0));
        avantiButton_IngressiPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        avantiButton_IngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        avantiButton_IngressiPanel.setText(">");
        avantiButton_IngressiPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_IngressiPanelActionPerformed(evt);
            }
        });
        visualizzaIngressiPanel.add(avantiButton_IngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 40, -1));

        chiudiButtonIngressiPanel.setBackground(new java.awt.Color(0, 0, 0));
        chiudiButtonIngressiPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        chiudiButtonIngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        chiudiButtonIngressiPanel.setText("Chiudi");
        chiudiButtonIngressiPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButtonIngressiPanelActionPerformed(evt);
            }
        });
        visualizzaIngressiPanel.add(chiudiButtonIngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, -1));

        searchFieldIngressiPanel.setEditable(false);
        searchFieldIngressiPanel.setBackground(new java.awt.Color(0, 153, 255));
        searchFieldIngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        searchFieldIngressiPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        visualizzaIngressiPanel.add(searchFieldIngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 30, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaIngressiPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 130, 60));

        newIngressoButton_IngressiPanel.setBackground(new java.awt.Color(0, 0, 0));
        newIngressoButton_IngressiPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        newIngressoButton_IngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        newIngressoButton_IngressiPanel.setText("Crea Nuovo Ingresso");
        newIngressoButton_IngressiPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newIngressoButton_IngressiPanelActionPerformed(evt);
            }
        });
        visualizzaIngressiPanel.add(newIngressoButton_IngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        ingressiIDLabel_VisualizzaIngressiPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        ingressiIDLabel_VisualizzaIngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        ingressiIDLabel_VisualizzaIngressiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        ingressiIDLabel_VisualizzaIngressiPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizzaIngressiPanel.add(ingressiIDLabel_VisualizzaIngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 60));

        jScrollPane3.setBorder(null);

        articoliQuantitaPosizioneIngressiPanel.setEditable(false);
        articoliQuantitaPosizioneIngressiPanel.setBackground(new java.awt.Color(0, 153, 255));
        articoliQuantitaPosizioneIngressiPanel.setColumns(20);
        articoliQuantitaPosizioneIngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        articoliQuantitaPosizioneIngressiPanel.setRows(5);
        articoliQuantitaPosizioneIngressiPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(articoliQuantitaPosizioneIngressiPanel);

        visualizzaIngressiPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 470, 290));

        dataLabel_VisualizzaIngressiPanel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        dataLabel_VisualizzaIngressiPanel.setForeground(new java.awt.Color(255, 255, 255));
        dataLabel_VisualizzaIngressiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        dataLabel_VisualizzaIngressiPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizzaIngressiPanel.add(dataLabel_VisualizzaIngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, 60));

        getContentPane().add(visualizzaIngressiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 490, 450));

        creaNegozioPanel.setBackground(new java.awt.Color(0, 153, 255));
        creaNegozioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        creaNegozioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CREA NEGOZIO");
        creaNegozioPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 43));

        indirizzoField_newNegozioPanel.setBackground(new java.awt.Color(0, 153, 255));
        indirizzoField_newNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indirizzoField_newNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        indirizzoField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Indirizzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        indirizzoField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indirizzoField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(indirizzoField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 224, -1));

        CodiceFiscaleField_NewNegozio.setBackground(new java.awt.Color(0, 153, 255));
        CodiceFiscaleField_NewNegozio.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        CodiceFiscaleField_NewNegozio.setForeground(new java.awt.Color(255, 255, 255));
        CodiceFiscaleField_NewNegozio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Codice Fiscale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        CodiceFiscaleField_NewNegozio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceFiscaleField_NewNegozioActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(CodiceFiscaleField_NewNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 224, 40));

        nomeField_newNegozioPanel.setBackground(new java.awt.Color(0, 153, 255));
        nomeField_newNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        nomeField_newNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        nomeField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        nomeField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(nomeField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 224, -1));

        cittaField_NewNegozioPanel.setBackground(new java.awt.Color(0, 153, 255));
        cittaField_NewNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        cittaField_NewNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        cittaField_NewNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Città", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        cittaField_NewNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cittaField_NewNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(cittaField_NewNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 224, -1));

        creaNegozioButton_CreaNegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        creaNegozioButton_CreaNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        creaNegozioButton_CreaNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        creaNegozioButton_CreaNegozioPanel.setText("Crea");
        creaNegozioButton_CreaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaNegozioButton_CreaNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(creaNegozioButton_CreaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        closeButton_creaNegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        closeButton_creaNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        closeButton_creaNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        closeButton_creaNegozioPanel.setText("Chiudi");
        closeButton_creaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_creaNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(closeButton_creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        modificaNegozioButton_CreaNegozioPanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaNegozioButton_CreaNegozioPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaNegozioButton_CreaNegozioPanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaNegozioButton_CreaNegozioPanel.setText("Modifica");
        modificaNegozioButton_CreaNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaNegozioButton_CreaNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(modificaNegozioButton_CreaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, -1));

        getContentPane().add(creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 230, 500, 190));

        sfondo.setBackground(new java.awt.Color(0, 153, 255));
        sfondo.setForeground(new java.awt.Color(255, 255, 255));
        sfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storicoPanel.setBackground(new java.awt.Color(0, 153, 255));
        storicoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        storicoPanel.setForeground(new java.awt.Color(255, 255, 255));

        titleLabel_StoricoMensile.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        titleLabel_StoricoMensile.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel_StoricoMensile.setText("Storico Mensile: ");

        avantiButton_StoricoPanel.setBackground(new java.awt.Color(0, 0, 0));
        avantiButton_StoricoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        avantiButton_StoricoPanel.setForeground(new java.awt.Color(255, 255, 255));
        avantiButton_StoricoPanel.setText(">");
        avantiButton_StoricoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_StoricoPanelActionPerformed(evt);
            }
        });

        cercaLAbel_StoricoPanel.setEditable(false);
        cercaLAbel_StoricoPanel.setBackground(new java.awt.Color(0, 153, 255));
        cercaLAbel_StoricoPanel.setForeground(new java.awt.Color(255, 255, 255));
        cercaLAbel_StoricoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        indietroButton_StoricoPanel.setBackground(new java.awt.Color(0, 0, 0));
        indietroButton_StoricoPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indietroButton_StoricoPanel.setForeground(new java.awt.Color(255, 255, 255));
        indietroButton_StoricoPanel.setText("<");
        indietroButton_StoricoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_StoricoPanelActionPerformed(evt);
            }
        });

        cercaBorderLabel_Pan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        reportMensileTextArea_ReportPanel.setBackground(new java.awt.Color(0, 153, 255));
        reportMensileTextArea_ReportPanel.setColumns(20);
        reportMensileTextArea_ReportPanel.setRows(5);
        jScrollPane5.setViewportView(reportMensileTextArea_ReportPanel);

        chiudiButton_reportPanel.setBackground(new java.awt.Color(0, 0, 0));
        chiudiButton_reportPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        chiudiButton_reportPanel.setForeground(new java.awt.Color(255, 255, 255));
        chiudiButton_reportPanel.setText("Chiudi");
        chiudiButton_reportPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButton_reportPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout storicoPanelLayout = new javax.swing.GroupLayout(storicoPanel);
        storicoPanel.setLayout(storicoPanelLayout);
        storicoPanelLayout.setHorizontalGroup(
            storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storicoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(storicoPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel_StoricoMensile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(storicoPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(cercaLAbel_StoricoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storicoPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(avantiButton_StoricoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(storicoPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(indietroButton_StoricoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cercaBorderLabel_Pan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(storicoPanelLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chiudiButton_reportPanel)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        storicoPanelLayout.setVerticalGroup(
            storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storicoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cercaBorderLabel_Pan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(storicoPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(storicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cercaLAbel_StoricoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avantiButton_StoricoPanel)
                            .addComponent(indietroButton_StoricoPanel)))
                    .addComponent(titleLabel_StoricoMensile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chiudiButton_reportPanel))
        );

        sfondo.add(storicoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 30, 520, 360));

        visualizzaArticoliPanel.setBackground(new java.awt.Color(0, 153, 255));
        visualizzaArticoliPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        visualizzaArticoliPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        IDLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        IDLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(IDLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 50));

        prezzoLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        prezzoLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        prezzoLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(prezzoLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 50));

        posizioneLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        posizioneLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        posizioneLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Posizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(posizioneLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 50));

        nomeLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        nomeLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(nomeLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 200, 50));

        descrizioneLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        descrizioneLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        descrizioneLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(descrizioneLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 50));

        sportLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        sportLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        sportLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Sport", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(sportLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 50));

        materialiLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        materialiLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        materialiLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Materiale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(materialiLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 50));

        avantiButton_VisualizzaArticoloPanel.setBackground(new java.awt.Color(0, 0, 0));
        avantiButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        avantiButton_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        avantiButton_VisualizzaArticoloPanel.setText(">");
        avantiButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(avantiButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, 30));

        indietroButton_VisualizzaArticoloPanel.setBackground(new java.awt.Color(0, 0, 0));
        indietroButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        indietroButton_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        indietroButton_VisualizzaArticoloPanel.setText("<");
        indietroButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(indietroButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 41, -1));

        modificaButton_cercaLabel__VisualizzaArticoliPanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaButton_cercaLabel__VisualizzaArticoliPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaButton_cercaLabel__VisualizzaArticoliPanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaButton_cercaLabel__VisualizzaArticoliPanel.setText("Modifica");
        modificaButton_cercaLabel__VisualizzaArticoliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaButton_cercaLabel__VisualizzaArticoliPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(modificaButton_cercaLabel__VisualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setBackground(new java.awt.Color(0, 0, 0));
        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setForeground(new java.awt.Color(255, 255, 255));
        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setText("Crea Articolo");
        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaArticoloButtoncercaLabel_VisualizzaArticoliPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(creaArticoloButtoncercaLabel_VisualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        chiudiButton_VisualizzaArticoloPanel.setBackground(new java.awt.Color(0, 0, 0));
        chiudiButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        chiudiButton_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        chiudiButton_VisualizzaArticoloPanel.setText("Chiudi");
        chiudiButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(chiudiButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        TipoArticoloLabel__VisualizzaArticoliPanel.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        TipoArticoloLabel__VisualizzaArticoliPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(TipoArticoloLabel__VisualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 280));

        cercaLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        cercaLabel_VisualizzaArticoloPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        visualizzaArticoliPanel.add(cercaLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 30, 30));

        cercaLabel__VisualizzaArticoliPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        cercaLabel__VisualizzaArticoliPanel.setForeground(new java.awt.Color(255, 255, 255));
        cercaLabel__VisualizzaArticoliPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(cercaLabel__VisualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, 60));

        dataLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        dataLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        dataLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Data inserimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(dataLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 50));

        quantitaLabel_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        quantitaLabel_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaLabel_VisualizzaArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Quantità", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        visualizzaArticoliPanel.add(quantitaLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 50));

        modificaPosizioneViewArticoliPanel.setBackground(new java.awt.Color(0, 0, 0));
        modificaPosizioneViewArticoliPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        modificaPosizioneViewArticoliPanel.setForeground(new java.awt.Color(255, 255, 255));
        modificaPosizioneViewArticoliPanel.setText("Modifica posizione");
        modificaPosizioneViewArticoliPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaPosizioneViewArticoliPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(modificaPosizioneViewArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, -1));

        titleLabel__VisualizzaArticoliPanel.setBackground(new java.awt.Color(0, 153, 255));
        titleLabel__VisualizzaArticoliPanel.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        titleLabel__VisualizzaArticoliPanel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel__VisualizzaArticoliPanel.setText("Visualizza Articoli");
        visualizzaArticoliPanel.add(titleLabel__VisualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        eliminaButton_VisualizzaArticoloPanel.setBackground(new java.awt.Color(0, 0, 0));
        eliminaButton_VisualizzaArticoloPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        eliminaButton_VisualizzaArticoloPanel.setForeground(new java.awt.Color(255, 255, 255));
        eliminaButton_VisualizzaArticoloPanel.setText("Elimina");
        eliminaButton_VisualizzaArticoloPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaButton_VisualizzaArticoloPanelActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(eliminaButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jScrollPane2.setToolTipText("");

        tabellaArticoli.setBackground(new java.awt.Color(0, 153, 255));
        tabellaArticoli.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        tabellaArticoli.setForeground(new java.awt.Color(255, 255, 255));
        tabellaArticoli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Articolo", "Prezzo", "sport", "Materiale", "Quantità", "Posizione"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaArticoli.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabellaArticoli.setSelectionForeground(new java.awt.Color(0, 153, 255));
        tabellaArticoli.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabellaArticoli.setShowGrid(true);
        tabellaArticoli.getTableHeader().setReorderingAllowed(false);
        tabellaArticoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaArticoliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabellaArticoli);
        if (tabellaArticoli.getColumnModel().getColumnCount() > 0) {
            tabellaArticoli.getColumnModel().getColumn(2).setMaxWidth(50);
            tabellaArticoli.getColumnModel().getColumn(5).setMaxWidth(80);
            tabellaArticoli.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        visualizzaArticoliPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 600, 340));

        sfondo.add(visualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 1160, 400));

        creaNuovoOrdinePanel.setBackground(new java.awt.Color(0, 153, 255));
        creaNuovoOrdinePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        creaNuovoOrdinePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Crea un nuovo ordine:");
        creaNuovoOrdinePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, 37));

        creaOrdineButton_orderViewPanel.setBackground(new java.awt.Color(0, 0, 0));
        creaOrdineButton_orderViewPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        creaOrdineButton_orderViewPanel.setForeground(new java.awt.Color(255, 255, 255));
        creaOrdineButton_orderViewPanel.setText("Crea");
        creaOrdineButton_orderViewPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaOrdineButton_orderViewPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(creaOrdineButton_orderViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 60));

        closeButton_newOrderPanel.setBackground(new java.awt.Color(0, 0, 0));
        closeButton_newOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        closeButton_newOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        closeButton_newOrderPanel.setText("Chiudi");
        closeButton_newOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_newOrderPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(closeButton_newOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 60));

        corriereField_NewOrderPanel.setBackground(new java.awt.Color(0, 153, 255));
        corriereField_NewOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        corriereField_NewOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        corriereField_NewOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Corriere", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        corriereField_NewOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corriereField_NewOrderPanelActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(corriereField_NewOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        ComboBoxNegozio.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        ComboBoxNegozio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxNegozio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNegozioActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(ComboBoxNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        comboBoxArticoli1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli1ItemStateChanged(evt);
            }
        });
        comboBoxArticoli1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxArticoli1MouseClicked(evt);
            }
        });
        comboBoxArticoli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxArticoli1ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        creaNuovoOrdinePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 70));

        comboBoxArticoli2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli2ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        comboBoxArticoli3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli3ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        comboBoxArticoli4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli4ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        comboBoxArticoli5.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli5ItemStateChanged(evt);
            }
        });
        comboBoxArticoli5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxArticoli5ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        comboBoxArticoli6.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli6ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        comboBoxArticoli7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli7ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        comboBoxArticoli8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli8ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        comboBoxArticoli9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxArticoli9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxArticoli9ItemStateChanged(evt);
            }
        });
        creaNuovoOrdinePanel.add(comboBoxArticoli9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        comboBoxArticoli10.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        comboBoxArticoli10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creaNuovoOrdinePanel.add(comboBoxArticoli10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        quantitaField10.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField10.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField10.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField10ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, -1));

        quantitaField2.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField2.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField2.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField2ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, -1));

        quantitaField1.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField1.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField1ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 60, -1));

        quantitaField3.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField3.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField3ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 60, -1));

        quantitaField4.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField4.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField4.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField4ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, -1));

        quantitaField5.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField5.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField5.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField5ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 60, -1));

        quantitaField6.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField6.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField6.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField6ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, -1));

        quantitaField7.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField7.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField7ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, -1));

        quantitaField8.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField8.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField8ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, -1));

        quantitaField9.setBackground(new java.awt.Color(0, 153, 255));
        quantitaField9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaField9.setForeground(new java.awt.Color(255, 255, 255));
        quantitaField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        quantitaField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaField9ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(quantitaField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 60, -1));

        quantitaLabel_NewOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        quantitaLabel_NewOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        quantitaLabel_NewOrderPanel.setText("Quantità:");
        creaNuovoOrdinePanel.add(quantitaLabel_NewOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        articoliLabel_NewOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        articoliLabel_NewOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        articoliLabel_NewOrderPanel.setText("Articoli: ");
        creaNuovoOrdinePanel.add(articoliLabel_NewOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        corniceArticoloLabel_newOrderPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        corniceArticoloLabel_newOrderPanel.setForeground(new java.awt.Color(255, 255, 255));
        corniceArticoloLabel_newOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        creaNuovoOrdinePanel.add(corniceArticoloLabel_newOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 350));

        sfondo.add(creaNuovoOrdinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 410, 430));

        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2260, 980));

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

        /* DAL TESTO...
        Il sistema deve permettere ai magazzinieri di inserire le informazioni relative ai movimenti di ingresso e uscita dal magazzino. I magazzinieri, inoltre, possono spostare un articolo da una posizione ad un’altra del magazzino, al fine di ottimizzare l’occupazione del magazzino.
        La segreteria amministrativa della catena di negozi è responsabile dell’inserimento dei tipi di articolo. Essa può accedere al sistema e visualizzare i movimenti di magazzino rispetto agli ordini dei vari negozi. Tutti gli utenti sono opportunamente autenticati dal sistema, prima che possano accedere alle funzionalità specifiche.
        I responsabili dei negozi possono accedere al sistema per effettuare gli ordini e per avere un riassunto degli ordini passati.*/
 /*
        1 - Magazziniere 
            Visualizza ingresso,crea ingresso, visualizza articolo, modifica posizione articolo, crea uscite per gli ordini quindi vede gli ordini
        2 - Segreteria Amministrativa
            creano articoli e quindi vedono gli articoli ma non possono spostare la posizione degli articoli, visualizzano ordini e ingressi senza modificarli o crearli ne cancellarli
        3 - Responsabile Negozi
            Visualizzano, creano e modificano gli ordini e i negozi, non possono vedere gli ingressi e le
         */
        //CONTROLLO DA IMPLEMENTARE A PROGETTO FINITO
        String pin = pinField.getText();
        String user = usrField.getText();

        if (pin.equals("") || user.equals("") || pin.substring(0, 1).equals(" ") || user.substring(0, 1).equals(" ")) {
            JOptionPane.showMessageDialog(null, "Inserire uno username e una password validi");
            usrField.setText("");
            pinField.setText("");
        } else {
            try {
                int type = m.loginHashCode(new Utente(user, pin, 1));
                JOptionPane.showMessageDialog(null, "Login effettuato correttamente\nTipoAccount: " + type);
                hideAll();//nascondo tutti i pannelli
                switch (type) {
                    case 1://Magazziniere
                        adminPanel.setVisible(true);
                        articoliButtonAdminPanel.setEnabled(true);
                        modificaPosizioneViewArticoliPanel.setEnabled(true);
                        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setEnabled(false);
                        modificaButton_cercaLabel__VisualizzaArticoliPanel.setEnabled(false);
                        negoziButtonAdminPanel.setEnabled(false);
                        ordiniButtonAdminPanel.setEnabled(false);
                        ingressiButtonAdminPanel.setEnabled(true);
                        typeOfUserLabel_AdminPanel.setText("Tipo Utente: Magazziniere");
                        
                        //Bottone per uscite setEnabled(true)
                        break;

                    case 2://segreteria amministrativa
                        adminPanel.setVisible(true);
                        articoliButtonAdminPanel.setEnabled(true);
                        modificaPosizioneViewArticoliPanel.setEnabled(false);
                        creaArticoloButtoncercaLabel_VisualizzaArticoliPanel.setEnabled(true);
                        modificaButton_cercaLabel__VisualizzaArticoliPanel.setEnabled(true);
                        negoziButtonAdminPanel.setEnabled(true);
                        ordiniButtonAdminPanel.setEnabled(true);
                        ingressiButtonAdminPanel.setEnabled(true);
                        typeOfUserLabel_AdminPanel.setText("Tipo Utente: Segreteria Amministrativa");
                        //Bottone per uscite setEnabled(true)
                        break;

                    case 3: // Responsabile Negozi
                        adminPanel.setVisible(true);
                        articoliButtonAdminPanel.setEnabled(false);
                        negoziButtonAdminPanel.setEnabled(false);
                        ordiniButtonAdminPanel.setEnabled(true);
                        ingressiButtonAdminPanel.setEnabled(false);
                        typeOfUserLabel_AdminPanel.setText("Tipo Utente: Responsabile dei Negozi");
                        //Bottone per uscite setEnabled(false)
                        break;

                    case 4:
                        adminPanel.setVisible(true);
                        articoliButtonAdminPanel.setEnabled(true);
                        negoziButtonAdminPanel.setEnabled(true);
                        ordiniButtonAdminPanel.setEnabled(true);
                        ingressiButtonAdminPanel.setEnabled(true);
                        //Bottone per uscite setEnabled(true)
                        break;
                }
            } catch (UserNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Impossibile effettuare il login; riprovare più tardi, se il problema persiste contattare l'amministratore di sistema il prima possibile");
                usrField.setText("");
                pinField.setText("");
            }
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void chiudiButtonOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButtonOrderPanelActionPerformed
        orderIDLabel_OrderViewPanel.setText("");
        prezzoLabel_OrderViewPanel.setText("");
        dataLabel_OrderViewPanel.setText("");
        corriereLabel_OrderViewPanel.setText("");
        negozioLabel_OrderViewPanel.setText("");
        hideAll();
        adminPanel.setVisible(true);
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
        modificaOrCreaOrdine = 1;
        bool = false;
        //INIZIALIZZAZIONE GRAFICA
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

        quantitaField1.setText("");
        quantitaField2.setText("");
        quantitaField5.setText("");
        quantitaField8.setText("");
        quantitaField3.setText("");
        quantitaField6.setText("");
        quantitaField9.setText("");
        quantitaField4.setText("");
        quantitaField7.setText("");
        quantitaField10.setText("");

        orderArticleSelected = 1;
        hideAll();
        creaNuovoOrdinePanel.setVisible(true);
        corriereField_NewOrderPanel.setText("");

        int i = 0;

        for (i = 0; i < m.negoziSize(); i++) {
            ComboBoxNegozio.addItem(m.getNegozio(i).getNome());
        }

        comboBoxArticoli1.addItem("<Articolo>");
        comboBoxArticoli2.addItem("<Articolo>");
        comboBoxArticoli3.addItem("<Articolo>");
        comboBoxArticoli4.addItem("<Articolo>");
        comboBoxArticoli5.addItem("<Articolo>");
        comboBoxArticoli6.addItem("<Articolo>");
        comboBoxArticoli7.addItem("<Articolo>");
        comboBoxArticoli8.addItem("<Articolo>");
        comboBoxArticoli9.addItem("<Articolo>");
        comboBoxArticoli9.addItem("<Articolo>");
        comboBoxArticoli10.addItem("<Articolo>");

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
            comboBoxArticoli10.addItem(m.getArticolo(i).getTipoArticolo().getName());
        }
        bool = true;
    }//GEN-LAST:event_newOrderButton_orderViewPanelActionPerformed

    private void articoliButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articoliButtonAdminPanelActionPerformed
        hideAll();
        visualizzaArticoliPanel.setVisible(true);
        articoli();
    }//GEN-LAST:event_articoliButtonAdminPanelActionPerformed

    private void closeButton_creaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_creaNegozioPanelActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_creaNegozioPanelActionPerformed

    private void negoziButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negoziButtonAdminPanelActionPerformed
        hideAll();
        negoziPanel.setVisible(true);
        indexShop = 0;
        negozi();
    }//GEN-LAST:event_negoziButtonAdminPanelActionPerformed

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
        if (from == 0) {
            hideAll();
            adminPanel.setVisible(true);
        } else if (from == 1) {
            from = 0;
            indexShop = 0;
            hideAll();
            negozi();
            visualizzaOrdiniPanel.setVisible(true);
            ordini();
        }

    }//GEN-LAST:event_closeButton_NegozioPanel1ActionPerformed

    private void CreaNegozioButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaNegozioButton_NegozioPanelActionPerformed
        hideAll();
        modificaNegozioButton_CreaNegozioPanel.setVisible(false);
        creaNegozioButton_CreaNegozioPanel.setVisible(true);
        creaNegozioPanel.setVisible(true);
    }//GEN-LAST:event_CreaNegozioButton_NegozioPanelActionPerformed

    private void creaNegozioButton_CreaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaNegozioButton_CreaNegozioPanelActionPerformed
        String cf = CodiceFiscaleField_NewNegozio.getText();
        String nome = nomeField_newNegozioPanel.getText();
        String indirizzo = indirizzoField_newNegozioPanel.getText();
        String citta = cittaField_NewNegozioPanel.getText();
        try {
            m.addNegozi(new Negozio(cf, nome, indirizzo, citta));
        } catch (Exception e) {

        }
        JOptionPane.showMessageDialog(null, "Negozio creato con successo!");
        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        indexShop = m.negoziSize() - 1;
        negozi();
    }//GEN-LAST:event_creaNegozioButton_CreaNegozioPanelActionPerformed

    private void closeButton_newOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_newOrderPanelActionPerformed
        hideAll();
        visualizzaOrdiniPanel.setVisible(true);
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
        corriereField_NewOrderPanel.setText("");
    }//GEN-LAST:event_closeButton_newOrderPanelActionPerformed

    private void chiudiButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButton_VisualizzaArticoloPanelActionPerformed
        hideAll();
        adminPanel.setVisible(true);
    }//GEN-LAST:event_chiudiButton_VisualizzaArticoloPanelActionPerformed

    private void eliminaNegozioButton_VisualizzaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaNegozioButton_VisualizzaNegozioPanelActionPerformed
        m.removeNegozio(indexShop);
        if (indexShop > 0) {
            indexShop--;
        }
        negozi();
    }//GEN-LAST:event_eliminaNegozioButton_VisualizzaNegozioPanelActionPerformed

    private void modificaButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButton_NegozioPanelActionPerformed
        hideAll();
        creaNegozioPanel.setVisible(true);
        CodiceFiscaleField_NewNegozio.setText(m.getNegozio(indexShop).getCodiceFiscale());
        nomeField_newNegozioPanel.setText(m.getNegozio(indexShop).getNome());
        indirizzoField_newNegozioPanel.setText(m.getNegozio(indexShop).getindirizzo());
        cittaField_NewNegozioPanel.setText(m.getNegozio(indexShop).getCitta());
        modificaNegozioButton_CreaNegozioPanel.setVisible(true);
        creaNegozioButton_CreaNegozioPanel.setVisible(false);
    }//GEN-LAST:event_modificaButton_NegozioPanelActionPerformed

    private void modificaNegozioButton_CreaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaNegozioButton_CreaNegozioPanelActionPerformed
        String cf = CodiceFiscaleField_NewNegozio.getText();
        String nome = nomeField_newNegozioPanel.getText();
        String indirizzo = indirizzoField_newNegozioPanel.getText();
        String citta = cittaField_NewNegozioPanel.getText();

        m.getNegozio(indexShop).setCodiceFiscale(cf);
        m.getNegozio(indexShop).setNome(nome);
        m.getNegozio(indexShop).setIndirizzo(indirizzo);
        m.getNegozio(indexShop).setCitta(citta);

        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        negozi();
    }//GEN-LAST:event_modificaNegozioButton_CreaNegozioPanelActionPerformed

    private void selezionaButton_NegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaButton_NegozioPanelActionPerformed
        String corriere = corriereField_NewOrderPanel.getText();
        //Ordine n = m.addOrdine(new Ordine(m.getNegozio(indexShop)));
        //m.createExit(m, n)
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
            //prendo i dati inseriti
            String nome = nomeFieldTipoArticolo_newArticlePanel.getText();
            String descrizione = descrizioneFieldTipoArticolo_newArticlePanel.getText();
            int day = Integer.parseInt(dayField_newArticlePanel.getText());
            int month = Integer.parseInt(monthField_newArticlePanel.getText());
            int year = Integer.parseInt(yearField_newArticlePanel.getText());
            GregorianCalendar c = new GregorianCalendar(year, month, day);
            float prezzo = Float.parseFloat(prezzoField_newArticlePanel.getText());

            //aggiungo l'articolo alla lista in magazzino
            m.addArticolo(new Articolo(prezzo, c, new TipoArticolo(nome, descrizione, sport, tipoMateriale)));

            nomeFieldTipoArticolo_newArticlePanel.setText("");
            descrizioneFieldTipoArticolo_newArticlePanel.setText("");
            prezzoField_newArticlePanel.setText("");
            dayField_newArticlePanel.setText("");
            monthField_newArticlePanel.setText("");
            yearField_newArticlePanel.setText("");
            poliestereRadioButton.setSelected(true);
            nuotoRadioButton.setSelected(true);
            hideAll();//nascondo tutto 

            indexArticle = m.articoliSize() - 1;//faccio puntare all'ultimo prodotto creato
            articoli();//aggiorno la view degli articoli
            visualizzaArticoliPanel.setVisible(true);
        } catch (Exception e) {
            nomeFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            descrizioneFieldTipoArticolo_newArticlePanel.setBackground(Color.red);
            prezzoField_newArticlePanel.setBackground(Color.red);
        }

    }//GEN-LAST:event_inserisciButton_newArticlePanelActionPerformed

    private void creaArticoloButtoncercaLabel_VisualizzaArticoliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaArticoloButtoncercaLabel_VisualizzaArticoliPanelActionPerformed
        hideAll();
        dayField_newArticlePanel.setText("");
        monthField_newArticlePanel.setText("");
        yearField_newArticlePanel.setText("");
        prezzoField_newArticlePanel.setText("");
        nomeFieldTipoArticolo_newArticlePanel.setText("");
        descrizioneFieldTipoArticolo_newArticlePanel.setText("");
        modificaButton_newArticlePanel.setVisible(false);
        inserisciButton_newArticlePanel.setVisible(true);
        nuotoRadioButton.setSelected(true);
        poliestereRadioButton.setSelected(true);
        newArticlePanel.setVisible(true);
    }//GEN-LAST:event_creaArticoloButtoncercaLabel_VisualizzaArticoliPanelActionPerformed

    private void basketRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basketRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basketRadioButtonActionPerformed

    private void prezzoField_newArticlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prezzoField_newArticlePanelMouseClicked
        Color a = new Color(0, 153, 255);
        prezzoField_newArticlePanel.setBackground(a);
    }//GEN-LAST:event_prezzoField_newArticlePanelMouseClicked

    private void modificaButton_cercaLabel__VisualizzaArticoliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButton_cercaLabel__VisualizzaArticoliPanelActionPerformed
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
            case "Nuoto":
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


    }//GEN-LAST:event_modificaButton_cercaLabel__VisualizzaArticoliPanelActionPerformed


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
        } catch (NumberFormatException e) {
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
        nuotoRadioButton.setSelected(false);
        calcioRadioButton.setSelected(false);
        palestraRadioButton.setSelected(false);
        tennisRadioButton.setSelected(false);
        sciiRadioButton.setSelected(false);
        basketRadioButton.setSelected(false);
        pallavoloRadioButton.setSelected(false);
        raftingRadioButton.setSelected(false);
        ciclismoRadioButton.setSelected(false);
        rugbyRadioButton.setSelected(false);
        atleticaRadioButton.setSelected(false);
        hockeyRadioButton.setSelected(false);
        golfRadioButton.setSelected(false);
        danzaRadioButton.setSelected(false);

        poliestereRadioButton.setSelected(false);
        siliconeRadioButton.setSelected(false);
        fintaPelleRadioButton.setSelected(false);
        goreTexRadioButton.setSelected(false);
        poliammideRadioButton.setSelected(false);
        polietileneRadioButton.setSelected(false);
        elastanRadioButton.setSelected(false);

        nomeFieldTipoArticolo_newArticlePanel.setText("");
        descrizioneFieldTipoArticolo_newArticlePanel.setText("");
        prezzoField_newArticlePanel.setText("");
        dayField_newArticlePanel.setText("");
        monthField_newArticlePanel.setText("");
        yearField_newArticlePanel.setText("");
        hideAll();
        visualizzaArticoliPanel.setVisible(true);
        articoli();
    }//GEN-LAST:event_cancellaButton_newArticlePanelActionPerformed

    //Nel pannello creaArticolo quando si genera un'eccezzione i campi di testo si colorano da neri a rossi e quando clicco sui i campi per modificarne il valore li ricoloro di nero e cancello la scritta di errore
    private void nomeFieldTipoArticolo_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldTipoArticolo_newArticlePanelActionPerformed
        nomeFieldTipoArticolo_newArticlePanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_nomeFieldTipoArticolo_newArticlePanelActionPerformed

    private void descrizioneFieldTipoArticolo_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descrizioneFieldTipoArticolo_newArticlePanelActionPerformed
        descrizioneFieldTipoArticolo_newArticlePanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_descrizioneFieldTipoArticolo_newArticlePanelActionPerformed

    private void prezzoField_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prezzoField_newArticlePanelActionPerformed
        prezzoField_newArticlePanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_prezzoField_newArticlePanelActionPerformed

    private void corriereField_NewOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corriereField_NewOrderPanelActionPerformed
        corriereField_NewOrderPanel.setBackground(C);
    }//GEN-LAST:event_corriereField_NewOrderPanelActionPerformed

    private void creaOrdineButton_orderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaOrdineButton_orderViewPanelActionPerformed
        boolean voidSelection = false;
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
        try {
            quantita1 = quantitaField1.getText().equals("") || quantitaField1.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField1.getText());
            quantita2 = quantitaField2.getText().equals("") || quantitaField2.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField2.getText());
            quantita3 = quantitaField3.getText().equals("") || quantitaField3.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField3.getText());
            quantita4 = quantitaField4.getText().equals("") || quantitaField4.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField4.getText());
            quantita5 = quantitaField5.getText().equals("") || quantitaField5.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField5.getText());
            quantita6 = quantitaField6.getText().equals("") || quantitaField6.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField6.getText());
            quantita7 = quantitaField7.getText().equals("") || quantitaField7.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField7.getText());
            quantita8 = quantitaField8.getText().equals("") || quantitaField8.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField8.getText());
            quantita9 = quantitaField9.getText().equals("") || quantitaField9.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField9.getText());
            quantita10 = quantitaField10.getText().equals("") || quantitaField10.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField10.getText());

            if (articolo1.equals("<Articolo>") && quantita1 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli1.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo2.equals("<Articolo>") && quantita2 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli2.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo3.equals("<Articolo>") && quantita3 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli3.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo4.equals("<Articolo>") && quantita4 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli4.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo5.equals("<Articolo>") && quantita5 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli5.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo6.equals("<Articolo>") && quantita6 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli6.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo7.equals("<Articolo>") && quantita7 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli7.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo8.equals("<Articolo>") && quantita8 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli8.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo9.equals("<Articolo>") && quantita9 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli9.setBackground(Color.red);
                voidSelection = true;
                return;
            }
            if (articolo10.equals("<Articolo>") && quantita10 != 0) {
                JOptionPane.showMessageDialog(null, "Selezionare un articolo!");
                comboBoxArticoli10.setBackground(Color.red);
                voidSelection = true;
                return;
            }

            Articolo a1 = articolo1.equals("<Articolo>") ? null : m.articoloContainedByName(articolo1);
            Articolo a2 = articolo2.equals("<Articolo>") ? null : m.articoloContainedByName(articolo2);
            Articolo a3 = articolo3.equals("<Articolo>") ? null : m.articoloContainedByName(articolo3);
            Articolo a4 = articolo4.equals("<Articolo>") ? null : m.articoloContainedByName(articolo4);
            Articolo a5 = articolo5.equals("<Articolo>") ? null : m.articoloContainedByName(articolo5);
            Articolo a6 = articolo6.equals("<Articolo>") ? null : m.articoloContainedByName(articolo6);
            Articolo a7 = articolo7.equals("<Articolo>") ? null : m.articoloContainedByName(articolo7);
            Articolo a8 = articolo8.equals("<Articolo>") ? null : m.articoloContainedByName(articolo8);
            Articolo a9 = articolo9.equals("<Articolo>") ? null : m.articoloContainedByName(articolo9);
            Articolo a10 = articolo10.equals("<Articolo>") ? null : m.articoloContainedByName(articolo10);

            if (quantita1 != 0) {
                articoliAndQuantita.put(a1, quantita1);
            }

            if (quantita2 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita3 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita4 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita5 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita6 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita7 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita8 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita9 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }

            if (quantita10 != 0) {
                if (articoliAndQuantita.containsKey(a2))//controllo se è già stato inserito
                {
                    articoliAndQuantita.put(a2, quantita2 + articoliAndQuantita.get(a2));
                } else {
                    articoliAndQuantita.put(a2, quantita2);
                }
            }
            if (articoliAndQuantita.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserisci almeno un oggetto!");
                return;
            }
            Ordine o1 = new Ordine(x, corriere, new GregorianCalendar(), articoliAndQuantita);
            if( modificaOrCreaOrdine == 1 )
            m.addOrdine(o1);
            if( modificaOrCreaOrdine == 2)
            ;
            
            
        } catch (ArticleDontExistInWareHouseException | HeadlessException | VoidStringUnexpectedException e) {
            JOptionPane.showMessageDialog(null, "Eccezione");
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
        } finally {
            if (voidSelection) {
                return;
            }

            indexOrder = m.ordineSize() - 1;

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
        }
    }//GEN-LAST:event_creaOrdineButton_orderViewPanelActionPerformed

    private void ComboBoxNegozioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNegozioActionPerformed

    }//GEN-LAST:event_ComboBoxNegozioActionPerformed

    void aggiungiArticolo() {
        switch (orderArticleSelected) {
            case 1:
                comboBoxArticoli2.setEnabled(true);
                quantitaField2.setEnabled(true);
                orderArticleSelected++;
                break;
            case 2:
                comboBoxArticoli3.setEnabled(true);
                quantitaField3.setEnabled(true);
                orderArticleSelected++;
                break;
            case 3:
                comboBoxArticoli4.setEnabled(true);
                quantitaField4.setEnabled(true);
                orderArticleSelected++;
                break;
            case 4:
                comboBoxArticoli5.setEnabled(true);
                quantitaField5.setEnabled(true);
                orderArticleSelected++;
                break;
            case 5:
                comboBoxArticoli6.setEnabled(true);
                quantitaField6.setEnabled(true);
                orderArticleSelected++;
                break;
            case 6:
                comboBoxArticoli7.setEnabled(true);
                quantitaField7.setEnabled(true);
                orderArticleSelected++;
                break;
            case 7:
                comboBoxArticoli8.setEnabled(true);
                quantitaField8.setEnabled(true);
                orderArticleSelected++;
                break;
            case 8:
                comboBoxArticoli9.setEnabled(true);
                quantitaField9.setEnabled(true);
                orderArticleSelected++;
                break;
            case 9:
                comboBoxArticoli10.setEnabled(true);
                quantitaField10.setEnabled(true);
                orderArticleSelected++;
                break;

        }
        /*quantitaField1.setBackground(C);
        quantitaField2.setBackground(C);
        quantitaField3.setBackground(C);
        quantitaField4.setBackground(C);
        quantitaField5.setBackground(C);
        quantitaField6.setBackground(C);
        quantitaField7.setBackground(C);
        quantitaField8.setBackground(C);
        quantitaField9.setBackground(C);
        quantitaField10.setBackground(C);

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

        }*/
    }

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

    private void creaIngressoButtonIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaIngressoButtonIngressoPanelActionPerformed
        try {
            Map<Articolo, Integer> posizioni = new TreeMap<>();
            Map<Articolo, Integer> quantita = new TreeMap<>();

            //COLORO I TESTI DELLO SFONDO DEL PANNELLO
            posizione1Field_newIngressoPanel.setBackground(C);
            posizione2Field_newIngressoPanel.setBackground(C);
            posizione3Field_newIngressoPanel.setBackground(C);
            posizione4Field_newIngressoPanel.setBackground(C);
            posizione5Field_newIngressoPanel.setBackground(C);
            posizione6Field_newIngressoPanel.setBackground(C);
            posizione7Field_newIngressoPanel.setBackground(C);
            posizione8Field_newIngressoPanel.setBackground(C);
            posizione9Field_newIngressoPanel.setBackground(C);
            posizione10Field_newIngressoPanel.setBackground(C);

            quantitaField1_newIngressoPanel.setBackground(C);
            quantitaField2_newIngressoPanel.setBackground(C);
            quantitaField3_newIngressoPanel.setBackground(C);
            quantitaField4_newIngressoPanel.setBackground(C);
            quantitaField5_newIngressoPanel.setBackground(C);
            quantitaField6_newIngressoPanel.setBackground(C);
            quantitaField7_newIngressoPanel.setBackground(C);
            quantitaField8_newIngressoPanel.setBackground(C);
            quantitaField9_newIngressoPanel.setBackground(C);
            quantitaField10_newIngressoPanel.setBackground(C);

            //mi dichiaro gli interi di cui ho bisogno
            int quantita1, quantita2, quantita3, quantita4, quantita5, quantita6, quantita7, quantita8, quantita9, quantita10;
            int posizione1, posizione2, posizione3, posizione4, posizione5, posizione6, posizione7, posizione8, posizione9, posizione10;

            //mi prendo l'articolo in base alla selezione del combobox
            String Articolo1 = (String) comboBoxIngressoArticoli1.getSelectedItem();
            String Articolo2 = (String) comboBoxIngressoArticoli2.getSelectedItem();
            String Articolo3 = (String) comboBoxIngressoArticoli3.getSelectedItem();
            String Articolo4 = (String) comboBoxIngressoArticoli4.getSelectedItem();
            String Articolo5 = (String) comboBoxIngressoArticoli5.getSelectedItem();
            String Articolo6 = (String) comboBoxIngressoArticoli6.getSelectedItem();
            String Articolo7 = (String) comboBoxIngressoArticoli7.getSelectedItem();
            String Articolo8 = (String) comboBoxIngressoArticoli8.getSelectedItem();
            String Articolo9 = (String) comboBoxIngressoArticoli9.getSelectedItem();
            String Articolo10 = (String) comboBoxIngressoArticoli10.getSelectedItem();

            //mi prendo gli articolo in base al nome del combobox
            Articolo a1 = m.articoloContainedByName(Articolo1);
            Articolo a2 = m.articoloContainedByName(Articolo2);
            Articolo a3 = m.articoloContainedByName(Articolo3);
            Articolo a4 = m.articoloContainedByName(Articolo4);
            Articolo a5 = m.articoloContainedByName(Articolo5);
            Articolo a6 = m.articoloContainedByName(Articolo6);
            Articolo a7 = m.articoloContainedByName(Articolo7);
            Articolo a8 = m.articoloContainedByName(Articolo8);
            Articolo a9 = m.articoloContainedByName(Articolo9);
            Articolo a10 = m.articoloContainedByName(Articolo10);

            //mi prendo o mi setto i valori di quantita e posizione
            quantita1 = quantitaField1_newIngressoPanel.getText().equals("") || quantitaField1_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField1_newIngressoPanel.getText());
            quantita2 = quantitaField2_newIngressoPanel.getText().equals("") || quantitaField2_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField2_newIngressoPanel.getText());
            quantita3 = quantitaField3_newIngressoPanel.getText().equals("") || quantitaField3_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField3_newIngressoPanel.getText());
            quantita4 = quantitaField4_newIngressoPanel.getText().equals("") || quantitaField4_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField4_newIngressoPanel.getText());
            quantita5 = quantitaField5_newIngressoPanel.getText().equals("") || quantitaField5_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField5_newIngressoPanel.getText());
            quantita6 = quantitaField6_newIngressoPanel.getText().equals("") || quantitaField6_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField6_newIngressoPanel.getText());
            quantita7 = quantitaField7_newIngressoPanel.getText().equals("") || quantitaField7_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField7_newIngressoPanel.getText());
            quantita8 = quantitaField8_newIngressoPanel.getText().equals("") || quantitaField8_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField8_newIngressoPanel.getText());
            quantita9 = quantitaField9_newIngressoPanel.getText().equals("") || quantitaField9_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField9_newIngressoPanel.getText());
            quantita10 = quantitaField10_newIngressoPanel.getText().equals("") || quantitaField10_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(quantitaField10_newIngressoPanel.getText());

            posizione1 = posizione1Field_newIngressoPanel.getText().equals("") || posizione1Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione1Field_newIngressoPanel.getText());
            posizione2 = posizione2Field_newIngressoPanel.getText().equals("") || posizione2Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione2Field_newIngressoPanel.getText());
            posizione3 = posizione3Field_newIngressoPanel.getText().equals("") || posizione3Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione3Field_newIngressoPanel.getText());
            posizione4 = posizione4Field_newIngressoPanel.getText().equals("") || posizione4Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione4Field_newIngressoPanel.getText());
            posizione5 = posizione5Field_newIngressoPanel.getText().equals("") || posizione5Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione5Field_newIngressoPanel.getText());
            posizione6 = posizione6Field_newIngressoPanel.getText().equals("") || posizione6Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione6Field_newIngressoPanel.getText());
            posizione7 = posizione7Field_newIngressoPanel.getText().equals("") || posizione7Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione7Field_newIngressoPanel.getText());
            posizione8 = posizione8Field_newIngressoPanel.getText().equals("") || posizione8Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione8Field_newIngressoPanel.getText());
            posizione9 = posizione9Field_newIngressoPanel.getText().equals("") || posizione9Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione9Field_newIngressoPanel.getText());
            posizione10 = posizione10Field_newIngressoPanel.getText().equals("") || posizione10Field_newIngressoPanel.getText().equals(" ") ? 0 : Integer.parseInt(posizione10Field_newIngressoPanel.getText());

            //essendo un ingresso si suppone che debba esserci almeno una quantita per poter entrare non è questo il modulo per spostare la posizione
            //per modificare la posizione andare direttamente su articolo
            Color e = Color.RED;

            //ora devo solo controllare che l'utente non mi abbia selezionato lo stesso articolo, in tal caso prensdo le quantità e le sommo
            //le posizioni invece prendo solo l'ultima
            switch (ingressoArticleSelected) {
                case 10:
                    if (quantita10 == 0 || posizione10 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField10_newIngressoPanel.setBackground(e);
                        posizione10Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a10)) {
                        quantita.put(a10, quantita.get(a10) + quantita10);
                    } else {
                        quantita.put(a10, quantita10);
                    }
                    posizioni.put(a10, posizione10);

                case 9:

                    if (quantita9 == 0 || posizione9 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField9_newIngressoPanel.setBackground(e);
                        posizione9Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a9)) {
                        quantita.put(a9, quantita.get(a9) + quantita9);
                    } else {
                        quantita.put(a9, quantita9);
                    }
                    posizioni.put(a9, posizione9);

                case 8:
                    if (quantita8 == 0 || posizione8 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField8_newIngressoPanel.setBackground(e);
                        posizione8Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a8)) {
                        quantita.put(a8, quantita.get(a8) + quantita8);
                    } else {
                        quantita.put(a8, quantita8);
                    }
                    posizioni.put(a8, posizione8);

                case 7:
                    if (quantita7 == 0 || posizione7 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField7_newIngressoPanel.setBackground(e);
                        posizione7Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a7)) {
                        quantita.put(a7, quantita.get(a7) + quantita7);
                    } else {
                        quantita.put(a7, quantita7);
                    }
                    posizioni.put(a7, posizione7);

                case 6:
                    if (quantita6 == 0 || posizione6 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField6_newIngressoPanel.setBackground(e);
                        posizione6Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a6)) {
                        quantita.put(a6, quantita.get(a6) + quantita6);
                    } else {
                        quantita.put(a6, quantita6);
                    }
                    posizioni.put(a6, posizione6);

                case 5:
                    if (quantita5 == 0 || posizione5 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField5_newIngressoPanel.setBackground(e);
                        posizione5Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a5)) {
                        quantita.put(a10, quantita.get(a5) + quantita5);
                    } else {
                        quantita.put(a5, quantita5);
                    }
                    posizioni.put(a5, posizione5);

                case 4:
                    if (quantita4 == 0 || posizione4 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField4_newIngressoPanel.setBackground(e);
                        posizione4Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a4)) {
                        quantita.put(a4, quantita.get(a4) + quantita4);
                    } else {
                        quantita.put(a4, quantita4);
                    }
                    posizioni.put(a4, posizione4);

                case 3:
                    if (quantita3 == 0 || posizione3 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField3_newIngressoPanel.setBackground(e);
                        posizione3Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a3)) {
                        quantita.put(a3, quantita.get(a3) + quantita3);
                    } else {
                        quantita.put(a3, quantita3);
                    }
                    posizioni.put(a3, posizione3);

                case 2:
                    if (quantita2 == 0 || posizione2 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField2_newIngressoPanel.setBackground(e);
                        posizione2Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a2)) {
                        quantita.put(a2, quantita.get(a2) + quantita2);
                    } else {
                        quantita.put(a2, quantita2);
                    }
                    posizioni.put(a2, posizione2);

                case 1:
                    if (quantita1 == 0 || posizione1 == 0) {
                        JOptionPane.showMessageDialog(null, "Non sono accettate 0 posizioni o 0 quantita!");
                        quantitaField1_newIngressoPanel.setBackground(e);
                        posizione1Field_newIngressoPanel.setBackground(e);
                        return;
                    }

                    if (quantita.containsKey(a1)) {
                        quantita.put(a1, quantita.get(a1) + quantita2);
                    } else {
                        quantita.put(a1, quantita1);
                    }
                    posizioni.put(a1, posizione1);
            }

            int day = Integer.parseInt(dayField_newIngressoPanel.getText());
            int month = Integer.parseInt(monthField_newIngressoPanel.getText());
            int year = Integer.parseInt(yearField_newIngressoPanel.getText());
            GregorianCalendar c = new GregorianCalendar(year, month, day);

            if (posizioni.isEmpty() && quantita.isEmpty()) {  //forzo il controllo su entrambe le mappe anche se non dovrebbe essere necessario visto che devono essere identiche
                //se le mappe sono identiche ignoro l'inserimento 
                hideAll();
                ingressi();
                visualizzaIngressiPanel.setVisible(true);
                return;
            }
            //ora posso aggiungere l'ingresso
            m.addIngresso(quantita, posizioni, c);
            indexIngressi = m.ingressiSize() - 1;
            hideAll();
            ingressi();
            visualizzaIngressiPanel.setVisible(true);
            //resetto le stringhe
            posizione1Field_newIngressoPanel.setText("");
            quantitaField1_newIngressoPanel.setText("");
            posizione2Field_newIngressoPanel.setText("");
            quantitaField2_newIngressoPanel.setText("");
            posizione3Field_newIngressoPanel.setText("");
            quantitaField3_newIngressoPanel.setText("");
            posizione4Field_newIngressoPanel.setText("");
            quantitaField4_newIngressoPanel.setText("");
            posizione5Field_newIngressoPanel.setText("");
            quantitaField5_newIngressoPanel.setText("");
            posizione6Field_newIngressoPanel.setText("");
            quantitaField6_newIngressoPanel.setText("");
            posizione7Field_newIngressoPanel.setText("");
            quantitaField7_newIngressoPanel.setText("");
            posizione8Field_newIngressoPanel.setText("");
            quantitaField8_newIngressoPanel.setText("");
            posizione9Field_newIngressoPanel.setText("");
            quantitaField9_newIngressoPanel.setText("");
            posizione10Field_newIngressoPanel.setText("");
            quantitaField10_newIngressoPanel.setText("");

        } catch (Exception ex) {
            Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_creaIngressoButtonIngressoPanelActionPerformed

    private void closeButton_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_newIngressoPanelActionPerformed
        dayField_newIngressoPanel.setText("");
        monthField_newIngressoPanel.setText("");
        yearField_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        posizione1Field_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        hideAll();
        visualizzaIngressiPanel.setVisible(true);
    }//GEN-LAST:event_closeButton_newIngressoPanelActionPerformed

    private void addArticleButton_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArticleButton_newIngressoPanelActionPerformed
        posizione1Field_newIngressoPanel.setBackground(C);
        posizione2Field_newIngressoPanel.setBackground(C);
        posizione3Field_newIngressoPanel.setBackground(C);
        posizione4Field_newIngressoPanel.setBackground(C);
        posizione5Field_newIngressoPanel.setBackground(C);
        posizione6Field_newIngressoPanel.setBackground(C);
        posizione7Field_newIngressoPanel.setBackground(C);
        posizione8Field_newIngressoPanel.setBackground(C);
        posizione9Field_newIngressoPanel.setBackground(C);
        posizione10Field_newIngressoPanel.setBackground(C);
        quantitaField1_newIngressoPanel.setBackground(C);
        quantitaField2_newIngressoPanel.setBackground(C);
        quantitaField3_newIngressoPanel.setBackground(C);
        quantitaField4_newIngressoPanel.setBackground(C);
        quantitaField5_newIngressoPanel.setBackground(C);
        quantitaField6_newIngressoPanel.setBackground(C);
        quantitaField7_newIngressoPanel.setBackground(C);
        quantitaField8_newIngressoPanel.setBackground(C);
        quantitaField9_newIngressoPanel.setBackground(C);
        quantitaField10_newIngressoPanel.setBackground(C);

        switch (ingressoArticleSelected) {
            case 1:
                try {
                    if ((Integer.parseInt(quantitaField1_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione1Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli2.setEnabled(true);
                        posizione2Field_newIngressoPanel.setEditable(true);
                        quantitaField2_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione1Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField1_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione1Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField1_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }

            case 2:
                try {
                    if ((Integer.parseInt(quantitaField2_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione2Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli3.setEnabled(true);
                        posizione3Field_newIngressoPanel.setEditable(true);
                        quantitaField3_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione2Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField2_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione2Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField2_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 3:
                try {
                    if ((Integer.parseInt(quantitaField3_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione3Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli4.setEnabled(true);
                        posizione4Field_newIngressoPanel.setEditable(true);
                        quantitaField4_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione3Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField3_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione3Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField3_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 4:
                try {
                    if ((Integer.parseInt(quantitaField4_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione4Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli5.setEnabled(true);
                        posizione5Field_newIngressoPanel.setEditable(true);
                        quantitaField5_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione4Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField4_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione4Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField4_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 5:
                try {
                    if ((Integer.parseInt(quantitaField5_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione5Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli6.setEnabled(true);
                        posizione6Field_newIngressoPanel.setEditable(true);
                        quantitaField6_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione5Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField5_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione5Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField5_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 6:
                try {
                    if ((Integer.parseInt(quantitaField6_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione6Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli7.setEnabled(true);
                        posizione7Field_newIngressoPanel.setEditable(true);
                        quantitaField7_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione6Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField6_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione6Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField6_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 7:
                try {
                    if ((Integer.parseInt(quantitaField7_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione7Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli8.setEnabled(true);
                        posizione8Field_newIngressoPanel.setEditable(true);
                        quantitaField8_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione7Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField7_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione7Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField7_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 8:
                try {
                    if ((Integer.parseInt(quantitaField8_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione8Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli9.setEnabled(true);
                        posizione9Field_newIngressoPanel.setEditable(true);
                        quantitaField9_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione8Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField8_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione8Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField8_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }
            case 9:
                try {
                    if ((Integer.parseInt(quantitaField9_newIngressoPanel.getText()) > 0) && (Integer.parseInt(posizione9Field_newIngressoPanel.getText()) > 0)) {
                        comboBoxIngressoArticoli10.setEnabled(true);
                        posizione10Field_newIngressoPanel.setEditable(true);
                        quantitaField10_newIngressoPanel.setEditable(true);
                        ingressoArticleSelected++;
                        addArticleButton_newIngressoPanel.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "inserire il primo articolo, la sua posizione e la sua quantità per procedere!!");
                        posizione9Field_newIngressoPanel.setBackground(Color.red);
                        quantitaField9_newIngressoPanel.setBackground(Color.red);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Bisogna inserire un numero in posizione e in quantità!! \nNon sono accettati altri tipi di carattere!");
                    posizione9Field_newIngressoPanel.setBackground(Color.red);
                    quantitaField9_newIngressoPanel.setBackground(Color.red);
                } finally {
                    break;
                }

        }
    }//GEN-LAST:event_addArticleButton_newIngressoPanelActionPerformed

    private void comboBoxIngressoArticoli5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIngressoArticoli5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxIngressoArticoli5ActionPerformed

    private void posizione6Field_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posizione6Field_newIngressoPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posizione6Field_newIngressoPanelActionPerformed

    private void quantitaField3_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField3_newIngressoPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitaField3_newIngressoPanelActionPerformed

    private void quantitaField5_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField5_newIngressoPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitaField5_newIngressoPanelActionPerformed

    private void quantitaField7_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaField7_newIngressoPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitaField7_newIngressoPanelActionPerformed

    private void modificaButtonOrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaButtonOrderPanelActionPerformed
        hideAll();
        creaNuovoOrdinePanel.setVisible(true);
    }//GEN-LAST:event_modificaButtonOrderPanelActionPerformed

    private void indietroButton_IngressiPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_IngressiPanelActionPerformed
        indexIngressi--;
        ingressi();
    }//GEN-LAST:event_indietroButton_IngressiPanelActionPerformed

    private void avantiButton_IngressiPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiButton_IngressiPanelActionPerformed
        indexIngressi++;
        ingressi();
    }//GEN-LAST:event_avantiButton_IngressiPanelActionPerformed

    private void chiudiButtonIngressiPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButtonIngressiPanelActionPerformed
        hideAll();
        adminPanel.setVisible(true);
    }//GEN-LAST:event_chiudiButtonIngressiPanelActionPerformed

    private void newIngressoButton_IngressiPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newIngressoButton_IngressiPanelActionPerformed

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
        posizione1Field_newIngressoPanel.setText("");
        posizione2Field_newIngressoPanel.setText("");
        posizione3Field_newIngressoPanel.setText("");
        posizione4Field_newIngressoPanel.setText("");
        posizione5Field_newIngressoPanel.setText("");
        posizione6Field_newIngressoPanel.setText("");
        posizione7Field_newIngressoPanel.setText("");
        posizione8Field_newIngressoPanel.setText("");
        posizione9Field_newIngressoPanel.setText("");
        posizione10Field_newIngressoPanel.setText("");
        quantitaField1_newIngressoPanel.setText("");
        quantitaField2_newIngressoPanel.setText("");
        quantitaField3_newIngressoPanel.setText("");
        quantitaField4_newIngressoPanel.setText("");
        quantitaField5_newIngressoPanel.setText("");
        quantitaField6_newIngressoPanel.setText("");
        quantitaField7_newIngressoPanel.setText("");
        quantitaField8_newIngressoPanel.setText("");
        quantitaField9_newIngressoPanel.setText("");
        quantitaField10_newIngressoPanel.setText("");
        comboBoxIngressoArticoli2.setEnabled(false);
        comboBoxIngressoArticoli3.setEnabled(false);
        comboBoxIngressoArticoli4.setEnabled(false);
        comboBoxIngressoArticoli5.setEnabled(false);
        comboBoxIngressoArticoli6.setEnabled(false);
        comboBoxIngressoArticoli7.setEnabled(false);
        comboBoxIngressoArticoli8.setEnabled(false);
        comboBoxIngressoArticoli9.setEnabled(false);
        comboBoxIngressoArticoli10.setEnabled(false);
        posizione2Field_newIngressoPanel.setEditable(false);
        posizione3Field_newIngressoPanel.setEditable(false);
        posizione4Field_newIngressoPanel.setEditable(false);
        posizione5Field_newIngressoPanel.setEditable(false);
        posizione6Field_newIngressoPanel.setEditable(false);
        posizione7Field_newIngressoPanel.setEditable(false);
        posizione8Field_newIngressoPanel.setEditable(false);
        posizione9Field_newIngressoPanel.setEditable(false);
        posizione10Field_newIngressoPanel.setEditable(false);
        quantitaField2_newIngressoPanel.setEditable(false);
        quantitaField3_newIngressoPanel.setEditable(false);
        quantitaField4_newIngressoPanel.setEditable(false);
        quantitaField5_newIngressoPanel.setEditable(false);
        quantitaField6_newIngressoPanel.setEditable(false);
        quantitaField7_newIngressoPanel.setEditable(false);
        quantitaField8_newIngressoPanel.setEditable(false);
        quantitaField9_newIngressoPanel.setEditable(false);
        quantitaField10_newIngressoPanel.setEditable(false);

        ingressoArticleSelected = 1;

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
    }//GEN-LAST:event_newIngressoButton_IngressiPanelActionPerformed

    private void dataOdierna_newIngressoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOdierna_newIngressoPanelActionPerformed
        GregorianCalendar c = new GregorianCalendar(); //prendo la data attuale
        //e stampo la data attuale
        dayField_newIngressoPanel.setText("" + c.get(GregorianCalendar.DATE));
        monthField_newIngressoPanel.setText("" + c.get(GregorianCalendar.MONTH));
        yearField_newIngressoPanel.setText("" + c.get(GregorianCalendar.YEAR));
    }//GEN-LAST:event_dataOdierna_newIngressoPanelActionPerformed

    private void generaUscitaButton_OrderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaUscitaButton_OrderViewPanelActionPerformed
        try {
            m.createExit(m.getOrdine(indexOrder));
            ordini();
        } catch (OrderNotFound | ArticleNotFound | OrderImpossibleToCreate ex) {
            JOptionPane.showMessageDialog(null, "Eccezzione nel creare l'uscita");
        }
    }//GEN-LAST:event_generaUscitaButton_OrderViewPanelActionPerformed

    private void logoutButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonAdminPanelActionPerformed
        exit();
        adminPanel.setVisible(false);
    }//GEN-LAST:event_logoutButtonAdminPanelActionPerformed

    private void saveButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonAdminPanelActionPerformed
        m.save();
    }//GEN-LAST:event_saveButtonAdminPanelActionPerformed

    private void ingressiButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingressiButtonAdminPanelActionPerformed
        hideAll();
        visualizzaIngressiPanel.setVisible(true);
        indexIngressi = 0;
        ingressi();
    }//GEN-LAST:event_ingressiButtonAdminPanelActionPerformed

    private void ordiniButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordiniButtonAdminPanelActionPerformed
        hideAll();
        visualizzaOrdiniPanel.setVisible(true);
        indexOrder = 0;
        ordini();
    }//GEN-LAST:event_ordiniButtonAdminPanelActionPerformed

    private void modificaPosizioneViewArticoliPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaPosizioneViewArticoliPanelActionPerformed
        int newPosition = 0;
        String s = "";
        do {
            do {
                s = JOptionPane.showInputDialog("Inserire la nuova posizione: ");
            } while (s.equals(" ") && s.equals(""));
            newPosition = Integer.parseInt(s);
        } while (newPosition < 0);

        try {
            m.setPosition(m.getArticolo(indexArticle), newPosition);
        } catch (ArticleDontExistInWareHouseException | PositionAlreadyOccupiedException ex) {
            Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificaPosizioneViewArticoliPanelActionPerformed

    private void eliminaButton_VisualizzaArticoloPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaButton_VisualizzaArticoloPanelActionPerformed
        m.removeArticolo(indexArticle);
        if (indexArticle > 0) {
            indexArticle--;
        }
        articoli();
    }//GEN-LAST:event_eliminaButton_VisualizzaArticoloPanelActionPerformed

    private void fineMeseButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineMeseButtonAdminPanelActionPerformed
        JOptionPane.showMessageDialog(null, m.chiusuraMensile());
    }//GEN-LAST:event_fineMeseButtonAdminPanelActionPerformed

    private void negozioInfo_OrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negozioInfo_OrderPanelActionPerformed
        try {
            Negozio n = m.getOrdine(indexOrder).getNegozio();
            indexShop = m.negozioIndex(n);
            hideAll();
            from = 1;
            negozi();
            negoziPanel.setVisible(true);
            indietroButton_NegozioPanel.setEnabled(false);
            avantiButton_NegozioPanel.setEnabled(false);
            modificaButton_NegozioPanel.setEnabled(false);
            selezionaButton_NegozioPanel.setEnabled(false);
            CreaNegozioButton_NegozioPanel.setEnabled(false);
            eliminaNegozioButton_VisualizzaNegozioPanel.setEnabled(false);
        } catch (ShopNotFoundException ex) {
            Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_negozioInfo_OrderPanelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void avantiButton_StoricoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiButton_StoricoPanelActionPerformed
        index++;
        report();
    }//GEN-LAST:event_avantiButton_StoricoPanelActionPerformed

    private void indietroButton_StoricoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_StoricoPanelActionPerformed
        index--;
        report();
    }//GEN-LAST:event_indietroButton_StoricoPanelActionPerformed

    private void storicoButton_AdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storicoButton_AdminPanelActionPerformed
        index = 0;
        storicoPanel.setVisible(true);
        reportMensileTextArea_ReportPanel.setText("");
        report();
    }//GEN-LAST:event_storicoButton_AdminPanelActionPerformed

    private void chiudiButton_reportPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiButton_reportPanelActionPerformed
        index = 0;
        reportMensileTextArea_ReportPanel.setText("");
        hideAll();
        adminPanel.setVisible(true);
    }//GEN-LAST:event_chiudiButton_reportPanelActionPerformed

    private void tabellaArticoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaArticoliMouseClicked
        indexArticle = tabellaArticoli.getSelectedRow();
        articoli();
    }//GEN-LAST:event_tabellaArticoliMouseClicked

    private void tabellaOrdiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaOrdiniMouseClicked
        indexOrder = tabellaOrdini.getSelectedRow();
        ordini();
    }//GEN-LAST:event_tabellaOrdiniMouseClicked

    private void comboBoxArticoli1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxArticoli1MouseClicked
        comboBoxArticoli1.setBackground(C);
    }//GEN-LAST:event_comboBoxArticoli1MouseClicked

    private void comboBoxArticoli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxArticoli1ActionPerformed

    }//GEN-LAST:event_comboBoxArticoli1ActionPerformed

    private void comboBoxArticoli1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli1ItemStateChanged
        if (bool) {
            comboBoxArticoli2.setEnabled(true);
            quantitaField2.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli1ItemStateChanged

    private void comboBoxArticoli2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli2ItemStateChanged
        if (bool) {
            comboBoxArticoli3.setEnabled(true);
            quantitaField3.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli2ItemStateChanged

    private void comboBoxArticoli3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli3ItemStateChanged
        if (bool) {
            comboBoxArticoli4.setEnabled(true);
            quantitaField4.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli3ItemStateChanged

    private void comboBoxArticoli4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli4ItemStateChanged
        if (bool) {
            comboBoxArticoli5.setEnabled(true);
            quantitaField5.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli4ItemStateChanged

    private void comboBoxArticoli5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxArticoli5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxArticoli5ActionPerformed

    private void comboBoxArticoli5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli5ItemStateChanged
        if (bool) {
            comboBoxArticoli6.setEnabled(true);
            quantitaField6.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli5ItemStateChanged

    private void comboBoxArticoli6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli6ItemStateChanged
        if (bool) {
            comboBoxArticoli7.setEnabled(true);
            quantitaField7.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli6ItemStateChanged

    private void comboBoxArticoli7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli7ItemStateChanged
        if (bool) {
            comboBoxArticoli8.setEnabled(true);
            quantitaField8.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli7ItemStateChanged

    private void comboBoxArticoli8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli8ItemStateChanged
        if (bool) {
            comboBoxArticoli9.setEnabled(true);
            quantitaField9.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli8ItemStateChanged

    private void comboBoxArticoli9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxArticoli9ItemStateChanged
        if (bool) {
            comboBoxArticoli10.setEnabled(true);
            quantitaField10.setEnabled(true);
        }
    }//GEN-LAST:event_comboBoxArticoli9ItemStateChanged

    private void cancellaOrderButton_orderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaOrderButton_orderViewPanelActionPerformed
        if(indexOrder == m.ordineSize()){
                m.removeOrdine(m.getOrdine(indexOrder));
                indexOrder= m.ordineSize();
        }else if(indexOrder == 0){
            m.removeOrdine(m.getOrdine(indexOrder));
            indexOrder = 0;
        }
        ordini();
    }//GEN-LAST:event_cancellaOrderButton_orderViewPanelActionPerformed

    private void duplicaOrderButton_orderViewPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicaOrderButton_orderViewPanelActionPerformed
        m.addOrdine(m.getOrdine(indexOrder));
        indexOrder = m.ordineSize()-1;
        ordini();
    }//GEN-LAST:event_duplicaOrderButton_orderViewPanelActionPerformed

    private void tabellaNegoziMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaNegoziMouseClicked
        indexShop = tabellaNegozi.getSelectedRow();
        negozi();
    }//GEN-LAST:event_tabellaNegoziMouseClicked

    void report() {
        if (m.reportIsEmpty()) {
            JOptionPane.showMessageDialog(null, "Nessun report ancora presente nel Database");
            reportMensileTextArea_ReportPanel.setText("");
            indietroButton_StoricoPanel.setEnabled(false);
            avantiButton_StoricoPanel.setEnabled(false);
            cercaLAbel_StoricoPanel.setText("");
        } else {
            if (index == 0) {
                indietroButton_StoricoPanel.setEnabled(false);
            } else {
                indietroButton_StoricoPanel.setEnabled(true);
            }
            if (index == m.reportSize() - 1) {
                avantiButton_StoricoPanel.setEnabled(false);

            } else {
                avantiButton_StoricoPanel.setEnabled(true);
            }
            reportMensileTextArea_ReportPanel.setText("" + m.getReportMensile(index));
            cercaLAbel_StoricoPanel.setText("" + index);

        }
    }

    void articoli() {
        if (m.articoliIsEmpty()) {
            cercaLabel_VisualizzaArticoloPanel.setText("");
            IDLabel_VisualizzaArticoloPanel.setText("");
            prezzoLabel_VisualizzaArticoloPanel.setText("");
            dataLabel_VisualizzaArticoloPanel.setText("");
            nomeLabel_VisualizzaArticoloPanel.setText("");
            descrizioneLabel_VisualizzaArticoloPanel.setText("");
            sportLabel_VisualizzaArticoloPanel.setText("");
            materialiLabel_VisualizzaArticoloPanel.setText("");
            posizioneLabel_VisualizzaArticoloPanel.setText("");
            quantitaLabel_VisualizzaArticoloPanel.setText("");
            avantiButton_VisualizzaArticoloPanel.setEnabled(false);
            eliminaButton_VisualizzaArticoloPanel.setEnabled(false);
            indietroButton_VisualizzaArticoloPanel.setEnabled(false);
            modificaButton_cercaLabel__VisualizzaArticoliPanel.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nessun Articolo ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {
            try {
                //esiste almeno un artiolo salvato

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

                DefaultTableModel model = (DefaultTableModel) tabellaArticoli.getModel();
                model.setRowCount(0);
                for (int ciao = 0; ciao < m.articoliSize(); ciao++) {
                    Articolo a = m.getArticolo(ciao);
                    try {
                        model.addRow(new Object[]{abs(a.getID()), a.getTipoArticolo().getName(), a.getPrezzo() + " €", a.getTipoArticolo().getSports(), a.getTipoArticolo().getMaterial(), m.getQuantita(a), m.getPosition(a)});
                    } catch (ArticleDontExistInWareHouseException ex) {
                        Logger.getLogger(Graphics.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Eccezione generata nel comporre la tabella!");
                    }
                }
                cercaLabel_VisualizzaArticoloPanel.setText("" + (indexArticle + 1));
                IDLabel_VisualizzaArticoloPanel.setText("" + abs(m.getArticolo(indexArticle).getID()));
                prezzoLabel_VisualizzaArticoloPanel.setText("" + m.getArticolo(indexArticle).getPrezzo());
                dataLabel_VisualizzaArticoloPanel.setText("" + m.getArticolo(indexArticle).getDataInString());
                nomeLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getName());
                descrizioneLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getDescription());
                sportLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getSports());
                materialiLabel_VisualizzaArticoloPanel.setText(m.getArticolo(indexArticle).getTipoArticolo().getMaterial());
                Articolo articolo = m.getArticolo(indexArticle);
                int quantita = m.getQuantita(articolo);
                int posizione = m.getPosition(articolo);
                quantitaLabel_VisualizzaArticoloPanel.setText(quantita + "");
                posizioneLabel_VisualizzaArticoloPanel.setText("" + posizione);
                tabellaArticoli.getSelectionModel().setSelectionInterval(indexArticle, indexArticle);
                //tabellaArticoli.setSelectionMode(indexArticle);
            } catch (ArticleDontExistInWareHouseException ex) {
                System.out.println("Eccezzione");
            }
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
            eliminaNegozioButton_VisualizzaNegozioPanel.setEnabled(false);
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
            
            DefaultTableModel model = (DefaultTableModel) tabellaNegozi.getModel();
            model.setRowCount(0);
            for (int ciao = 0; ciao < m.negoziSize(); ciao++) {
                Negozio a = m.getNegozio(ciao);
                model.addRow(new Object[]{ a.getCodiceFiscale().toUpperCase(), a.getNome(), a.getindirizzo(), a.getCitta()});
            }
            tabellaNegozi.getSelectionModel().setSelectionInterval(indexShop, indexShop);
            modificaButton_NegozioPanel.setEnabled(true);
            selezionaButton_NegozioPanel.setEnabled(true);
            CreaNegozioButton_NegozioPanel.setEnabled(true);
            eliminaNegozioButton_VisualizzaNegozioPanel.setEnabled(true);
            searchField_NegozioPanel.setText("" + (indexShop + 1));
            codiceFiscaleLabel_NegozioPanel.setText(m.getNegozio(indexShop).getCodiceFiscale());
            indirizzoLabel_NegozioPanel.setText(m.getNegozio(indexShop).getindirizzo());
            nomeNegozioLabel_NegozioPanel.setText(m.getNegozio(indexShop).getNome());
            cittaNegozio_NegozioPanel.setText(m.getNegozio(indexShop).getCitta());
        }
    }

    void ordini() {

        if (m.ordineIsEmpty()) {
            articoliQuantitaTextArea_OrderViewPanel.setText("");
            shippedLabel_OrderViewPanell.setText("");
            orderIDLabel_OrderViewPanel.setText("");
            negozioLabel_OrderViewPanel.setText("");
            dataLabel_OrderViewPanel.setText("");
            DefaultTableModel model = (DefaultTableModel) tabellaOrdini.getModel();
            model.setRowCount(0);
            prezzoLabel_OrderViewPanel.setText("");
            corriereLabel_OrderViewPanel.setText("");
            searchFieldOrderPanel.setText("");
            corriereLabel_OrderViewPanel.setText("");
            searchFieldOrderPanel.setEditable(false);
            indietroButton_OrderPanel.setEnabled(false);
            avantiButton_OrderPanel.setEnabled(false);
            negozioInfo_OrderPanel.setEnabled(false);
            modificaButtonOrderPanel.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nessun ordine ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {

            //controlliamo che sia il primo ordine
            if (indexOrder == 0) {
                indietroButton_OrderPanel.setEnabled(false);
            } else {
                indietroButton_OrderPanel.setEnabled(true);
            }

            //controlliamo se sia l'ultimo ordine
            if (indexOrder == m.ordineSize() - 1) {
                avantiButton_OrderPanel.setEnabled(false);
            } else {
                avantiButton_OrderPanel.setEnabled(true);
            }
            DefaultTableModel model = (DefaultTableModel) tabellaOrdini.getModel();
            model.setRowCount(0);
            for (int ciao = 0; ciao < m.ordineSize(); ciao++) {
                Ordine a = m.getOrdine(ciao);
                model.addRow(new Object[]{abs(a.getID()), a.getDataInString(), a.getTotalPrice() + " €", a.getNegozio().getNome(), a.getCorriere(), a.isShipped(), a.articoliSize()});
            }
            tabellaOrdini.getSelectionModel().setSelectionInterval(indexOrder, indexOrder);
            negozioInfo_OrderPanel.setEnabled(true);
            modificaButtonOrderPanel.setEnabled(true);
            negozioLabel_OrderViewPanel.setText(m.getOrdine(indexOrder).getNegozio().getNome());
            searchFieldOrderPanel.setText("" + (indexOrder + 1));
            orderIDLabel_OrderViewPanel.setText("" + abs(m.getOrdine(indexOrder).getID()));
            dataLabel_OrderViewPanel.setText(m.getOrdine(indexOrder).getDataInString());
            prezzoLabel_OrderViewPanel.setText("".concat(m.getOrdine(indexOrder).getTotalPrice() + "").replace(".", ",") + " €");
            articoliQuantitaTextArea_OrderViewPanel.setText("" + m.getOrdine(indexOrder).toString());
            corriereLabel_OrderViewPanel.setText(m.getOrdine(indexOrder).getCorriere());
            boolean isShipped = m.getOrdine(indexOrder).isShipped();
            
            if (isShipped) {
                shippedLabel_OrderViewPanell.setForeground(Color.GREEN);
                shippedLabel_OrderViewPanell.setText("Spedito");
                cancellaOrderButton_orderViewPanel.setEnabled(false);
                duplicaOrderButton_orderViewPanel.setEnabled(false);
            } else {
                shippedLabel_OrderViewPanell.setForeground(Color.red);
                shippedLabel_OrderViewPanell.setText("Non spedito");
                cancellaOrderButton_orderViewPanel.setEnabled(true);
                duplicaOrderButton_orderViewPanel.setEnabled(true);
            }
            generaUscitaButton_OrderViewPanel.setEnabled(!isShipped);
        }

    }//resetOrder

    void ingressi() {
        if (m.ingressiIsEmpty()) {
            ingressiIDLabel_VisualizzaIngressiPanel.setText("");
            searchFieldIngressiPanel.setText("");
            indietroButton_IngressiPanel.setEnabled(false);
            avantiButton_IngressiPanel.setEnabled(false);
            newIngressoButton_IngressiPanel.setEnabled(true);
            articoliQuantitaPosizioneIngressiPanel.setText("NESSUN INGRESSO DISPONIBILE NEL DATABASE");
            //JOptionPane.showMessageDialog(null, "Nessun ordine ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {
            if (indexIngressi == 0) {
                indietroButton_IngressiPanel.setEnabled(false);
            } else {
                indietroButton_IngressiPanel.setEnabled(true);
            }
            if (indexIngressi == m.ingressiSize() - 1) {
                avantiButton_IngressiPanel.setEnabled(false);
            } else {
                avantiButton_IngressiPanel.setEnabled(true);
            }
            dataLabel_VisualizzaIngressiPanel.setText(m.getIngresso(indexIngressi).getDataInString());
            searchFieldIngressiPanel.setText("" + (indexIngressi + 1));
            ingressiIDLabel_VisualizzaIngressiPanel.setText("" + abs(m.getIngresso(indexIngressi).getID()));
            articoliQuantitaPosizioneIngressiPanel.setText("" + m.getIngresso(indexIngressi).toString());
        }

    }

    void exit() {
        hideAll();
        usrField.setText("");
        pinField.setText("");
        typeOfUserLabel_AdminPanel.setText("Tipo Utente: Segreteria Amministrativa");
        loginPanel.setVisible(true);
    }//exit


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodiceFiscaleField_NewNegozio;
    private javax.swing.JComboBox<String> ComboBoxNegozio;
    private javax.swing.JButton CreaNegozioButton_NegozioPanel;
    private javax.swing.JLabel IDLabel_VisualizzaArticoloPanel;
    private javax.swing.ButtonGroup MaterialiBottonGroup;
    private javax.swing.ButtonGroup SportButtonGroup;
    private javax.swing.JLabel TipoArticoloLabel_NewArticlePanel;
    private javax.swing.JLabel TipoArticoloLabel__VisualizzaArticoliPanel;
    private javax.swing.JButton addArticleButton_newIngressoPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton articoliButtonAdminPanel;
    private javax.swing.JLabel articoliLabel_NewOrderPanel;
    private javax.swing.JTextArea articoliQuantitaPosizioneIngressiPanel;
    private javax.swing.JTextArea articoliQuantitaTextArea_OrderViewPanel;
    private javax.swing.JRadioButton atleticaRadioButton;
    private javax.swing.JButton avantiButton_IngressiPanel;
    private javax.swing.JButton avantiButton_NegozioPanel;
    private javax.swing.JButton avantiButton_OrderPanel;
    private javax.swing.JButton avantiButton_StoricoPanel;
    private javax.swing.JButton avantiButton_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton basketRadioButton;
    private javax.swing.JRadioButton calcioRadioButton;
    private javax.swing.JButton cancelPinButton;
    private javax.swing.JButton cancellaButton_newArticlePanel;
    private javax.swing.JButton cancellaOrderButton_orderViewPanel;
    private javax.swing.JLabel cercaBorderLabel_Pan;
    private javax.swing.JTextField cercaLAbel_StoricoPanel;
    private javax.swing.JLabel cercaLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel cercaLabel__VisualizzaArticoliPanel;
    private javax.swing.JButton chiudiButtonIngressiPanel;
    private javax.swing.JButton chiudiButtonOrderPanel;
    private javax.swing.JButton chiudiButton_VisualizzaArticoloPanel;
    private javax.swing.JButton chiudiButton_reportPanel;
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
    private javax.swing.JLabel corriereLabel_OrderViewPanel;
    private javax.swing.JButton creaArticoloButtoncercaLabel_VisualizzaArticoliPanel;
    private javax.swing.JButton creaIngressoButtonIngressoPanel;
    private javax.swing.JPanel creaIngressoPanel;
    private javax.swing.JButton creaNegozioButton_CreaNegozioPanel;
    private javax.swing.JPanel creaNegozioPanel;
    private javax.swing.JPanel creaNuovoOrdinePanel;
    private javax.swing.JButton creaOrdineButton_orderViewPanel;
    private javax.swing.JRadioButton danzaRadioButton;
    private javax.swing.JLabel dataLabel_OrderViewPanel;
    private javax.swing.JLabel dataLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel dataLabel_VisualizzaIngressiPanel;
    private javax.swing.JLabel dataLabel_newArticlePanel1;
    private javax.swing.JLabel dataLabel_newIngressoPanel;
    private javax.swing.JButton dataOdierna_newArticlePanel;
    private javax.swing.JButton dataOdierna_newIngressoPanel;
    private javax.swing.JTextField dayField_newArticlePanel;
    private javax.swing.JTextField dayField_newIngressoPanel;
    private javax.swing.JTextField descrizioneFieldTipoArticolo_newArticlePanel;
    private javax.swing.JLabel descrizioneLabel_VisualizzaArticoloPanel;
    private javax.swing.JButton duplicaOrderButton_orderViewPanel;
    private javax.swing.JRadioButton elastanRadioButton;
    private javax.swing.JButton eliminaButton_VisualizzaArticoloPanel;
    private javax.swing.JButton eliminaNegozioButton_VisualizzaNegozioPanel;
    private javax.swing.JButton fineMeseButtonAdminPanel;
    private javax.swing.JRadioButton fintaPelleRadioButton;
    private javax.swing.JButton generaUscitaButton_OrderViewPanel;
    private javax.swing.JRadioButton golfRadioButton;
    private javax.swing.JRadioButton goreTexRadioButton;
    private javax.swing.JRadioButton hockeyRadioButton;
    private javax.swing.JButton indietroButton_IngressiPanel;
    private javax.swing.JButton indietroButton_NegozioPanel;
    private javax.swing.JButton indietroButton_OrderPanel;
    private javax.swing.JButton indietroButton_StoricoPanel;
    private javax.swing.JButton indietroButton_VisualizzaArticoloPanel;
    private javax.swing.JTextField indirizzoField_newNegozioPanel;
    private javax.swing.JLabel indirizzoLabel_NegozioPanel;
    private javax.swing.JButton ingressiButtonAdminPanel;
    private javax.swing.JLabel ingressiIDLabel_VisualizzaIngressiPanel;
    private javax.swing.JButton inserisciButton_newArticlePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JButton logoutButtonAdminPanel;
    private javax.swing.JLabel materialeTipoArticolo_newArticlePanel;
    private javax.swing.JLabel materialiLabel_VisualizzaArticoloPanel;
    private javax.swing.JButton modificaButtonOrderPanel;
    private javax.swing.JButton modificaButton_NegozioPanel;
    private javax.swing.JButton modificaButton_cercaLabel__VisualizzaArticoliPanel;
    private javax.swing.JButton modificaButton_newArticlePanel;
    private javax.swing.JButton modificaNegozioButton_CreaNegozioPanel;
    private javax.swing.JButton modificaPosizioneViewArticoliPanel;
    private javax.swing.JTextField monthField_newArticlePanel;
    private javax.swing.JTextField monthField_newIngressoPanel;
    private javax.swing.JButton negoziButtonAdminPanel;
    private javax.swing.JPanel negoziPanel;
    private javax.swing.JButton negozioInfo_OrderPanel;
    private javax.swing.JLabel negozioLabel_OrderViewPanel;
    private javax.swing.JPanel newArticlePanel;
    private javax.swing.JButton newIngressoButton_IngressiPanel;
    private javax.swing.JButton newOrderButton_orderViewPanel;
    private javax.swing.JTextField nomeFieldTipoArticolo_newArticlePanel;
    private javax.swing.JTextField nomeField_newNegozioPanel;
    private javax.swing.JLabel nomeLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel nomeNegozioLabel_NegozioPanel;
    private javax.swing.JRadioButton nuotoRadioButton;
    private javax.swing.JLabel orderIDLabel_OrderViewPanel;
    private javax.swing.JButton ordiniButtonAdminPanel;
    private javax.swing.JRadioButton palestraRadioButton;
    private javax.swing.JRadioButton pallavoloRadioButton;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JRadioButton poliammideRadioButton;
    private javax.swing.JRadioButton poliestereRadioButton;
    private javax.swing.JRadioButton polietileneRadioButton;
    private javax.swing.JTextField posizione10Field_newIngressoPanel;
    private javax.swing.JTextField posizione1Field_newIngressoPanel;
    private javax.swing.JTextField posizione2Field_newIngressoPanel;
    private javax.swing.JTextField posizione3Field_newIngressoPanel;
    private javax.swing.JTextField posizione4Field_newIngressoPanel;
    private javax.swing.JTextField posizione5Field_newIngressoPanel;
    private javax.swing.JTextField posizione6Field_newIngressoPanel;
    private javax.swing.JTextField posizione7Field_newIngressoPanel;
    private javax.swing.JTextField posizione8Field_newIngressoPanel;
    private javax.swing.JTextField posizione9Field_newIngressoPanel;
    private javax.swing.JLabel posizioneLabel_VisualizzaArticoloPanel;
    private javax.swing.JTextField prezzoField_newArticlePanel;
    private javax.swing.JLabel prezzoLabel_OrderViewPanel;
    private javax.swing.JLabel prezzoLabel_VisualizzaArticoloPanel;
    private javax.swing.JTextField quantitaField1;
    private javax.swing.JTextField quantitaField10;
    private javax.swing.JTextField quantitaField10_newIngressoPanel;
    private javax.swing.JTextField quantitaField1_newIngressoPanel;
    private javax.swing.JTextField quantitaField2;
    private javax.swing.JTextField quantitaField2_newIngressoPanel;
    private javax.swing.JTextField quantitaField3;
    private javax.swing.JTextField quantitaField3_newIngressoPanel;
    private javax.swing.JTextField quantitaField4;
    private javax.swing.JTextField quantitaField4_newIngressoPanel;
    private javax.swing.JTextField quantitaField5;
    private javax.swing.JTextField quantitaField5_newIngressoPanel;
    private javax.swing.JTextField quantitaField6;
    private javax.swing.JTextField quantitaField6_newIngressoPanel;
    private javax.swing.JTextField quantitaField7;
    private javax.swing.JTextField quantitaField7_newIngressoPanel;
    private javax.swing.JTextField quantitaField8;
    private javax.swing.JTextField quantitaField8_newIngressoPanel;
    private javax.swing.JTextField quantitaField9;
    private javax.swing.JTextField quantitaField9_newIngressoPanel;
    private javax.swing.JLabel quantitaLabel_NewOrderPanel;
    private javax.swing.JLabel quantitaLabel_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton raftingRadioButton;
    private javax.swing.JTextArea reportMensileTextArea_ReportPanel;
    private javax.swing.JRadioButton rugbyRadioButton;
    private javax.swing.JButton saveButtonAdminPanel;
    private javax.swing.JRadioButton sciiRadioButton;
    private javax.swing.JTextField searchFieldIngressiPanel;
    private javax.swing.JTextField searchFieldOrderPanel;
    private javax.swing.JTextField searchField_NegozioPanel;
    private javax.swing.JButton selezionaButton_NegozioPanel;
    private javax.swing.JPanel sfondo;
    private javax.swing.JLabel shippedLabel_OrderViewPanell;
    private javax.swing.JRadioButton siliconeRadioButton;
    private javax.swing.JLabel sportLabelTipoArticolo_newArticlePanel;
    private javax.swing.JLabel sportLabel_VisualizzaArticoloPanel;
    private javax.swing.JButton storicoButton_AdminPanel;
    private javax.swing.JPanel storicoPanel;
    private javax.swing.JTable tabellaArticoli;
    private javax.swing.JTable tabellaNegozi;
    private javax.swing.JTable tabellaOrdini;
    private javax.swing.JRadioButton tennisRadioButton;
    private javax.swing.JLabel titleLabel_StoricoMensile;
    private javax.swing.JLabel titleLabel__VisualizzaArticoliPanel;
    private javax.swing.JLabel titolo_newArticlePanel;
    private javax.swing.JLabel typeOfUserLabel_AdminPanel;
    private javax.swing.JTextField usrField;
    private javax.swing.JPanel visualizzaArticoliPanel;
    private javax.swing.JPanel visualizzaIngressiPanel;
    private javax.swing.JPanel visualizzaOrdiniPanel;
    private javax.swing.JTextField yearField_newArticlePanel;
    private javax.swing.JTextField yearField_newIngressoPanel;
    // End of variables declaration//GEN-END:variables
}
