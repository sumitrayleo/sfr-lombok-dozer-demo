package rays.springframework.test.lombokdozerdemo;

import org.dozer.Mapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rays.springframework.test.lombokdozerdemo.data.EmployeeDto;
import rays.springframework.test.lombokdozerdemo.model.Employee;

@SpringBootApplication
public class LombokDozerDemoApplication implements CommandLineRunner {

    private final Mapper mapper;

    public LombokDozerDemoApplication(Mapper mapper) {
        this.mapper = mapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(LombokDozerDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = Employee.builder().id(1L).name("Sumit Ray").department("IT").salary(1234.34).build();
        EmployeeDto employeeDto = new EmployeeDto();

        mapper.map(employee, employeeDto);

        System.out.println(employeeDto);
    }
}
