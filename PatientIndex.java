package assign02;

import java.util.Comparator;
import java.util.TreeMap;

public class PatientIndex {
	private TreeMap<UHealthID, String> member;

	public PatientIndex() {

		this.member = new TreeMap<>((id1, id2) -> id1.toString().compareTo(id2.toString()));

	}
	void addPatient(Patient p){
        UHealthID id = p.getUHealthID();
        String name = p.getFirstName() + " " + p.getLastName();

        member.put(id, name);
    }

    void removePatient(Patient p){
        member.remove(p.getUHealthID());
    }

    String getName(UHealthID id){
        return member.get(id);
    }
}