
package com.unedol.inventariounedol;

import com.unedol.inventariounedol.entidades.Marca;
import java.util.ArrayList;


public class MainMarca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca mar1 = new Marca(1,"Lenovo");
        Marca mar2 = new Marca(2,"Genius");
        Marca mar3 = new Marca(3,"Xtreme");
        Marca mar4 = new Marca(4,"Logitech");
        
        ArrayList<Marca> marcas = new ArrayList<Marca>();
        
        marcas.add(mar1);
        marcas.add(mar2);
        marcas.add(mar3);
        marcas.add(mar4);
        
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).Marca());
        }
        
        
        //Agregar nueva marca
        Marca mar5 = new Marca(5,"Asus");
        marcas.add(mar5);
        
       
        System.out.println("\nLista (se agrego 1): ");
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).Marca());
        }
        
        
        //Eliminarr una marca
        int eliminar = 2;
        
        for(int i = 0; i < marcas.size(); i++){
            if(marcas.get(i).getId() == eliminar){
                marcas.remove(i).getId();
            }
        }

        System.out.println("\nLista (se elimino 1): ");
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).Marca());
        }
        
        //Actualizar una marca
        
        int actualizar = 1;
        
        for(int i = 0; i < marcas.size(); i++){
            if(marcas.get(i).getId() == actualizar ){
                //marcas.set(i, mar1).setNombre("Samsung"); este también me funciono
                marcas.get(i).setNombre("Samsung");
            }
        }
        
        System.out.println("\nLista (se actualizo 1): ");
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).Marca());
        }
        
    }
    
}
