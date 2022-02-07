package com.dbs.itt.app.repository;

import com.dbs.itt.app.model.ApplicationRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRegistrationRepository extends JpaRepository<ApplicationRegistration, String> {
}
