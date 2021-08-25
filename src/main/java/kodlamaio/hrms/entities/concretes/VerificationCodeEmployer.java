package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "verification_code_employers")
@PrimaryKeyJoinColumn(name = "id")
public class VerificationCodeEmployer extends VerificationCode {
	@ManyToOne()
	@JoinColumn(name = "employer_id", referencedColumnName = "id")
	private Employer employer;
}
