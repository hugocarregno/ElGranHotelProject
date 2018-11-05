package elgranhotel.vista;



import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class VistaBuscarReserva extends javax.swing.JInternalFrame {
    private TipoHabitacionData tipoHabitacionData;
    private List<TipoHabitacion> listaTiposHabitacion;
    private Conexion conexion;
    private HuespedData huespedData;
    private ArrayList<Huesped> listaHuespedes;
    private ReservaData reservaData;
    private Reserva reserva;
    private List<Reserva> listaBuscarReservaDni;
    private List<Reserva> listaBuscarReservaFecha;
    private DefaultTableModel modeloReserva;
    
    
    /**
     * Creates new form VisaReserva
     */
    public VistaBuscarReserva() {
        initComponents();
        
          try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
             modeloReserva=new DefaultTableModel();
          //  tipoHabitacionData = new TipoHabitacionData(conexion);
          //  huespedData= new HuespedData(conexion);
            reservaData= new ReservaData(conexion);
            
          //  listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();      
             armaCabeceraTabla();  
             
            // cargaDatos();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaBuscarReserva.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDiasReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBBorrarReserva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFTipoHabitacion = new javax.swing.JTextField();
        jTFCantPersonasReserva = new javax.swing.JTextField();
        jTFEstadoReserva1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuscarReservaPorHuesped = new javax.swing.JTable();
        jBActualizarReserva1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFIdReserva = new javax.swing.JTextField();
        jBBuscarFecha = new javax.swing.JButton();
        jXDPInicioReserva = new org.jdesktop.swingx.JXDatePicker();
        jXDPFinReserva = new org.jdesktop.swingx.JXDatePicker();

        jLabel10.setText("Dias");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR RESERVA");

        jLabel11.setText("Monto Total");

        jLabel2.setText("Huesped");

        jTHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHuespedReservaActionPerformed(evt);
            }
        });

        jBLimpiarReserva.setText("Limpiar");

        jBBuscarHuespedReserva.setText("Buscar");
        jBBuscarHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Fin");

        jLabel5.setText("Cantidad de Personas");

        jBBorrarReserva.setText("Borrar");

        jLabel7.setText("Estado");

        jLabel8.setText("Tipo De Habitacion");

        jTableBuscarReservaPorHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6"
            }
        ));
        jTableBuscarReservaPorHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscarReservaPorHuespedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuscarReservaPorHuesped);

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

        jLabel6.setText("ID");

        jBBuscarFecha.setText("Buscar");
        jBBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEstadoReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel11)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTFIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTHuespedReserva)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBBuscarHuespedReserva))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBActualizarReserva1)
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrarReserva)
                        .addGap(26, 26, 26)
                        .addComponent(jBLimpiarReserva)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarHuespedReserva))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jBBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFEstadoReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBorrarReserva)
                            .addComponent(jBActualizarReserva1)
                            .addComponent(jBLimpiarReserva)
                            .addComponent(jButton1))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedReservaActionPerformed

        // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped
        borraFilasTabla();
        long dni=Long.parseLong(jTHuespedReserva.getText());

        //Huesped huesped= (Huesped)huespedData.mostrarHuesped(dni);
          //ReservaData rd = new ReservaData();
       //           try {
      //  conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        
        //reservaData = new ReservaData(conexion);
        listaBuscarReservaDni = reservaData.buscarReserva(dni, conexion);
        
        for(Reserva r:listaBuscarReservaDni){
            modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), r.getEstadoReserva(), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
        }
        //1 es la fila y 6 son las columnas
        //String filaBusquedaDni[][]=new String[listaBuscarReservaDni.size()][6];
        //int i;
        //for (i=0; i<listaBuscarReservaDni.size(); i++){
       
      //   filaBusquedaDni[i][0] = String.valueOf(listaBuscarReservaDni.get(i).getIdReserva());
      //   filaBusquedaDni[i][1] = String.valueOf(listaBuscarReservaDni.get(i).getFechaInicioReserva());
      //   filaBusquedaDni[i][2] = String.valueOf(listaBuscarReservaDni.get(i).getFechaFinReserva());
       //  filaBusquedaDni[i][3] = String.valueOf(listaBuscarReservaDni.get(i).getEstadoReserva());
       //  filaBusquedaDni[i][4] = String.valueOf(listaBuscarReservaDni.get(i).getHuesped().getDniHuesped());
        // filaBusquedaDni[i][5] = String.valueOf(listaBuscarReservaDni.get(i).getHabitacion().getNumeroHabitacion());

        //}
      
  //    jTableBuscarReservaPorHuesped.setModel(new javax.swing.table.DefaultTableModel(
    //        filaBusquedaDni,
    //        new String [] {
    //            "Id Reserva", "Fecha Inicio", "Fecha Fin", "Estado", "Dni Huesped", "Habitacion"
    //        }
   //     ));    
 // } catch (ClassNotFoundException ex) {
 //       Logger.getLogger(VistaBuscarReserva.class.getName()).log(Level.SEVERE, null, ex);
 //  }
        
        
       // if(huesped==null){
       // DialogoReservaHuesped dialogo= new DialogoReservaHuesped(new javax.swing.JFrame(), true);

            // guarda el dni en una variable en el jdialog para usar en huesped
           // dialogo.setDniHuesped(dni);
          //  dialogo.setVisible(true);

        //} else{

          //  jTHuespedReserva.setText(huesped.getDniHuesped()+" - "+huesped.getNombreHuesped());

        //}

    }//GEN-LAST:event_jBBuscarHuespedReservaActionPerformed

    private void jXDPInicioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPInicioReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDPInicioReservaActionPerformed

    private void jBActualizarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarReserva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActualizarReserva1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHuespedReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHuespedReservaActionPerformed

    private void jTableBuscarReservaPorHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscarReservaPorHuespedMouseClicked
         //obtener fila seleccionada    
        int row = jTableBuscarReservaPorHuesped.getSelectedRow();
        
        //Creo variables que van a almacenar lo que hay en la fila
        String id=jTableBuscarReservaPorHuesped.getValueAt(row, 0).toString();
        String fechaIngreso=jTableBuscarReservaPorHuesped.getValueAt(row, 1).toString();
        LocalDate localDateFechaI = LocalDate.parse(fechaIngreso);
        DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
        String fechaFin=jTableBuscarReservaPorHuesped.getValueAt(row, 2).toString();
        LocalDate localDateFechaF = LocalDate.parse(fechaFin);

        String estado=jTableBuscarReservaPorHuesped.getValueAt(row, 3).toString();
        String dniHuesped=jTableBuscarReservaPorHuesped.getValueAt(row, 4).toString();
        String habitacion=jTableBuscarReservaPorHuesped.getValueAt(row, 5).toString();
       
       //inserto en textfield
       //id reserva
       jTFIdReserva.setText(id);
       //estado
       jTFEstadoReserva1.setText(estado);
       //fecha inicio
       Date dateInicio=java.sql.Date.valueOf(localDateFechaI); 
       jXDPInicioReserva.setDate(dateInicio);
       //fecha fin
       Date dateFin=java.sql.Date.valueOf(localDateFechaF);
       jXDPFinReserva.setDate(dateFin);
       
       //si tengo vacio dni, cargarlo segun fecha elegida
       jTHuespedReserva.setText(dniHuesped);
       
       
     
     //recuperar de selected a jxdpinicioreserva
     
     
     //para modificar fecha
     /*
     String input = "Mon Jun 18 00:00:00 IST 2012";
DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" )
                                       .withLocale( Locale.US );
ZonedDateTime zdt = ZonedDateTime.parse( input , f );

Extract a date-only object, a LocalDate, without any time-of-day and without any time zone.

LocalDate ld = zdt.toLocalDate();
DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern( "dd/MM/uuuu" );
String output = ld.format( fLocalDate) ;

Dump to console.

System.out.println( "input: " + input );
System.out.println( "zdt: " + zdt );
System.out.println( "ld: " + ld );
System.out.println( "output: " + output );
     
     */
    }//GEN-LAST:event_jTableBuscarReservaPorHuespedMouseClicked

    private void jBBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarFechaActionPerformed
             
        //controlar que fecha inicio sea menor o igual que fecha fin
       cargaDatos();
        //si selecciono me llena el jxdatepiker esta hecho esto en evento clic        
    }//GEN-LAST:event_jBBuscarFechaActionPerformed

     public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("Id Reserva");
        columnas.add("Fecha Ingreso");
        columnas.add("Fecha Salida");
        columnas.add("Estado");
        columnas.add("Huesped");
        columnas.add("Habitación");
        for(Object it: columnas){
            modeloReserva.addColumn(it);
        }
        jTableBuscarReservaPorHuesped.setModel(modeloReserva);
  }
     public void cargaDatos(){
       borraFilasTabla();      
    //recibo ambas fechas
       String fechaIBuscar=jXDPInicioReserva.getDate().toString();
       String fechaFBuscar=jXDPFinReserva.getDate().toString();
       
       //convertirlas  aaaa-mm-dd
       
       DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" ).withLocale( Locale.US );
       ZonedDateTime zdtInicio = ZonedDateTime.parse( fechaIBuscar , f );
       ZonedDateTime zdtFin = ZonedDateTime.parse( fechaFBuscar , f );
 
       LocalDate fechaIDB = zdtInicio.toLocalDate();
       LocalDate fechaFDB = zdtFin.toLocalDate();
  
        
        //reservaData = new ReservaData(conexion);
            System.out.println(fechaIDB);
            System.out.println(fechaFDB);
        listaBuscarReservaFecha = reservaData.buscarReserva(fechaIDB, fechaFDB, conexion);     
        for(Reserva r:listaBuscarReservaFecha){
            modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), r.getEstadoReserva(), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
        }
               
 
     }
     
     public void borraFilasTabla(){

      int a =modeloReserva.getRowCount()-1; //se le resta 1 por que no cuenta la columna de titulos
         //uso for que inicie en el valor de a y va disminuyendo hasta ser igual a 0
        for(int i=a;i>=0;i--){
            //limpieza de tabla
            modeloReserva.removeRow(i ); 
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarReserva1;
    private javax.swing.JButton jBBorrarReserva;
    private javax.swing.JButton jBBuscarFecha;
    private javax.swing.JButton jBBuscarHuespedReserva;
    private javax.swing.JButton jBLimpiarReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantPersonasReserva;
    private javax.swing.JTextField jTFDiasReserva;
    private javax.swing.JTextField jTFEstadoReserva1;
    private javax.swing.JTextField jTFIdReserva;
    private javax.swing.JTextField jTFMontoReserva;
    private javax.swing.JTextField jTFTipoHabitacion;
    public javax.swing.JTextField jTHuespedReserva;
    private javax.swing.JTable jTableBuscarReservaPorHuesped;
    private org.jdesktop.swingx.JXDatePicker jXDPFinReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPInicioReserva;
    // End of variables declaration//GEN-END:variables

    
}
