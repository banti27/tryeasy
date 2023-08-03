package in.tryeasy.recordkeeping.controller;

import in.tryeasy.recordkeeping.model.EmployeeCreationRequest;
import in.tryeasy.recordkeeping.model.EmployeeCreationResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    @PostMapping
    public EmployeeCreationResponse saveEmployee(@RequestBody EmployeeCreationRequest employeeCreationRequest) {
        log.info("Employee: {}", employeeCreationRequest);
        final var response = new EmployeeCreationResponse();
        response.setEmployeeId(UUID.randomUUID());
        return response;
    }


}
