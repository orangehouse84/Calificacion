/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package orangehouse.calificacion;

import java.util.Scanner; // Para permitir al usuario ingresar datos

public class Calificacion {

    // Atributos tipo string y arreglo de la clase
    private String nombre;
    private double[] calificaciones = new double[5];

    // Constructor para inicializar los atributos
    public Calificacion(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final a partir del promedio y asigna calificacion de tipo caracter
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método principal para solicitar datos al usuario y mostrar resultados
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        double[] calificaciones = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la calificacion de la materia " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        Calificacion alumno = new Calificacion(nombre, calificaciones);
        double promedio = alumno.calcularPromedio();
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);
        System.out.println();
        System.out.println("Nombre del estudiante: " + nombre);
        
System.out.println();// Imprimir las calificaciones
for (int i = 0; i < calificaciones.length; i++) {
    System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);}
        System.out.println("\n");
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion final: " + calificacionFinal);

        scanner.close();
    }
}


