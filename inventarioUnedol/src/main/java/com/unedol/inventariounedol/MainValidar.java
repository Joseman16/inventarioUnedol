
package com.unedol.inventariounedol;

import com.unedol.inventariounedol.entidades.Categoria;
import com.unedol.inventariounedol.entidades.Marca;

public class MainValidar {

    
    public static void main(String[] args) {
        boolean pruebaBandera = true;
        
        Marca mar1 = new Marca(1,"Lenovo");
        Marca mar2 = new Marca(2,"Dell");
    
        Categoria cat1 = new Categoria(1,"Computadoras");
        Categoria cat2 = new Categoria(1,"Electronica232");
        
        
        pruebaBandera = esSoloLetras(cat1.getNombre());
        
        if(pruebaBandera){
            System.out.println("Nombre Valido!");
        }else{
            System.out.println("Contiene Numero!");
        }
        
        pruebaBandera = esSoloLetras(cat2.getNombre());
        
        if(pruebaBandera){
            System.out.println("Nombre Valido!");
        }else{
            System.out.println("Contiene Numero!");
        }
        
        pruebaBandera = esSoloNumero(mar2.getId());
        
        if(pruebaBandera){
            System.out.println("Numeo valido: "+mar2.getId());
        }else{
            System.out.println("Error!");
        }
    }
    
    public static boolean esSoloLetras(String cadena){
        //Verrifica si lka cadena no es nula y coincide solo con las letras (mayúsculas y minúsculas)
        return cadena!= null && cadena.matches("^[a-zA-Z]+$");
    }
    
    public static boolean esSoloNumero (double num){
        boolean bandera = false;
        double numero = 0;
        
        try{
            numero = num; 
            bandera = true;
        }catch(NumberFormatException e){
            System.out.println("No es numerico: "+e.getMessage());
            bandera = false;
        }
        
        return bandera;
    }
}
