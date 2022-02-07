package com.dbs.itt.app.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_app_registration")
public class ApplicationRegistration {

    @Id
    @GenericGenerator(name = "Application-Generic-Generator", strategy = "com.dbs.itt.app.config.EntityIdGenerator")
    @GeneratedValue(generator = "Application-Generic-Generator")
    @Column(name = "app_id", nullable = false, unique = true)
    private String appId;

    @Column(name = "app_code", nullable = false)
    private String appCode;

    @Column(name = "application_name", nullable = false)
    private String applicationName;

    @Column(name = "secret_key", nullable = false)
    private String secretKey;

    @Column(name = "s3_secret_key", nullable = false)
    private String s3SecretKey;

    @Column(name = "s3_access_key", nullable = false)
    private String s3AccessKey;

    @Column(name = "db_url", nullable = false)
    private String dbUrl;

    @Column(name = "db_user_name", nullable = false)
    private String dbUserName;

    @Column(name = "db_user_password", nullable = false)
    private String dbPassword;


}
