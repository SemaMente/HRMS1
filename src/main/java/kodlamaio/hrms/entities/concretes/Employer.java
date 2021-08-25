package kodlamaio.hrms.entities.concretes;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.*;
import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "employers")
public class Employer extends User {

	@Column(name = "company_name")
	@NotNull
	@NotBlank
	private String companyName;

	@Column(name = "phone_number")
	@NotNull
	@NotBlank
	private String phoneNumber;

	@Column(name = "web_address")
	@NotNull
	@NotBlank
	private String webAddress;

	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

	@OneToMany(mappedBy = "employer")
	private List<VerificationCodeEmployer> verificationCodeEmployers;

	@OneToMany(mappedBy = "employer")
	private List<SystemEmployeeConfirmEmployer> systemEmployeeConfirmEmployer;

}
