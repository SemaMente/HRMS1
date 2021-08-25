package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobseekerCoverLetter;

import java.util.List;
public interface JobseekerCoverLetterDao extends JpaRepository<JobseekerCoverLetter, Integer> {

	@Query
	List<JobseekerCoverLetter> getJobseekerCoverLetterByJobseekerId(int jobseekerId);

}
