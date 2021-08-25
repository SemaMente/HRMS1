package kodlamaio.hrms.core.utilities.verification;

public interface VerificationService {

	void sendLink(String email);
	void sendCode(String phoneNumber);
}
