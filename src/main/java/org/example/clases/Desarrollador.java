package org.example.clases;

import org.example.interfaces.IEvaluacionDesempeno;

import java.util.ArrayList;

public class Desarrollador extends Empleado implements IEvaluacionDesempeno {
    private ArrayList<String> lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario) {
        super(id, nombre, departamento, salario);
        this.lenguajes = new ArrayList<>();
        //Lenguajes como requisito para el trabajo
        lenguajes.add("Java");
        lenguajes.add("Oracle");
    }
    //AGREGAR LENGUAJES APRENDIDOS
    public void addLenguaje(String lenguaje) {
        lenguajes.add(lenguaje);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId() + ", Nombre: " + getNombre() + ", Departamento: " + getDepartamento() + ", Salario: " + getSalario() + ", Lenguajes: ");
        for (String index : lenguajes) {
            System.out.println(index);
        }
    }
    @Override
    public void calcularBono() {
        double sueldoBono = 0;
        if (lenguajes.size() == 2) {
            System.out.println(sueldoBono);
        } else if (lenguajes.size() <= 4) {
            sueldoBono = getSalario() * 0.5;
            System.out.println(sueldoBono);
        } else {
            System.out.println(getSalario());
        }
    }
    @Override
    public void evaluarDesempeno() {
        if (lenguajes.size() == 2) {
            System.out.println("DESEMPENO MALO");
        } else if (lenguajes.size() <= 4) {
            System.out.println("DESEMPENO REGULAR");
        } else {
            System.out.println("DESEMPENO BUENO");
        }
    }
}




