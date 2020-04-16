package rays.springframework.test.lombokdozerdemo.model;

import lombok.*;
import org.dozer.Mapping;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Mapping("empId")
    private Long id;
    @Mapping("empName")
    private String name;
    @Mapping("empDepartment")
    private String department;
    @Mapping("empSalary")
    private Double salary;
}
