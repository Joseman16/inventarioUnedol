/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unedol.inventariounedol;

import com.unedol.inventariounedol.entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Josman
 */
public class MainCategoria {

    public static void main(String[] args) {
        
        Categoria cat1 = new Categoria (1,"Teclado");
        Categoria cat2 = new Categoria (2,"Monitor");
        Categoria cat3 = new Categoria (3,"Mouse");
        
        ArrayList<Categoria> cat = new ArrayList<Categoria>();
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);
        
        for(int i = 0; i < cat.size(); i++){
            System.out.println(cat.get(i).categoria());
        }
        
        Categoria cat4 = new Categoria (4,"Fuente de Poder");
        
        cat.add(cat4);
        
        System.out.println("\nLista: ");
        for(int i = 0; i <cat.size(); i++){
             System.out.println(cat.get(i).categoria());
        }
        
    }
}
