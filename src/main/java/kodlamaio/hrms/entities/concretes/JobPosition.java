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
@Table(name = "job_positions")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String jobPositionName;

	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvertisement> jobAdvertisements;

	
	  @OneToMany(mappedBy="jobPosition") private List<JobseekerExperience> jobseekerExperiences;
	 

}
