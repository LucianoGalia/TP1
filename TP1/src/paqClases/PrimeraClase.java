/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;
import java.util.ArrayList;
/**
 *
 * @author estudiante
 */
public class PrimeraClase {
    
    String unaCadena;
    int unEntero;
    
    public static void main(String[] args){
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Escritorio";
        unObjeto2.unEntero = 6;
        unObjeto3.unaCadena = "Teclado";
        unObjeto3.unEntero = 7;
        unObjeto4.unaCadena = "Pantalla";
        unObjeto4.unEntero = 8; 
        unObjeto5.unaCadena = "Mouse";
        unObjeto5.unEntero = 9;
        
        ArrayList<PrimeraClase> lista = new ArrayList<>();
        lista.add(unObjeto1);
        lista.add(unObjeto2);
        lista.add(unObjeto3);
        lista.add(unObjeto4);
        lista.add(unObjeto5);
        
        for(int i = 0; i < lista.size() ; i++){
            lista.get(i).mostrar();
        }
    }
    
    public void mostrar(){  
        System.out.println("Atributos: " + this.unaCadena + " y " + this.unEntero);
    }
}

/*para la parte 2 me pide el cliente que quiere
Class 
Cliente = nombre apellido contraseña mail.
Empleado = nombre apellido contraseña mail.
Encargado = lo mismo.
Producto = descripcion, 
Precio = ... .
*/