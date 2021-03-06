/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_grupo2.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andya
 */
public class Usuario implements Serializable {
    private String user;
    private String contrasenia;
    
    public Usuario(String user, String contrasenia){
        this.user=user;
        this.contrasenia=contrasenia;
    }
    
    public String getUser(){
        return user;
    }
    
    public String getContrasenia(){
        return contrasenia;
        
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.user);
        hash = 73 * hash + Objects.hashCode(this.contrasenia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        return true;
    }
    
    
}
