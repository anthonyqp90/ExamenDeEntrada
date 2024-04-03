package org.example.clases;

import org.example.interfaces.IEvaluacionDesempeno;

import java.util.ArrayList;

public class Gerente extends Empleado implements IEvaluacionDesempeno {
    private ArrayList<Desarrollador> equipo;
    public Gerente(int id, String nombre, String departamento, double salario) {
        super(id, nombre, departamento, salario);
        equipo = new ArrayList<>();
    }

    public void addDesarrollador(Desarrollador empleado) {
        equipo.add(empleado);
    }

    public void removeDesarrolador(Desarrollador empleado) {
        equipo.remove(empleado);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId() + ", Nombre: " + getNombre() + ", Departamento: " + getDepartamento() + ", Salario: " + getSalario());
        for (Desarrollador index : equipo) {
            index.mostrarDetalles();
        }
    }
    @Override
    public void calcularBono() {
        double sueldoBono=0;
        if (equipo.size()==1){
            System.out.println(sueldoBono);
        } else if (equipo.size()<=3) {
            sueldoBono=getSalario()*0.5;
            System.out.println(sueldoBono);
        }
        else{
            System.out.println(getSalario());
        }
    }
    @Override
    public void evaluarDesempeno() {
        if (equipo.size()<=1){
            System.out.println("DESEMPENIO MALO");
        } else if (equipo.size()<=3) {
            System.out.println("DESMPENO REGULAR");
        }
        else{
            System.out.println("DESEMPENO BUENO");
        }
    }
}
