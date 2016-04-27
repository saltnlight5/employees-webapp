package zdeng.webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.Repository;

import javax.persistence.EntityManager;

/**
 * Created by zedeng on 4/26/16.
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
