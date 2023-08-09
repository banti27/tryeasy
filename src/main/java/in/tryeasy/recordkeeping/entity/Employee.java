package in.tryeasy.recordkeeping.entity;


import in.tryeasy.recordkeeping.constant.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "employee_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID employeeId;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String fatherName;
    private String motherName;
    private boolean isMarried;
    private String spouseName;
    private LocalDate birthDate;
    private LocalDate anniversaryDate;
}
