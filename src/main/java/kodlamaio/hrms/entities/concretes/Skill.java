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
@Table(name = "skills")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skill_id")
	private int id;

	@Column(name = "skill_name")
	private String skillName;

	@ManyToOne()
	@JoinColumn(name = "cv_id", referencedColumnName = "id")
	private Cv cv;

}
