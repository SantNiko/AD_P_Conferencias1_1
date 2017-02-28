/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoaad;

/**
 *
 * @author AnxoPregal
 */
public class Autor extends javax.swing.JFrame {

    /**
     * Creates new form Conferencias
     */
    public Autor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgTamano = new javax.swing.ButtonGroup();
        jpCabecera = new javax.swing.JPanel();
        lblConferencia = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jpDatosConfNueva = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblArticulos = new javax.swing.JLabel();
        jsId = new javax.swing.JScrollPane();
        jeDni = new javax.swing.JEditorPane();
        jsNombre = new javax.swing.JScrollPane();
        jeNombre = new javax.swing.JEditorPane();
        jsEmail = new javax.swing.JScrollPane();
        jeEmail = new javax.swing.JEditorPane();
        jslAutores = new javax.swing.JScrollPane();
        jlArticulos = new javax.swing.JList<>();
        jpBotonesAutores = new javax.swing.JPanel();
        btnAnadirSesion = new javax.swing.JButton();
        btnBorrarSesion = new javax.swing.JButton();
        btnInfoSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpCabecera.setBackground(new java.awt.Color(255, 204, 153));
        jpCabecera.setLayout(new java.awt.GridBagLayout());

        lblConferencia.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblConferencia.setText("Autor ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jpCabecera.add(lblConferencia, gridBagConstraints);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/guardar25.png"))); // NOI18N
        Guardar.setMaximumSize(new java.awt.Dimension(25, 25));
        Guardar.setMinimumSize(new java.awt.Dimension(25, 25));
        Guardar.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jpCabecera.add(Guardar, gridBagConstraints);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/atras25.png"))); // NOI18N
        btnAtras.setMaximumSize(new java.awt.Dimension(25, 25));
        btnAtras.setMinimumSize(new java.awt.Dimension(25, 25));
        btnAtras.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jpCabecera.add(btnAtras, gridBagConstraints);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/edit25.png"))); // NOI18N
        btnEditar.setMaximumSize(new java.awt.Dimension(25, 25));
        btnEditar.setMinimumSize(new java.awt.Dimension(25, 25));
        btnEditar.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jpCabecera.add(btnEditar, gridBagConstraints);

        getContentPane().add(jpCabecera, java.awt.BorderLayout.PAGE_START);

        jpDatosConfNueva.setBackground(new java.awt.Color(204, 255, 153));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        jpDatosConfNueva.setLayout(jPanel1Layout);

        lblDni.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        jpDatosConfNueva.add(lblDni, gridBagConstraints);

        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 0, 0);
        jpDatosConfNueva.add(lblNombre, gridBagConstraints);

        lblEmail.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 0, 0);
        jpDatosConfNueva.add(lblEmail, gridBagConstraints);

        lblArticulos.setText("Artículos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        jpDatosConfNueva.add(lblArticulos, gridBagConstraints);

        jsId.setViewportView(jeDni);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 15);
        jpDatosConfNueva.add(jsId, gridBagConstraints);

        jsNombre.setViewportView(jeNombre);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 15);
        jpDatosConfNueva.add(jsNombre, gridBagConstraints);

        jsEmail.setViewportView(jeEmail);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 15, 15);
        jpDatosConfNueva.add(jsEmail, gridBagConstraints);

        jslAutores.setPreferredSize(new java.awt.Dimension(150, 130));

        jlArticulos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jslAutores.setViewportView(jlArticulos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 15, 0);
        jpDatosConfNueva.add(jslAutores, gridBagConstraints);

        jpBotonesAutores.setBackground(new java.awt.Color(255, 0, 153));
        jpBotonesAutores.setOpaque(false);
        jpBotonesAutores.setLayout(new java.awt.GridBagLayout());

        btnAnadirSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/mas25.png"))); // NOI18N
        btnAnadirSesion.setMaximumSize(new java.awt.Dimension(25, 25));
        btnAnadirSesion.setMinimumSize(new java.awt.Dimension(25, 25));
        btnAnadirSesion.setOpaque(false);
        btnAnadirSesion.setPreferredSize(new java.awt.Dimension(25, 25));
        btnAnadirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jpBotonesAutores.add(btnAnadirSesion, gridBagConstraints);

        btnBorrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/x25.png"))); // NOI18N
        btnBorrarSesion.setMaximumSize(new java.awt.Dimension(25, 25));
        btnBorrarSesion.setMinimumSize(new java.awt.Dimension(25, 25));
        btnBorrarSesion.setOpaque(false);
        btnBorrarSesion.setPreferredSize(new java.awt.Dimension(25, 25));
        btnBorrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jpBotonesAutores.add(btnBorrarSesion, gridBagConstraints);

        btnInfoSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/i25.png"))); // NOI18N
        btnInfoSesion.setMaximumSize(new java.awt.Dimension(25, 25));
        btnInfoSesion.setMinimumSize(new java.awt.Dimension(25, 25));
        btnInfoSesion.setOpaque(false);
        btnInfoSesion.setPreferredSize(new java.awt.Dimension(25, 25));
        btnInfoSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jpBotonesAutores.add(btnInfoSesion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 10);
        jpDatosConfNueva.add(jpBotonesAutores, gridBagConstraints);

        getContentPane().add(jpDatosConfNueva, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoSesionActionPerformed

    private void btnBorrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarSesionActionPerformed

    private void btnAnadirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnadirSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.ButtonGroup bgTamano;
    private javax.swing.JButton btnAnadirSesion;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrarSesion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInfoSesion;
    private javax.swing.JEditorPane jeDni;
    private javax.swing.JEditorPane jeEmail;
    private javax.swing.JEditorPane jeNombre;
    private javax.swing.JList<String> jlArticulos;
    private javax.swing.JPanel jpBotonesAutores;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpDatosConfNueva;
    private javax.swing.JScrollPane jsEmail;
    private javax.swing.JScrollPane jsId;
    private javax.swing.JScrollPane jsNombre;
    private javax.swing.JScrollPane jslAutores;
    private javax.swing.JLabel lblArticulos;
    private javax.swing.JLabel lblConferencia;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
