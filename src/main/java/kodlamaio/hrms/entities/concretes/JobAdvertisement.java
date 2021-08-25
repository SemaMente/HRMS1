package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "job_description")
	private String jobDescription;

	@Column(name = "min_salary")
	private Integer minSalary;

	@Column(name = "max_salary")
	private Integer maxSalary;

	@Column(name = "open_position_number")
	private int openPositionNumber;

	@Column(name = "deadline")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") // Copied
	private LocalDate deadline;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "is_active")
	private boolean isActive = false;

	@ManyToOne()
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	private City city;

	@ManyToOne()

	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@OneToMany(mappedBy = "jobAdvertisement")
	private List<FavoriteJobAdvertisement> favoriteJobAdvertisements;

}
