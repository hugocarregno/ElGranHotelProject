/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import static elgranhotel.vista.Principal.escritorio;
import java.text.SimpleDateFormat;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.JXDatePicker;



/**
 *
 * @author Lucas
 */
public class VistaReserva extends javax.swing.JInternalFrame {
    
    private TipoHabitacion tipoHabitacion;
    private TipoHabitacionData tipoHabitacionData;
    private List<TipoHabitacion> listaTiposHabitacion;
    private List<Habitacion> listaHabitaciones;
    private Conexion conexion;
    private HuespedData huespedData;
    private HuespedData huespedData1;
    private ArrayList<Huesped> listaHuespedes;
    private Reserva reserva;
    private ReservaData reservaData;
    private DefaultTableModel modeloReserva;
    private Habitacion habitacion;
    private HabitacionData habitacionData;
    private List<Reserva> listaReservas;
    
   
    
    
    
    
    /**
     * Creates new form VisaReserva
     */
    public VistaReserva() {
        initComponents();
        
          try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
             modeloReserva=new DefaultTableModel();
            
            tipoHabitacionData = new TipoHabitacionData(conexion);
            huespedData= new HuespedData(conexion);
            
            
            listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();
                       
            //Método encargado de llenar el combobox
           cargarTiposHabitacionEnComboBox();
          
           armaCabeceraTabla();
            
           
         
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaReserva.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDHuespedReserva = new javax.swing.JDialog();
        jBCancelarPopUpHuespedReserva = new javax.swing.JButton();
        jBCargarPopUpHuespedReserva = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTHuespedReserva = new javax.swing.JTextField();
        jBBuscarHuespedReserva = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDiasReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBTipoHabitacionReserva = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jBConfitmarReserva = new javax.swing.JButton();
        jBBuscarHabitacionesReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHabitacionesReserva = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTFCantPersonasReserva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFMontoReserva = new javax.swing.JTextField();
        jBLimpiarReserva = new javax.swing.JButton();
        jBBuscarTipoHabitacion = new javax.swing.JButton();
        jXDPInicioReserva = new org.jdesktop.swingx.JXDatePicker();
        jXDPFinReserva = new org.jdesktop.swingx.JXDatePicker();

        jBCancelarPopUpHuespedReserva.setText("CANCELAR");
        jBCancelarPopUpHuespedReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBCargarPopUpHuespedReserva.setText("CARGAR");
        jBCargarPopUpHuespedReserva.setToolTipText("");
        jBCargarPopUpHuespedReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCargarPopUpHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarPopUpHuespedReservaActionPerformed(evt);
            }
        });

        jLabel8.setText("<html>No se encuentra el huesped buscado. <br>¿Desea cargarlo?</html>");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setText("ERROR AL BUSCAR HUESPED");

        javax.swing.GroupLayout jDHuespedReservaLayout = new javax.swing.GroupLayout(jDHuespedReserva.getContentPane());
        jDHuespedReserva.getContentPane().setLayout(jDHuespedReservaLayout);
        jDHuespedReservaLayout.setHorizontalGroup(
            jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                .addGroup(jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBCargarPopUpHuespedReserva)
                        .addGap(39, 39, 39)
                        .addComponent(jBCancelarPopUpHuespedReserva))
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12))
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jDHuespedReservaLayout.setVerticalGroup(
            jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDHuespedReservaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCargarPopUpHuespedReserva)
                    .addComponent(jBCancelarPopUpHuespedReserva))
                .addGap(16, 16, 16))
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Reservas - El Gran Hotel 1.0");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("HACER RESERVA");

        jLabel2.setText("Huesped");

        jBBuscarHuespedReserva.setText("BUSCAR");
        jBBuscarHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Fin");

        jTFDiasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasReservaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad de Personas");

        jCBTipoHabitacionReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionReservaActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Habitacion");

        jBConfitmarReserva.setText("Confirmar");
        jBConfitmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfitmarReservaActionPerformed(evt);
            }
        });

        jBBuscarHabitacionesReserva.setText("Habitaciones Disponibles");
        jBBuscarHabitacionesReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHabitacionesReservaActionPerformed(evt);
            }
        });

        jTHabitacionesReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTHabitacionesReserva);

        jLabel9.setText("Habitaciones disponibles");

        jTFCantPersonasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCantPersonasReservaActionPerformed(evt);
            }
        });

        jLabel10.setText("Dias");

        jLabel11.setText("Monto Total");

        jBLimpiarReserva.setText("Limpiar");
        jBLimpiarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarReservaActionPerformed(evt);
            }
        });

        jBBuscarTipoHabitacion.setText("Buscar");
        jBBuscarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTipoHabitacionActionPerformed(evt);
            }
        });

        jXDPFinReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDPFinReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jBConfitmarReserva)
                                .addGap(22, 22, 22)
                                .addComponent(jBLimpiarReserva))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipoHabitacionReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarTipoHabitacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)
                                .addGap(16, 16, 16)
                                .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 529, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBBuscarHuespedReserva)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBBuscarHabitacionesReserva)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarHuespedReserva))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jBBuscarTipoHabitacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTipoHabitacionReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBuscarHabitacionesReserva)
                            .addComponent(jBConfitmarReserva)
                            .addComponent(jBLimpiarReserva)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca un huesped para la reserva, si el huesped ya esta cargado desplega el dni y el nombre, recibe DNI
    private void jBBuscarHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedReservaActionPerformed
        
        // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped
        
         long dni=Long.parseLong(jTHuespedReserva.getText().substring(0, 8).trim());
          
         Huesped huesped= (Huesped)huespedData.mostrarHuesped(dni);
        
         if(huesped==null){
         DialogoReservaHuesped dialogo= new DialogoReservaHuesped(new javax.swing.JFrame(), true);
        
        // guarda el dni en una variable en el jdialog para usar en huesped 
        dialogo.setDniHuesped(dni);
        dialogo.setVisible(true);       
        dispose();
        
         } else{
             
            jTHuespedReserva.setText(huesped.getDniHuesped()+" - "+huesped.getNombreHuesped());
              
         }                         
        
    }//GEN-LAST:event_jBBuscarHuespedReservaActionPerformed
   
    //Crea una nueva reserva
    private void jBConfitmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfitmarReservaActionPerformed
    long dni= Long.parseLong(jTHuespedReserva.getText().substring(0,8).trim());
              
    /*SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    String toLocalDate= formater.format(jXDPInicioReserva.getDate());
    LocalDate fechaInicio= LocalDate.parse(toLocalDate);
    
    SimpleDateFormat formater2 = new SimpleDateFormat("yyyy-MM-dd");
    String toLocalDateFin= formater2.format(jXDPFinReserva.getDate());
    LocalDate fechaFin = LocalDate.parse(toLocalDateFin);
     */
    
    LocalDate fechaInicio= fromPickerToLocalDate(jXDPInicioReserva);
    LocalDate fechaFin = fromPickerToLocalDate(jXDPFinReserva);
    int filaSeleccionada= jTHabitacionesReserva.getSelectedRow();
        
        if(filaSeleccionada!=-1){
          
            int numeroHabitacion= (Integer)modeloReserva.getValueAt(filaSeleccionada,0);
           
            //HABITACION seleccionada por la lista, filtrada del data por el numeroHabitacion
           Habitacion h= habitacionData.buscarHabitacion(numeroHabitacion,conexion);
           
               //HUESPED
           Huesped huesped= huespedData.mostrarHuesped(dni);
                //carga la reserva con los datos
                //el estado es por defecto true
                 LocalDate fechaDeHoy = LocalDate.now();
               
            reserva= new Reserva(fechaInicio, fechaFin, true, huesped, h);
                 if(fechaDeHoy.isBefore(fechaInicio)){
                        h.setEstadoHabitacion(false);
                 }else{
                        h.setEstadoHabitacion(true);
                 }
                 
            reservaData.hacerReserva(reserva);
  
            habitacionData.actualizarHabitacion(h);
            reservaData.finReserva(huesped);
            JOptionPane.showMessageDialog(escritorio, "La reserva se guardo correctamente");
        }
          
    }//GEN-LAST:event_jBConfitmarReservaActionPerformed

    
    private void jBCargarPopUpHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarPopUpHuespedReservaActionPerformed

        VistaHuesped vh=new VistaHuesped();
        Principal.escritorio.add(vh);
        vh.toFront();
        vh.setVisible(true);

    }//GEN-LAST:event_jBCargarPopUpHuespedReservaActionPerformed

    
    private void jBBuscarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTipoHabitacionActionPerformed
       cargarTiposHabitacionEnComboBoxXCP();
       precioReserva();
    }//GEN-LAST:event_jBBuscarTipoHabitacionActionPerformed

    private void jXDPInicioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPInicioReservaActionPerformed
        cargarDias();


    }//GEN-LAST:event_jXDPInicioReservaActionPerformed

    //carga la lista de habitaciones segun el tipo
    private void jBBuscarHabitacionesReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHabitacionesReservaActionPerformed
        
            cargatablaHabitacionesSeguntipo();
    



        
        
    }//GEN-LAST:event_jBBuscarHabitacionesReservaActionPerformed

    private void jTFDiasReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasReservaActionPerformed
       
        
    }//GEN-LAST:event_jTFDiasReservaActionPerformed

    private void jXDPFinReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPFinReservaActionPerformed
        cargarDias();       
    }//GEN-LAST:event_jXDPFinReservaActionPerformed

    private void jCBTipoHabitacionReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionReservaActionPerformed
      
    }//GEN-LAST:event_jCBTipoHabitacionReservaActionPerformed

    private void jTFCantPersonasReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCantPersonasReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCantPersonasReservaActionPerformed

    private void jBLimpiarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarReservaActionPerformed
        limpiarComboBox();
        cargarTiposHabitacionEnComboBox();
        armaCabeceraTabla();
        jTHuespedReserva.setText("");
     
        jTFDiasReserva.setText("");
        jTFCantPersonasReserva.setText("");
        jTFMontoReserva.setText("");
        
        
    }//GEN-LAST:event_jBLimpiarReservaActionPerformed


    //metodos combobox
    public void cargarTiposHabitacionEnComboBox(){
    //Carga los tipos de habitacion  al ComboBox
    if(jCBTipoHabitacionReserva.getItemCount()==0){
     for(TipoHabitacion item: tipoHabitacionData.mostrarTipoHabitacion()){
            jCBTipoHabitacionReserva.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
    
    public void cargarTiposHabitacionEnComboBoxXCP(){
    //Carga los tipos de habitacion  al ComboBox
                 List<TipoHabitacion> resultado= new ArrayList<>();
                  int cantPersonas= Integer.parseInt(0+jTFCantPersonasReserva.getText());
        
    //creo una lista de los tipos que tienen la cantidad de personas que me piden     
        
        for(TipoHabitacion tipo:tipoHabitacionData.mostrarTipoHabitacion()){
           if(tipo.getCantPersonasTipoHabitacion()==(cantPersonas)){
            resultado.add(tipo);
            }
         }  
       
    //Limpiar comboBox
    limpiarComboBox();
      
      
    //le paso al combo box solo los tipos que correspondan
    if(jCBTipoHabitacionReserva.getItemCount()==0){
     for(TipoHabitacion item: resultado){
            jCBTipoHabitacionReserva.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
   
    public void limpiarComboBox(){
        
        jCBTipoHabitacionReserva.removeAllItems();
       
     }
    
    //metodos tabla
    public void cargatablaHabitacionesSeguntipo(){
        
    borraFilasTabla();
        
    LocalDate fechaInicioHR= fromPickerToLocalDate(jXDPInicioReserva);
        
    LocalDate fechaFinHR = fromPickerToLocalDate(jXDPFinReserva);
       
    reservaData =new ReservaData(conexion);
     
    habitacionData= new HabitacionData(conexion);
       
    listaHabitaciones= new ArrayList<>(); 
     
   
     
    //hasta aca ok
    
    String objetCb= (String)jCBTipoHabitacionReserva.getSelectedItem();
    TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
                  
     /*for (Iterator<Habitacion> it= tlhR.iterator(); it.hasNext();){
    Habitacion h= it.next();
    if(h.getTipoHabitacion().getIdTipoHabitacion()==tpHabSelec.getIdTipoHabitacion())
        listaHabitaciones.add(h);
     }*/
    
    
    List<Habitacion> todasLasHabitaciones= habitacionData.obtenerHabitaciones(conexion);

    todasLasHabitaciones.stream().filter((h) -> (h.getTipoHabitacion().getIdTipoHabitacion()==tpHabSelec.getIdTipoHabitacion())).forEachOrdered((h) -> {

        listaHabitaciones.add(h);
    
        });
   
   List<Reserva> reservas= reservaData.obtenerReservas();
   List<Integer> numerosHABOrrar= new ArrayList<>();
    for (Reserva r:reservas){
        if(r.getFechaInicioReserva().plusDays(1).equals(fechaInicioHR)  && r.getFechaFinReserva().plusDays(1).isEqual(fechaFinHR) ||r.getFechaInicioReserva().plusDays(1).isAfter(fechaInicioHR) && r.getFechaFinReserva().plusDays(1).isBefore(fechaFinHR) ){
           int numeroH=r.getHabitacion().getNumeroHabitacion();
           numerosHABOrrar.add((Integer)numeroH);
           }
    }
    
    int remove_h = -1;
    for(int k=0;k< numerosHABOrrar.size();k++){
         for(int i=0;i<listaHabitaciones.size();i++){
            if(listaHabitaciones.get(i).getNumeroHabitacion()==(numerosHABOrrar.get(k))){
                remove_h = i;
            }
        }
        if(remove_h > -1){
            listaHabitaciones.remove(remove_h);
            remove_h = -1;
        }
    }
    for(Habitacion h:listaHabitaciones){
          
          modeloReserva.addRow(new Object[]{h.getNumeroHabitacion(), h.getPisoHabitacion(), h.getTipoHabitacion().getCategoriaTipoHabitacion(),h.getTipoHabitacion().getTipoCamaTipoHabitacion(), h.getTipoHabitacion().getCantidadCamasTipoHabitacion()});
        }
    }
    
    public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("Numero Habitacion");
        columnas.add("Piso");
        columnas.add("Tipo");
        columnas.add("Tipo Cama");
        columnas.add("Cant Camas");
        for(Object it:columnas){
        
            modeloReserva.addColumn(it);
        }
        jTHabitacionesReserva.setModel(modeloReserva);
  }
    
    public void borraFilasTabla(){

   int a =modeloReserva.getRowCount()-1;

for(int i=a;i>=0;i--){
   
modeloReserva.removeRow(i );
}
}
    
    public  TipoHabitacion searchDeStringATipoHabitacion(String selectedItemComboBox){
        //sacar el id y pasarlo a int, buscar con el id en la base de datos y sacarlo como un tipoHabitacion completo
        int idTipoHabitacion= Integer.parseInt(selectedItemComboBox.substring(0, 2).trim());
      
       TipoHabitacion tH=(tipoHabitacionData.buscarTipoHabitacion(idTipoHabitacion));
    
        return tH;
    }
          
     //cargar dias en diasreserva
     public void cargarDias(){
    LocalDate fechaInicio= fromPickerToLocalDate(jXDPInicioReserva);
    LocalDate fechaFin = fromPickerToLocalDate(jXDPFinReserva);
    if(fechaFin.isBefore(fechaInicio) || fechaInicio.isAfter(fechaFin)){
        //si fecha fin es menor a fecha inicio o si fecha inicio es mayor que fecha fin
        JOptionPane.showMessageDialog(this, "No se puede realizar la reserva, revisar fecha");
        //si llegamos con los tiempos estaria bueno que muestre un cartel con jOptionPane
    }   
    long diasReserva=fechaInicio.until(fechaFin, DAYS);
    System.out.println(diasReserva);
    jTFDiasReserva.setText(diasReserva +"");
       
     }
     
     public void precioReserva(){
        String objetCb= (String)jCBTipoHabitacionReserva.getSelectedItem();
        TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
         
         
         int dias=Integer.parseInt(jTFDiasReserva.getText());
         double precioXnoche=tpHabSelec.getPrecioNocheTipoHabitacion();
         double monto= dias*precioXnoche;
         jTFMontoReserva.setText(monto + "");
}
     
     
     public LocalDate fromPickerToLocalDate(JXDatePicker datePicker){
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    String toLocalDate= formater.format(datePicker.getDate());
    LocalDate fechaInLD= LocalDate.parse(toLocalDate);
        
    return fechaInLD;
   }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscarHabitacionesReserva;
    private javax.swing.JButton jBBuscarHuespedReserva;
    private javax.swing.JButton jBBuscarTipoHabitacion;
    private javax.swing.JButton jBCancelarPopUpHuespedReserva;
    private javax.swing.JButton jBCargarPopUpHuespedReserva;
    private javax.swing.JButton jBConfitmarReserva;
    private javax.swing.JButton jBLimpiarReserva;
    private javax.swing.JComboBox<String> jCBTipoHabitacionReserva;
    private javax.swing.JDialog jDHuespedReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantPersonasReserva;
    private javax.swing.JTextField jTFDiasReserva;
    private javax.swing.JTextField jTFMontoReserva;
    private javax.swing.JTable jTHabitacionesReserva;
    public javax.swing.JTextField jTHuespedReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPFinReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPInicioReserva;
    // End of variables declaration//GEN-END:variables
}
