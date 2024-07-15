package assign02;

import java.util.GregorianCalendar;

public class CurrentPatientGeneric<Type> extends Patient{

	private Type assignedPhysician;
	private GregorianCalendar lastVisit;
	
	
	public CurrentPatientGeneric(String firstName, String lastName, UHealthID uHealthID, Type physician, GregorianCalendar lastVisit) {
		super(firstName, lastName, uHealthID);
		this.assignedPhysician = physician;
		this.lastVisit = lastVisit;
		// TODO Auto-generated constructor stub
		
	}
	public Type getPhysician() {
		return assignedPhysician;
		
	}
	public GregorianCalendar getLastVisit() {
		return lastVisit;
		
	}
	public void updatePhysician(Type newPhysician) {
		this.assignedPhysician = newPhysician;

	}
	public void updateLastVisit(GregorianCalendar date) {
		this.lastVisit = date;

	}
}
