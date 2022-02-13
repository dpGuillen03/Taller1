/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto Empresa, sus atributos y metodos.
 * @author DiegoP
 */
public class Business {
    
    /**
     * Atributos de la Clase Objeto Empresa.
     */
    private String name;
    public int employees;
    protected String location;
    
    /**
     * Devuelve el dato (nombre) de la Empresa.
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Agreaga/Modifica el dato(nombre) de la Empresa.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el dato(cantidad de Empleados) de la Empresa.
     * @return 
     */
    public int getEmployees() {
        return employees;
    }

    /**
     * Agrega/modifica el dato (cantidad de Empleados) de la Empresa.
     * @param employees 
     */
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    /**
     * Devuelve el dato (Ubicacion) de la Empresa.
     * @return 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Agrega/modifica el dato(Ubicacion) de la Empresa.
     * @param location 
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    
}
