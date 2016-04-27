package zdeng.webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * IT = Integration Test
 * Created by zedeng on 4/26/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class SpringIT {
    @Autowired
    EmployeeRepository empRepo;

    @Test
    @Transactional
    public void testEmployeeRepository() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Employee emp = empRepo.getOne("10001");
        assertThat(emp.getFirstName(), is("Georgi"));
        assertThat(emp.getLastName(), is("Facello"));
        assertThat(emp.getGender(), is("M"));
        assertThat(df.format(emp.getBirthDate()), is("1953-09-02"));

        assertThat(empRepo.count(), greaterThanOrEqualTo(300_000L));
    }
}
