package Controlador;

/*import Modelo.ICoffee;

import javax.swing.*;

public class FacturaController extends javax.swing.JFrame {
    

    public FacturaController() {
        
        initComponents();
        controlFacturas = new ConsultaFacturasSQLMVCController();
        controlUsuarios = new UserConsultaSQLMVCController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollBar1 = new javax.swing.JScrollBar();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tip1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LecheBatida = new javax.swing.JCheckBox();
        Moca = new javax.swing.JCheckBox();
        Soya = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        generarOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneOrden = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        tip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HouseBlend = new javax.swing.JRadioButton();
        DarkRoast = new javax.swing.JRadioButton();
        Descafeinado = new javax.swing.JRadioButton();
        Expresso = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lechevapor = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBar1 = new javax.swing.JMenu();
        consultarFacturas = new javax.swing.JMenuItem();
        consultarUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane4.setViewportView(jTree1);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaModuloPrincipalPatronDecorador/fondo.jpg"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(75, 54, 33));
        jLabel21.setText("ADICIONALES");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));

        tip1.setBackground(new java.awt.Color(161, 130, 98));
        tip1.setText("0");
        tip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tip1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Starbuzz Coffee");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(8, 4, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 54, 33));
        jLabel1.setText("TIPO DE CAFÉ:");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 27));

        LecheBatida.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        LecheBatida.setForeground(new java.awt.Color(75, 54, 33));
        LecheBatida.setSelected(true);
        LecheBatida.setText("Leche Batida");
        LecheBatida.setOpaque(false);
        LecheBatida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecheBatidaActionPerformed(evt);
            }
        });
        getContentPane().add(LecheBatida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        Moca.setBackground(new java.awt.Color(8, 4, 0));
        Moca.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Moca.setForeground(new java.awt.Color(75, 54, 33));
        Moca.setText("Moca (Chocolate)");
        Moca.setContentAreaFilled(false);
        Moca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MocaActionPerformed(evt);
            }
        });
        getContentPane().add(Moca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        Soya.setBackground(new java.awt.Color(128, 64, 0));
        Soya.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Soya.setForeground(new java.awt.Color(75, 54, 33));
        Soya.setText("Soya");
        Soya.setOpaque(false);
        getContentPane().add(Soya, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 69, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 54, 33));
        jLabel2.setText("ADICIONALES");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 43, 25));
        jLabel3.setText("STARBUZZ COFFEE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 13, -1, -1));

        generarOrden.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        generarOrden.setText("Generar Facturación");
        generarOrden.setToolTipText("Confirma la orden y genera la facturación");
        generarOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(generarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 150, 31));

        paneOrden.setEditable(false);
        paneOrden.setBackground(new java.awt.Color(161, 130, 98));
        paneOrden.setColumns(20);
        paneOrden.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        paneOrden.setRows(5);
        paneOrden.setToolTipText("Muestra las especificaciones de la orden");
        paneOrden.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(paneOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 324, 109));

        limpiar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        limpiar.setText("Nueva Orden");
        limpiar.setToolTipText("Genera una nueva orden");
        limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiar.setFocusPainted(false);
        limpiar.setMaximumSize(new java.awt.Dimension(139, 24));
        limpiar.setMinimumSize(new java.awt.Dimension(139, 24));
        limpiar.setPreferredSize(new java.awt.Dimension(139, 24));
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarMouseEntered(evt);
            }
        });
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 150, 31));
        limpiar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tip.setBackground(new java.awt.Color(161, 130, 98));
        tip.setText("0");
        tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipActionPerformed(evt);
            }
        });
        getContentPane().add(tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 91, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 54, 33));
        jLabel4.setText("TIP:");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        jLabel4.setMaximumSize(new java.awt.Dimension(107, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(107, 19));
        jLabel4.setPreferredSize(new java.awt.Dimension(107, 19));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 40, 27));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(75, 54, 33));
        jLabel5.setText("₡ 1.200");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        HouseBlend.setBackground(new java.awt.Color(8, 4, 0));
        buttonGroup1.add(HouseBlend);
        HouseBlend.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        HouseBlend.setForeground(new java.awt.Color(75, 54, 33));
        HouseBlend.setText("House Blend");
        HouseBlend.setToolTipText("");
        HouseBlend.setOpaque(false);
        getContentPane().add(HouseBlend, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 86, -1, -1));

        DarkRoast.setBackground(new java.awt.Color(8, 4, 0));
        buttonGroup1.add(DarkRoast);
        DarkRoast.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        DarkRoast.setForeground(new java.awt.Color(75, 54, 33));
        DarkRoast.setText("Dark Roast");
        DarkRoast.setOpaque(false);
        DarkRoast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkRoastActionPerformed(evt);
            }
        });
        getContentPane().add(DarkRoast, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Descafeinado.setBackground(new java.awt.Color(8, 4, 0));
        buttonGroup1.add(Descafeinado);
        Descafeinado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Descafeinado.setForeground(new java.awt.Color(75, 54, 33));
        Descafeinado.setText("Descafeinado");
        Descafeinado.setOpaque(false);
        Descafeinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescafeinadoActionPerformed(evt);
            }
        });
        getContentPane().add(Descafeinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Expresso.setBackground(new java.awt.Color(8, 4, 0));
        buttonGroup1.add(Expresso);
        Expresso.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Expresso.setForeground(new java.awt.Color(75, 54, 33));
        Expresso.setText("Expresso");
        Expresso.setOpaque(false);
        Expresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpressoActionPerformed(evt);
            }
        });
        getContentPane().add(Expresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(75, 54, 33));
        jLabel9.setText("₡ 1.400");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 54, 33));
        jLabel12.setText("PRECIOS");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        jLabel12.setMaximumSize(new java.awt.Dimension(107, 19));
        jLabel12.setMinimumSize(new java.awt.Dimension(107, 19));
        jLabel12.setPreferredSize(new java.awt.Dimension(107, 19));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 70, 27));

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(75, 54, 33));
        jLabel10.setText("₡ 300");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 54, 33));
        jLabel13.setText("₡  50");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(75, 54, 33));
        jLabel14.setText("₡ 300");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(75, 54, 33));
        jLabel7.setText("₡ 250");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        Lechevapor.setBackground(new java.awt.Color(8, 4, 0));
        Lechevapor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        Lechevapor.setForeground(new java.awt.Color(75, 54, 33));
        Lechevapor.setText("Leche al Vapor");
        Lechevapor.setOpaque(false);
        Lechevapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LechevaporActionPerformed(evt);
            }
        });
        getContentPane().add(Lechevapor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel19.setBackground(new java.awt.Color(8, 4, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(75, 54, 33));
        jLabel19.setText("PRECIOS");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        jLabel19.setMaximumSize(new java.awt.Dimension(107, 19));
        jLabel19.setMinimumSize(new java.awt.Dimension(107, 19));
        jLabel19.setPreferredSize(new java.awt.Dimension(107, 19));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 70, 27));

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(75, 54, 33));
        jLabel6.setText("₡ 1.450");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(75, 54, 33));
        jLabel16.setText("₡ 1.100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 90, 40));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(75, 54, 33));
        jLabel20.setText("ADICIONALES");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(8, 4, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 26));

        reloj.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 110, 20));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistaModuloPrincipalPatronDecorador/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 440));

        menuBar1.setText("Consultas");
        menuBar1.setToolTipText("Menú únicamente para administradores");

        consultarFacturas.setText("Consultar Facturas");
        consultarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFacturasActionPerformed(evt);
            }
        });
        menuBar1.add(consultarFacturas);

        consultarUsuarios.setText("Consultar Usuarios");
        consultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarUsuariosActionPerformed(evt);
            }
        });
        menuBar1.add(consultarUsuarios);

        jMenuBar1.add(menuBar1);

        jMenu2.setText("Exit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        Login.setText("Volver a Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jMenu2.add(Login);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu2.add(Salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void generarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarOrdenActionPerformed
        try {
            if (tip.getText().isEmpty()) {
                tip.setText("0");
            }
            orden();
            if (!paneOrden.getText().isEmpty()) {
                limitador = true;
            }
        } catch (Exception e) {
            e.getMessage();
            condimento = "";
            cafeAux = "";
            JOptionPane.showMessageDialog(null, "Datos escoger el tipo de café " + e.getMessage());
        }
    }//GEN-LAST:event_generarOrdenActionPerformed

    public void menuBar() {
        this.consultarFacturas.setEnabled(false);
        this.consultarUsuarios.setEnabled(false);
    }

    private void imprimirOrden() {
        double propina = Integer.parseInt(tip.getText());
        costoTotal = propina + cafe.getPrecio();
        paneOrden.setText("                         |Orden #" + orden + "|\n"
                + "Una Orden de Café: "
                + cafe.getTipo() + "\n"
                + "Costo del Café: " + cafe.getPrecio() + " colones\n"
                + "Propina: " + tip.getText() + " colones" + "\n"
                + "Costo Total: " + costoTotal + " colones");
    }
   
    
    public void initViewFacturas() {
        String costo = String.valueOf(costoTotal);
        String tips = tip.getText();
        controlFacturas.initViewFacturas();
        controlFacturas.view.insertarDatos(cafeAux, condimento, costo,tips);
    }

    public void orden() {
        try {
            int aux = Integer.parseInt(tip.getText());
            if (aux >= 0) {
                escogerTipoCafe();
                escogerCondimento();
                imprimirOrden();
                initViewFacturas();
                generarOrden.setEnabled(false);
                tip.setEditable(false);
            } else {
                advertencia();
            }
        } catch (NumberFormatException e) {
            e.getMessage();
            advertencia();
        }
    }

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        try {
            if (limitador) {
                orden++;
            }
            limpiar();
            tip.setText("0");
            cafeAux = "";
            condimento = "";
            generarOrden.setEnabled(true);
            tip.setEditable(true);
            if (paneOrden.getText().isEmpty()) {
                limitador = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_limpiarActionPerformed

    public void limpiar() {
        try {
            paneOrden.setText(null);
            LecheBatida.setSelected(true);
            Soya.setSelected(false);
            Moca.setSelected(false);
            Lechevapor.setSelected(false);
            HouseBlend.setSelected(true);
            DarkRoast.setSelected(false);
            Expresso.setSelected(false);
            Descafeinado.setSelected(false);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void tipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipActionPerformed
        try {
            tip.setText(null);
        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_tipActionPerformed
    
    private void advertencia() {
        tip.setText("0");
        JOptionPane.showMessageDialog(null, "Datos de TIP incorrectos, debe introducir los datos correctamente");
    }

    private void MocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MocaActionPerformed

    private void DarkRoastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkRoastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DarkRoastActionPerformed

    private void ExpressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpressoActionPerformed

    private void DescafeinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescafeinadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescafeinadoActionPerformed

    private void LechevaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LechevaporActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LechevaporActionPerformed

    private void limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseEntered

    }//GEN-LAST:event_limpiarMouseEntered

    private void LecheBatidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecheBatidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LecheBatidaActionPerformed

    private void consultarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFacturasActionPerformed
        try {
            controlFacturas.initViewFacturas();
            controlFacturas.view.setVisible(true);
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_consultarFacturasActionPerformed

    private void consultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarUsuariosActionPerformed
        controlUsuarios.initUserConsuLta();
    }//GEN-LAST:event_consultarUsuariosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void tip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tip1ActionPerformed
    }//GEN-LAST:event_tip1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        controlUsuarios.initLogIn();
        this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

//</editor-fold>
    public void escogerTipoCafe() {
        try {
            //HouseBlend
            if (HouseBlend.isSelected()) {
                cafe = new HouseBlend();
                cafeAux = "HouseBlend";
            }
            if (DarkRoast.isSelected()) {
                cafe = new DarkRoast();
                cafeAux = "DarkRoast";
            }
            if (Descafeinado.isSelected()) {
                cafe = new Descafeinado();
                cafeAux = "Descafeinado";
            }
            if (Expresso.isSelected()) {
                cafe = new Expresso();
                cafeAux = "Expresso";
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void escogerCondimento() {
        try {
            if (LecheBatida.isSelected()) {
                cafe = new LecheBatida(cafe);
                condimento += "Leche Batida, ";
            }
            if (Soya.isSelected()) {
                cafe = new Soya(cafe);
                condimento += "Soya, ";
            }
            if (Moca.isSelected()) {
                cafe = new Moca(cafe);
                condimento += "Moca, ";
            }
            if (Lechevapor.isSelected()) {
                cafe = new LecheAlVapor(cafe);
                condimento += "Leche Vapor, ";
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /**
     * @param args the command line arguments
     */
/*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacturaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new FacturaController().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DarkRoast;
    private javax.swing.JRadioButton Descafeinado;
    private javax.swing.JRadioButton Expresso;
    private javax.swing.JRadioButton HouseBlend;
    private javax.swing.JCheckBox LecheBatida;
    private javax.swing.JCheckBox Lechevapor;
    private javax.swing.JMenuItem Login;
    private javax.swing.JCheckBox Moca;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JCheckBox Soya;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JMenuItem consultarFacturas;
    private javax.swing.JMenuItem consultarUsuarios;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton generarOrden;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton limpiar;
    private javax.swing.JMenu menuBar1;
    private javax.swing.JTextArea paneOrden;
    private javax.swing.JLabel reloj;
    private javax.swing.JTextField tip;
    private javax.swing.JTextField tip1;
    // End of variables declaration//GEN-END:variables
    //CafeBase cafe;
    ICoffee cafe;
    static int orden = 0;
    boolean limitador = false;
    String condimento = "";
    String cafeAux = "";
    double costoTotal;
    //ConsultaFacturasSQLMVCController controlFacturas;
    //UserConsultaSQLMVCController controlUsuarios;
}*/
