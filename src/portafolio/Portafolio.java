
package portafolio;

public class Portafolio {
        
         public static conexion conexion = new conexion();
    
    public static void main(String[] args) {
      

        if(conexion.crearConexion()){
            inicio m = new inicio();
            m.setVisible(true);
    }

}
}
