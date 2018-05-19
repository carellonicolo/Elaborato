package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    Magazzino m;

    public Main() {
        m = new Magazzino();
        initComponents();
    }
    
    public void hideAll(){
        newArticlePanel.setVisible(false);
        ordersViewPanel.setVisible(false);
        pinPanel.setVisible(false);
        creaNuovoOrdinePanel.setVisible(false);
        visaulizzaNegozioPanel.setVisible(false);
        visualizzaArticoliPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        pinPanel = new javax.swing.JPanel();
        pinField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cancelPinButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        usrLabel = new javax.swing.JLabel();
        usrField = new javax.swing.JTextField();
        loginTitleLabel = new javax.swing.JLabel();
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
        ordersViewPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        orderIDLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jTextField7 = new javax.swing.JTextField();
        visaulizzaNegozioPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
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

        pinPanel.setBackground(new java.awt.Color(0, 153, 0));
        pinPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pinPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 143, -1));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setText("Password:");
        pinPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

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
        usrLabel.setText("Username:");
        pinPanel.add(usrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        usrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrFieldActionPerformed(evt);
            }
        });
        pinPanel.add(usrField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 149, -1));

        loginTitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        loginTitleLabel.setText("LOGIN");
        pinPanel.add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(pinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 340, 260));

        newArticlePanel.setBackground(new java.awt.Color(0, 153, 255));
        newArticlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel2.setText("Inserisci un nuovo Articolo:");
        newArticlePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 289, 46));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("Prezzo:");
        newArticlePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 163, -1, -1));
        newArticlePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 158, 86, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setText("Data: ");
        newArticlePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 224, -1, -1));
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
        newArticlePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 251, -1, -1));

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("Cancella");
        newArticlePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 362, -1, -1));

        jButton3.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton3.setText("Inserisci");
        newArticlePanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 362, 130, -1));

        jLabel7.setText("Tipo di Articolo:");
        newArticlePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, -1, -1));

        getContentPane().add(newArticlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        ordersViewPanel.setBackground(new java.awt.Color(255, 102, 102));
        ordersViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 30)); // NOI18N
        jLabel8.setText("Visualizza Ordini:");
        ordersViewPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton4.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton4.setText("Vedi info Negozio");
        ordersViewPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jButton5.setText("<");
        ordersViewPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 41, -1));

        jButton6.setText(">");
        ordersViewPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, -1));

        jButton7.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton7.setText("Modifica");
        ordersViewPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jButton8.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton8.setText("Chiudi");
        ordersViewPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        ordersViewPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 93, -1));

        jLabel13.setText("Cerca:");
        ordersViewPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jButton17.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton17.setText("Crea Nuovo Ordine");
        ordersViewPanel.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        orderIDLabel.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        orderIDLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        orderIDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordersViewPanel.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        jLabel9.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordersViewPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 60));

        jLabel10.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prezzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordersViewPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 60));

        jLabel11.setFont(new java.awt.Font("Avenir", 0, 15)); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Negozio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir", 0, 13))); // NOI18N
        ordersViewPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 70));

        getContentPane().add(ordersViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 600, 400));

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
        creaNuovoOrdinePanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 128, -1, -1));

        jButton10.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton10.setText("Seleziona Articolo");
        creaNuovoOrdinePanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jButton11.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton11.setText("Crea");
        creaNuovoOrdinePanel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 220, -1, -1));

        jButton12.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton12.setText("Chiudi");
        creaNuovoOrdinePanel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 220, -1, -1));

        jLabel22.setText("Corriere:");
        creaNuovoOrdinePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        creaNuovoOrdinePanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 96, 138, -1));

        getContentPane().add(creaNuovoOrdinePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 410, 260));

        visaulizzaNegozioPanel.setBackground(new java.awt.Color(255, 0, 255));
        visaulizzaNegozioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel14.setText("Visualizza Negozio:");
        visaulizzaNegozioPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Avenir", 1, 36)); // NOI18N
        jLabel15.setText("Visualizza Ordine:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        visaulizzaNegozioPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 720, 550, 340));

        jButton13.setText(">");
        visaulizzaNegozioPanel.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 40, -1));

        jButton14.setText("<");
        visaulizzaNegozioPanel.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 41, -1));
        visaulizzaNegozioPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 93, -1));

        jLabel21.setText("Cerca:");
        visaulizzaNegozioPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jButton15.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton15.setText("Chiudi");
        visaulizzaNegozioPanel.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jButton16.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton16.setText("Modifica");
        visaulizzaNegozioPanel.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel16.setText("Codice Fiscale: ");
        visaulizzaNegozioPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel23.setText("Nome: ");
        visaulizzaNegozioPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel24.setText("Indirizzo:");
        visaulizzaNegozioPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel25.setText("Città: ");
        visaulizzaNegozioPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton18.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton18.setText("Crea Negozio");
        visaulizzaNegozioPanel.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        getContentPane().add(visaulizzaNegozioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 550, 340));

        visualizzaArticoliPanel.setBackground(new java.awt.Color(0, 255, 255));
        visualizzaArticoliPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel26.setText("Visualizza Articoli: ");
        visualizzaArticoliPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel27.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel27.setText("ID: ");
        visualizzaArticoliPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 74, -1, -1));

        jLabel28.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel28.setText("Prezzo: ");
        visualizzaArticoliPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 98, -1, -1));

        jLabel29.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel29.setText("Data:");
        visualizzaArticoliPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 134, -1, -1));

        jLabel30.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel30.setText("Tipo Articolo");
        visualizzaArticoliPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 74, -1, -1));

        jLabel31.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel31.setText("Nome:");
        visualizzaArticoliPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel32.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel32.setText("Descrizione:");
        visualizzaArticoliPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel33.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel33.setText("Sport:");
        visualizzaArticoliPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel34.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel34.setText("Materiali:");
        visualizzaArticoliPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jButton19.setText(">");
        visualizzaArticoliPanel.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 40, -1));

        jButton20.setText("<");
        visualizzaArticoliPanel.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 41, -1));
        visualizzaArticoliPanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 93, -1));

        jLabel35.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel35.setText("Cerca:");
        visualizzaArticoliPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jButton21.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton21.setText("Modifica");
        visualizzaArticoliPanel.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jButton22.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton22.setText("Crea Negozio");
        visualizzaArticoliPanel.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jButton23.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton23.setText("Chiudi");
        visualizzaArticoliPanel.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        getContentPane().add(visualizzaArticoliPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, 590, 320));

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
        JOptionPane.showMessageDialog(null, "Impossibile effettuare il login; riprovare più tardi, se il problema persiste contattae l'amministratore di sistema il prima possibile");

        String pin = pinField.getText();
        String user = usrField.getText();

        int type = m.login(new Utente(user, pin, 1));
        
        if(m.login(new Utente(user, pin, 1)) == -1){
            JOptionPane.showMessageDialog(null, "Impossibile effettuare il login; riprovare più tardi, se il problema persiste contattae l'amministratore di sistema il prima possibile");
            usrField.setText("");
            pinField.setText("");
        }else{
            usrField.setText("");
            pinField.setText("");
            JOptionPane.showMessageDialog(null, "Login effettuato correttamente\nTipoAccount: " + type);
            hideAll();
            resetOrdini();
            ordersViewPanel.setVisible(true);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    public void resetOrdini(){
        if(m.)
        orderIDLabel.setText("");
    }
    
    
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
    private javax.swing.JButton cancelPinButton;
    private javax.swing.JPanel creaNuovoOrdinePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JPanel newArticlePanel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JPanel ordersViewPanel;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JPanel pinPanel;
    private javax.swing.JTextField usrField;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JPanel visaulizzaNegozioPanel;
    private javax.swing.JPanel visualizzaArticoliPanel;
    // End of variables declaration//GEN-END:variables
}
