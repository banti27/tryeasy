package in.tryeasy.recordkeeping.model;

import in.tryeasy.recordkeeping.constant.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeCreationRequest {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String fatherName;
    private String motherName;
    private boolean isMarried;
    private String spouseName;
    private LocalDate birthDate;
    private LocalDate anniversaryDate;
}
