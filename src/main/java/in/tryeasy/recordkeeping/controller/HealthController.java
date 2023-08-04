package in.tryeasy.recordkeeping.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class HealthController {

    @GetMapping(path = {"/", "/health", "/status"})
    public String getHealth() {
        log.info("********** STATUS API CALLED ***************");
        return String.format("App is UP and RUNNING: %s", LocalDateTime.now());
    }

}
