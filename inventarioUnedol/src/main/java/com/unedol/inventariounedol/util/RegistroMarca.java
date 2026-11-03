
package com.unedol.inventariounedol.util;

import com.unedol.inventariounedol.entidades.Categoria;
import com.unedol.inventariounedol.entidades.Marca;
import java.util.ArrayList;

public class RegistroMarca {
    ArrayList<Marca> marcas = new ArrayList<Marca>();
    
    public void insertar (Marca marca){
        marcas.add(marca);
    }
    
    public void eliminar (Marca marca){
        for(int i = 0; i < marcas.size(); i++){
            if(marcas.get(i).getId() == marca.getId()){
                marcas.remove(i);
                i--;
            }
        }
    }
    
    //Nose si detener el bucle con break o con una bandera (este ultimo es mejor)
    public void actualizar (Marca marca){
        for(int i = 0; i < marcas.size(); i++){
            if(marcas.get(i).getId() == marca.getId()){
                marcas.set(i, marca);
                break;
            }
        }
    }
    
    //Tradicionalemnte como retorno un ArrayList de marcas
    public ArrayList<Marca> retornarMarca(){
        ArrayList<Marca> cats = new ArrayList<Marca>();
        for(int i = 0; i < marcas.size(); i++){
            cats.add(marcas.get(i));
        }
        return cats;
    }
    
    public ArrayList<Marca> retornarMarca2(){
        return new ArrayList<Marca>(marcas);
    }
    
    public void mostrarDatos (){
        int i = 0;
        while(!marcas.isEmpty()){
            i++;
            System.out.println(marcas.get(i));
        }
    }
    
    public void mostrarDatos2(){
        for(int i = 0; i < marcas.size(); i++){
            System.out.println(marcas.get(i).getId()+" "+marcas.get(i).getNombre());
        }
    }    
}
