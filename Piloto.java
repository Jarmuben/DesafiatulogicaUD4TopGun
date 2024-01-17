//Piloto no es una clase especializada de avión por lo que no hereda de avión.
package topGun;

public class Piloto {
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

	// Creo constructor sin parametros

	public Piloto() {

	}

	// Ahora el constructor con parametros.
	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;

	}
	// Creación de los métodos getter y setter

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

	public void mostrarPiloto() {
		// System.out.println("Nombre: " + getNombre());

		System.out.println("Identificación Piloto:" + getIdPiloto());
		System.out.println("Nombre:" + getNomPiloto());
		System.out.println("Horas de vuelo:" + getHorasVueloPiloto());
		System.out.println("Rango Piloto:" + getRangoPiloto());

	}

}
