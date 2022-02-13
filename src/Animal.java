/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto Animal, sus atributos y metodos.
 * @author DiegoP
 */
public class Animal {
    
    /**
     * Atributos de la clase Objeto Animal.
     */
    private String name;
    protected int legs;
    public String environment;

    /**
     * Instancia un objeto de clase Animal, recibiendo los parametros completos de sus atributos.
     * @param name
     * @param legs
     * @param environment 
     */
    public Animal(String name, int legs, String environment) {
        this.name = name;
        this.legs = legs;
        this.environment = environment;
    }
    
    /**
     * Devuelve el nombre de Animal
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Agrega/modifica el dato (nombre) del Animal.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el dato(patas "cantidad de patas") del Animal.
     * @return 
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Devuelve el dato(ambiente) del animal.
     * @return 
     */
    public String getEnvironment() {
        return environment;
    }
    
    
}
