package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educations")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "starting_date")
	private LocalDate startingDate;

	@Column(name = "graduation_date")
	private LocalDate endDate;

	@ManyToOne()
	@JoinColumn(name = "cv_id", referencedColumnName = "id")
	private Cv cv;

	@ManyToOne()

	@JoinColumn(name = "school_id", referencedColumnName = "id")
	private School school;

	@ManyToOne()
	@JoinColumn(name = "department_id", referencedColumnName = "id")
	private Department department;

}
