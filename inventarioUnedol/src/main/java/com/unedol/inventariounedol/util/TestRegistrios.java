
package com.unedol.inventariounedol.util;

import com.unedol.inventariounedol.entidades.Categoria;
import com.unedol.inventariounedol.entidades.Componente;
import com.unedol.inventariounedol.entidades.Marca;

public class TestRegistrios {

    public static void main(String[] args) {
        //Las clases de registros
        RegistroMarca rmar = new RegistroMarca();
        RegistroCategoria rcat = new RegistroCategoria();
        RegistroComponentes rcompt = new RegistroComponentes();
        
        //Objetos Marca
        Marca mar1 = new Marca(1, "Lenovo");
        Marca mar2 = new Marca(2, "Genius");
        Marca mar3 = new Marca(3, "Logitech");
        
        //Insetar objetos al arreglo
        rmar.insertar(mar1);
        rmar.insertar(mar2);
        rmar.insertar(mar3);
        
        //mostrar información en la consola
        System.out.println("\n/******** Marcas ********/");
        rmar.mostrarDatos2();
        
        //Objetos Categorias
        Categoria cat1 = new Categoria(1,"Teclado");
        Categoria cat2 = new Categoria(2,"Mouse");
        
        //Insertar objetos al arreglo
        rcat.insertar(cat1);
        rcat.insertar(cat2);
        
        //mostrar información en la consola
        System.out.println("\n/******** Categorias ********/");
        rcat.mostrarDatos2();
        
        /************ Componentes ************/
        Componente comp1 = new Componente(1,"TCL01", mar2, cat1, true);
        Componente comp2 = new Componente(2,"MOU01", mar2, cat2, true);
        Componente comp3 = new Componente(3,"TCL02", mar3, cat1, false);
        Componente comp4 = new Componente(4,"MOU02", mar1, cat2, true);
        
        //Guardamos los componentes al arreglo
        rcompt.insertar(comp1);
        rcompt.insertar(comp2);
        rcompt.insertar(comp3);
        rcompt.insertar(comp4);
        
        System.out.println("\n/******** Componentes ********/");
        rcompt.mostrarDatos3();
        
    }
    
}
