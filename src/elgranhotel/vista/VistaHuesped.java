/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;



import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import static elgranhotel.vista.Principal.escritorio;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class VistaHuesped extends javax.swing.JInternalFrame {
      private HuespedData huespedData;
      private Conexion conexion;
      private Huesped huesped;
      private List<Huesped> listaHuespedes;
      private DefaultTableModel modeloHuesped;
      private String opcion;
      private long dniHuesped;
      private List<Object> listaInforme;
      private ReservaData reservaData;
      private List<Reserva> listaReservas;
      
    /**
     * Creates new form VistaHuesped1
     */
    public VistaHuesped() {
        initComponents();
        
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        modeloHuesped=new DefaultTableModel();
        huespedData= new HuespedData(conexion);
        reservaData= new ReservaData(conexion);
        listaHuespedes=new ArrayList<>();
        armaCabeceraTabla();
        
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jBtGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtBuscarDniHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHuesped = new javax.swing.JTable();
        jBLimpiar = new javax.swing.JButton();
        jtDni = new javax.swing.JFormattedTextField();
        jtNombre = new javax.swing.JTextField();
        jBInforme = new javax.swing.JButton();
        rBHuespedesEnElHotel = new javax.swing.JRadioButton();
        rBHuespedsTodos = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Huespedes- El Gran Hotel 1.0");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("HUESPED");

        jLabel5.setText("Celular");

        jBtGuardar.setText("Guardar");
        jBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jBtModificar.setText("Modificar");
        jBtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jBtBorrar.setText("Borrar");
        jBtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBorrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Domicilio");

        jLabel4.setText("Correo");

        jBtBuscarDniHuesped.setText("Buscar");
        jBtBuscarDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBuscarDniHuespedActionPerformed(evt);
            }
        });

        jTableHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jTableHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHuespedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHuesped);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        try {
            jtDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBInforme.setText("Informe");
        jBInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInformeActionPerformed(evt);
            }
        });

        rBHuespedesEnElHotel.setText("En el Hotel");
        rBHuespedesEnElHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBHuespedesEnElHotelActionPerformed(evt);
            }
        });

        rBHuespedsTodos.setText("Todos");
        rBHuespedsTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBHuespedsTodosActionPerformed(evt);
            }
        });

        jLabel7.setText("Listar huéspedes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtGuardar)
                        .addGap(33, 33, 33)
                        .addComponent(jBtModificar)
                        .addGap(45, 45, 45)
                        .addComponent(jBtBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtBuscarDniHuesped)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBInforme))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBHuespedesEnElHotel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rBHuespedsTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtBuscarDniHuesped)
                    .addComponent(jBInforme)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtGuardar)
                    .addComponent(jBtModificar)
                    .addComponent(jBtBorrar)
                    .addComponent(jBLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBHuespedesEnElHotel)
                    .addComponent(rBHuespedsTodos)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        //cargo un huesped nuevo y me direcciona a vista reserva
        botonGuardar();
        
    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void jBtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtModificarActionPerformed
       //actualizo información de un huesped
        botonActualizar();
    }//GEN-LAST:event_jBtModificarActionPerformed

    private void jBtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBorrarActionPerformed
        //elimino un huesped
        botonBorrar();
        
    }//GEN-LAST:event_jBtBorrarActionPerformed

    private void jBtBuscarDniHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarDniHuespedActionPerformed
      
        botonBuscar();
          
    }//GEN-LAST:event_jBtBuscarDniHuespedActionPerformed

    private void jTableHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHuespedMouseClicked
        //clic en alguna fila de la tabla
        cargarDatosDesdeTabla();
        
        
    }//GEN-LAST:event_jTableHuespedMouseClicked

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        //limpieza de campos
        limpiar();
        
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformeActionPerformed
       botonInforme();
    
    }//GEN-LAST:event_jBInformeActionPerformed

    private void rBHuespedesEnElHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBHuespedesEnElHotelActionPerformed
        //al presionar el radio boton libre
        rBHuespedsTodos.setSelected(false);
        huespedesEnElHotel();
    }//GEN-LAST:event_rBHuespedesEnElHotelActionPerformed

    private void rBHuespedsTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBHuespedsTodosActionPerformed
        rBHuespedesEnElHotel.setSelected(false);
         //boton buscar
        opcion="buscarTodos";
        cargarDatos(opcion);
        

    }//GEN-LAST:event_rBHuespedsTodosActionPerformed
    public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("DNI");
        columnas.add("Nombre");
        columnas.add("Domicilio");
        columnas.add("Correo");
        columnas.add("Celular");
        for(Object it: columnas){
            modeloHuesped.addColumn(it);
        }
        jTableHuesped.setModel(modeloHuesped);
  }
    
    public void cargarDatos(String opcion){
        borraFilasTabla();
        if(opcion=="buscarDni"){
            listaHuespedes.removeAll(listaHuespedes);
            listaHuespedes.add(huespedData.mostrarHuesped(Long.parseLong(jtDni.getText())));
        }          
        if(opcion=="buscarTodos"){
            listaHuespedes.removeAll(listaHuespedes);
            listaHuespedes = huespedData.mostrarHuespedes();
        }
        for(Huesped h:listaHuespedes){
            modeloHuesped.addRow(new Object[]{h.getDniHuesped(), h.getNombreHuesped(), h.getDomicilioHuesped(), h.getCorreoHuesped(), h.getCelularHuesped()});
        }        
    }

    public void cargarDatosDesdeTabla(){
        
         //obtener fila seleccionada    
        int row = jTableHuesped.getSelectedRow();
        
        //Creo variables que van a almacenar lo que hay en la fila
        String dni=jTableHuesped.getValueAt(row, 0).toString();
        String nombre=jTableHuesped.getValueAt(row, 1).toString();
        String domicilio=jTableHuesped.getValueAt(row, 2).toString();
        String correo=jTableHuesped.getValueAt(row, 3).toString();
        String celular=jTableHuesped.getValueAt(row, 4).toString();
        //inserto en textfield
         jtDni.setText(dni);
         jtNombre.setText(nombre);
         jtDomicilio.setText(domicilio);
         jtCorreo.setText(correo);
         jtCelular.setText(celular);
       
    
    }

    public void limpiar(){
         jtDni.setText("");
         jtNombre.setText("");
         jtDomicilio.setText("");
         jtCorreo.setText("");
         jtCelular.setText("");
        
    }
    
      public void borraFilasTabla(){

      int a =modeloHuesped.getRowCount()-1; 
         //uso for que inicie en el valor de a y va disminuyendo hasta ser igual a 0
         for(int i=a;i>=0;i--){
            //limpieza de tabla
            modeloHuesped.removeRow(i ); 
        }
     }
    public boolean textFieldVacios()
    {
     boolean vacio=jtDni.getText().equals("") && 
     jtNombre.getText().equals("") &&
     jtDomicilio.getText().equals("") &&
     jtCorreo.getText().equals("") &&
     jtCelular.getText().equals("");
            
            return vacio;
    }
      //metodos para botones
   public void botonBorrar(){
   int rta=0;
        if(!textFieldVacios())
        {   
            if(JOptionPane.showConfirmDialog(this, "Esta por BORRAR un Huesped. ¿Desea continuar?", "ADVERTENCIA",0 )==0)
            {
                dniHuesped = Integer.parseInt(jtDni.getText());
        
                rta=huespedData.eliminarHuesped(dniHuesped);
        
                if(rta==1)
                {
                    JOptionPane.showMessageDialog(this, "Operación EXITOSA");
                    borraFilasTabla();
                }else 
                {
                 JOptionPane.showMessageDialog(this, "FALLÓ la operación");
                }
             }
        }else{
                JOptionPane.showMessageDialog(this, "Completar DATOS ");
              }
   }
   
    public void botonGuardar(){
        int rta=0;
     
     if(!textFieldVacios())
     { 
        dniHuesped= Long.parseLong(jtDni.getText());
        String nombre=jtNombre.getText();
        String domicilio=jtDomicilio.getText();
        String correo=jtCorreo.getText();
        String celular=jtCelular.getText();
        huesped=new Huesped(dniHuesped,nombre,domicilio,correo,celular);
        rta=huespedData.crearHuesped(huesped);
        
                if(rta==1)
                 {
                    JOptionPane.showMessageDialog(this, "Se creo un Nuevo Huesped");
                    VistaReserva vr=new VistaReserva();
                    Principal.escritorio.add(vr);
                    vr.toFront();
                    vr.setVisible(true);
                    // toma el dni que buscaron en reserva y lo setea en el text field de dni 
                    vr.jTHuespedReserva.setText(dniHuesped+" "+huesped.getNombreHuesped());
      
                    dispose();
                 }else
                    {
                     JOptionPane.showMessageDialog(this, "FALLÓ la operación");
                    }
     }else
        {
             JOptionPane.showMessageDialog(this, "Completar DATOS ");
        }
   }
    
    public void botonActualizar(){
       int rta=0;
    if(!textFieldVacios())
     { 
         long dni=Long.parseLong(jtDni.getText());
         String nombre=jtNombre.getText();
         String domicilio=jtDomicilio.getText();
         String correo=jtCorreo.getText();
         String celular=jtCelular.getText();

         huesped=new Huesped(dni,nombre,domicilio,correo,celular);
         rta=huespedData.modificarHuesped(huesped);
         
                if(rta==1)
                {
                        JOptionPane.showMessageDialog(this, "Se ha Modificado un Huesped");
                        borraFilasTabla();
                }else
                   {
                         JOptionPane.showMessageDialog(this, "FALLÓ la operación");
                   }
      }else
           {
                JOptionPane.showMessageDialog(this, "Completar DATOS ");
           }   
   }
    public void botonBuscar(){
    //declaro y recibo dni
        //long dniHuesped;
        dniHuesped = Long.parseLong(jtDni.getText());
        
        //si el campo dni no esta vacio, inserto los valores en el formulario
        if (jtDni.getText()!=null){
                         
            huesped= huespedData.mostrarHuesped(dniHuesped);
            jtNombre.setText(huesped.getNombreHuesped());
            jtDomicilio.setText(huesped.getDomicilioHuesped());
            jtCorreo.setText(huesped.getCorreoHuesped());
            jtCelular.setText(huesped.getCelularHuesped());
          
            opcion="buscarDni";
            //cargo datos en la tabla
            cargarDatos(opcion); 
        
        }
    }
    
    public void botonInforme(){
        
        dniHuesped=Long.parseLong(jtDni.getText());
        
        JasperReport informe;
        JasperPrint imprimir;
        try {
        
                         
            huesped= huespedData.mostrarHuesped(dniHuesped);
            Map parametros = new HashMap();
            parametros.put("parametroDni", String.valueOf(dniHuesped));
            parametros.put("parametroNombre", huesped.getNombreHuesped());
            parametros.put("parametroDomicilio", huesped.getDomicilioHuesped());
            parametros.put("parametroCorreo", huesped.getCorreoHuesped());
            parametros.put("parametroCelular", huesped.getCelularHuesped());
        
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        //informe = JasperCompileManager.compileReport("InformeHuesped.jasper");
         informe = (JasperReport) JRLoader.loadObjectFromFile("InformeHuesped.jasper");
        imprimir = JasperFillManager.fillReport(informe, parametros , this.conexion.getConexion());
        //imprimir = JasperFillManager.fillReport
        JasperViewer jViewer = new JasperViewer(imprimir,false); //Creamos la vista del Reporte
        jViewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
        jViewer.setVisible(true); //Inicializamos la vista del informe
        } catch (JRException ex) {
            Logger.getLogger(java.security.Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    private void huespedesEnElHotel(){
       
       borraFilasTabla();
        listaReservas = reservaData.obtenerReservas(conexion); 
        LocalDate hoy= LocalDate.now();
        List<Reserva> finalizadas= new ArrayList<>();
        List<Huesped> huespedActivo= new ArrayList<>();
        //el hash set no permite duplicados asi que lo uso para que me diga si dni puede entrar en el set o no, si no puede entrar es porque esta duplicado
        // y ese huesped no peude entrar en la lista de huespedes activos, porque ya esta ahi
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();

     for(Reserva r:listaReservas){
              if(r.getFechaFinReserva().plusDays(1).isEqual(hoy) || r.getFechaFinReserva().plusDays(1).isBefore(hoy)){
               finalizadas.add(r);
        
            }else{
                  if (hashSet.add((int)r.getHuesped().getDniHuesped())) {
                      huespedActivo.add(r.getHuesped());
                     
                  }
                }
          }
    if(!huespedActivo.isEmpty()){
        for(Huesped h:huespedActivo){
            
            modeloHuesped.addRow(new Object[]{h.getDniHuesped(), h.getNombreHuesped(), h.getDomicilioHuesped(), h.getCorreoHuesped(), h.getCelularHuesped()});
        }
    }else{
    JOptionPane.showMessageDialog(this, "No hay Huéspedes en el Hotel");
    }
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInforme;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBtBorrar;
    private javax.swing.JButton jBtBuscarDniHuesped;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHuesped;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    public static javax.swing.JFormattedTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JRadioButton rBHuespedesEnElHotel;
    private javax.swing.JRadioButton rBHuespedsTodos;
    // End of variables declaration//GEN-END:variables
}
