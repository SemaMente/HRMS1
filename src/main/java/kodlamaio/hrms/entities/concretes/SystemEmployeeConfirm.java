package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "system_employee_confirms")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Inheritance(strategy = InheritanceType.JOINED)
public class SystemEmployeeConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private SystemEmployee systemEmployee;

	@Column(name = "is_confirmed")
	private boolean isConfirmed;

	@Column(name = "confirm_date")
	private LocalDate confirmDate;

}
