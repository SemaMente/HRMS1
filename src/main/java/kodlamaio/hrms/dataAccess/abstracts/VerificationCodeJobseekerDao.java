package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.VerificationCodeJobseeker;

public interface VerificationCodeJobseekerDao extends JpaRepository<VerificationCodeJobseeker, Integer> {

	VerificationCodeJobseeker getByVerificationCode(String verificationCode);

	VerificationCodeJobseeker getByJobseekerId(int jobseekerId);

}
