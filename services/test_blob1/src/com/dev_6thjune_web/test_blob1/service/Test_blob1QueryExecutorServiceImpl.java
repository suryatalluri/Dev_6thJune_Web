/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/

package com.dev_6thjune_web.test_blob1.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

import com.dev_6thjune_web.test_blob1.models.query.InsertQueryRequest;
import com.dev_6thjune_web.test_blob1.models.query.UpdateQueryRequest;

@Service
public class Test_blob1QueryExecutorServiceImpl implements Test_blob1QueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test_blob1QueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("test_blob1WMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "test_blob1TransactionManager")
    @Override
    public Integer executeUpdate_query(UpdateQueryRequest updateQueryRequest) {
        Map params = new HashMap(2);

        params.put("Name", updateQueryRequest.getName());
        params.put("Id", updateQueryRequest.getId());

        return queryExecutor.executeNamedQueryForUpdate("Update_query", params);
    }

    @Transactional(value = "test_blob1TransactionManager")
    @Override
    public Integer executeInsert_query(InsertQueryRequest insertQueryRequest) {
        Map params = new HashMap(3);

        params.put("ID", insertQueryRequest.getId());
        params.put("Name", insertQueryRequest.getName());
        params.put("City", insertQueryRequest.getCity());

        return queryExecutor.executeNamedQueryForUpdate("insert_query", params);
    }

}


