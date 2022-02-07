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
@Entity(name = "tb_data_load_column_mapping")
public class DataLoadColumnMapping {

    @Id
    @GenericGenerator(name = "Application-Generic-Generator", strategy = "com.dbs.itt.app.config.EntityIdGenerator")
    @GeneratedValue(generator = "Application-Generic-Generator")
    @Column(name = "data_load_mapping_id", nullable = false, unique = true)
    private String dataLoadMappingId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "data_load_schedule_id", foreignKey = @ForeignKey(name = "fk_data_load_schedule_data_load_schedule_id"))
    private ApplicationDataLoadSchedule applicationDataLoadSchedule;

    @Column(name = "file_column_index")
    private int fileColumnIndex;

    @Column(name = "db_column_name", nullable = false)
    private String dbColumnName;

    @Enumerated(EnumType.STRING)
    @Column(name = "column_date_type", nullable = false)
    private ColumnDataType columnDataType;

    @Column(name = "column_special_format")
    private String columnSpecialFormat;
}
