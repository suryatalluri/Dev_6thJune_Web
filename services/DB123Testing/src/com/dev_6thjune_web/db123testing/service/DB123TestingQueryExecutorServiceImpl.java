/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/

package com.dev_6thjune_web.db123testing.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.file.model.Downloadable;

import com.dev_6thjune_web.db123testing.AllTypes;
import com.dev_6thjune_web.db123testing.models.query.*;

@Service
public class DB123TestingQueryExecutorServiceImpl implements DB123TestingQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DB123TestingQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("DB123TestingWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "DB123TestingTransactionManager")
    @Override
    public Integer executeUpdate_query(UpdateQueryRequest updateQueryRequest) {
        Map params = new HashMap(2);

        params.put("Name", updateQueryRequest.getName());
        params.put("Icon", updateQueryRequest.getIcon());

        return queryExecutor.executeNamedQueryForUpdate("update_query", params);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Page<Select1Response> executeSelect1(Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.executeNamedQuery("select1", params, Select1Response.class, pageable);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public InputStream getBlobColContentForSelect1(Integer id) throws EntityNotFoundException {
        Map params = new HashMap(0);

        params.put("id", id);

        Select1Response _result =  queryExecutor.executeNamedQuery("select1__identifier", params, Select1Response.class);
        if(_result.getBlobCol() == null) {
            LOGGER.debug("Blob content not exists for blobCol in query select1");
            throw new EntityNotFoundException("blobCol");
        }
        return new ByteArrayInputStream(_result.getBlobCol());
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Downloadable exportSelect1(ExportType exportType, Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.exportNamedQueryData("select1", params, exportType, Select1Response.class, pageable);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Page<AllTypes> executeCdz(Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.executeNamedQuery("cdz", params, AllTypes.class, pageable);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Downloadable exportCdz(ExportType exportType, Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.exportNamedQueryData("cdz", params, exportType, AllTypes.class, pageable);
    }

}


