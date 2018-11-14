package elgranhotel.vista;


import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;


public class VistaBuscarReserva extends javax.swing.JInternalFrame {
    
    
    private Conexion conexion;
    private HuespedData huespedData;
    private ReservaData reservaData;
    private Reserva reserva;
    private List<Reserva> listaBuscarReservaDni;
    private List<Reserva> listaBuscarReservaFecha;
    private List<Reserva> listaReservas;
    private HabitacionData habitacionData;
    private DefaultTableModel modeloReserva;
    
    
    /**
     * Creates new form VisaReserva
     */
    public VistaBuscarReserva() {
        initComponents();
        
          try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
            modeloReserva=new DefaultTableModel();
            huespedData= new HuespedData(conexion);
            huespedData= new HuespedData(conexion);
            habitacionData= new HabitacionData(conexion);
            reservaData = new ReservaData(conexion);
            reservaData.finReserva(conexion);
           
                       
            armaCabeceraTabla();
               
            
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
        jBCancelarReserva = new javax.swing.JButton();
        rBFinalizadas = new javax.swing.JRadioButton();
        rBActivas = new javax.swing.JRadioButton();
        jXDPInicioReserva = new org.jdesktop.swingx.JXDatePicker();
        jXDPFinReserva = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Reservas - El Gran Hotel 1.0");

        jLabel10.setText("Dias");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR RESERVA");

        jLabel11.setText("Monto Total");

        jLabel2.setText("Huesped");

        jTHuespedReserva.setToolTipText("Escriba el DNI del Huesped");

        jBLimpiarReserva.setText("Limpiar");
        jBLimpiarReserva.setToolTipText("Limpia los campos.");
        jBLimpiarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarReservaActionPerformed(evt);
            }
        });

        jBBuscarHuespedReserva.setText("Buscar");
        jBBuscarHuespedReserva.setToolTipText("Busca las Reservas por DNI.");
        jBBuscarHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Fin");

        jTFDiasReserva.setToolTipText("");

        jLabel5.setText("Cantidad de Personas");

        jLabel7.setText("Estado");

        jLabel8.setText("Tipo De Habitacion");

        jTableBuscarReservaPorHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Reserva", "Fecha Inicio", "Fecha Fin", "Estado", "Dni Huesped", "Habitacion"
            }
        ));
        jTableBuscarReservaPorHuesped.setToolTipText("Seleccione la Reserva para modficiarla.");
        jTableBuscarReservaPorHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscarReservaPorHuespedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuscarReservaPorHuesped);

        jBActualizarReserva1.setText("Actualizar");
        jBActualizarReserva1.setToolTipText("Actualiza los datos de la reserva seleccionada.");
        jBActualizarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarReserva1ActionPerformed(evt);
            }
        });

        jButton1.setText("Fin Reserva");
        jButton1.setToolTipText("Finaliza  la reserva seleccionada.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinReserva(evt);
            }
        });

        jLabel6.setText("ID");

        jBBuscarFecha.setText("Buscar");
        jBBuscarFecha.setToolTipText("Busca las Reservas por Fechas.");
        jBBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarFechaActionPerformed(evt);
            }
        });

        jBCancelarReserva.setText("Cancelar");
        jBCancelarReserva.setToolTipText("Borra la reserva seleccionada.");
        jBCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarReservaActionPerformed(evt);
            }
        });

        rBFinalizadas.setText("Finalizadas");
        rBFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBFinalizadasActionPerformed(evt);
            }
        });

        rBActivas.setText("Activas");
        rBActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBActivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEstadoReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jBActualizarReserva1)
                                .addGap(46, 46, 46)
                                .addComponent(jBCancelarReserva)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)))
                        .addGap(33, 33, 33)
                        .addComponent(jBLimpiarReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBBuscarHuespedReserva))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel1))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(rBFinalizadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBActivas)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rBFinalizadas)
                            .addComponent(rBActivas))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarHuespedReserva)
                            .addComponent(jTFIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jBBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jBActualizarReserva1)
                            .addComponent(jBLimpiarReserva)
                            .addComponent(jButton1)
                            .addComponent(jBCancelarReserva))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedReservaActionPerformed
     
        botonBuscarXHuesped();
      
    }//GEN-LAST:event_jBBuscarHuespedReservaActionPerformed

    private void jBActualizarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarReserva1ActionPerformed
       
        botonActualizar();
    
    }//GEN-LAST:event_jBActualizarReserva1ActionPerformed

    private void jBFinReserva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinReserva
    
        botonFinReserva();   
        
    }//GEN-LAST:event_jBFinReserva

    private void jTableBuscarReservaPorHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscarReservaPorHuespedMouseClicked
     
        clickEnLaTabla();   
     
    }//GEN-LAST:event_jTableBuscarReservaPorHuespedMouseClicked

    private void jBBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarFechaActionPerformed
     
        botonBuscarXFecha();
        
    }//GEN-LAST:event_jBBuscarFechaActionPerformed

    private void jBCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarReservaActionPerformed
       
        botonCancelar();    
              
    }//GEN-LAST:event_jBCancelarReservaActionPerformed

    private void jBLimpiarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarReservaActionPerformed
        
        botonLimpiar();
        
    }//GEN-LAST:event_jBLimpiarReservaActionPerformed

    private void rBFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBFinalizadasActionPerformed
        //al presionar el radio boton libre
       rBActivas.setSelected(false);
       cargarTablaSegun(false);
    }//GEN-LAST:event_rBFinalizadasActionPerformed

    private void rBActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBActivasActionPerformed
        rBFinalizadas.setSelected(false);
        cargarTablaSegun(true);
       
    }//GEN-LAST:event_rBActivasActionPerformed

    //metodos Botones
    public void botonBuscarXFecha(){
        //recibo ambas fechas
       String fechaIBuscar=jXDPInicioReserva.getDate().toString();
       String fechaFBuscar=jXDPFinReserva.getDate().toString();
       
       //convertirlas  aaaa-mm-dd
       
       DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" ).withLocale( Locale.US );
       ZonedDateTime zdtInicio = ZonedDateTime.parse( fechaIBuscar , f );
       ZonedDateTime zdtFin = ZonedDateTime.parse( fechaFBuscar , f );
      //System.out.println(zdt);
       LocalDate fechaIDB = zdtInicio.toLocalDate();
       LocalDate fechaFDB = zdtFin.toLocalDate();
       
        //controlar que fecha inicio sea menor o igual que fecha fin
       

        //consulto en db
               
        
        System.out.println("aqui1");
            System.out.println(fechaIDB);
            System.out.println(fechaFDB);
       listaBuscarReservaFecha = reservaData.buscarReserva(fechaIDB, fechaFDB, conexion);     
        
       for(Reserva r:listaBuscarReservaFecha){
            modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), estadoReserva(r.getEstadoReserva()), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
        }
        //si selecciono me llena el jxdatepiker esta hecho esto en evento clic
        
    }
    
    public void clickEnLaTabla(){
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
        int numHab=Integer.parseInt(jTableBuscarReservaPorHuesped.getValueAt(row, 5).toString());
        Habitacion h=habitacionData.buscarHabitacion(numHab, conexion);
        
        
        
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
       
       //toma el numero de habitacion para setear el tipo
        int idTipoHab= h.getTipoHabitacion().getIdTipoHabitacion();
        String idTH= String.valueOf(idTipoHab);
        
        String tipoTH= String.valueOf(h.getTipoHabitacion().getCategoriaTipoHabitacion());
        jTFTipoHabitacion.setText(idTH+" "+tipoTH);
        
        setCantPersonas(jTFCantPersonasReserva, idTipoHab, conexion);
        
        //carga los dias que dura la reserva
        cargarDias(localDateFechaI,localDateFechaF );
        
        //setea el precio de la reserva en el jtfield
        precioReserva(jTFMontoReserva, idTipoHab, conexion);
        
        
    }
    
    public void botonBuscarXHuesped(){
        // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped
        borraFilasTabla();  
        long dni=Long.parseLong(jTHuespedReserva.getText());
       
        listaBuscarReservaDni = reservaData.buscarReserva(dni,  conexion);
        
         for(Reserva r:listaBuscarReservaDni){
            modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), estadoReserva(r.getEstadoReserva()), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
        }
        
       
    }
    
    public void botonCancelar(){
       int rta=0;
       if(!textFieldVacios()){
         if(JOptionPane.showConfirmDialog(this, "Esta por BORRAR una Reserva. ¿Desea continuar?", "ADVERTENCIA",0 )==0){
           int idReserva= Integer.parseInt(jTFIdReserva.getText());
           rta=reservaData.cancelarReserva(idReserva);
               if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
            else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
           }
          }else{
         JOptionPane.showMessageDialog(this, "Completar DATOS "); 
       }
   }
    
    public void botonFinReserva(){
         int rta=0;
    if(!textFieldVacios())
     {    
         int idReserva= Integer.parseInt(jTFIdReserva.getText());
        rta=reservaData.finReserva(idReserva);
        if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
            else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
        }else{
         JOptionPane.showMessageDialog(this, "Completar DATOS ");
       }  
     
    }
    
    public void botonActualizar(){
        int rta=0;
    if(!textFieldVacios())
    {
    long dni= Long.parseLong(jTHuespedReserva.getText().substring(0,8).trim());
    LocalDate fechaInicio= fromPickerToLocalDate(jXDPInicioReserva);
    LocalDate fechaFin = fromPickerToLocalDate(jXDPFinReserva);
    
    int filaSeleccionada= jTableBuscarReservaPorHuesped.getSelectedRow();
     if(filaSeleccionada!=-1){
        int numeroHabitacion= Integer.parseInt(jTableBuscarReservaPorHuesped.getValueAt(filaSeleccionada, 5).toString());
        String estadoS=(jTableBuscarReservaPorHuesped.getValueAt(filaSeleccionada, 3).toString());
        boolean estadoB= false;
        if(estadoS.equals("ACTIVA")){
        estadoB=true;
        }else{estadoB=false;}
        //HABITACION seleccionada por la lista, filtrada del data por el numeroHabitacion
        Habitacion h= habitacionData.buscarHabitacion(numeroHabitacion, conexion);
        //HUESPED
        Huesped huesped= huespedData.mostrarHuesped(dni);
        reserva= new Reserva(fechaInicio, fechaFin, estadoB, huesped, h);
        rta=reservaData.modificarReserva(reserva);
        if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
            else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
      }   
     }else{
         JOptionPane.showMessageDialog(this, "Completar DATOS ");
   }
 }
    
    public void botonLimpiar(){
        
        armaCabeceraTabla();
        borraFilasTabla();
        
        jTFEstadoReserva1.setText("");
        jTFTipoHabitacion.setText("");
        jTFIdReserva.setText("");
        jTHuespedReserva.setText("");
        jTFDiasReserva.setText("");
        jTFCantPersonasReserva.setText("");
        jTFMontoReserva.setText("");
        
    }
    
    
   //metodos auxiliares
    public void cargarDias(LocalDate fechaInicio, LocalDate fechaFin){

    long diasReserva=fechaInicio.until(fechaFin, DAYS);
    System.out.println(diasReserva);
    jTFDiasReserva.setText(diasReserva +"");
       
     }
    
    public LocalDate fromPickerToLocalDate(JXDatePicker datePicker){
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    String toLocalDate= formater.format(datePicker.getDate());
    LocalDate fechaInLD= LocalDate.parse(toLocalDate);
        
    return fechaInLD;
   }
      
    public void precioReserva(JTextField jtf, int idTipoHabitacion, Conexion conexion){
        
         TipoHabitacion tpHabSelec=habitacionData.buscarTipoHabitacion(idTipoHabitacion, conexion);
                  
         int dias=Integer.parseInt(jTFDiasReserva.getText());
         double precioXnoche=tpHabSelec.getPrecioNocheTipoHabitacion();
         double monto= dias*precioXnoche;
         jtf.setText(monto + "");
}

    public void setCantPersonas(JTextField jtf, int idTipoHabitacion, Conexion conexion){
       TipoHabitacion tpHabSelec=habitacionData.buscarTipoHabitacion(idTipoHabitacion, conexion);
       int cantP= tpHabSelec.getCantPersonasTipoHabitacion();
       jtf.setText(cantP+"");
   }
   
    public String estadoReserva(Boolean buleano){
  String estado;
  if(buleano){
  estado= "ACTIVA";
  }else{
  estado= "FINALIZADA";
  }
  return estado;
  }

    public void armaCabeceraTabla(){
     
        modeloReserva.addColumn("Id Reserva");
        modeloReserva.addColumn("Fecha Inicio");
        modeloReserva.addColumn("Fecha Fin");
        modeloReserva.addColumn("Estado");
        modeloReserva.addColumn("Dni Huesped");
        modeloReserva.addColumn("Habitacion");
        this.jTableBuscarReservaPorHuesped.setModel( modeloReserva);
    }
  
    public void borraFilasTabla(){

    int a = modeloReserva.getRowCount()-1;
   
    for(int i=a;i>=0;i--){
         modeloReserva.removeRow(i);
     
    }
}
    
    public boolean textFieldVacios(){
    boolean vacio=
    jTFIdReserva.getText().equals("") && 
    jTHuespedReserva.getText().equals("") &&
    jTableBuscarReservaPorHuesped.getSelectedRow()==-1;
    return vacio;
    }
    
    public void cargarTablaSegun(Boolean bool){
       borraFilasTabla();
        listaReservas = reservaData.obtenerReservas(conexion); 
        LocalDate hoy= LocalDate.now();
        List<Reserva> finalizadas= new ArrayList<>();
        List<Reserva> activas= new ArrayList<>();
   
        for(Reserva r:listaReservas){
              if(r.getFechaFinReserva().plusDays(1).isEqual(hoy) || r.getFechaFinReserva().plusDays(1).isBefore(hoy)){
               finalizadas.add(r);
        
            }else{
                activas.add(r);
                }
          }
        
     if(bool){   
     for(Reserva r:activas)   
     modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), estadoReserva(r.getEstadoReserva()), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
     } if(!bool){
     for(Reserva r:finalizadas)   
     modeloReserva.addRow(new Object[]{r.getIdReserva(), r.getFechaInicioReserva(), r.getFechaFinReserva(), estadoReserva(r.getEstadoReserva()), r.getHuesped().getDniHuesped(), r.getHabitacion().getNumeroHabitacion()});
     
     }
            
       
  } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarReserva1;
    private javax.swing.JButton jBBuscarFecha;
    private javax.swing.JButton jBBuscarHuespedReserva;
    private javax.swing.JButton jBCancelarReserva;
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
    private javax.swing.JRadioButton rBActivas;
    private javax.swing.JRadioButton rBFinalizadas;
    // End of variables declaration//GEN-END:variables
}
