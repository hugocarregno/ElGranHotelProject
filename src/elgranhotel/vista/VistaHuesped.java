/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo
 */
public class VistaHuesped extends javax.swing.JInternalFrame {
    private HuespedData huespedData;
    private Huesped Vhuesped;
    private Conexion conexion;
    private List<Huesped> listaHuesped;
    //private ArrayList<Huesped> listaHuespedes;

    /**
     * Creates new form VistaHuesped
     */
    public VistaHuesped() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        huespedData= new HuespedData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
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

        jetiquetaHusped = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jBtGuardar = new javax.swing.JButton();
        jBtModificar = new javax.swing.JButton();
        jBtBorrar = new javax.swing.JButton();
        jBtBuscarDniHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHuesped = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(800, 577));

        jetiquetaHusped.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jetiquetaHusped.setText("                                        Huesped");
        jetiquetaHusped.setToolTipText("");

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Domicilio");

        jLabel4.setText("Correo");

        jLabel5.setText("Celular");

        jtNombre.setToolTipText("");

        jBtGuardar.setText("Guardar");
        jBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardarActionPerformed(evt);
            }
        });

        jBtModificar.setText("Modificar");
        jBtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtModificarActionPerformed(evt);
            }
        });

        jBtBorrar.setText("Borrar");
        jBtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBorrarActionPerformed(evt);
            }
        });

        jBtBuscarDniHuesped.setText("Buscar");
        jBtBuscarDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBuscarDniHuespedActionPerformed(evt);
            }
        });

        jTableHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dni", "Nombre", "Domicilio", "Correo", "Celular"
            }
        ));
        jScrollPane1.setViewportView(jTableHuesped);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jetiquetaHusped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jBtGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtBuscarDniHuesped))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jetiquetaHusped, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtBuscarDniHuesped))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtGuardar)
                    .addComponent(jBtModificar)
                    .addComponent(jBtBorrar)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        long dni= Long.parseLong(jtfDni.getText());
        String nombre=jtNombre.getText();
        String domicilio=jtDomicilio.getText();
        String correo=jtCorreo.getText();
        String celular=jtCelular.getText();
       
        Huesped huesped=new Huesped(dni,nombre,domicilio,correo,celular);
        huespedData.crearHuesped(huesped);
        
        
    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void jBtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtModificarActionPerformed
         if (jtfDni.getText()!=null){
            long dni=Long.parseLong(jtfDni.getText()); 
            String nombre=jtNombre.getText();
            String domicilio=jtDomicilio.getText();
            String correo=jtCorreo.getText();
            String celular=jtCelular.getText();
          
             Huesped huesped=new Huesped(dni,nombre,domicilio,correo,celular);
             huespedData.modificarHuesped(huesped);
    }//GEN-LAST:event_jBtModificarActionPerformed
    }
    private void jBtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBorrarActionPerformed
        long dni=Long.parseLong(jtfDni.getText());
        huespedData.eliminarHuesped(dni);
    }//GEN-LAST:event_jBtBorrarActionPerformed

    private void jBtBuscarDniHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarDniHuespedActionPerformed
        //almaceno dni
        //me conecto en un try
        //hago la consulta
        //devuelvo la busqueda en la tabla
        
         long dniHuesped;
        dniHuesped = Long.parseLong(jtfDni.getText());
        //mostrarConsulta();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        
        huespedData= new HuespedData(conexion);
        Vhuesped = huespedData.mostrarHuesped(dniHuesped);
        //1 es la fila y 5 son las columnas
        String filaBusquedaDni[][]=new String[1][5];
        
        filaBusquedaDni[0][0] =String.valueOf(Vhuesped.getDniHuesped());
        filaBusquedaDni[0][1] =String.valueOf(Vhuesped.getNombreHuesped());
        filaBusquedaDni[0][2] =String.valueOf(Vhuesped.getDomicilioHuesped());
        filaBusquedaDni[0][3] =String.valueOf(Vhuesped.getCorreoHuesped());
        filaBusquedaDni[0][4] =String.valueOf(Vhuesped.getCelularHuesped());
        
        jtfDni.setText("");
       /* 
        //listaHuespedes = (ArrayList<Huesped>)huespedData.obtenerHuespedes();
        
        String fila[][]= new String [listaHuespedes.size()][5];
        int i;
        for (i=0; i<listaHuespedes.size(); i++){
       
         fila[i][0] = String.valueOf(listaHuespedes.get(i).getDniHuesped());
         fila[i][1] = String.valueOf(listaHuespedes.get(i).getNombreHuesped());
         fila[i][2] = String.valueOf(listaHuespedes.get(i).getDomicilioHuesped());
         fila[i][3] = String.valueOf(listaHuespedes.get(i).getCorreoHuesped());
         fila[i][4] = String.valueOf(listaHuespedes.get(i).getCelularHuesped());
        }
// for (Reserva h: listaReserva){  
       //           System.out.println((Arrays.toString(new Object[]{h.getIdReserva(),h.getFechaInicioReserva(),h.getFechaFinReserva(),h.getEstadoReserva(),h.getHuesped().getDniHuesped(),h.getHabitacion().getNumeroHabitacion()})));

       // } */
      jTableHuesped.setModel(new javax.swing.table.DefaultTableModel(
           filaBusquedaDni,
            new String [] {
               "DNI Huesped", "nombre", "domicilio" , "Correo", "celular"
            }
        ));     
  } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
   }
        
    }//GEN-LAST:event_jBtBuscarDniHuespedActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtBorrar;
    private javax.swing.JButton jBtBuscarDniHuesped;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHuesped;
    private javax.swing.JLabel jetiquetaHusped;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtfDni;
    // End of variables declaration//GEN-END:variables
}
