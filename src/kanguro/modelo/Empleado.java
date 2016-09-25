/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanguro.modelo;

/**
 *
 * @author jburguca7.alumns
 */
public class Empleado {
    
    private int age;
    private String fullname;
    private String address;
    private String poblacion;
    private float salary;
    private String tutor;

    public Empleado(int age, String fullname, String address, String poblacion, float salary) {
        this.age = age;
        this.fullname = fullname;
        this.address = address;
        this.poblacion = poblacion;
        this.salary = salary;
    }

    public Empleado(int age, String fullname, String address, String poblacion, float salary, String tutor) {
        this.age = age;
        this.fullname = fullname;
        this.address = address;
        this.poblacion = poblacion;
        this.salary = salary;
        this.tutor = tutor;
    }
    public String toString(){
        String s;
        if(age>17){
            s="Nombre: "+fullname+" Edad: "+age+" Direccion: "+poblacion+","+address+" Salario:"+salary;
        }
        else{
            s="Nombre: "+fullname+" Edad: "+age+" Tutor:"+tutor+" Direccion: "+poblacion+","+address+" Salario:"+salary;
        }
        return s;
    }
    
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
}
