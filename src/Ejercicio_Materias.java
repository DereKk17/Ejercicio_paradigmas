import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_Materias {
    public static void main(String[] args) {
        String nombre;
        int cedula;
        final String [] ASIGNATURASDISPONIBLES = {"M. Modelacion Matematica", "A. Arquitectura de computadores", "F. Fisica Electromagentica","P. Paradigmas de Programacion", "E. Estructura de Datos lineales", "C. cultura Religiosa"};
        String [] asignaturasInscirtas;
        System.out.println("BIENVENIDO AL AREA DE INCRIPCION DE ASIGNATURAS");
        System.out.println("dijite el numero deseado para acceder al menu");

        System.out.println("1.revisar asignaturas disponibles");
        System.out.println("2. inscribir asignaturas");
        System.out.println("3. Cancelar asinaturas preinscritas");
        System.out.println("4. Mostrar asignaturas preinscritas");
        System.out.println("5. liquidar materia");

        int menu = 1;

        switch (menu){
            case 1:
                System.out.println(Arrays.toString(ASIGNATURASDISPONIBLES));


            case 2:

            case 3:
                Scanner cancelar = new Scanner(System.in);
                System.out.println(Arrays.toString(asignaturasInscirtas));
                System.out.println("ingrese la letra de la materia para cancelar : ");
               String materia = cancelar.next();
               if (materia =="a"){

               }


            case 4:
                System.out.println(Arrays.toString(asignaturasInscirtas));

            case 5:
                System.out.println("sus materias han sido inscritas correctamente?");
        }

        Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            nombre = entrada.next();
            System.out.print("Ingresa su cedula: ");
            cedula = entrada.nextInt();
            System.out.print(cedula);

    }
}
