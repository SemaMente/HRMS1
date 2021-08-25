package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvLanguages;
public interface CvLanguageDao extends JpaRepository<CvLanguages,Integer> {

}
