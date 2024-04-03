package org.example;

import org.example.clases.Desarrollador;
import org.example.clases.Empleado;
import org.example.clases.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Instancear empleados
        Desarrollador empleado1 = new Desarrollador(101, "anthony cristian", "BackEnd", 3000);
        Desarrollador empleado2 = new Desarrollador(102, "kevin cajahuanca", "FrontEnd", 400);
        Desarrollador empleado3 = new Desarrollador(103, "carlos pelinco", "QA", 1500);
        Desarrollador empleado4 = new Desarrollador(104, "chibolo", "BackEnd", 3000);
        Desarrollador empleado5 = new Desarrollador(105, "nelson", "BackEnd", 8000);
        Desarrollador empleado6 = new Desarrollador(106, "diego", "BackEnd", 8000);

        //Intancear gerentes
        Gerente gerente1 = new Gerente(206, "Patron YULL", "Gerencia", 20000);

        //Lenguaje aprendidos
        empleado1.addLenguaje("PYTHON");
        empleado1.addLenguaje("PHP");
        empleado2.addLenguaje("JAVA SCRIPT");
        empleado3.addLenguaje("RUBY");
        empleado3.addLenguaje("GO");
        empleado3.addLenguaje("C++");
        empleado5.addLenguaje("Swift");

        //Empleados a cargo del gerente
        gerente1.addDesarrollador(empleado1);
        gerente1.addDesarrollador(empleado2);
        gerente1.addDesarrollador(empleado3);
        gerente1.addDesarrollador(empleado4);
        gerente1.addDesarrollador(empleado5);
        gerente1.addDesarrollador(empleado6);

        //Empleado despedido
        gerente1.removeDesarrolador(empleado6);

        //Imprimir datos de gerente
        gerente1.mostrarDetalles();
        System.out.println(" ");

        //Imprimir bono de empleados
        empleado1.evaluarDesempeno();
        empleado1.calcularBono();
        System.out.println(" ");
        empleado4.evaluarDesempeno();
        empleado4.calcularBono();
        System.out.println(" ");
        empleado3.evaluarDesempeno();
        empleado3.calcularBono();



    }

}
