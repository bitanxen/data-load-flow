package com.dbs.itt.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_app_data_load_schedule")
public class ApplicationDataLoadSchedule {

    @Id
    @GenericGenerator(name = "Application-Generic-Generator", strategy = "com.dbs.itt.app.config.EntityIdGenerator")
    @GeneratedValue(generator = "Application-Generic-Generator")
    @Column(name = "data_load_schedule_id", nullable = false, unique = true)
    private String dataLoadScheduleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_registration_id", foreignKey = @ForeignKey(name = "fk_app_registration_data_load_schedule"))
    private ApplicationRegistration applicationRegistration;

    @Column(name = "bucket_name", nullable = false)
    private String bucketName;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @Column(name = "file_name_pattern", nullable = false)
    private String fileNamePattern;

    @Column(name = "header_skip_lines", nullable = false)
    private int headerSkipLines;

    @Column(name = "footer_skip_lines", nullable = false)
    private int footerSkipLines;

    @Column(name = "table_name", nullable = false)
    private String tableName;

    @Column(name = "is_column", nullable = false)
    private String idColumn;

    @Column(name = "override", nullable = false)
    private double override;

    @Column(name = "data_load_schedule", nullable = false)
    private String dataLoadSchedule;


}
