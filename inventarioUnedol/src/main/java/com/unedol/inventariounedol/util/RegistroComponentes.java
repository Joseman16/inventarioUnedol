
package com.unedol.inventariounedol.util;

import com.unedol.inventariounedol.entidades.Componente;
import java.util.ArrayList;

public class RegistroComponentes {
    ArrayList<Componente> componentes = new ArrayList<Componente>();
    
    public void insertar(Componente compt){
        componentes.add(compt);
    }
    
    public void eliminar(Componente compt){
        for(int i = 0; i < componentes.size(); i++){
            if(componentes.get(i).getId() == compt.getId()){
                componentes.remove(i);
                i--;
            }
        }
    }
    
    public void actualizar(Componente compt){
        for(int i = 0; i < componentes.size(); i++){
            if(componentes.get(i).getId() == compt.getId()){
                componentes.set(i, compt);
                break;
            }
        }
    }
    
    public ArrayList<Componente> retornarComponente(){
        return new ArrayList<Componente>(componentes);
    }
    
    public void mostrarDatos(){
        int i = 0;
        while(!componentes.isEmpty()){
            i++;
            System.out.println(componentes.get(i));
        }
        
    }
    
    public void mostarDatos2(){
        for(int i = 0; i < componentes.size(); i++){
            System.out.println(componentes.get(i));
        }
    }
    
    public void mostrarDatos3(){
        for(Componente compt: componentes){
            System.out.println(compt);
        }
    }
}
