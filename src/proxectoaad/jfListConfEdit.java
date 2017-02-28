/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoaad;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author AnxoPregal
 */
public class jfListConfEdit extends javax.swing.JFrame {

    /**
     * Creates new form jfListConf
     */
    public jfListConfEdit() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ListCellRenderer a;
        
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

        jLabel3 = new javax.swing.JLabel();
        jpGestionFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListConfe = new javax.swing.JList<>();
        jpInfo = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        lblNSesiones = new javax.swing.JLabel();
        lblNParticipantes = new javax.swing.JLabel();
        lblHoraFin = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblListado = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jpCabecera = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jpBotones = new javax.swing.JPanel();
        btnAnadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de conferencias");
        setMinimumSize(new java.awt.Dimension(800, 550));

        jpGestionFondo.setBackground(new java.awt.Color(204, 255, 153));
        jpGestionFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpGestionFondo.setToolTipText("");
        jpGestionFondo.setMinimumSize(new java.awt.Dimension(300, 300));
        jpGestionFondo.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBorder(null);

        jListConfe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jListConfe.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListConfe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListConfe.setToolTipText("");
        jListConfe.setAlignmentX(10.5F);
        jListConfe.setAlignmentY(10.5F);
        jListConfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListConfeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListConfe);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 50, 30);
        jpGestionFondo.add(jScrollPane1, gridBagConstraints);

        jpInfo.setBackground(new java.awt.Color(255, 255, 255));
        jpInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpInfo.setPreferredSize(new java.awt.Dimension(100, 100));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jpInfo.setLayout(jPanel2Layout);

        lbl1.setText("Fecha conferencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl1, gridBagConstraints);

        lbl2.setText("Hora inicio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl2, gridBagConstraints);

        lbl3.setText("Nº de sesiones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl3, gridBagConstraints);

        lbl4.setText("Nº de participantes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl4, gridBagConstraints);

        lbl5.setText("Hora de fin estipulada:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl5, gridBagConstraints);

        lbl6.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl6, gridBagConstraints);

        lbl7.setText("Descripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jpInfo.add(lbl7, gridBagConstraints);

        lblFecha.setText(" ");
        lblFecha.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblFecha, gridBagConstraints);

        lblHoraInicio.setText(" ");
        lblHoraInicio.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblHoraInicio, gridBagConstraints);

        lblNSesiones.setText(" ");
        lblNSesiones.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblNSesiones, gridBagConstraints);

        lblNParticipantes.setText(" ");
        lblNParticipantes.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblNParticipantes, gridBagConstraints);

        lblHoraFin.setText(" ");
        lblHoraFin.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblHoraFin, gridBagConstraints);

        lblPrecio.setText(" ");
        lblPrecio.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jpInfo.add(lblPrecio, gridBagConstraints);

        lblDescripcion.setText(" ");
        lblDescripcion.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpInfo.add(lblDescripcion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 50, 100);
        jpGestionFondo.add(jpInfo, gridBagConstraints);

        lblListado.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblListado.setText("Listado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 100, 0, 50);
        jpGestionFondo.add(lblListado, gridBagConstraints);

        lblInfo.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblInfo.setText("Información");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 0, 100);
        jpGestionFondo.add(lblInfo, gridBagConstraints);

        jpCabecera.setBackground(new java.awt.Color(255, 204, 153));
        jpCabecera.setLayout(new java.awt.GridBagLayout());

        lblTitulo.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lblTitulo.setText("GESTIÓN DE CONFERENCIAS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(22, 60, 20, 55);
        jpCabecera.add(lblTitulo, gridBagConstraints);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/atras40.png"))); // NOI18N
        btnAtras.setMaximumSize(new java.awt.Dimension(40, 40));
        btnAtras.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAtras.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jpCabecera.add(btnAtras, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 80;
        jpGestionFondo.add(jpCabecera, gridBagConstraints);

        jpBotones.setBackground(new java.awt.Color(255, 0, 153));
        jpBotones.setOpaque(false);
        jpBotones.setPreferredSize(new java.awt.Dimension(40, 160));
        jpBotones.setLayout(new java.awt.GridBagLayout());

        btnAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/mas40.png"))); // NOI18N
        btnAnadir.setMaximumSize(new java.awt.Dimension(40, 40));
        btnAnadir.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAnadir.setOpaque(false);
        btnAnadir.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jpBotones.add(btnAnadir, gridBagConstraints);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/edit40.png"))); // NOI18N
        btnEditar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnEditar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnEditar.setOpaque(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jpBotones.add(btnEditar, gridBagConstraints);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxectoaad/images/x40.png"))); // NOI18N
        btnBorrar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBorrar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBorrar.setOpaque(false);
        btnBorrar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpBotones.add(btnBorrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        jpGestionFondo.add(jpBotones, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGestionFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGestionFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jListConfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListConfeMouseClicked
        // TODO add your handling code here:
        System.out.println(this.jListConfe.getSelectedValue());
    }//GEN-LAST:event_jListConfeMouseClicked

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
            java.util.logging.Logger.getLogger(jfListConfEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfListConfEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfListConfEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfListConfEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfListConfEdit().setVisible(true);
            }
        });
    }

    public JButton getBtnAnadir() {
        return btnAnadir;
    }

    public void setBtnAnadir(JButton btnAnadir) {
        this.btnAnadir = btnAnadir;
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public void setBtnAtras(JButton btnAtras) {
        this.btnAtras = btnAtras;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JList<String> getjListConfe() {
        return jListConfe;
    }

    public void setjListConfe(JList<String> jListConfe) {
        this.jListConfe = jListConfe;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getJpBotones() {
        return jpBotones;
    }

    public void setJpBotones(JPanel jpBotones) {
        this.jpBotones = jpBotones;
    }

    public JPanel getJpCabecera() {
        return jpCabecera;
    }

    public void setJpCabecera(JPanel jpCabecera) {
        this.jpCabecera = jpCabecera;
    }

    public JPanel getJpGestionFondo() {
        return jpGestionFondo;
    }

    public void setJpGestionFondo(JPanel jpGestionFondo) {
        this.jpGestionFondo = jpGestionFondo;
    }

    public JPanel getJpInfo() {
        return jpInfo;
    }

    public void setJpInfo(JPanel jpInfo) {
        this.jpInfo = jpInfo;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public void setLbl4(JLabel lbl4) {
        this.lbl4 = lbl4;
    }

    public JLabel getLbl5() {
        return lbl5;
    }

    public void setLbl5(JLabel lbl5) {
        this.lbl5 = lbl5;
    }

    public JLabel getLbl6() {
        return lbl6;
    }

    public void setLbl6(JLabel lbl6) {
        this.lbl6 = lbl6;
    }

    public JLabel getLbl7() {
        return lbl7;
    }

    public void setLbl7(JLabel lbl7) {
        this.lbl7 = lbl7;
    }

    public JLabel getLblDescripcion() {
        return lblDescripcion;
    }

    public void setLblDescripcion(JLabel lblDescripcion) {
        this.lblDescripcion = lblDescripcion;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JLabel getLblHoraFin() {
        return lblHoraFin;
    }

    public void setLblHoraFin(JLabel lblHoraFin) {
        this.lblHoraFin = lblHoraFin;
    }

    public JLabel getLblHoraInicio() {
        return lblHoraInicio;
    }

    public void setLblHoraInicio(JLabel lblHoraInicio) {
        this.lblHoraInicio = lblHoraInicio;
    }

    public JLabel getLblInfo() {
        return lblInfo;
    }

    public void setLblInfo(JLabel lblInfo) {
        this.lblInfo = lblInfo;
    }

    public JLabel getLblListado() {
        return lblListado;
    }

    public void setLblListado(JLabel lblListado) {
        this.lblListado = lblListado;
    }

    public JLabel getLblNParticipantes() {
        return lblNParticipantes;
    }

    public void setLblNParticipantes(JLabel lblNParticipantes) {
        this.lblNParticipantes = lblNParticipantes;
    }

    public JLabel getLblNSesiones() {
        return lblNSesiones;
    }

    public void setLblNSesiones(JLabel lblNSesiones) {
        this.lblNSesiones = lblNSesiones;
    }

    public JLabel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JLabel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListConfe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpGestionFondo;
    private javax.swing.JPanel jpInfo;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHoraFin;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblListado;
    private javax.swing.JLabel lblNParticipantes;
    private javax.swing.JLabel lblNSesiones;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
