package com.dbs.itt.app.service;

import com.dbs.itt.app.repository.ApplicationDataLoadScheduleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApplicationDataLoadScheduleServiceImpl implements ApplicationDataLoadScheduleService {

    private final ApplicationDataLoadScheduleRepository applicationDataLoadScheduleRepository;

    public ApplicationDataLoadScheduleServiceImpl(ApplicationDataLoadScheduleRepository applicationDataLoadScheduleRepository) {
        this.applicationDataLoadScheduleRepository = applicationDataLoadScheduleRepository;
    }


}
