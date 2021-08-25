package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.FavoriteJobAdvertisement;

public interface FavoriteJobAdvertisementDao extends JpaRepository<FavoriteJobAdvertisement, Integer> {

	List<FavoriteJobAdvertisement> getByJobseekerId(int jobseekerId);

	List<FavoriteJobAdvertisement> getByEmployerId(int employerId);
}
