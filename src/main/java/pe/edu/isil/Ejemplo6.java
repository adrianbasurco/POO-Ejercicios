package pe.edu.isil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo6 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", 50));
        estudiantes.add(new Estudiante("Fatima", 30));
        estudiantes.add(new Estudiante("Adrian", 30));
        estudiantes.add(new Estudiante("Pepe", 26));
        estudiantes.add(new Estudiante("David", 44));

        boolean seElimino = estudiantes.removeIf(e -> e.getEdad() < 30);
        System.out.println("Se elimino alguno " + seElimino);
        System.out.println("Restantes: " + estudiantes.size());
        for(Estudiante estudiante: estudiantes){
            System.out.println(estudiante);
        }
    }
}