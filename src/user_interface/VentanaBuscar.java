package user_interface;

import controllers.ManejadorVentanaBuscar;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.JTextComponent;

/**
 *
 * Clase que se encarga de mostrarle al usuario la interfaz para buscar palabras
 * dentro de la aplicación
 *
 * @author Manu
 */
public class VentanaBuscar extends javax.swing.JFrame {

    private JTextPane areaTexto;
    private ManejadorVentanaBuscar manejador;

    /**
     * Contructor para crear un nuevo frame para buscar
     *
     * @param areaTexto El componente de texto sobre el cual se buscará la
     * palabra.
     */
    public VentanaBuscar(JTextPane areaTexto) {
        this.areaTexto = areaTexto;
        initComponents();
        setVisible(true);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.manejador = new ManejadorVentanaBuscar(this);
        manejador.activarBotones();
        this.getContentPane().setBackground(new Color(50, 50, 50));
        this.setIconImage(new ImageIcon(getClass().getResource("/images/filtro.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBuscar = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelBusqueda = new javax.swing.JLabel();
        botonAnterior = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar");

        textBuscar.setBackground(new java.awt.Color(40, 40, 40));
        textBuscar.setForeground(new java.awt.Color(255, 255, 255));
        textBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        textBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBuscarKeyReleased(evt);
            }
        });

        botonSiguiente.setBackground(new java.awt.Color(9, 124, 233));
        botonSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setText("Buscar siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(9, 124, 233));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        labelBusqueda.setForeground(new java.awt.Color(255, 255, 255));

        botonAnterior.setBackground(new java.awt.Color(9, 124, 233));
        botonAnterior.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonAnterior.setForeground(new java.awt.Color(255, 255, 255));
        botonAnterior.setText("Buscar anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(50, 50, 50));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Sensible a mayúsculas");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(botonSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelBusqueda))
                            .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(labelBusqueda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnterior)
                    .addComponent(botonSiguiente)
                    .addComponent(botonSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        manejador.buscarPalabra(false);
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }// GEN-LAST:event_botonSalirActionPerformed

    private void textBuscarKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_textBuscarKeyReleased
        manejador.activarBotones();
    }// GEN-LAST:event_textBuscarKeyReleased

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed
        manejador.buscarPalabra(true);
    }// GEN-LAST:event_botonSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables

    public JTextComponent getAreaTexto() {
        return areaTexto;
    }

    public JTextField getTextBuscar() {
        return textBuscar;
    }

    public JLabel getLabelBusqueda() {
        return labelBusqueda;
    }

    public JButton getBotonSiguiente() {
        return botonSiguiente;
    }

    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public JButton getBotonAnterior() {
        return botonAnterior;
    }
}
