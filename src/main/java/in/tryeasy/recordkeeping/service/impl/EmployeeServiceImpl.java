package in.tryeasy.recordkeeping.service.impl;

import in.tryeasy.recordkeeping.entity.Employee;
import in.tryeasy.recordkeeping.model.EmployeeCreationRequest;
import in.tryeasy.recordkeeping.model.EmployeeCreationResponse;
import in.tryeasy.recordkeeping.repository.EmployeeRepository;
import in.tryeasy.recordkeeping.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeCreationResponse saveEmployee(EmployeeCreationRequest employeeCreationRequest) {

        // creating Employee entity object from EmployeeCreationRequest object
        final var employee = Employee
                .builder()
                .firstName(employeeCreationRequest.getFirstName())
                .lastName(employeeCreationRequest.getLastName())
                .fatherName(employeeCreationRequest.getFatherName())
                .motherName(employeeCreationRequest.getMotherName())
                .gender(employeeCreationRequest.getGender())
                .isMarried(employeeCreationRequest.isMarried())
                .spouseName(employeeCreationRequest.getSpouseName())
                .birthDate(employeeCreationRequest.getBirthDate())
                .anniversaryDate(employeeCreationRequest.getAnniversaryDate())
                .build();

        // with the help of EmployeeRepository we are saving Employee to database
        // while providing Employee to EmployeeRepository developer did not provide primary key value
        // primary key will be automatically generated by JPA provider in our case Hibernate
        final var savedEntity = this.employeeRepository.save(employee);

        // return EmployeeCreationResponse with the generated employeeId
        return EmployeeCreationResponse.builder()
                .employeeId(savedEntity.getEmployeeId())
                .build();
    }

}
