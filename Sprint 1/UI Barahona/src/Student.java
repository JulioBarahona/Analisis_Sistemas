
public class Student extends Persona{
	
	private boolean organizer = false;
	private int hourToDo;
	
	public boolean isOrganizer() {
		return organizer;
	}

	public void setOrganizer(boolean organizer) {
		this.organizer = organizer;
	}

	public int getHourToDo() {
		return hourToDo;
	}

	public void setHourToDo(int hourToDo) {
		this.hourToDo = hourToDo;
	}

	public Student(String nombre, String apellido, boolean organizer, int hourToDo) {
		super(nombre, apellido);
		this.organizer = organizer;
		this.hourToDo = hourToDo;
	}
}
