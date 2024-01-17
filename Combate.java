package topGun;

public class Combate extends Avion {

	boolean esFurtivo;

	// constructor sin parámetro

	public Combate() {
		// Invoca al constructor sin parametros de la clase Padre (Avion)
		super();

	}

	// Inicialización atributos propios clase Pájaro
	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		// Invoca al constructor de la clase Padre con Parámetros.
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;

	}
	// Creo los get y set

	public boolean getEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

	// Debo mostrar la información del avion de la clase padre porque no se
	// especifica de ningun tipo de avión en especifico sino general.
	@Override
	public void mostrarAvion() {
		super.mostrarAvion();

		System.out.println("Es furtivo: " + (getEsFurtivo() ? "Si" : "No"));
	}

}
