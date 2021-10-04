package user_interface.reports;

import controllers.ManejadorVentanaReportes;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import models.token.TipoToken;
import models.token.Token;

/**
 *
 * @author Manu
 */
public class VentanaReportes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaReporteTokens
     */
    private List<Token> tokens;
    private ManejadorVentanaReportes manejador;
    private TipoReporte tipoReporte;

    public VentanaReportes(List<Token> tokens, TipoReporte tipoReporte) {
        initComponents();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        this.tokens = tokens;
        this.tipoReporte = tipoReporte;
        this.manejador = new ManejadorVentanaReportes(this);
        manejador.setTituloLabel();
        manejador.actualizarTabla();
        this.getContentPane().setBackground(new Color(40,40,40));
        jScrollPane1.getViewport().setBackground(new Color(40,40,40));

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

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReports = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Reporte de Tokens");
        getContentPane().add(labelTitulo, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 109, 148)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaReports.setBackground(new java.awt.Color(40, 40, 40));
        tablaReports.setForeground(new java.awt.Color(255, 255, 255));
        tablaReports.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tablaReports);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));

        botonSalir.setBackground(new java.awt.Color(9, 124, 233));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Regresar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaReports;
    // End of variables declaration//GEN-END:variables

    public List<Token> getTokens() {
        return tokens;
    }

    public JTable getTablaReports() {
        return tablaReports;
    }

    public TipoReporte getTipoReporte() {
        return tipoReporte;
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

}
