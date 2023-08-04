package in.tryeasy.recordkeeping.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    @GetMapping(path = {"/", "/health", "/status"})
    public String getHealth() {
        log.info("********** STATUS API CALLED ***************");
        return "App is UP and RUNNING";
    }

}
