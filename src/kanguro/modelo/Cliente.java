/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.modelo;

import java.util.ArrayList;

/**
 *
 * @author jburguca7.alumnes
 */
public class Cliente {
    
    private ArrayList<Servicio> listaServi;
    private String DNI;
    private String fullname;

    public Cliente(String DNI, String fullname) {
        this.DNI = DNI;
        this.fullname = fullname;
        this.listaServi = new ArrayList<>(); 
    }

    public ArrayList<Servicio> getListaServi() {
        return listaServi;
    }

    public void setListaServi(ArrayList<Servicio> listaServi) {
        this.listaServi = listaServi;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }  
    
}
