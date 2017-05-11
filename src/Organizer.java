
public class Organizer extends Persona {

	private boolean organizer = true;

	public boolean isOrganizer() {
		return organizer;
	}
	public void setOrganizer(boolean organizer) {
		this.organizer = organizer;
	}
	public Organizer(String nombre, String apellido, boolean organizer) {
		super(nombre, apellido);
		this.organizer = organizer;
	}
	
	
}
