
package com.unedol.inventariounedol.entidades;


public class Componente {
    private int id;
    private String nombre;
    private Marca marca;
    private Categoria categoria;
    private boolean funcionamiento;
    
    public Componente(){
        
    }
    
    public Componente(String nombre, Marca marca, Categoria categoria, boolean funcionamiento){
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.funcionamiento = funcionamiento;
    }
    
    public Componente(int id, String nombre, Marca marca, Categoria categoria, boolean funcionamiento){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.funcionamiento = funcionamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
    
    public String LeerComponentes (){
        return "Id: "+id+", Nombre: "+nombre+", Marca: "+marca.getNombre()+", Categoría: "+categoria.getNombre()+", funcionamiento: "+funcionamiento;
    }
    
}
