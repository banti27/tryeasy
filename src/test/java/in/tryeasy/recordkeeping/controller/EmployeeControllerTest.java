package in.tryeasy.recordkeeping.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.tryeasy.recordkeeping.model.EmployeeCreationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testSaveEmployee() throws Exception {
        final var employee = new EmployeeCreationRequest();
        employee.setFirstName("Test First Name");
        employee.setLastName("Test Last Name");
        employee.setFatherName("Test Father Name");
        employee.setMotherName("Test Mother Name");
        this.mockMvc.perform(post("/api/employee")
                        .content(this.objectMapper.writeValueAsString(employee))
                        .contentType("application/json"))
                .andExpect(status().isCreated());
    }

}