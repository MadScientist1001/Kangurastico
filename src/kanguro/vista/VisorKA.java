/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.vista;

import java.util.Scanner;
import kanguro.controlador.Controlador;

/**
 *
 * @author jburguca7.alumnes
 */
public class VisorKA {
    private Controlador ctrl;
    
    public int menuInicio(Scanner sc){
        int op;
        System.out.println("------KANGUROS------");
        System.out.println("1:Registrar Cliente");
        System.out.println("2:Registrar Empleado");
        System.out.println("3:Registrar Servicio");
        System.out.println("4:Editar informacion");
        System.out.println("5:Salir");
        op=sc.nextInt();
        return op;
    }
    
    public int menuEditar(Scanner sc){
        int op;
        System.out.println("----KANGUROS-Editar----");
        System.out.println("1:Mostrar Clientes");
        System.out.println("2:Mostrar Empleados");
        System.out.println("3:Editar Cliente");
        System.out.println("4:Editar Empleado");
        System.out.println("5:Atras");
        op=sc.nextInt();
        return op;
    }
    
    public void gestionMenu(){
        Controlador ctrl = new Controlador();
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        while(opcion!=5){
            opcion=menuInicio(sc);
            if (opcion==1){
            //REGISTRA CLIENTE
            ctrl.newCliente(sc);
            }
            if (opcion==2){
            //REGISTRA EMPLEADO
            ctrl.newEmpleado(sc);
            }
            if (opcion==3){
            //REGISTRA SERVICIO
            ctrl.newService(sc);
            }
            if (opcion==4){
                while(opcion!=5){
                    opcion=menuEditar(sc);
                    if(opcion==1){
                    //LISTA CLIENTES
                    }
                    if(opcion==2){
                    //LISTA EMPLEADOS
                    }
                    if(opcion==3){
                    //EDITAR CLIENTE
                    }
                    if(opcion==4){
                    //EDITAR EMPLEADO
                    }
                }
                opcion=0;
            }   
        }
        
    
    
    
    }
    
}
