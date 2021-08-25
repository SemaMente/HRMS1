package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name = "jobseekers")
public class Jobseeker extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "birth_date")
	private int birthDate;

	@Column(name = "image")
	private String image;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;

	@OneToMany(mappedBy = "jobseeker")
	private List<Cv> cv;

	@OneToMany(mappedBy = "jobAdvertisement")
	private List<FavoriteJobAdvertisement> favoriteJobAdvertisements;

}
