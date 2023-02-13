package com.uniovi.sdi2223908spring.entities;

public class Teacher {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String categoria;

    public Teacher(Long id, String dni, String nombre,String apellido,String categoria){
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.categoria = categoria;
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDni(){
        return dni;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCategoria(){
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(){
        return "DNI: " + getDni() + " Nombre: " + getNombre()
                + " Apellido : " + getApellido() + " Categoria: " + getCategoria();
    }
}
