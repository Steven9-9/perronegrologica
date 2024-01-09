package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);

        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        System.out.print("Ingrese su nombre: ");
        nombreCliente = leerDato.nextLine();

        System.out.print("Buenas tardes "+ nombreCliente + " de que pais nos visitas: ");
        paisCliente = leerDato.nextLine();

        System.out.print("Ingresa tu año de nacimiento: ");
        anoNacimientoCliente = leerDato.nextInt();

        System.out.print("Ingresa tu mes de nacimiento: ");
        mesNacimientoCliente = leerDato.nextInt();

        System.out.print("Ingresa tu dia de nacimiento: ");
        diaNacimientoCliente = leerDato.nextInt();

        int edadCliente = 2024 - anoNacimientoCliente;

        System.out.println("Su edad es: " + edadCliente);

        if(edadCliente >= 18) {

            System.out.println("Usted es mayor de edad");
            System.out.println("Nuestro menu de licores es: ");
            System.out.println("1... Botella de guaro --- 150 ");
            System.out.println("1... Botella de ron --- 180 ");
            
        }else{

            System.out.println("Usted es un niño vayase a mimir");

        }

        }
    }

