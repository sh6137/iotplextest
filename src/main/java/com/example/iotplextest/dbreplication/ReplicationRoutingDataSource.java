package com.example.iotplextest.dbreplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Slf4j
public class ReplicationRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return (TransactionSynchronizationManager.isCurrentTransactionReadOnly()) ? "slave" : "master"; //(2)
    }
}
