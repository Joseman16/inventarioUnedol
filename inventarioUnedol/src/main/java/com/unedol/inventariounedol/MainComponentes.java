
package com.unedol.inventariounedol;

import com.unedol.inventariounedol.entidades.Categoria;
import com.unedol.inventariounedol.entidades.Componente;
import com.unedol.inventariounedol.entidades.Marca;
import java.util.ArrayList;

public class MainComponentes {

    
    public static void main(String[] args) {
        
        //Arreglos (Javacollection)
        ArrayList<Marca> marcas = new ArrayList<Marca>();
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        //Objetos de marca
        Marca mar1 = new Marca(1,"Genius");
        Marca mar2 = new Marca(2,"Logitech");
        Marca mar3 = new Marca(3,"Quasad");
        
        //Objetos de categoria
        Categoria cat1 = new Categoria(1,"Teclado");
        Categoria cat2 = new Categoria(2,"Mouse");
        Categoria cat3 = new Categoria(3,"Parlantes");
         
        /****** Guardar en los arreglos ******/
        //Marcas:
        marcas.add(mar1);
        marcas.add(mar2);
        marcas.add(mar3);
        
        //Categorias:
        categorias.add(cat1);
        categorias.add(cat2);
        categorias.add(cat3);
       
        //Mostrar los elementos
        System.out.println("\nLista de marcas: ");
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).Marca());       
        }
        
        System.out.println("\nLista de categorias: ");
        for(int i = 0; i < categorias.size(); i++){
            System.out.println(categorias.get(i).categoria());       
        }
        
        //Arreglo para componente
        ArrayList<Componente> componentes = new ArrayList<Componente>();
        
        //Creación del componente
        Componente comp1 = new Componente(1,"T1", mar2, cat1, true);
        Componente comp2 = new Componente(2,"M1", mar2, cat2, true);
        Componente comp3 = new Componente(3,"PA1", mar1, cat3, false);
        Componente comp4 = new Componente(4,"T2", mar1, cat1, true);
        Componente comp5 = new Componente(5,"PA2",  mar3, cat3, true);
        
        componentes.add(comp1);
        componentes.add(comp2);
        componentes.add(comp3);
        componentes.add(comp4);
        componentes.add(comp5);
        
         System.out.println("\nLista de componentes: ");
        for (int i = 0; i < componentes.size(); i++){
            System.out.println(componentes.get(i).LeerComponentes());
        }

    }
    
}
