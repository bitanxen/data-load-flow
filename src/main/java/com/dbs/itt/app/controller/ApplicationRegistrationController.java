package com.dbs.itt.app.controller;

import com.dbs.itt.app.dto.ApplicationRegistrationDTO;
import com.dbs.itt.app.dto.CreateApplicationRegistrationDTO;
import com.dbs.itt.app.service.ApplicationRegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/registration/")
public class ApplicationRegistrationController {

    private final ApplicationRegistrationService applicationRegistrationService;

    public ApplicationRegistrationController(ApplicationRegistrationService applicationRegistrationService) {
        this.applicationRegistrationService = applicationRegistrationService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<ApplicationRegistrationDTO>> getAllRegistration() {
        return ResponseEntity.ok(applicationRegistrationService.getAllRegistrationDetails());
    }

    @PostMapping(value = "/")
    public ResponseEntity<ApplicationRegistrationDTO> createNewRegistration(@RequestBody CreateApplicationRegistrationDTO applicationRegistration) {
        return ResponseEntity.ok(applicationRegistrationService.createApplicationRegistration(applicationRegistration));
    }
}
