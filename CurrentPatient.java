package assign02;

import java.util.GregorianCalendar;

public class CurrentPatient extends Patient{

	private int assignedPhysician;
	private GregorianCalendar lastVisit;
	
	
	public CurrentPatient(String firstName, String lastName, UHealthID uHealthID, int physician, GregorianCalendar lastVisit) {
		super(firstName, lastName, uHealthID);
		this.assignedPhysician = physician;
		this.lastVisit = lastVisit;
		// TODO Auto-generated constructor stub
		
	}
	public int getPhysician() {
		return assignedPhysician;
		
	}
	public GregorianCalendar getLastVisit() {
		return lastVisit;
		
	}
	public void updatePhysician(int newPhysician) {
		this.assignedPhysician = newPhysician;
	}
	public void updateLastVisit(GregorianCalendar date) {
		this.lastVisit = date;
	}
}
