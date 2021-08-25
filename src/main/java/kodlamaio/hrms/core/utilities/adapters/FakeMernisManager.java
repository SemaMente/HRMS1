package kodlamaio.hrms.core.utilities.adapters;

import java.util.Date;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Jobseeker;
@Service
public class FakeMernisManager implements FakeMernisService{

	@Override
	public boolean CheckIfRealPerson(int identityNumber, String firstName, String lastName, Date dateOfBirth) {
	
		return true;
	}

	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) {

		return true;
	}

}
