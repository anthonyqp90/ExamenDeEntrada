package org.example.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    //METODO CONSTRUCTOR
    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }
    //METODOS ABSTRACTOS
    public void mostrarDetalles() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Departamento: " + departamento + ", Salario: " + salario);
    }
    public void calcularBono() {
    }
}
