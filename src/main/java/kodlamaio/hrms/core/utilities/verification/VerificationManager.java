package kodlamaio.hrms.core.utilities.verification;

import java.util.UUID;

//I copied paste. Then I will do a deep research.

public class VerificationManager implements VerificationService {

	@Override
	public void sendLink(String email) {
	 
		UUID uuid= UUID.randomUUID();
		@SuppressWarnings("unused")
		String verificationLink="https://HRMS.com/verificationmail/" + uuid.toString();
		System.out.println("Verification code has sent your mail. Please Check your mail...");
		System.out.println("Please click and verify your account");
	}

	@Override
	public void sendCode(String phoneNumber) {
	
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("activation code:" + verificationCode );
		
		
	}

}
