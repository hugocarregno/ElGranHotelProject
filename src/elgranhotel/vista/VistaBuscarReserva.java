package elgranhotel.vista;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class VistaBuscarReserva extends javax.swing.JInternalFrame {
    private TipoHabitacionData tipoHabitacionData;
    private List<TipoHabitacion> listaTiposHabitacion;
    private Conexion conexion;
    private HuespedData huespedData;
    private ArrayList<Huesped> listaHuespedes;
    private ReservaData reservaData;
    private Reserva reserva;
    
    
    
    
    /**
     * Creates new form VisaReserva
     */
    public VistaBuscarReserva() {
        initComponents();
        
          try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
            tipoHabitacionData = new TipoHabitacionData(conexion);
            huespedData= new HuespedData(conexion);
            
            
            listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();
                       
               
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFMontoReserva = new javax.swing.JTextField();
        jTHuespedReserva = new javax.swing.JTextField();
        jBLimpiarReserva = new javax.swing.JButton();
        jBBuscarHuespedReserva = new javax.swing.JButton();
        jXDPFinReserva = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jXDPInicioReserva = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jTFDiasReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBBorrarReserva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFEstadoReserva = new javax.swing.JTextField();
        jBBuscarXFechaReserva = new javax.swing.JButton();
        jTFCantPersonasReserva = new javax.swing.JTextField();
        jTFEstadoReserva1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBActualizarReserva1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel10.setText("Dias");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR RESERVA");

        jLabel11.setText("Monto Total");

        jLabel2.setText("Huesped");

        jBLimpiarReserva.setText("Limpiar");

        jBBuscarHuespedReserva.setText("Buscar");
        jBBuscarHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Inicio");

        jXDPInicioReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDPInicioReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Fin");

        jLabel5.setText("Cantidad de Personas");

        jBBorrarReserva.setText("Borrar");

        jLabel7.setText("Estado");

        jBBuscarXFechaReserva.setText("Buscar");
        jBBuscarXFechaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarXFechaReservaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo De Habitacion");

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
        jScrollPane1.setViewportView(jTable1);

        jBActualizarReserva1.setText("Actualizar");
        jBActualizarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarReserva1ActionPerformed(evt);
            }
        });

        jButton1.setText("Fin Reserva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscarHuespedReserva))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscarXFechaReserva))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEstadoReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel11)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBActualizarReserva1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBorrarReserva)
                                        .addGap(26, 26, 26)
                                        .addComponent(jBLimpiarReserva)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFEstadoReserva))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarHuespedReserva))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jBBuscarXFechaReserva)
                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFEstadoReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBorrarReserva)
                            .addComponent(jBActualizarReserva1)
                            .addComponent(jBLimpiarReserva)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedReservaActionPerformed

        // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped

        long dni=Long.parseLong(jTHuespedReserva.getText());

        Huesped huesped= (Huesped)huespedData.mostrarHuesped(dni);

        if(huesped==null){
            DialogoReservaHuesped dialogo= new DialogoReservaHuesped(new javax.swing.JFrame(), true);

            // guarda el dni en una variable en el jdialog para usar en huesped
            dialogo.setDniHuesped(dni);
            dialogo.setVisible(true);

        } else{

            jTHuespedReserva.setText(huesped.getDniHuesped()+" - "+huesped.getNombreHuesped());

        }

    }//GEN-LAST:event_jBBuscarHuespedReservaActionPerformed

    private void jXDPInicioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPInicioReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDPInicioReservaActionPerformed

    private void jBBuscarXFechaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarXFechaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarXFechaReservaActionPerformed

    private void jBActualizarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarReserva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActualizarReserva1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarReserva1;
    private javax.swing.JButton jBBorrarReserva;
    private javax.swing.JButton jBBuscarHuespedReserva;
    private javax.swing.JButton jBBuscarXFechaReserva;
    private javax.swing.JButton jBLimpiarReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantPersonasReserva;
    private javax.swing.JTextField jTFDiasReserva;
    private javax.swing.JTextField jTFEstadoReserva;
    private javax.swing.JTextField jTFEstadoReserva1;
    private javax.swing.JTextField jTFMontoReserva;
    public javax.swing.JTextField jTHuespedReserva;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDPFinReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPInicioReserva;
    // End of variables declaration//GEN-END:variables
}
