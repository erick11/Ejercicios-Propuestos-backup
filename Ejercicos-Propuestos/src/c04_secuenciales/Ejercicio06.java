package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio06 {

        /*
         * 06) Una cl�nica ha recibido una donaci�n en d�lares que debe ser
         * repartida entre sus servicios de atenci�n, de la siguiente manera:
         * Medicina general,50% de la donaci�n 
         * Ginecolog�a, 30% de la donaci�n 
         * Pediatr�a, 30% del monto recibido por Medicina general 
         * Traumatolog�a, lo que resta de la donaci�n //...........................................
         */

        public static void main(String[] args) {

                //Declaracion de Variables 
                Scanner sc = new Scanner(System.in);
                double don_cli;
                double mon_meG, mon_gin, mon_ped, mon_tra;              
                //Lectura de datos 
                System.out.println("Ingrese su Donacion por favor: ");
                don_cli= Double.parseDouble(sc.nextLine());

                //Proceso de calculo
                mon_meG = don_cli*0.5;
                mon_gin = don_cli*0.30;
                mon_ped = don_cli*0.5*0.30;
                mon_tra = don_cli - (mon_meG + mon_gin + mon_ped);
                
                //Salida de Resultados
                System.out.println("Monto de Medicina General: "+ mon_meG);
                System.out.println("Monto de Ginecologia: "+ mon_gin);
                System.out.println("Monto de Pediatr�a: "+ mon_ped);
                System.out.println("Monto de Traumatolog�a: "+ mon_tra);
        }
}