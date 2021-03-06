package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ReservaData {
    private Connection connection = null;
    private Conexion conexion;
    
    public ReservaData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection=conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    //veo el historial de reservas
    public List<Reserva> obtenerReservas( Conexion conexion){
        List<Reserva> reservas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM reserva;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Reserva reserva;
     
            while(resultSet.next()){
                reserva = new Reserva();
               
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
               
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"), conexion);
               
                reserva.setHuesped(huesped);
                
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"), conexion);
               
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    //lista de todos los huespedes
    public List<Huesped> obtenerHuespedes(){
        List<Huesped> huespedes = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM huesped;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Huesped huesped;
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setDniHuesped(resultSet.getLong("dniHuesped"));
                huesped.setNombreHuesped(resultSet.getString("nombreHuesped"));
                huesped.setDomicilioHuesped(resultSet.getString("domicilioHuesped"));
                huesped.setCorreoHuesped(resultSet.getString("correoHuesped"));
                huesped.setCelularHuesped(resultSet.getString("celularHuesped"));

                huespedes.add(huesped);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return huespedes;
    }   
    
    //busco reservas realizadas por el dni del huesped
    public List<Reserva> buscarReserva(long dni,  Conexion conexion){
        //recibo un huesped
        //busco en la base de datos si el dniHuesped esta en alguna reserva y en
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped AND habitacion.numeroHabitacion=reserva.numeroHabitacion AND reserva.dniHuesped = "+ dni + ";" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            Reserva reserva;
            
            while(resultSet.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"), conexion);
                reserva.setHuesped(huesped);
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"), conexion);
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    //busco reservas por fecha de inicio y fin
    public List<Reserva> buscarReserva(LocalDate fechaI, LocalDate fechaF,  Conexion conexion){
        //recibo una fecha de inicio de la reserva
        //busco en la base de datos si hay alguna reserva para esa fecha 
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
      
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped and habitacion.numeroHabitacion=reserva.numeroHabitacion and fechaInicioReserva>='"+fechaI.toString()+"' and fechaFinReserva<='"+fechaF.toString()+"';";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            Reserva reserva;
            
            while(resultSet.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"), conexion);
                reserva.setHuesped(huesped);
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"), conexion);
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener una reserva por esas fecha: " + ex.getMessage());
        }
        
        
        return reservas;
}
    
    public int hacerReserva(Reserva reserva){
       int rta=0;
        try {
            
            String sql = "INSERT INTO reserva (fechaInicioReserva, fechaFinReserva, estadoReserva, dniHuesped, numeroHabitacion) VALUES ( ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setDate(1,  java.sql.Date.valueOf(reserva.getFechaInicioReserva()));
            statement.setDate(2, java.sql.Date.valueOf(reserva.getFechaFinReserva()));
            statement.setBoolean(3, reserva.getEstadoReserva());
            statement.setLong(4, reserva.getHuesped().getDniHuesped());
            statement.setInt(5, reserva.getHabitacion().getNumeroHabitacion());
            
            rta=statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
             if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una reserva");
            }
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
      return rta;
    }
    
    public int modificarReserva(Reserva reserva){
       int rta=0;     
        try {
            
            String sql = "UPDATE reserva SET fechaInicioReserva= ? ,fechaFinReserva= ? ,estadoReserva= ? ,dniHuesped= ? ,numeroHabitacion= ?  WHERE idReserva= ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            
           
            statement.setDate(1,  java.sql.Date.valueOf(reserva.getFechaInicioReserva()));
            statement.setDate(2, java.sql.Date.valueOf(reserva.getFechaFinReserva()));
            statement.setBoolean(3, reserva.getEstadoReserva());
            statement.setLong(4, reserva.getHuesped().getDniHuesped());
            statement.setInt(5, reserva.getHabitacion().getNumeroHabitacion());
            statement.setInt(6, reserva.getIdReserva());
            
            rta=statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
        
        return rta;
    }
    //borra una reserva
    public int cancelarReserva(int idReserva){
        int rta=0;
        try {
            
            String sql = "DELETE FROM reserva \n WHERE idReserva =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idReserva);
                       
            rta=statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un tipo de Habitacion: " + ex.getMessage());
        }
   return rta;
    }
        
    public Huesped mostrarHuesped(long dni, Conexion conexion) {
       
        HuespedData huespedData = new HuespedData(conexion);
        
        return huespedData.mostrarHuesped(dni);
    }

    public Habitacion mostrarHabitacion(int idHabitacion, Conexion conexion) {
      
        HabitacionData habitacionData = new HabitacionData(conexion);
        return habitacionData.buscarHabitacion(idHabitacion, conexion);
    }
    //metodo utilizado en vista buscar reserva
    public int finReserva(int idReserva){
        int rta=0;
        try {
            
            String sql = "UPDATE reserva r  INNER JOIN habitacion h  ON r.numeroHabitacion= h.numeroHabitacion SET r.estadoReserva= 0 , h.estadoHabitacion= 0  WHERE r.numeroHabitacion= ? ;";

            PreparedStatement statement = connection.prepareStatement(sql);
                       
            statement.setInt(1, idReserva);
            
            rta=statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {     
            System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
        return rta;
    }
    
    //conn este metodos buscamos reservas con estado true
    public List<Reserva> obtenerReservasActivas( Conexion conexion){
        List<Reserva> reservas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM reserva WHERE estadoReserva=1;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Reserva reserva;
     
            while(resultSet.next()){
                reserva = new Reserva();
               
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
               
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"), conexion);
               
                reserva.setHuesped(huesped);
                
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"), conexion);
               
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }
        
        
        return reservas;
    }
        
      public void finReserva( Conexion conexion){
         try {
             //busco las reservas activas y las guardo en una lista
            List<Reserva> listaReservas=this.obtenerReservasActivas(conexion);
           
            //obtengo la fecha de hoy 
            LocalDate fechaHoy = LocalDate.now();
               
            for(Reserva r:listaReservas){
               LocalDate fechaFinAComparar=r.getFechaFinReserva();
               LocalDate fechaInicioAComparar=r.getFechaInicioReserva();

               if(fechaHoy.isEqual(fechaFinAComparar.plusDays(1)))
               {
                   String sql = "UPDATE reserva INNER JOIN  huesped  INNER JOIN habitacion  ON huesped.dniHuesped= reserva.dniHuesped AND reserva.numeroHabitacion= habitacion.numeroHabitacion SET reserva.estadoReserva= 0, habitacion.estadoHabitacion=0 WHERE reserva.idReserva= ? ;";

                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(1, r.getIdReserva());
       
                    statement.executeUpdate();
                    
                    statement.close();
               }
                if(fechaHoy.isEqual(fechaInicioAComparar.plusDays(1)))
               {
                   String sql = "UPDATE reserva INNER JOIN  huesped  INNER JOIN habitacion  ON huesped.dniHuesped= reserva.dniHuesped AND reserva.numeroHabitacion= habitacion.numeroHabitacion SET reserva.estadoReserva= 1, habitacion.estadoHabitacion=1 WHERE reserva.idReserva= ? ;";

                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(1, r.getIdReserva());
       
                    statement.executeUpdate();
                    
                    statement.close();
               }
        
             }
         }catch (SQLException ex) {System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
    }
   
}