
package basededatos;


public class ClaseBaseDeDatos {
    
    private String usuario = "";
    private String token ="";


    private ClaseBaseDeDatos(String usuario,String token){
        this.usuario = usuario;
        this.token = token;
    }
    private ClaseBaseDeDatos() {
    }
    
    public void setUsuario(){

    }


    public String getUsuario() {
        return usuario;
    }
    
    public String getToken() {
        return token;
    }

    public static ClaseBaseDeDatos usuario1 = new ClaseBaseDeDatos("Pedro","554a654ads");

    private static ClaseBaseDeDatos usuario2 = null;

    public static ClaseBaseDeDatos geNuevoUsuario(){
        
       if (usuario2 == null){
           usuario2 =new ClaseBaseDeDatos();
       }
       return usuario2;
   }


}
   
