
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto Fruta, sus atributos y metodos.
 * @author DiegoP
 */
public class Fruit {
    
    /**
     * Atributos de la clase Objeto Fruta.
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    
    /**
     * Devuelve el valor de los colores del objeto Fruta
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Agrega valores al atributo color del Objeto Fruta.
     * @param name parametro de entrada para el valor o dato del color agregado
     */
    public void setColors(String name) {
        this.colors.add(name);
    }
     
    
}
