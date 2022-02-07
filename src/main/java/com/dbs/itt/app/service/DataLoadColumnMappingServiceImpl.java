package com.dbs.itt.app.service;

import com.dbs.itt.app.model.DataLoadColumnMapping;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DataLoadColumnMappingServiceImpl implements DataLoadColumnMappingService {

    private final DataLoadColumnMapping dataLoadColumnMapping;

    public DataLoadColumnMappingServiceImpl(DataLoadColumnMapping dataLoadColumnMapping) {
        this.dataLoadColumnMapping = dataLoadColumnMapping;
    }
}
