/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa la clase del Objeto Cuenta Bancaria, sus atributos y metodos.
 * @author DiegoP
 */
public class BanckAccounts {
    
    /**
     * Atributos de la Clase Objeto Cuenta Bancaria.
     */
    public int accountNumber;
    protected boolean activated;

    
    /**
     * Representa la activacion o desactivacion de la cuenta bancaria (true/false).
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    /**
     * Devuelve el valor o estado (activo o desactivado) de la cuenta bancaria
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }
    
    
    
    
}
