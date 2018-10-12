/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinalclase;
/**
 *
 * @author USUARIO
 */
//Creamos la clase Equipo
public class Equipo {
    //Atributos de la clase Equipo
    private String nombre;
    private int num_jugadores;
    private String ciudad;
    
    //Metodo para agregar y obtener Nombre del equipo
    public String obtenerNombre(){
        return nombre;
    }
    public void agregarNombre(String nom){
        nombre=nom;
    }
    
    //Metodo para agregar y obtener Numero de jugadores
    public int obteNum(){
        return num_jugadores;
    }
    public void agregNum(int num_jug){
        num_jugadores=num_jug;
    }
    
    //Metodo para agregar y obtener Nombre de la ciudad
    public String obteCiudad(){
        return ciudad;
    }
    public void agreCiudad(String nomb_ciudad){
        ciudad=nomb_ciudad;
    }
    
    //Creamos los 4 Constructores
    public Equipo(){
    }
    public Equipo(String nombre){
        agregarNombre(nombre);
    }
    public Equipo(String nombre,int num_jugadores){
        agregarNombre(nombre);
        agregNum(num_jugadores);
    }
    public Equipo(String nombre,int num_jugadores,String ciudad){
        agregarNombre(nombre);
        agregNum(num_jugadores);
        agreCiudad(ciudad);
    }
}
