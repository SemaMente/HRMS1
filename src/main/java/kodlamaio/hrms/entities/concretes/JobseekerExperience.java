package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobseeker_experiences")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class JobseekerExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_experience_id")
	private int id;

	@Column(name = "company_name")
	private String companyName;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "started_date")
	private LocalDate startedDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "ended_date")
	private LocalDate endedDate;

	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;

	@ManyToOne()
	@JoinColumn(name = "cv_id", referencedColumnName = "id")
	private Cv cv;

}
