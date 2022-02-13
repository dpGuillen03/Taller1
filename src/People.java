
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto Persona, sus atributos y metodos.
 * @author DiegoP
 */
public class People {
    
    /**
     * Atributos de la clase objeto Persona
     */
    public String name;
    public String lastName1;
    public String lastNAme2;
    public Date dateBirth;
    public float height;

    
    /**
     * Devuelve el nombre del Objeto Persona.
     * @return nombre
     */
    public String getName() {
        return name;
    }
    
    /**
     * Agrega o Modifica el valor del nombre del Objeto Persona.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
      
}
