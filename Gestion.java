package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "Capitán");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

		// Le pido al usuario que introduzca los datos que solicito
		System.out.println("Introduzca los datos de dos pilotos según se le indique");

		System.out.println("Piloto 4: Introduzca el nombre");
		String nombre4 = sc.nextLine();

		System.out.println("Piloto 4: Introduzca las horas de vuelo");
		int horas4 = sc.nextInt();
		sc.nextLine();//

		System.out.println("Piloto 4: Introduzca el rango");
		String rango4 = sc.nextLine();

		System.out.println("Piloto 5: Introduzca el nombre");
		String nombre5 = sc.nextLine();

		System.out.println("Piloto 5: Introduzca las horas de vuelo");
		int horas5 = sc.nextInt();
		sc.nextLine();

		System.out.println("Piloto 5: Introduzca el rango");
		String rango5 = sc.nextLine();

		Piloto piloto4 = new Piloto(4, nombre4, horas4, rango4);
		Piloto piloto5 = new Piloto(5, nombre5, horas5, rango5);

		// Muestro la información del piloto1 y 3 usando método mostrarPiloto y sale por
		// pantalla
		// Le pido que me ponga los datos del 4 y 5 pero yo saco por pantalla del 1 y 3.
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();

		// Ahora saco por pantalla la información del 4 y 5
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();

		Entrenamiento entrenamiento1 = new Entrenamiento(1, "Into", 50, piloto1, true);

		Combate combate1 = new Combate(3, "Inso", 60, piloto2, true);
		Combate combate2 = new Combate(4, "Insolo", 70, piloto3, false);
		System.out.println("Introduzca la información solicitada a continuación");

		System.out.println("Avión1: Introduzca el modelo de avión");
		String nombre1 = sc.nextLine();

		System.out.println("Avión: Introduzca la capacidad de pasajeros");
		int capacidad1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Avión1: Introduzca si tiene doble mando");
		boolean tieneDobleMando1 = sc.nextBoolean();
		sc.nextLine();

		System.out.println("Avión2: Introduzca el modelo de avión");
		String nombre2 = sc.nextLine();

		System.out.println("Avión2: Introduzca la capacidad de pasajeros");
		int capacidad2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Avión2: Introduzca si tiene doble mando");
		boolean tieneDobleMando2 = sc.nextBoolean();
		sc.nextLine();

		Entrenamiento entrenamiento2 = new Entrenamiento(2, nombre1, capacidad1, piloto4, tieneDobleMando1);
		Entrenamiento entrenamiento3 = new Entrenamiento(5, nombre2, capacidad2, piloto5, tieneDobleMando2);

		// Me sale por pantalla los datos de todos los aviones.
		combate1.mostrarAvion();
		combate2.mostrarAvion();
		entrenamiento1.mostrarAvion();
		entrenamiento2.mostrarAvion();
		entrenamiento3.mostrarAvion();

	}

}
