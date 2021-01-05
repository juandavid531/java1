/*
Usar diagramas de venn para ver si el elemento ingresado a que conjunto pertenece (int, long, float, double, string, boolean, etcc) y asi decidir instrucciones,
con esto, evitar el try catch y que este mejor elaborado y posteriores ideas y pulir el codigo...

tbn pensar en filtrarlos; ejemplo: "sahdfg&/(%huh4548dsf2.1sdf3.156e12&/(0.213e-15juan&&pepe, caremonad, etc"
relacionar diagramas de venn, pertenece, esta contenido, comparten, disyuntas, etc

Evitar castear y permitir ciertos caracteres o combinaciones de estos, ademas permitir cierta longitud o estandar y que hacer en caso de no cumplir
Explorar limites y excepciones de los tipos de datos

en ath, configurarlo para dar mas billetes de un tipo u otro depende del stock de cada meneda

pulir la conversion de tiempo, usar double

Pulir la Aritmetica con todas las formas habidas y por haber, reforzar conceptos de proporcionalidad, limites y excepciones y probabilidad y estadistica

mostrar en tiempo real o paralelo la operacion como la conversion moneda de google, interesante fncion
*/
import java.util.Scanner;
public class menu{
	public static void main(String args[]){
		int menu=1;
		
		String opc1="1";
		String opc2="2";
		String opc3="3";
		String opc4="4";
		String opc21="21";
		//String out_menu="Exit";
		String out_menu="0";
		
		Scanner sc = new Scanner(System.in);
		
		while(menu != 0){
		System.out.println("\t\tMENU\n");
		System.out.println("\n\t01. Calcular Calendario");
		System.out.println("\t02. Calculador/Aritmetica (x,y)");
		System.out.println("\t03. Convertir Tiempo");
		System.out.println("\t04. ATM Cash");
		System.out.println("\t05. Sistema Internacional de Unidades");
		System.out.println("\t06. Problemas Unal, Ciclo I, Ciclo II & Ciclo III");
		System.out.println("\t07. Sistema Internacional de Unidades");
		System.out.println("\t08. Proporcionalidad");
		System.out.println("\t09. Matrices");
		System.out.println("\t10. Geometria");
		System.out.println("\t11. Logica Proposicional");
		System.out.println("\t12. Algebra's");
		System.out.println("\t13. Mecanografia");
		System.out.println("\t14. Simulador Cronometro & Temporizador");
		System.out.println("\t15. Elecronica Digial");
		System.out.println("\t16. Probabilidad, estadistica y grafos");
		System.out.println("\t17. plano cartesiano, graficar puntos por punto con eso de return o funciones, no lo entiendo");
		System.out.println("\t18. Ley de ohm y Circuitos Paralelos y en Serie");
		System.out.println("\t19. Practicar y reforzar conceptos de arrays y eso del for");
		System.out.println("\t20. Conversion entre monedas - tasas de cambio, leer tiorico banco santander");
		System.out.println("\t21. 3 variables: True or False");
		System.out.println("\t00. Exit\n\n");
		System.out.print("Ingrese Opcion: ");
		String dato = sc.nextLine();
		
			if(dato.equals(opc1)){
				int calendario=1;
				while(calendario != 0){

					System.out.print("Calcular Calendario: ");
					String tiempo = sc.nextLine();
					int numero = Integer.parseInt(tiempo);
					
					if(numero != 0){
					System.out.println("\t\t\t"+(numero/365)+" Year's");
					System.out.println("\t\t\t"+((numero%365)/30)+" Month's");
					System.out.println("\t\t\t"+((numero%365)%30)+" Day's");
					}else{
						calendario=0;
					}
				}	 
			}
			else if(dato.equals(opc2)){
				int Aritmetica=1;
				while(Aritmetica != 0){

				System.out.println("\t\tAritmetica");
				System.out.println("\t\t  (x,y)");
				System.out.println("01. Voy a Sumar");
				System.out.println("02. Voy a Restar");
				System.out.println("03. Voy a Multiplicar");
				System.out.println("04. Voy a Dividir");
				System.out.println("00. Voy a Salir");
				System.out.print("\nQue quiere hacer: ");
				String math = sc.nextLine();
				int Math = Integer.parseInt(math);
				if(Math != 0){
				if (Math == 1){
					int operacion=1;
					while(operacion != 0){
					System.out.print("Sumando 1: ");
					String numero1 = sc.nextLine();
					int num1 = Integer.parseInt(numero1);
					
					System.out.print("Sumando 2: ");
					String numero2 = sc.nextLine();
					int num2 = Integer.parseInt(numero2);
					
					if(num1 == 0 && num2 == 0){
					operacion=0;
					}else{
						System.out.println("\t\t\tLa suma es: "+(num1+num2));
					}
					}
				}
				else if (Math == 2){
					int operacion=1;
					while(operacion != 0){
					System.out.print("Minuendo: ");
					String numero1 = sc.nextLine();
					int num1 = Integer.parseInt(numero1);
					
					System.out.print("Sustraendo: ");
					String numero2 = sc.nextLine();
					int num2 = Integer.parseInt(numero2);
					
					if(num1 == 0 && num2 == 0){
					operacion=0;
					}else{
						System.out.println("\t\t\tLa Diferencia es: "+(num1-num2));
					}
					}
				}
				else if (Math == 3){
					int operacion=1;
					while(operacion != 0){
					System.out.print("Factor 1: ");
					String numero1 = sc.nextLine();
					int num1 = Integer.parseInt(numero1);
					
					System.out.print("Factor 2: ");
					String numero2 = sc.nextLine();
					int num2 = Integer.parseInt(numero2);
					
					if(num1 == 0 && num2 == 0){
					operacion=0;
					}else{
						System.out.println("\t\t\tEl producto es: "+(num1*num2));
					}
					}
				}
				else if (Math == 4){
					int operacion=1;
					while(operacion != 0){
					System.out.print("Dividendo: ");
					String numero1 = sc.nextLine();
					int num1 = Integer.parseInt(numero1);
					
					System.out.print("Divisor: ");
					String numero2 = sc.nextLine();
					int num2 = Integer.parseInt(numero2);
					
					if(num1 == 0 && num2 == 0){
					operacion=0;
					}else{
						System.out.println("\t\t\tLa Division es: "+(num1/num2));
					}
					}
				}else{
					System.out.println("Debe ingresar alguna de las 4 opciones");
				}
				}else{
					Aritmetica=0;
				}
				}
			}
			else if(dato.equals(opc3)){
				int tiempo=1;
				
				while(tiempo != 0){
					
					System.out.println("\t\tConvertir Tiempo\n");
					System.out.println("01. Dias -> Horas");
					System.out.println("02. Horas -> Dias");
					System.out.println("03. Dias -> Minutos");
					System.out.println("04. Minutos -> Dias");
					System.out.println("05. Dias -> Segundos");
					System.out.println("06. Segundos -> Dias");
					System.out.println("07. Horas -> Minutos");
					System.out.println("08. Minutos -> Horas");
					System.out.println("09. Horas -> Segundos");
					System.out.println("10. Segundos -> Horas");
					System.out.println("11. Minutos -> Segundos");
					System.out.println("12. Segundos -> Minutos");
					System.out.print("\nv: ");
					String convertirtiempo = sc.nextLine();
					int conversiontime = Integer.parseInt(convertirtiempo);
					
					if(conversiontime != 0){
					if(conversiontime==1){
					System.out.println("01. Dias -> Horas");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Dias: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Dias, hay "+(diaS*24)+" Horas");
						}else{
							timetime=0;
						}
						}
					}
					else if(conversiontime==2){
					System.out.println("02. Horas -> Dias");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Horas: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Horas, hay "+(diaS/24)+" Dias");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==3){
					System.out.println("03. Dias -> Minutos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Dias: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Dias, hay "+((diaS*24)*60)+" Minutos");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==4){
					System.out.println("04. Minutos -> Dias");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Minutos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Minutos, hay "+((diaS/24)/60)+" Dias");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==5){
					System.out.println("05. Dias -> Segundos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Dias: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Dias, hay "+(((diaS*24)*60)*60)+" Segundos");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==6){
					System.out.println("06. Segundos -> Dias");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Segundos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Segundos, hay "+(((diaS/24)/60)/60)+" Dias");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==7){
					System.out.println("07. Horas -> Minutos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Horas: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Horas, hay "+(diaS*60)+" Minutos");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==8){
					System.out.println("08. Minutos -> Horas");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Minutos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Minutos, hay "+(diaS/24)+" Horas");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==9){
					System.out.println("09. Horas -> Segundos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Horas: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Horas, hay "+((diaS*60)*60)+" Segundos");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==10){
					System.out.println("10. Segundos -> Horas");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Segundos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Segundos, hay "+((diaS/60)/60)+" Horas");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==11){
					System.out.println("11. Minutos -> Segundos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Minutos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Minutos, hay "+(diaS*60)+" Segundos");
						}else{
							timetime = 0;
						}
						}
					}
					else if(conversiontime==12){
					System.out.println("12. Segundos -> Minutos");
						int timetime = 1;
						while(timetime != 0){
						System.out.print("    Ingrese Segundos: ");
						String dias = sc.nextLine();
						int diaS = Integer.parseInt(dias);
						if(diaS != 0){
						System.out.println("En "+diaS+" Segundos, hay "+(diaS/60)+" Minutos");
						}else{
							timetime = 0;
						}
						}
					}
					else{
					System.out.println("Debe ingresar alguna de las 12 opciones");
					}
					}
					else{
						tiempo=0;
					}
				}
			}
			else if(dato.equals(opc4)){
				int cajero=1;
				while(cajero != 0){

				System.out.print("\nIngrese el Monto a Retirar: $");
				String Num1 = sc.nextLine();
				int cash = Integer.parseInt(Num1);
				
				if(cash != 0){
				if(cash >=10000 && (cash%10000)==0){
					System.out.println((cash/100000)+" x $100.000");
					System.out.println((((cash%100000)/50000))+" x $50.000");
					System.out.println(((((cash%100000)%50000)/20000))+" x $20.000");
					System.out.println((((((cash%100000)%50000)%20000)/10000))+" x $10.000");
					System.out.println("0 x $ 5.000");
					System.out.println("0 x $ 2.000");
					System.out.println("0 x $ 1.000");
					System.out.println("0 x $   500");
					System.out.println("0 x $   200");
					System.out.println("0 x $   100");
					System.out.println("0 x $    50");
				}else{
					System.out.println("Ingrese un monto valido");
				}
				}else{
					cajero = 0;
				}
				}
			}
			else if(dato.equals(opc21)){
				int trueorfalse=1;
				while(trueorfalse != 0){

					System.out.print("0 - 9: ");
					String tiempo = sc.nextLine();
					int numero = Integer.parseInt(tiempo);
					if(numero != 123){
////////////////////////////////////////////////////////////////////////////////////////////////////
					if(numero >-1 && numero <10){
						if(numero == 0){
							System.out.println("\t\t"+numero+" = 0");
						}else{
							if(numero == 1){
							System.out.println("\t\t"+numero+" = 1");
							}else{
								if(numero == 2){
								System.out.println("\t\t"+numero+" = 2");
								}else{
									if(numero == 3){
									System.out.println("\t\t"+numero+" = 3");
									}else{
										if(numero == 4){
										System.out.println("\t\t"+numero+" = 4");
										}else{
											if(numero == 5){
											System.out.println("\t\t"+numero+" = 5");
											}else{
												if(numero == 6){
												System.out.println("\t\t"+numero+" = 6");
												}else{
													if(numero == 7){
													System.out.println("\t\t"+numero+" = 7");
													}else{
														if(numero == 8){
														System.out.println("\t\t"+numero+" = 8");
														}else{
															System.out.println("\t\t"+numero+" = 9");
														}
													}
												}
											}
										}
									}
								}
							}
						}
//Flecha de la Muerte, falta el abecedario
////////////////////////////////////////////////////////////////////////////////////////////////////
					}else{
						System.out.println("Debe ingresar un numero entre 0 & 9");
					}
////////////////////////////////////////////////////////////////////////////////////////////////////
					}else{
						trueorfalse=0;
					}
				}	 
			}
			else if(dato.equals(out_menu)){
				menu=0;
				System.out.println("Ha terminado.");
			}
			else{
				System.out.println("\t\t\tDebe ingresar alguna de las opciones\n\n\n");
			}
		}
	}
}