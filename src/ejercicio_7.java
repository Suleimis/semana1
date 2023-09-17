
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**********BIENVENIDOS**********");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese situación laboral (nombrado/contratado): ");
        String sl = sc.nextLine();
        System.out.print("Ingrese sueldo bruto (920-1800): ");
        double sb = sc.nextDouble();
        System.out.print("Ingrese AFP: ");
        String afp = sc.next();
        double afpPorcentaje = 0;
        if (afp.equals("profuturo")) {
            afpPorcentaje = 0.06;
        } else if (afp.equals("rimac")) {
            afpPorcentaje = 0.07;
        } else if (afp.equals("union")) {
            afpPorcentaje = 0.08;
        }
        double rmPorcentaje = 0;
        if (sl.equals("nombrado")) {
            rmPorcentaje = 0.08;
        } else if (sl.equals("contratado")) {
            rmPorcentaje = 0.05;
        }

        double dscAFP = sb * afpPorcentaje;
        double dscRm = sb * rmPorcentaje;
        double sueldoNeto = sb - dscAFP - dscRm;

        System.out.println("EL SUELDO NETO de " + nombre + " es: " + sueldoNeto);
        System.out.println("El AFP de " + nombre + " es: " + dscAFP);
        System.out.println("LA RENUMERACION de " + nombre + " es: " + dscRm);
    }
}
