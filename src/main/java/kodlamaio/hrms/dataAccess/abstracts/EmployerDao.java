package kodlamaio.hrms.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Employer;
public interface EmployerDao extends JpaRepository<Employer, Integer> {
 
	@Query
	List<Employer> getVerifiedEmployer();
	@Query
	List<Employer> getNotVerifiedEmployer();
	
	
}
