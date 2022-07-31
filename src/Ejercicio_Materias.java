import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_Materias {
    public static void main(String[] args) {
        String nombre;
        int cedula;
        Scanner entrada = new Scanner(System.in);

        final String [] ASIGNATURASDISPONIBLES = {"M. Modelacion Matematica", "A. Arquitectura de computadores", "F. Fisica Electromagentica","P. Paradigmas de Programacion", "E. Estructura de Datos lineales", "C. cultura Religiosa"};
        ArrayList<String> asignaturasInscritas = null;
        System.out.println("BIENVENIDO AL AREA DE INCRIPCION DE ASIGNATURAS");
        System.out.println("dijite el numero deseado para acceder al menu");

        System.out.println("1.revisar asignaturas disponibles");
        System.out.println("2. inscribir asignaturas");
        System.out.println("3. Cancelar asinaturas preinscritas");
        System.out.println("4. Mostrar asignaturas preinscritas");
        System.out.println("5. liquidar materia");
        System.out.println("6. salir");

        int menu = 1;

        switch (menu){
            case 1:

            case 2:
                System.out.println(Arrays.toString(ASIGNATURASDISPONIBLES));

                System.out.print("Ingrese la letra de la materia para inscribir: ");
                String materia = entrada.next();
                if (materia == "m"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[0]);
                }else if(materia == "a"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[1]);
                }else if(materia == "f"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[2]);
                }else if(materia == "p"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[3]);
                }else if(materia == "e"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[4]);
                }else if(materia == "c"){
                    asignaturasInscritas.add(ASIGNATURASDISPONIBLES[5]);
                }
            case 3:

            case 4:

            case 5:

            case 6:

        }

    }
}
