package in.tryeasy.recordkeeping.controller;

import in.tryeasy.recordkeeping.model.EmployeeCreationRequest;
import in.tryeasy.recordkeeping.model.EmployeeCreationResponse;
import in.tryeasy.recordkeeping.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {


    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeCreationResponse> saveEmployee(@Valid @RequestBody EmployeeCreationRequest employeeCreationRequest) {
        log.info("Employee: {}", employeeCreationRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.employeeService.saveEmployee(employeeCreationRequest));
    }


}
