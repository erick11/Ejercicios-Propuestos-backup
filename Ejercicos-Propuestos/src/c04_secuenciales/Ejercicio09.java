package c04_secuenciales;

import java.util.Scanner;

public class Ejercicio09 {

	/*
	09) 
	Dados dos tanques llenos de agua cuyas capacidades est�n dadas en litros 
	y en yardas c�bicas.  De la  cantidad total de agua: el 75% se dedica al 
	consumo dom�stico y el 25% se dedica al riego. Dise�e un programa que 
	haga lo siguiente: 
 
	Determine la cantidad total de agua expresada en metros c�bicos y en pies 
	c�bicos. 
	Determine las cantidades de agua dedicadas al riego y al consumo 
	dom�stico expresadas en metros c�bicos y en pies c�bicos.  
 
	Considere los siguientes factores de conversi�n: 
 
	1 pie c�bico = 0.0283 metros c�bicos 
	1 metro c�bico = 1000 litros 
	1 yarda c�bica = 27 pies c�bicos 
	 
	*/
	
	public static void main(String[] args) {
		
		//Declaracion de variables
		Scanner sc = new Scanner(System.in);
		double T1_lit, T2_yar;
		double can_riego_metros, can_riego_pies, can_consumo_metros, can_consumo_pies;
		
		//Lectura de datos
		System.out.println("Ingrese la cantidad para el primer Tanque (litros)");
		T1_lit = Double.parseDouble(sc.nextLine());
		System.out.println("Ingrese la cantidad para el segundo Tanque (pies)");
		T2_yar = Double.parseDouble(sc.nextLine());
	
		//Proceso de calculo
		can_riego_metros =  (1000*(0.25 * T1_lit)) +(0.0283/27/(0.25 * T2_yar));
		can_riego_pies = 0.0283 * can_riego_metros;
		
		can_consumo_metros =  (1000*(0.75 * T1_lit)) +(0.0283/27/(0.75 * T2_yar));
		can_consumo_pies = 0.0283 * can_consumo_metros;
		
		//Salida de Resultados
		System.out.println("Tanque 1 metros: "+ (1000*(0.25 * T1_lit)));
		System.out.println("Tanque 2 metros: "+ (0.0283/27/(0.25 * T2_yar)));
		
		System.out.println("Cantidad de Agua para el Consumo en metros: " + can_consumo_metros);
		System.out.println("Cantidad de Agua para el Consumo en Pies: " + can_consumo_pies);
		System.out.println("Cantidad de Agua para el Riego en metros: " + can_riego_metros);
		System.out.println("Cantidad de Agua para el Riego en Pies: " + can_consumo_pies);
		
	}
}
