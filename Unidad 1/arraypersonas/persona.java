/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpersonas;

/**
 *
 * @author Gerar
 */
public class persona {
    private int nume;
    private String nombre;
    private int edad;
    
    
    public persona(){
        
        
    }
    
     public persona(int nume, String nombre,int edad){
        this.nume =nume;
        this.nombre=nombre;
        this.edad=edad;
        
    }

    /**
     * @return the nume
     */
    public int getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(int nume) {
        this.nume = nume;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
