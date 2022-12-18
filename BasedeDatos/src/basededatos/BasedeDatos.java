
package basededatos;

public class BasedeDatos {


    public static void main(String[] args) {
        
        System.out.println( ClaseBaseDeDatos.usuario1.getUsuario());
        System.out.println(ClaseBaseDeDatos.usuario1.getToken());

        ClaseBaseDeDatos.geNuevoUsuario();
    }
}