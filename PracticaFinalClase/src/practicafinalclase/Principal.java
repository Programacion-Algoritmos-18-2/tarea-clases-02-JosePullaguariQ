/*
 * Practica Final de Clase 2
 */
package practicafinalclase;
/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {
        // Creamos primer objteto y presentamos en pantalla
        Equipo e = new Equipo();
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s",e.obtenerNombre(),e.obteNum(),e.obteCiudad());
        
        //Creamos segundo objeto y presentamos en pantalla
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregNum(20);
        e2.agreCiudad("Loja");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s",e2.obtenerNombre(),e2.obteNum(),e2.obteCiudad());
        
        //Creamos tercer objeto y presentamos en pantalla
        Equipo e3 = new Equipo("Deportivo Cuenca",24);
        e3.agreCiudad("Cuenca");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s",e3.obtenerNombre(),e3.obteNum(),e3.obteCiudad());
        
        //Creamos cuarto objeto y presentamos en pantalla
        Equipo e4 = new Equipo("Macara",35,"Ambato");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s",e4.obtenerNombre(),e4.obteNum(),e4.obteCiudad());
    }
}