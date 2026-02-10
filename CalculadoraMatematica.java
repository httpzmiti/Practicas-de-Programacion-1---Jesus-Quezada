package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
import java.util.Scanner;

/**
 * Clase CalculadoraMatematica que implementa operaciones matematicas basicas.
 * Utiliza principios de programacion estructurada y orientada a objetos.
 */
public class CalculadoraMatematica {

    // Atributos privados
    private double numero1;
    private double numero2;

    /**
     * Constructor por defecto que inicializa los numeros en 0.
     */
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    /**
     * Establece los valores de los dos numeros.
     * @param num1 primer numero
     * @param num2 segundo numero
     */
    public void ingresarNumeros(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
        System.out.println("Numeros ingresados correctamente.");
    }

    /**
     * Realiza la suma de los dos numeros.
     * @return resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Realiza la resta entre los dos numeros.
     * @return resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Realiza la multiplicacion entre los dos numeros.
     * @return resultado de la multiplicacion
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Realiza la division entre los dos numeros, con manejo de excepcion si el divisor es cero.
     * @return resultado de la division
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir() throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("Error: Division por cero.");
        }
        return numero1 / numero2;
    }

    /**
     * Muestra el menu interactivo de opciones para el usuario.
     */
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        
        // Primero, se ingresan los numeros
        ingresarNumeros(0, 0); // Ingreso inicial de numeros predeterminados para evitar error por valores no inicializados
        
        do {
            System.out.println("===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");
            
            opcionMenu = scanner.nextInt();
            
            switch (opcionMenu) {
                case 1:
                    // Se ingresan los numeros
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = scanner.nextDouble();
                    ingresarNumeros(numero1, numero2);
                    break;
                case 2:
                    // Operacion de Suma
                    System.out.println("Resultado de la suma: " + sumar());
                    break;
                case 3:
                    // Operacion de Resta
                    System.out.println("Resultado de la resta: " + restar());
                    break;
                case 4:
                    // Operacion de Multiplicacion
                    System.out.println("Resultado de la multiplicacion: " + multiplicar());
                    break;
                case 5:
                    // Operacion de Division
                    try {
                        System.out.println("Resultado de la division: " + dividir());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    // Salir
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        } while (opcionMenu != 0);
        
        scanner.close();
    }

    public static void main(String[] args) {
        // Crear una instancia de la calculadora y mostrar el menu
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        calculadora.mostrarMenu();
    }
}
