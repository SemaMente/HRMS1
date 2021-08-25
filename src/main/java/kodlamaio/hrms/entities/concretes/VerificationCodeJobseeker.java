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
@Table(name = "verification_code_jobseekers")
@PrimaryKeyJoinColumn(name = "id")

public class VerificationCodeJobseeker extends VerificationCode {
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", referencedColumnName = "id")
	private Jobseeker jobseeker;
}
