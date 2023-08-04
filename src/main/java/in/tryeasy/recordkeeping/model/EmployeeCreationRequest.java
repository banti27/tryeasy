package in.tryeasy.recordkeeping.model;

import in.tryeasy.recordkeeping.constant.Gender;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeCreationRequest {
    @NotBlank(message = "First name is required")
    private String firstName;
    @NotBlank(message = "Last name is required")
    private String lastName;
    private Gender gender;
    @NotBlank(message = "Father's name is required")
    private String fatherName;
    @NotBlank(message = "Mother's name is required")
    private String motherName;
    private boolean isMarried;
    private String spouseName;
    private LocalDate birthDate;
    private LocalDate anniversaryDate;
}
