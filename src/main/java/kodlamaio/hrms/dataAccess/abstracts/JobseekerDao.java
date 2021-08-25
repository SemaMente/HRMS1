package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobseekerDao extends JpaRepository<Jobseeker, Integer> {

}
