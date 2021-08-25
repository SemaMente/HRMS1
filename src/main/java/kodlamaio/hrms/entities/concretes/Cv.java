package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cvs")
@JsonIgnoreProperties({ "hibernateLazyInitializer" })

public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", referencedColumnName = "id")
	private Jobseeker jobseeker;

	@OneToMany(mappedBy = "cvs")
	private List<Skill> skills;

	@OneToMany(mappedBy = "cvs")
	private List<CvLanguages> cvLanguages;

	@OneToMany(mappedBy = "cvs")
	private List<JobseekerExperience> jobseekerExperiences;

	@OneToMany(mappedBy = "cvs")
	private List<Education> education;

}
