/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.controlador;

import java.util.Scanner;
import kanguro.modelo.DatosKA;

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
        String tutor;
        
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
    }
    
    public void newService(Scanner sc){
        String dni;
        boolean found=false;
        
        System.out.println("-REGISTRANDO SERVICIO-");
        System.out.println("DNI del cliente?");
        dni=sc.next();
        for(int i = 0;i<data.getListClientes().size();i++){
                if(data.getListClientes().get(i).getDNI().equals(dni)){
                    found=true;
                }
            }
        if (found==true){
            
        }
        else {
            System.out.println("No existe ningun cliente registrado con ese DNI.");
        }
        
    }
}
