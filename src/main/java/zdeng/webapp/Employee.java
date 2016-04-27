package zdeng.webapp;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zedeng on 4/26/16.
 */
@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id @Column(name="emp_no") String empNo;
    @Column(name="birth_date") Date birthDate;
    @Column(name="first_name") String firstName;
    @Column(name="last_name") String lastName;
    @Column(name="gender") String gender;
    @Column(name="hire_date") Date hireDate;
}
