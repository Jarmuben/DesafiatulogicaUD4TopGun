package topGun;

//Avión es genérico y avion de entremaniento es algo más especializado lo que implica que hereda de avión.
public class Entrenamiento extends Avion {

	boolean tieneDobleMando;

	// Constructor sin parametro

	public Entrenamiento() {
		// Invoca al constructor sin parámetros de la clase Padre (Avion)
		super();

	}

	// Inicialización atributos propios clase Pájaro
	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		// Invoca al constructor de la clase Padre con Parámetros.
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;

	}
	// Creo los get y set

	public boolean getTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}

	// Debo mostrar la información del avion de la clase padre porque no se
	// especifica de ningun tipo de avión en especifico sino general.
	@Override
	public void mostrarAvion() {
		super.mostrarAvion();

		System.out.println("Tiene doble mando: " + (getTieneDobleMando() ? "Si" : "No"));
	}

}
