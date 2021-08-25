package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Table(name="system_employee_confirm_employers")
@PrimaryKeyJoinColumn(name="id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class SystemEmployeeConfirmEmployer extends SystemEmployeeConfirm {
	

    @ManyToOne()
    @JoinColumn(name="employer_id",referencedColumnName =  "id")
    private Employer employer;

}
