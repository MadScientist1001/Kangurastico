/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.controlador;

import java.util.Date;
import java.util.Scanner;
import kanguro.modelo.Cliente;
import kanguro.modelo.DatosKA;
import kanguro.modelo.Empleado;
import kanguro.modelo.Servicio;

/**
 *
 * @author jburguca7.alumnes
 */
public class Controlador {
    private DatosKA data = new DatosKA();
    
    public void newEmpleado(Scanner sc){
        int age;
        String fullname;
        String address;
        String poblacion;
        float salary;
        String tutor=" ";
        
        System.out.println("-REGISTRANDO EMPLEADO-");
        System.out.println("Nombre completo?");
        fullname=sc.next();
        System.out.println("Edad?");
        age=sc.nextInt();
        System.out.println("Direccion de su domicilio?");
        address=sc.next();
        System.out.println("Localidad?");
        poblacion=sc.next();
        System.out.println("Salario?");
        salary=sc.nextFloat();
        if(age<18){
            System.out.println("Avalador/Tutor del menor?");
            tutor=sc.next();
            data.getListEmpleado().add(new Empleado(age,fullname,address,poblacion,salary));
        }
        else{
            data.getListEmpleado().add(new Empleado(age,fullname,address,poblacion,salary,tutor));
        }

    }
    
    public void newCliente(Scanner sc){
        String fullname;
        String DNI;
        
        System.out.println("-REGISTRANDO CLIENTE-");
        System.out.println("Nombre completo?");
        fullname=sc.next();
        System.out.println("DNI?");
        DNI=sc.next();
        data.getListClientes().add(new Cliente(fullname,DNI));
    }
    
    public void newService(Scanner sc){
        String dni;
        String valoracion;
        Cliente cl = null;
        boolean found=false;
        
        System.out.println("-REGISTRANDO SERVICIO-");
        System.out.println("DNI del cliente?");
        dni=sc.next();
        for(int i = 0;i<data.getListClientes().size();i++){
                if(data.getListClientes().get(i).getDNI().equals(dni)){
                    cl=data.getListClientes().get(i);
                    found=true;
                }
            }
        if (found==true){
            System.out.println("valoracion del servivio?");
            valoracion=sc.next();
            cl.getListaServi().add(new Servicio(new Date(),valoracion));
        }
        else {
            System.out.println("No existe ningun cliente registrado con ese DNI.");
        }
        
    }
}
