/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package duoc.cl.hoytsmarkplanet.Views;
import duoc.cl.hoytsmarkplanet.DAO.PeliculaDAO;

import duoc.cl.hoytsmarkplanet.DTO.PeliculaDTO;
import duoc.cl.hoytsmarkplanet.Service.PeliculaService;

/**
 *
 * @author cetecom
 */
public class AgregarPelicula extends javax.swing.JInternalFrame {

    private final PeliculaService peliculaService;

    /**
     * Creates new form AgregarPelicula
     */
    public AgregarPelicula() {
        initComponents();
        this.peliculaService = new PeliculaService();

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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDirector = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAnno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoDuracion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Pelicula");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Titulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel1, gridBagConstraints);

        campoTitulo.setPreferredSize(new java.awt.Dimension(300, 22));
        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(campoTitulo, gridBagConstraints);

        jLabel2.setText("Director:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(campoDirector, gridBagConstraints);

        jLabel3.setText("Año:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(campoAnno, gridBagConstraints);

        jLabel4.setText("Duracion(minutos):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(campoDuracion, gridBagConstraints);

        jLabel5.setText("Genero:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(campoGenero, gridBagConstraints);

        botonAgregar.setText("Agregar pelicula");
        botonAgregar.setPreferredSize(new java.awt.Dimension(116, 25));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(botonAgregar, gridBagConstraints);

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(botonLimpiar, gridBagConstraints);

        getContentPane().add(jPanel3, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        String tit = campoTitulo.getText();
        String dire = campoDirector.getText();
        int anno = Integer.valueOf(campoAnno.getText());
        int dura = Integer.valueOf(campoDuracion.getText());
        String genero = campoGenero.getText();
        PeliculaDTO mov = new PeliculaDTO(tit, dire, anno, dura, genero);
        peliculaService.agregarPelicula(mov);

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        campoAnno.setText("");
        campoDirector.setText("");
        campoDuracion.setText("");
        campoGenero.setText("");
        campoTitulo.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField campoAnno;
    private javax.swing.JTextField campoDirector;
    private javax.swing.JTextField campoDuracion;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}