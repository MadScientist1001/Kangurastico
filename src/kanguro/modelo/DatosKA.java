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
public class DatosKA {
    private ArrayList<Cliente> listClientes;
    private ArrayList<Empleado> listEmpleado;

    public DatosKA() {
        listClientes = new ArrayList();
        listEmpleado = new ArrayList();
    }

    public ArrayList<Cliente> getListClientes() {
        return listClientes;
    }

    public ArrayList<Empleado> getListEmpleado() {
        return listEmpleado;
    }

}
