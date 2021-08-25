package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
public interface JobAdvertisementDao extends JpaRepository <JobAdvertisement, Integer> {

	
	@Query
	List<JobAdvertisement> getByEmployerId (int employerId);
	@Query
	List<JobAdvertisement> getByJobPositionId (int jobPositionId);
	@Query
	List<JobAdvertisement> getByCityId (int cityId);
	
	void updateById(int id);
	void deleteById(int id);
}
