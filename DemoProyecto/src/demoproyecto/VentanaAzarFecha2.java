/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproyecto;

import source.EquiposFaseGrupos;

/**
 *
 * @author ferna
 */
public class VentanaAzarFecha2 extends javax.swing.JFrame {

    String[] strGrupoA = EquiposFaseGrupos.grupoA.crearString();
    String[] strGrupoB = EquiposFaseGrupos.grupoB.crearString();
    String[] strGrupoC = EquiposFaseGrupos.grupoC.crearString();
    String[] strGrupoD = EquiposFaseGrupos.grupoD.crearString();
    String[] strGrupoE = EquiposFaseGrupos.grupoE.crearString();
    String[] strGrupoF = EquiposFaseGrupos.grupoF.crearString();
    String[] strGrupoG = EquiposFaseGrupos.grupoG.crearString();
    String[] strGrupoH = EquiposFaseGrupos.grupoH.crearString();

    public VentanaAzarFecha2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jlGrupo1.setListData(strGrupoA);
        this.jlGrupo2.setListData(strGrupoB);
        this.jlGrupo3.setListData(strGrupoC);
        this.jlGrupo4.setListData(strGrupoD);
        this.jlGrupo5.setListData(strGrupoE);
        this.jlGrupo6.setListData(strGrupoF);
        this.jlGrupo7.setListData(strGrupoG);
        this.jlGrupo8.setListData(strGrupoH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane9 = new javax.swing.JScrollPane();
        jlGrupo2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlGrupo5 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jlGrupo7 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlGrupo4 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jlGrupo8 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlGrupo3 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jlGrupo6 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlGrupo1 = new javax.swing.JList<>();
        btnRegresar = new javax.swing.JButton();
        btnAvanzarFecha3 = new javax.swing.JButton();
        btnSimularFecha1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtAreaResultados = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(920, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(920, 580));
        getContentPane().setLayout(null);

        jlGrupo2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo2.setOpaque(false);
        jScrollPane9.setViewportView(jlGrupo2);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(30, 10, 160, 100);

        jlGrupo5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo5.setOpaque(false);
        jScrollPane5.setViewportView(jlGrupo5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 130, 160, 100);

        jlGrupo7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo7.setOpaque(false);
        jScrollPane7.setViewportView(jlGrupo7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(30, 260, 160, 100);

        jlGrupo4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo4.setOpaque(false);
        jScrollPane4.setViewportView(jlGrupo4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 390, 160, 100);

        jlGrupo8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo8.setOpaque(false);
        jScrollPane8.setViewportView(jlGrupo8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(230, 390, 160, 100);

        jlGrupo3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo3.setOpaque(false);
        jScrollPane3.setViewportView(jlGrupo3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(230, 260, 160, 100);

        jlGrupo6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo6.setOpaque(false);
        jScrollPane6.setViewportView(jlGrupo6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(230, 130, 160, 100);

        jlGrupo1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo1.setOpaque(false);
        jScrollPane1.setViewportView(jlGrupo1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 10, 160, 100);

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(10, 540, 160, 30);

        btnAvanzarFecha3.setText("AVANZAR A FECHA 3");
        btnAvanzarFecha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarFecha3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvanzarFecha3);
        btnAvanzarFecha3.setBounds(750, 540, 160, 30);

        btnSimularFecha1.setText("SIMULAR FECHA 2");
        btnSimularFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimularFecha1);
        btnSimularFecha1.setBounds(610, 490, 160, 30);

        jtxtAreaResultados.setColumns(20);
        jtxtAreaResultados.setRows(5);
        jScrollPane2.setViewportView(jtxtAreaResultados);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane10.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 40, 450, 440);

        Titulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Titulo.setText("RESULTADOS FECHA 2");
        getContentPane().add(Titulo);
        Titulo.setBounds(560, 10, 240, 30);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoOctavos.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 923, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaAzarFecha1 regresar = new VentanaAzarFecha1();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAvanzarFecha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarFecha3ActionPerformed
        VentanaAzarFecha3 fecha3 = new VentanaAzarFecha3();
        fecha3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAvanzarFecha3ActionPerformed

    private void btnSimularFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularFecha1ActionPerformed
          String salida = "";
        int resultados[] = new int[32];
        for (int i = 0; i < 32; i++) {
            resultados[i] = (int) (Math.random() * 6);
            
        }
        salida += "Partidos Grupo A\n"+strGrupoA[0] + "\t" + resultados[0] + "\t" + strGrupoA[1] + "\t" + resultados[1] + "\n";
        salida += strGrupoA[2] + "\t" + resultados[2] + "\t" + strGrupoA[3] + "\t" + resultados[3] + "\n";
        salida += "\nPartidos Grupo B\n"+strGrupoB[0] + "\t" + resultados[4] + "\t" + strGrupoB[1] + "\t" + resultados[5] + "\n";
        salida += strGrupoB[2] + "\t" + resultados[6] + "\t" + strGrupoB[3] + "\t" + resultados[7] + "\n";
        salida += "\nPartidos Grupo C\n"+strGrupoC[0] + "\t" + resultados[8] + "\t" + strGrupoC[1] + "\t" + resultados[9] + "\n";
        salida += strGrupoC[2] + "\t" + resultados[10] + "\t" + strGrupoC[3] + "\t" + resultados[11] + "\n";
        salida += "\nPartidos Grupo D\n"+strGrupoD[0] + "\t" + resultados[12] + "\t" + strGrupoD[1] + "\t" + resultados[13] + "\n";
        salida += strGrupoD[2] + "\t" + resultados[14] + "\t" + strGrupoD[3] + "\t" + resultados[15] + "\n";
        salida += "\nPartidos Grupo E\n"+strGrupoE[0] + "\t" + resultados[16] + "\t" + strGrupoE[1] + "\t" + resultados[17] + "\n";
        salida += strGrupoE[2] + "\t" + resultados[18] + "\t" + strGrupoE[3] + "\t" + resultados[19] + "\n";
        salida += "\nPartidos Grupo F\n"+strGrupoF[0] + "\t" + resultados[20] + "\t" + strGrupoF[1] + "\t" + resultados[21] + "\n";
        salida += strGrupoF[2] + "\t" + resultados[22] + "\t" + strGrupoF[3] + "\t" + resultados[23] + "\n";
        salida += "\nPartidos Grupo G\n"+strGrupoG[0] + "\t" + resultados[24] + "\t" + strGrupoG[1] + "\t" + resultados[25] + "\n";
        salida += strGrupoG[2] + "\t" + resultados[26] + "\t" + strGrupoG[3] + "\t" + resultados[27] + "\n";
        salida += "\nPartidos Grupo H\n"+strGrupoH[0] + "\t" + resultados[28] + "\t" + strGrupoH[1] + "\t" + resultados[29] + "\n";
        salida += strGrupoH[2] + "\t" + resultados[30] + "\t" + strGrupoH[3] + "\t" + resultados[31] + "\n";
        this.jtxtAreaResultados.setText(salida);
        EquiposFaseGrupos.grupoA.ingresarResultados(resultados[0], resultados[1], strGrupoA[0], strGrupoA[1]);
        EquiposFaseGrupos.grupoA.ingresarResultados(resultados[2], resultados[3], strGrupoA[2], strGrupoA[3]);
        EquiposFaseGrupos.grupoB.ingresarResultados(resultados[4], resultados[5], strGrupoB[0], strGrupoB[1]);
        EquiposFaseGrupos.grupoB.ingresarResultados(resultados[6], resultados[7], strGrupoB[2], strGrupoB[3]);
        EquiposFaseGrupos.grupoC.ingresarResultados(resultados[8], resultados[9], strGrupoC[0], strGrupoC[1]);
        EquiposFaseGrupos.grupoC.ingresarResultados(resultados[10], resultados[11], strGrupoC[2], strGrupoC[3]);
        EquiposFaseGrupos.grupoD.ingresarResultados(resultados[12], resultados[13], strGrupoD[0], strGrupoD[1]);
        EquiposFaseGrupos.grupoD.ingresarResultados(resultados[14], resultados[15], strGrupoD[2], strGrupoD[3]);
        EquiposFaseGrupos.grupoE.ingresarResultados(resultados[16], resultados[17], strGrupoE[0], strGrupoE[1]);
        EquiposFaseGrupos.grupoE.ingresarResultados(resultados[18], resultados[19], strGrupoE[2], strGrupoE[3]);
        EquiposFaseGrupos.grupoF.ingresarResultados(resultados[20], resultados[21], strGrupoF[0], strGrupoF[1]);
        EquiposFaseGrupos.grupoF.ingresarResultados(resultados[22], resultados[23], strGrupoF[2], strGrupoF[3]);
        EquiposFaseGrupos.grupoG.ingresarResultados(resultados[24], resultados[25], strGrupoG[0], strGrupoG[1]);
        EquiposFaseGrupos.grupoG.ingresarResultados(resultados[26], resultados[27], strGrupoG[2], strGrupoG[3]);
        EquiposFaseGrupos.grupoH.ingresarResultados(resultados[28], resultados[29], strGrupoH[0], strGrupoH[1]);
        EquiposFaseGrupos.grupoH.ingresarResultados(resultados[30], resultados[31], strGrupoH[2], strGrupoH[3]);
        
        EquiposFaseGrupos.ordenarGrupos();
        jtxtAreaResultados.setText(EquiposFaseGrupos.imprimirGrupos());
    }//GEN-LAST:event_btnSimularFecha1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAzarFecha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAzarFecha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAzarFecha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAzarFecha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAzarFecha2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAvanzarFecha3;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSimularFecha1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> jlGrupo1;
    private javax.swing.JList<String> jlGrupo2;
    private javax.swing.JList<String> jlGrupo3;
    private javax.swing.JList<String> jlGrupo4;
    private javax.swing.JList<String> jlGrupo5;
    private javax.swing.JList<String> jlGrupo6;
    private javax.swing.JList<String> jlGrupo7;
    private javax.swing.JList<String> jlGrupo8;
    private javax.swing.JTextArea jtxtAreaResultados;
    // End of variables declaration//GEN-END:variables
}
