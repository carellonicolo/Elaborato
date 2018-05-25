package Main;

import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    static int indexOrder = 0, indexArticle = 0, indexShop = 0; //numero ordine
    Magazzino m;

    public Main() {
        m = new Magazzino();
        initComponents();
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
        errorLabel_creaNuovoArticoloPanel.setVisible(false);
    }

    public void hideAll() {
        newArticlePanel.setVisible(false);
        ordinePanel.setVisible(false);
        loginPanel.setVisible(false);
        creaNuovoOrdinePanel.setVisible(false);
        negoziPanel.setVisible(false);
        visualizzaArticoliPanel.setVisible(false);
        adminPanel.setVisible(false);
        creaNegozioPanel.setVisible(false);
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
        selzionaButton_VisualizzaArticoloPanel = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        cercaLabel_VisualizzaArticoloPanel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
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
        ordinePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        negozioInfo_OrderPanel = new javax.swing.JButton();
        indietroButton_OrderPanel = new javax.swing.JButton();
        avantiButton_OrderPanel = new javax.swing.JButton();
        modificaButtonOrderPanel = new javax.swing.JButton();
        chiudiButtonOrderPanel = new javax.swing.JButton();
        searchFieldOrderPanel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        orderIDLabel = new javax.swing.JLabel();
        orderDataLabel = new javax.swing.JLabel();
        orderPrezzoLabel = new javax.swing.JLabel();
        orderNomeNegozioLabel = new javax.swing.JLabel();
        articoliQuantitaOrderPanel = new javax.swing.JLabel();
        creaNuovoOrdinePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        corrriereField_NewOrderPanel = new javax.swing.JTextField();
        adminPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
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

        loginPanel.setBackground(new java.awt.Color(0, 153, 0));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 143, -1));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
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
        loginPanel.add(usrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 240, 60));

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
        loginPanel.add(usrField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 149, -1));

        loginTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        loginTitleLabel.setText("LOGIN");
        loginPanel.add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 260));

        visualizzaArticoliPanel.setBackground(new java.awt.Color(0, 255, 255));
        visualizzaArticoliPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Visualizza Articoli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Avenir", 0, 36))); // NOI18N
        visualizzaArticoliPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 50));

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

        selzionaButton_VisualizzaArticoloPanel.setText("Seleziona");
        visualizzaArticoliPanel.add(selzionaButton_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel30.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 18))); // NOI18N
        visualizzaArticoliPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 280));

        cercaLabel_VisualizzaArticoloPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        visualizzaArticoliPanel.add(cercaLabel_VisualizzaArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 30, 30));

        jLabel35.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        visualizzaArticoliPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, 60));

        getContentPane().add(visualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 510, 400));

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

        getContentPane().add(negoziPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 270));

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

        getContentPane().add(creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 500, 180));

        ordinePanel.setBackground(new java.awt.Color(255, 102, 102));
        ordinePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 30)); // NOI18N
        jLabel8.setText("Visualizza Ordini:");
        ordinePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        negozioInfo_OrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        negozioInfo_OrderPanel.setText("Vedi info Negozio");
        ordinePanel.add(negozioInfo_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        indietroButton_OrderPanel.setText("<");
        indietroButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroButton_OrderPanelActionPerformed(evt);
            }
        });
        ordinePanel.add(indietroButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 41, -1));

        avantiButton_OrderPanel.setText(">");
        avantiButton_OrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiButton_OrderPanelActionPerformed(evt);
            }
        });
        ordinePanel.add(avantiButton_OrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, -1));

        modificaButtonOrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        modificaButtonOrderPanel.setText("Modifica");
        ordinePanel.add(modificaButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        chiudiButtonOrderPanel.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        chiudiButtonOrderPanel.setText("Chiudi");
        chiudiButtonOrderPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiButtonOrderPanelActionPerformed(evt);
            }
        });
        ordinePanel.add(chiudiButtonOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        ordinePanel.add(searchFieldOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 93, -1));

        jLabel13.setText("Cerca:");
        ordinePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jButton17.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton17.setText("Crea Nuovo Ordine");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        ordinePanel.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        orderIDLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderIDLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        orderIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordinePanel.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        orderDataLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderDataLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 60));

        orderPrezzoLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderPrezzoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderPrezzoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 60));

        orderNomeNegozioLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderNomeNegozioLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderNomeNegozioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 70));

        articoliQuantitaOrderPanel.setText("jLabel9");
        ordinePanel.add(articoliQuantitaOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 240, 130));

        getContentPane().add(ordinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 600, 400));

        creaNuovoOrdinePanel.setBackground(new java.awt.Color(255, 255, 0));
        creaNuovoOrdinePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel17.setText("Crea un nuovo ordine:");
        creaNuovoOrdinePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, 37));

        jLabel18.setText("ID:");
        creaNuovoOrdinePanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel19.setText("Negozio:");
        creaNuovoOrdinePanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel20.setText("Articoli:");
        creaNuovoOrdinePanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jButton9.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton9.setText("Seleziona Negozio");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, -1));

        jButton10.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton10.setText("Seleziona Articolo");
        jButton10.setEnabled(false);
        creaNuovoOrdinePanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jButton11.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton11.setText("Crea");
        creaNuovoOrdinePanel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 220, -1, -1));

        jButton12.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton12.setText("Chiudi");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        creaNuovoOrdinePanel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 220, -1, -1));

        jLabel22.setText("Corriere:");
        creaNuovoOrdinePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        creaNuovoOrdinePanel.add(corrriereField_NewOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 96, 140, -1));

        getContentPane().add(creaNuovoOrdinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 410, 260));

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

        jToggleButton1.setText("Ordini");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        adminPanel.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, -1));

        getContentPane().add(adminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 110));

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
        elastanRadioButton.setText("Elastan");
        newArticlePanel.add(elastanRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        polietileneRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        polietileneRadioButton.setText("Polietilene");
        newArticlePanel.add(polietileneRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        poliammideRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        poliammideRadioButton.setText("Poliammide");
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
        prezzoField_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        prezzoField_newArticlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prezzoField_newArticlePanelMouseClicked(evt);
            }
        });
        newArticlePanel.add(prezzoField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 60));

        dayField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        dayField_newArticlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        newArticlePanel.add(dayField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 20, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("/");
        newArticlePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        monthField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        monthField_newArticlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        newArticlePanel.add(monthField_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 27, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("/");
        newArticlePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        yearField_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        yearField_newArticlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
        descrizioneFieldTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(descrizioneFieldTipoArticolo_newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 450, 90));

        nomeFieldTipoArticolo_newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        nomeFieldTipoArticolo_newArticlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
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
        errorLabel_creaNuovoArticoloPanel.setText("Impossibile creare l'articolo,dsafsgsfg");
        errorLabel_creaNuovoArticoloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true), "Errore!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Avenir", 1, 20), new java.awt.Color(255, 51, 51))); // NOI18N
        newArticlePanel.add(errorLabel_creaNuovoArticoloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 190, 110));

        getContentPane().add(newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 730, 540));

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

        m.addUser(new Utente("ciao", "ciao", 1));

        Articolo a1 = new Articolo((float) 14, new TipoArticolo("nome1", "Desrizione1", 2, 1));
        Articolo a2 = new Articolo((float) 14, new TipoArticolo("nome2", "Desrizione2", 3, 4));
        Negozio n1 = new Negozio("codice fiscale1", "primo Negozio", "Indirizzo1", "City");
        Negozio n2 = new Negozio("codice fiscale2", "secondo Negozio", "Indirizzo2", "City");
        Ordine o1 = new Ordine(n1);
        o1.addArticle(a2, 10);
        o1.addArticle(a1, 4);
        Ordine o2 = new Ordine(n2);
        o2.addArticle(a2, 10);
        o2.addArticle(a1, 4);
        m.addArticolo(a1);
        m.addArticolo(a2);
        m.addNegozi(n1);
        m.addNegozi(n2);
        m.addOrdine(o1);
        m.addOrdine(o2);

        /*
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

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        hideAll();
        creaNuovoOrdinePanel.setVisible(true);
        corrriereField_NewOrderPanel.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

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
        ordinePanel.setVisible(true);
        indexOrder = 0;
        ordini();
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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        exit();
    }//GEN-LAST:event_jButton12ActionPerformed

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!"".equals(corrriereField_NewOrderPanel.getText()) && !" ".equals(corrriereField_NewOrderPanel.getText())) {
            JOptionPane.showMessageDialog(null, "Prima di scegliere il negozio ordinante bisogna inserire il corriere che prende in carico la spedizione! ");
            corrriereField_NewOrderPanel.setBackground(Color.red);
        } else {
            corrriereField_NewOrderPanel.setBackground(Color.white);
            hideAll();
            negoziPanel.setVisible(true);
            selezionaButton_NegozioPanel.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
        String corriere = corrriereField_NewOrderPanel.getText();
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

        if (nuotoRadioButton.isSelected()) {
            sport = 1;
        }
        if (calcioRadioButton.isSelected()) {
            sport = 2;
        }
        if (palestraRadioButton.isSelected()) {
            sport = 3;
        }
        if (tennisRadioButton.isSelected()) {
            sport = 4;
        }
        if (sciiRadioButton.isSelected()) {
            sport = 5;
        }
        if (basketRadioButton.isSelected()) {
            sport = 6;
        }
        if (pallavoloRadioButton.isSelected()) {
            sport = 7;
        }
        if (raftingRadioButton.isSelected()) {
            sport = 8;
        }
        if (ciclismoRadioButton.isSelected()) {
            sport = 9;
        }
        if (rugbyRadioButton.isSelected()) {
            sport = 10;
        }
        if (atleticaRadioButton.isSelected()) {
            sport = 11;
        }
        if (hockeyRadioButton.isSelected()) {
            sport = 12;
        }
        if (golfRadioButton.isSelected()) {
            sport = 13;
        }
        if (danzaRadioButton.isSelected()) {
            sport = 14;
        }

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

        if (danzaRadioButton.isSelected()) {
            sport = 14;
        }

        try {
            String nome = nomeFieldTipoArticolo_newArticlePanel.getText();
            String descrizione = descrizioneFieldTipoArticolo_newArticlePanel.getText();
            int day = Integer.parseInt(dayField_newArticlePanel.getText());
            int month = Integer.parseInt(monthField_newArticlePanel.getText());
            int year = Integer.parseInt(yearField_newArticlePanel.getText());
            GregorianCalendar c = new GregorianCalendar(day, month, year);
            float prezzo = Float.parseFloat(prezzoField_newArticlePanel.getText());
            m.addArticolo(new Articolo(prezzo,c, new TipoArticolo(nome, descrizione, sport, tipoMateriale)));
            nomeFieldTipoArticolo_newArticlePanel.setText("");
            descrizioneFieldTipoArticolo_newArticlePanel.setText("");
            prezzoField_newArticlePanel.setText("");
            poliestereRadioButton.setSelected(true);
            nuotoRadioButton.setSelected(true);
            hideAll();
            indexArticle = m.articoliSize();
            visualizzaArticoliPanel.setVisible(true);
            errorLabel_creaNuovoArticoloPanel.setVisible(false);
        } catch (NumberFormatException e) {
            errorLabel_creaNuovoArticoloPanel.setVisible(true);
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
        hideAll();
        newArticlePanel.setVisible(true);
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

        if (nuotoRadioButton.isSelected()) {
            sport = 1;
        }
        if (calcioRadioButton.isSelected()) {
            sport = 2;
        }
        if (palestraRadioButton.isSelected()) {
            sport = 3;
        }
        if (tennisRadioButton.isSelected()) {
            sport = 4;
        }
        if (sciiRadioButton.isSelected()) {
            sport = 5;
        }
        if (basketRadioButton.isSelected()) {
            sport = 6;
        }
        if (pallavoloRadioButton.isSelected()) {
            sport = 7;
        }
        if (raftingRadioButton.isSelected()) {
            sport = 8;
        }
        if (ciclismoRadioButton.isSelected()) {
            sport = 9;
        }
        if (rugbyRadioButton.isSelected()) {
            sport = 10;
        }
        if (atleticaRadioButton.isSelected()) {
            sport = 11;
        }
        if (hockeyRadioButton.isSelected()) {
            sport = 12;
        }
        if (golfRadioButton.isSelected()) {
            sport = 13;
        }
        if (danzaRadioButton.isSelected()) {
            sport = 14;
        }

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

        if (danzaRadioButton.isSelected()) {
            sport = 14;
        }

        try {
            String nome = nomeFieldTipoArticolo_newArticlePanel.getText();
            String descrizione = descrizioneFieldTipoArticolo_newArticlePanel.getText();
            int day = Integer.parseInt(dayField_newArticlePanel.getText());
            int month = Integer.parseInt(monthField_newArticlePanel.getText());
            int year = Integer.parseInt(yearField_newArticlePanel.getText());
            float prezzo = Float.parseFloat(prezzoField_newArticlePanel.getText());
            m.getArticolo(indexArticle).setData(day, month, year);
            m.getArticolo(indexArticle).setPrezzo(prezzo);
            m.getArticolo(indexArticle).setTipoArticolo(new TipoArticolo(nome, descrizione, sport, tipoMateriale));
            nomeFieldTipoArticolo_newArticlePanel.setText("");
            descrizioneFieldTipoArticolo_newArticlePanel.setText("");
            prezzoField_newArticlePanel.setText("");
            poliestereRadioButton.setSelected(true);
            nuotoRadioButton.setSelected(true);
            hideAll();
            visualizzaArticoliPanel.setVisible(true);
            errorLabel_creaNuovoArticoloPanel.setVisible(false);
        } catch (NumberFormatException e) {
            errorLabel_creaNuovoArticoloPanel.setVisible(true);
        }
    }//GEN-LAST:event_modificaButton_newArticlePanelActionPerformed

    private void dataOdierna_newArticlePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOdierna_newArticlePanelActionPerformed
        GregorianCalendar c = new GregorianCalendar(); //prendo la data attuale
        yearField_newArticlePanel.setText("" + c.get(GregorianCalendar.DATE));
        monthField_newArticlePanel.setText("" + c.get(GregorianCalendar.MONTH));
        yearField_newArticlePanel.setText("" + GregorianCalendar.YEAR);
    }//GEN-LAST:event_dataOdierna_newArticlePanelActionPerformed

    void articoli() {
        if (m.articoliIsEmpty()) {
            avantiButton_VisualizzaArticoloPanel.setEnabled(false);
            indietroButton_VisualizzaArticoloPanel.setEnabled(false);
            modificaButton_VisualizzaArticoloPanel.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nessun Articolo ancora presente nel Database, premi 'crea ordine ora' per crearne uno nuovo subito");
        } else {//esiste almeno un artiolo salvato
            System.out.println(indexArticle);
            System.out.println((m.articoliSize() - 1));
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

            cercaLabel_VisualizzaArticoloPanel.setText("" + indexArticle);
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
            articoliQuantitaOrderPanel.setText("" + m.getOrdine(indexOrder).getArticoli_e_quantità());
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
    private javax.swing.JButton CreaNegozioButton_NegozioPanel;
    private javax.swing.JLabel IDLabel_VisualizzaArticoloPanel;
    private javax.swing.ButtonGroup MaterialiBottonGroup;
    private javax.swing.ButtonGroup SportButtonGroup;
    private javax.swing.JLabel TipoArticoloLabel_NewArticlePanel;
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
    private javax.swing.JLabel codiceFiscaleLabel_NegozioPanel;
    private javax.swing.JTextField corrriereField_NewOrderPanel;
    private javax.swing.JButton creaFromCreaNegozioPanel;
    private javax.swing.JButton creaNegozioButton_VisualizzaArticoloPanel;
    private javax.swing.JPanel creaNegozioPanel;
    private javax.swing.JPanel creaNuovoOrdinePanel;
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
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
    private javax.swing.JTextField nomeFieldTipoArticolo_newArticlePanel;
    private javax.swing.JTextField nomeField_newNegozioPanel;
    private javax.swing.JLabel nomeLabel_VisualizzaArticoloPanel;
    private javax.swing.JLabel nomeNegozioLabel_NegozioPanel;
    private javax.swing.JRadioButton nuotoRadioButton;
    private javax.swing.JLabel orderDataLabel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel orderNomeNegozioLabel;
    private javax.swing.JLabel orderPrezzoLabel;
    private javax.swing.JPanel ordinePanel;
    private javax.swing.JRadioButton palestraRadioButton;
    private javax.swing.JRadioButton pallavoloRadioButton;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JRadioButton poliammideRadioButton;
    private javax.swing.JRadioButton poliestereRadioButton;
    private javax.swing.JRadioButton polietileneRadioButton;
    private javax.swing.JTextField prezzoField_newArticlePanel;
    private javax.swing.JLabel prezzoLabel_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton raftingRadioButton;
    private javax.swing.JRadioButton rugbyRadioButton;
    private javax.swing.JRadioButton sciiRadioButton;
    private javax.swing.JTextField searchFieldOrderPanel;
    private javax.swing.JTextField searchField_NegozioPanel;
    private javax.swing.JButton selezionaButton_NegozioPanel;
    private javax.swing.JButton selzionaButton_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton siliconeRadioButton;
    private javax.swing.JLabel sportLabelTipoArticolo_newArticlePanel;
    private javax.swing.JLabel sportLabel_VisualizzaArticoloPanel;
    private javax.swing.JRadioButton tennisRadioButton;
    private javax.swing.JLabel titolo_newArticlePanel;
    private javax.swing.JTextField usrField;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JPanel visualizzaArticoliPanel;
    private javax.swing.JTextField yearField_newArticlePanel;
    // End of variables declaration//GEN-END:variables
}
