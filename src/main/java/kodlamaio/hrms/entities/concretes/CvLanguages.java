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
@Table(name = "cv_languages")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CvLanguages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_language_id")
	private int cv_language_id;

	@Column(name = "language_name")
	private String languageName;

	@Column(name = "level")
	private short level;

	@ManyToOne()
	@JoinColumn(name = "resume_id", referencedColumnName = "id")
	private Cv cv;

}
