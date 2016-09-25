/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.modelo;

import java.util.Date;

/**
 *
 * @author jburguca7.alumnes
 */
public class Servicio {
    
    private Date date;
    private String valoracion;

    public Servicio(Date date, String valoracion) {
        this.date = date;
        this.valoracion = valoracion;
    }
    public String toString(){
        String s;
        s="Fecha "+date+" Valoracion "+valoracion;
        return s;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
    
    
}
