/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproyecto;

/**
 *
 * @author ferna
 */
public class VentanaFecha1Manual extends javax.swing.JFrame {

    /**
     * Creates new form FaseOctavos
     */
    public VentanaFecha1Manual() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnAvanzarFecha2 = new javax.swing.JButton();
        btnSimularFecha1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlGrupo1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlGrupo3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlGrupo4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlGrupo5 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jlGrupo6 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jlGrupo7 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jlGrupo8 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jlGrupo9 = new javax.swing.JList<>();
        Titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(920, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(10, 540, 160, 30);

        btnAvanzarFecha2.setText("AVANZAR A FECHA2");
        btnAvanzarFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarFecha2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvanzarFecha2);
        btnAvanzarFecha2.setBounds(750, 540, 160, 30);

        btnSimularFecha1.setText("SIMULAR FECHA 1");
        btnSimularFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimularFecha1);
        btnSimularFecha1.setBounds(610, 490, 160, 30);

        jlGrupo1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo1.setOpaque(false);
        jScrollPane1.setViewportView(jlGrupo1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 10, 160, 100);

        jlGrupo3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo3.setOpaque(false);
        jScrollPane3.setViewportView(jlGrupo3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(230, 260, 160, 100);

        jlGrupo4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo4.setOpaque(false);
        jScrollPane4.setViewportView(jlGrupo4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 390, 160, 100);

        jlGrupo5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo5.setOpaque(false);
        jScrollPane5.setViewportView(jlGrupo5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 130, 160, 100);

        jlGrupo6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo6.setOpaque(false);
        jScrollPane6.setViewportView(jlGrupo6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(230, 130, 160, 100);

        jlGrupo7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo7.setOpaque(false);
        jScrollPane7.setViewportView(jlGrupo7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(30, 260, 160, 100);

        jlGrupo8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo8.setOpaque(false);
        jScrollPane8.setViewportView(jlGrupo8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(230, 390, 160, 100);

        jlGrupo9.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlGrupo9.setOpaque(false);
        jScrollPane9.setViewportView(jlGrupo9);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(30, 10, 160, 100);

        Titulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Titulo.setText("RESULTADOS FECHA 1");
        getContentPane().add(Titulo);
        Titulo.setBounds(560, 10, 240, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 40, 450, 440);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoOctavos.jpg"))); // NOI18N
        getContentPane().add(LabelFondo);
        LabelFondo.setBounds(0, 0, 920, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvanzarFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarFecha2ActionPerformed
    VentanaFecha2Manual fecha2 =new VentanaFecha2Manual();
    fecha2.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnAvanzarFecha2ActionPerformed

    private void btnSimularFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularFecha1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       VentanaManual regresar = new VentanaManual();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFecha1Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFecha1Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFecha1Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFecha1Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFecha1Manual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAvanzarFecha2;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSimularFecha1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> jlGrupo1;
    private javax.swing.JList<String> jlGrupo3;
    private javax.swing.JList<String> jlGrupo4;
    private javax.swing.JList<String> jlGrupo5;
    private javax.swing.JList<String> jlGrupo6;
    private javax.swing.JList<String> jlGrupo7;
    private javax.swing.JList<String> jlGrupo8;
    private javax.swing.JList<String> jlGrupo9;
    // End of variables declaration//GEN-END:variables
}
