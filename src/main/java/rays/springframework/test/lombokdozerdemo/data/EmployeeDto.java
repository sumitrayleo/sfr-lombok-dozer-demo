package rays.springframework.test.lombokdozerdemo.data;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long empId;
    private String empName;
    private String empDepartment;
    private Double empSalary;
}
