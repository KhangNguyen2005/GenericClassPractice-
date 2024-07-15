package assign02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatientIndexTest {

	private Patient patient1;
	private Patient patient2;
	private Patient patient3;
	private PatientIndex patientIndex;

	@BeforeEach
	void setUp() throws Exception {
		patient1 = new Patient("Ryan", "Do", new UHealthID("AAAA-1231"));
		patient2 = new Patient("Khang", "Nguyen", new UHealthID("ADAC-9345"));
		patient3 = new Patient("Nhi", "Nguyen", new UHealthID("ABDU-6941"));

		patientIndex = new PatientIndex();
	}

	@Test
	public void addPatient() {
		patientIndex.addPatient(patient3);

		assertEquals("Nhi Nguyen", patientIndex.getName(new UHealthID("ABDU-6941")));
	}

	@Test
	public void removePatient() {
		patientIndex.removePatient(patient3);

		assertFalse("Nhi Nguyen".equals(patientIndex.getName(new UHealthID("ABDU-6941"))));
	}

	@Test
	public void getName() {
		patientIndex.addPatient(patient1);
		patientIndex.addPatient(patient2);
		patientIndex.addPatient(patient3);

		assertEquals("Khang Nguyen", patientIndex.getName(new UHealthID("ADAC-9345")));
	}

	@Test
	public void getNameNull() {
		assertEquals(null, patientIndex.getName(new UHealthID("AAAA-1111")));
	}

	@Test
	public void addNameAlreadyExist() {
		Patient patient1 = new Patient("Phuc", "Do", new UHealthID("AAAA-1231"));
		patientIndex.addPatient(patient1);

		assertEquals("Phuc Do", patientIndex.getName(new UHealthID("AAAA-1231")));
	}

}
