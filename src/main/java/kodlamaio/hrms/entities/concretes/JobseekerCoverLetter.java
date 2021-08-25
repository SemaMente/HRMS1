package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobseeker_cover_letters")
@JsonIgnoreProperties({ "hibernateLazyInitializer","jobseeker"})

public class JobseekerCoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;


	@Column(name = "title")
	private String title;

	@Column(name = "text")
	private String text;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", referencedColumnName = "id")
	private Jobseeker jobseeker;

}
