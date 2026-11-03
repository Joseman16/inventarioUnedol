
package com.unedol.inventariounedol.util;

import com.unedol.inventariounedol.entidades.Categoria;
import java.util.ArrayList;


public class RegistroCategoria {
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    
    public void insertar(Categoria cat){
        categorias.add(cat);
    }
    
    public void eliminar(Categoria cat){
        for(int i = 0; i < categorias.size(); i++){
            if(categorias.get(i).getId() == cat.getId()){
                categorias.remove(i);
                i--;
            }
        }
    }
    
    public void actualiz(Categoria cat){
        for(int i = 0; i < categorias.size(); i++){
            if(categorias.get(i).getId() == cat.getId()){
                categorias.set(i, cat);
                break;
            }
        }
    }
    
    //Tradicionalemnte como retorno un ArrayList de categoria
    public ArrayList<Categoria> retornarCategorias(){
        ArrayList<Categoria> cats = new ArrayList<Categoria>();
        for(int i = 0; i < categorias.size(); i++){
            cats.add(categorias.get(i));
        }
        return cats;
    }
    
    public ArrayList<Categoria> retornarCategorias2(){
        return new ArrayList<Categoria>(categorias);
    }
    
    public void mostrarDatos(){
        int i = 0;
        while(!categorias.isEmpty()){
            i++;
            System.out.println(categorias.get(i));
            
        }
    }
    
    public void mostrarDatos2(){
        for(int i = 0; i < categorias.size(); i++){
            System.out.println(categorias.get(i).getId()+" "+categorias.get(i).getNombre());
        }
    }

}
