package com.dbs.itt.app.service;

import com.dbs.itt.app.dto.ApplicationRegistrationDTO;
import com.dbs.itt.app.dto.CreateApplicationRegistrationDTO;
import com.dbs.itt.app.model.ApplicationRegistration;
import com.dbs.itt.app.repository.ApplicationRegistrationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ApplicationRegistrationServiceImpl implements ApplicationRegistrationService {

    private final ApplicationRegistrationRepository applicationDataLoadScheduleRepository;

    public ApplicationRegistrationServiceImpl(ApplicationRegistrationRepository applicationDataLoadScheduleRepository) {
        this.applicationDataLoadScheduleRepository = applicationDataLoadScheduleRepository;
    }

    @Override
    public List<ApplicationRegistration> getAllRegistration() {
        return applicationDataLoadScheduleRepository.findAll();
    }

    @Override
    public List<ApplicationRegistrationDTO> getAllRegistrationDetails() {
        return getAllRegistration().stream().map(this::convertIntoDTO).collect(Collectors.toList());
    }

    @Override
    public ApplicationRegistrationDTO createApplicationRegistration(CreateApplicationRegistrationDTO applicationRegistration) {
        ApplicationRegistration registration = new ApplicationRegistration();
        return convertIntoDTO(applicationDataLoadScheduleRepository.save(registration));
    }

    private ApplicationRegistrationDTO convertIntoDTO(ApplicationRegistration applicationRegistration) {
        if(applicationRegistration == null) {
            return null;
        }

        return ApplicationRegistrationDTO.builder()

                .build();
    }
}
