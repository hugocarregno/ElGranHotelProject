/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import elgranhotel.vista.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class RunnableClass implements Runnable{
    private Conexion conexion;
    private ReservaData reservaData;

    public RunnableClass(Conexion conexion) {
        this.conexion = conexion;
    }
    
    

    @Override
    public void run() {  
       
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            reservaData= new ReservaData(conexion);
            
            reservaData.finReserva(conexion);
            
            System.out.println("Reservas finalizadas");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}
