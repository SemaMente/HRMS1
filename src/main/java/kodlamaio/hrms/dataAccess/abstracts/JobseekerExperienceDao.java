package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobseekerExperience;
public interface JobseekerExperienceDao extends JpaRepository<JobseekerExperience, Integer>{

	void addExperienceByJobseekerId(int jobseekerId);
}
