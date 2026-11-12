package pe.edu.isil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo5 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", 50));
        estudiantes.add(new Estudiante("Fatima", 30));
        estudiantes.add(new Estudiante("Adrian", 30));
        estudiantes.add(new Estudiante("Pepe", 26));
        estudiantes.add(new Estudiante("David", 44));

        Iterator<Estudiante> iterator = estudiantes.iterator();
        while (iterator.hasNext()) {
            Estudiante actual = iterator.next();
            if (actual.getNombre().equals("Fatima")) {
                iterator.remove();
                break;
            }
        }
        System.out.println("Registrados : " + estudiantes.size());
        for(Estudiante estudiante: estudiantes){
            System.out.println(estudiante);
        }

    }
}
