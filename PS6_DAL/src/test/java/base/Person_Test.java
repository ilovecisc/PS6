package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.PersonDomainModel;


public class Person_Test {
	PersonDomainModel testPer = new PersonDomainModel();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Addtest() {
		testPer.setFirstName("Yifan");
		testPer.setLastName("Li");
		testPer.setCity("Newark");
		testPer.setPostalCode(19711);
		testPer.setStreet("606 Canton Drive");
		testPer.setPersonID(null);
		PersonDAL.addPerson(testPer);
	}
	@Test
	public void Deletetest() {
		PersonDAL.deletePerson(testPer.getPersonID());
	}
	@Test
	public void Updatetest() {
		
	}
	@Test
	public void Gettest() {
		
	}

}