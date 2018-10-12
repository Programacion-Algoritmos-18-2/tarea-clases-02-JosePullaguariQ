/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

/**
 *
 * @author USUARIO
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        Precio p;
        p=new Precio();
        p.agregar(20.2);
        System.out.println(p.obtener());
    } 
}

