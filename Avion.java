package topGun;

public class Avion {
	int idAvion;
	String modAvion;
	int capAvion;
	Piloto piloto;// Atributo que almacena un objeto de clase Piloto

	// Creo constructor sin parámetros.
	public Avion() {

	}

	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {

		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	// Creación de los métodos getter y setter
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public void mostrarAvion() {
		// System.out.println("Nombre: " + getNombre());
		System.out.println("Identificación Avión:" + getIdAvion());
		System.out.println("Modelo avión:" + getModAvion());
		System.out.println(" Capacidad avión:" + getCapAvion());
		getPiloto().mostrarPiloto();// Consigo el piloto de la clase Piloto y luego muestro los datos del piloto.
	}

}
