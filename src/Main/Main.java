package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    static int indexOrder = 0, indexArticle = 0, indexShop = 0; //numero ordine
    Magazzino m;

    public Main() {
        m = new Magazzino();
        initComponents();
        hideAll();
        pinPanel.setVisible(true);
        selezionaButton_NegozioPanel.setVisible(false);
    }

    public void hideAll() {
        newArticlePanel.setVisible(false);
        ordinePanel.setVisible(false);
        pinPanel.setVisible(false);
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
        pinPanel = new javax.swing.JPanel();
        pinField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cancelPinButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        usrLabel = new javax.swing.JLabel();
        usrField = new javax.swing.JTextField();
        loginTitleLabel = new javax.swing.JLabel();
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
        visualizzaArticoliPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        newArticlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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

        codiceFiscaleLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Codice Fiscale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        negoziPanel.add(codiceFiscaleLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 60));

        nomeNegozioLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nome\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        negoziPanel.add(nomeNegozioLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 60));

        indirizzoLabel_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Indirizzo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        negoziPanel.add(indirizzoLabel_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, 60));

        cittaNegozio_NegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Città", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
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
        negoziPanel.add(selezionaButton_NegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        closeButton_NegozioPanel1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        closeButton_NegozioPanel1.setText("Chiudi");
        closeButton_NegozioPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton_NegozioPanel1ActionPerformed(evt);
            }
        });
        negoziPanel.add(closeButton_NegozioPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        getContentPane().add(negoziPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 550, 270));

        creaNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        creaNegozioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel9.setText("CREA NEGOZIO");
        creaNegozioPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 43));

        indirizzoField_newNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        indirizzoField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Indirizzo"));
        indirizzoField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indirizzoField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(indirizzoField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 224, -1));

        CodiceFiscaleField_NewNegozio.setBackground(new java.awt.Color(255, 204, 204));
        CodiceFiscaleField_NewNegozio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Codice Fiscale"));
        CodiceFiscaleField_NewNegozio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceFiscaleField_NewNegozioActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(CodiceFiscaleField_NewNegozio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 224, 40));

        nomeField_newNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        nomeField_newNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nome"));
        nomeField_newNegozioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeField_newNegozioPanelActionPerformed(evt);
            }
        });
        creaNegozioPanel.add(nomeField_newNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 224, -1));

        cittaField_NewNegozioPanel.setBackground(new java.awt.Color(255, 204, 204));
        cittaField_NewNegozioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Città"));
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

        getContentPane().add(creaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 500, 180));

        pinPanel.setBackground(new java.awt.Color(0, 153, 0));
        pinPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pinPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 143, -1));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        pinPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 60));

        cancelPinButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        cancelPinButton.setText("Cancel");
        cancelPinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPinButtonActionPerformed(evt);
            }
        });
        pinPanel.add(cancelPinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        loginButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        pinPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        usrLabel.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        usrLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        pinPanel.add(usrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 240, 60));

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
        pinPanel.add(usrField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 149, -1));

        loginTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        loginTitleLabel.setText("LOGIN");
        pinPanel.add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(pinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 340, 260));

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
        orderIDLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        orderIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordinePanel.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        orderDataLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderDataLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderDataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 60));

        orderPrezzoLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderPrezzoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderPrezzoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 60));

        orderNomeNegozioLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderNomeNegozioLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordinePanel.add(orderNomeNegozioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 70));

        articoliQuantitaOrderPanel.setText("jLabel9");
        ordinePanel.add(articoliQuantitaOrderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 240, 130));

        getContentPane().add(ordinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 600, 400));

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

        getContentPane().add(creaNuovoOrdinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 410, 260));

        visualizzaArticoliPanel.setBackground(new java.awt.Color(0, 255, 255));
        visualizzaArticoliPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel26.setText("Visualizza Articoli: ");
        visualizzaArticoliPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 50));

        jLabel28.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 50));

        jLabel29.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 50));

        jLabel30.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel30.setText("Tipo Articolo");
        visualizzaArticoliPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel31.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 200, 50));

        jLabel32.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Descrizione", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 200, 50));

        jLabel33.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Sport", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 200, 50));

        jLabel34.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Materiali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 190, 50));

        jButton19.setText(">");
        visualizzaArticoliPanel.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 40, -1));

        jButton20.setText("<");
        visualizzaArticoliPanel.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 41, -1));
        visualizzaArticoliPanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 93, -1));

        jLabel35.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cerca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        visualizzaArticoliPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 200, 50));

        jButton21.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton21.setText("Modifica");
        visualizzaArticoliPanel.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        jButton22.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton22.setText("Crea Negozio");
        visualizzaArticoliPanel.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton23.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton23.setText("Chiudi");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        visualizzaArticoliPanel.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton7.setText("Seleziona");
        visualizzaArticoliPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        getContentPane().add(visualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 540, 370));

        adminPanel.setBackground(new java.awt.Color(0, 0, 0));
        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Articoli");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 46, -1, -1));

        jButton5.setText("Negozi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 81, 90, -1));

        jToggleButton1.setText("Ordini");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        adminPanel.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 116, -1, -1));

        getContentPane().add(adminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 470, 180));

        newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        newArticlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel2.setText("Inserisci un nuovo Articolo:");
        newArticlePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 289, 46));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("€");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 50));

        jTextField1.setBackground(new java.awt.Color(51, 153, 255));
        newArticlePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 158, 86, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Data ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        newArticlePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 90));
        newArticlePanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 219, 29, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("/");
        newArticlePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 213, -1, -1));
        newArticlePanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 219, 27, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("/");
        newArticlePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 213, -1, -1));
        newArticlePanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 219, 49, -1));

        jButton1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton1.setText("Data Odierna");
        newArticlePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("Cancella");
        newArticlePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 362, -1, -1));

        jButton3.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton3.setText("Inserisci");
        newArticlePanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 362, 130, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo Articolo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 14))); // NOI18N
        newArticlePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 250, 60));

        getContentPane().add(newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

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
        indexOrder = 0;//azzero 'indice degli ordini
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
        aggiornaOrdini();
    }//GEN-LAST:event_avantiButton_OrderPanelActionPerformed

    private void indietroButton_OrderPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroButton_OrderPanelActionPerformed
        indexOrder--;
        aggiornaOrdini();
    }//GEN-LAST:event_indietroButton_OrderPanelActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        hideAll();
        creaNuovoOrdinePanel.setVisible(true);
        corrriereField_NewOrderPanel.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void closeButton_creaNegozioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton_creaNegozioPanelActionPerformed
        exit();
    }//GEN-LAST:event_closeButton_creaNegozioPanelActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        hideAll();
        ordinePanel.setVisible(true);
        indexOrder = 0;
        aggiornaOrdini();
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
        m.addNegozi(new Negozio(cf,nome,indirizzo,citta));
        JOptionPane.showMessageDialog(null, "Utente creato con successo!");
        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        indexShop = m.negoziSize()-1;
        negozi();
    }//GEN-LAST:event_creaFromCreaNegozioPanelActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        exit();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        exit();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CodiceFiscaleField_NewNegozio.setText("");
        nomeField_newNegozioPanel.setText("");
        indirizzoField_newNegozioPanel.setText("");
        cittaField_NewNegozioPanel.setText("");
        hideAll();
        negoziPanel.setVisible(true);
        aggiornaOrdini();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        hideAll();
        negoziPanel.setVisible(true);
        selezionaButton_NegozioPanel.setVisible(rootPaneCheckingEnabled);
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

            searchField_NegozioPanel.setText("" + (indexShop+1));
            codiceFiscaleLabel_NegozioPanel.setText(m.getNegozi(indexShop).getCodiceFiscale());
            indirizzoLabel_NegozioPanel.setText(m.getNegozi(indexShop).getindirizzo());
            nomeNegozioLabel_NegozioPanel.setText(m.getNegozi(indexShop).getNome());
            cittaNegozio_NegozioPanel.setText(m.getNegozi(indexShop).getCitta());
        }
    }

    void aggiornaOrdini() {

        if (m.ordineIsEmpty()) {
            indexOrder = 0;
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
            searchFieldOrderPanel.setText("" + indexOrder);
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
            pinPanel.setVisible(true);

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
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel articoliQuantitaOrderPanel;
    private javax.swing.JButton avantiButton_NegozioPanel;
    private javax.swing.JButton avantiButton_OrderPanel;
    private javax.swing.JButton cancelPinButton;
    private javax.swing.JButton chiudiButtonOrderPanel;
    private javax.swing.JTextField cittaField_NewNegozioPanel;
    private javax.swing.JLabel cittaNegozio_NegozioPanel;
    private javax.swing.JButton closeButton_NegozioPanel1;
    private javax.swing.JButton closeButton_creaNegozioPanel;
    private javax.swing.JLabel codiceFiscaleLabel_NegozioPanel;
    private javax.swing.JTextField corrriereField_NewOrderPanel;
    private javax.swing.JButton creaFromCreaNegozioPanel;
    private javax.swing.JPanel creaNegozioPanel;
    private javax.swing.JPanel creaNuovoOrdinePanel;
    private javax.swing.JButton indietroButton_NegozioPanel;
    private javax.swing.JButton indietroButton_OrderPanel;
    private javax.swing.JTextField indirizzoField_newNegozioPanel;
    private javax.swing.JLabel indirizzoLabel_NegozioPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JButton modificaButtonOrderPanel;
    private javax.swing.JButton modificaButton_NegozioPanel;
    private javax.swing.JButton modificaFromNewNegozioPanel;
    private javax.swing.JPanel negoziPanel;
    private javax.swing.JButton negozioInfo_OrderPanel;
    private javax.swing.JPanel newArticlePanel;
    private javax.swing.JTextField nomeField_newNegozioPanel;
    private javax.swing.JLabel nomeNegozioLabel_NegozioPanel;
    private javax.swing.JLabel orderDataLabel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel orderNomeNegozioLabel;
    private javax.swing.JLabel orderPrezzoLabel;
    private javax.swing.JPanel ordinePanel;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JPanel pinPanel;
    private javax.swing.JTextField searchFieldOrderPanel;
    private javax.swing.JTextField searchField_NegozioPanel;
    private javax.swing.JButton selezionaButton_NegozioPanel;
    private javax.swing.JTextField usrField;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JPanel visualizzaArticoliPanel;
    // End of variables declaration//GEN-END:variables
}
