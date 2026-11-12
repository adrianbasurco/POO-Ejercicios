package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo4 {
    public static void main(String[] args){
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", 50));
        estudiantes.add(new Estudiante("Fatima", 30));
        estudiantes.add(new Estudiante("Adrian", 30));
        estudiantes.add(new Estudiante("Pepe", 26));
        estudiantes.add(new Estudiante("David", 44));

        String buscado = "Gadiel";
        boolean encontrado = false;
        for(Estudiante estudi : estudiantes){
            if(estudi.getNombre().equals(buscado)){
                System.out.println("Encontrado: " + estudi);
                encontrado  = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No encontrado " + buscado);
        }
    }
}
