package kodlamaio.hrms.core.utilities.adapters;

import java.util.Date;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface FakeMernisService {
	public boolean CheckIfRealPerson(int identityNumber, String firstName, String lastName, Date dateOfBirth);

	boolean checkIfRealPerson(Jobseeker jobseeker);
}
