package com.dbs.itt.app.service;

import com.dbs.itt.app.dto.ApplicationRegistrationDTO;
import com.dbs.itt.app.dto.CreateApplicationRegistrationDTO;
import com.dbs.itt.app.model.ApplicationRegistration;

import java.util.List;

public interface ApplicationRegistrationService {
    List<ApplicationRegistration> getAllRegistration();
    List<ApplicationRegistrationDTO> getAllRegistrationDetails();

    ApplicationRegistrationDTO createApplicationRegistration(CreateApplicationRegistrationDTO applicationRegistration);
}
