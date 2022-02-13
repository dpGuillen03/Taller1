/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto  Pais, sus atributos y metodos.
 * @author DiegoP
 */
public class Country {
    
    /**
     * Atributos de la Clase Objeto Pais
     */
    public String name;
    private int populationAmount;
    protected int squareKilometers;

    
    /**
     * Devuelve el nombre del pais
     * @return 
     */
    public String getName() {
        return name;
    }

    
    /**
     * Agrega o modifica el valor o dato del nombre del objeto Pais.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el valor (cantidad de habitantes) del Pais.
     * @return 
     */
    public int getPopulationAmount() {
        return populationAmount;
    }

    /**
     * Agrega/modifica el valor o dato (cantidad de habitantes) del Pais.
     * @param populationAmount 
     */
    public void setPopulationAmount(int populationAmount) {
        this.populationAmount = populationAmount;
    }

    /**
     * Devuelve el valor(kilomentros cuadrados) del Pais.
     * @return 
     */
    public int getSquareKilometers() {
        return squareKilometers;
    }
  
}
