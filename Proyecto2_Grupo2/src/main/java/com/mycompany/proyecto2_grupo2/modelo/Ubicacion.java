/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_grupo2.modelo;

import java.io.Serializable;

/**
 *
 * @author rociomera
 */
public class Ubicacion implements Serializable{
    private double x; //Manzana
    private double y; //Villa
    public Ubicacion(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    /**
     * calcula la distancia cartesiana entre la ubicacion pasada 
     * como parametro y el objeto que llama a la funcion
     * d =  ( (x2 - x1)^2 + (y2 - y1)^2 )^1/2
     * */
    public double calcularDistancia(Ubicacion u){
        return Math.sqrt(Math.pow(u.x-x,2) + Math.pow(u.y - y,2));
    }

    @Override
    public String toString() {
        return "\nMz= " +x+",\nVilla="+y;
    }
    
    public String toCSV() {
        return getX()+":"+getY();
    }
    
    
}
