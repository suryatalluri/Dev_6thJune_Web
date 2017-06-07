/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.hrdb.Vacation;


/**
 * ServiceImpl object for domain model class Vacation.
 *
 * @see Vacation
 */
@Service("hrdb.VacationService")
public class VacationServiceImpl implements VacationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(VacationServiceImpl.class);


    @Autowired
    @Qualifier("hrdb.VacationDao")
    private WMGenericDao<Vacation, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Vacation, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "hrdbTransactionManager")
    @Override
	public Vacation create(Vacation vacation) {
        LOGGER.debug("Creating a new Vacation with information: {}", vacation);
        Vacation vacationCreated = this.wmGenericDao.create(vacation);
        return vacationCreated;
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public Vacation getById(Integer vacationId) throws EntityNotFoundException {
        LOGGER.debug("Finding Vacation by id: {}", vacationId);
        Vacation vacation = this.wmGenericDao.findById(vacationId);
        if (vacation == null){
            LOGGER.debug("No Vacation found with id: {}", vacationId);
            throw new EntityNotFoundException(String.valueOf(vacationId));
        }
        return vacation;
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public Vacation findById(Integer vacationId) {
        LOGGER.debug("Finding Vacation by id: {}", vacationId);
        return this.wmGenericDao.findById(vacationId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "hrdbTransactionManager")
	@Override
	public Vacation update(Vacation vacation) throws EntityNotFoundException {
        LOGGER.debug("Updating Vacation with information: {}", vacation);
        this.wmGenericDao.update(vacation);

        Integer vacationId = vacation.getId();

        return this.wmGenericDao.findById(vacationId);
    }

    @Transactional(value = "hrdbTransactionManager")
	@Override
	public Vacation delete(Integer vacationId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Vacation with id: {}", vacationId);
        Vacation deleted = this.wmGenericDao.findById(vacationId);
        if (deleted == null) {
            LOGGER.debug("No Vacation found with id: {}", vacationId);
            throw new EntityNotFoundException(String.valueOf(vacationId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public Page<Vacation> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Vacations");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Page<Vacation> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Vacations");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service hrdb for table Vacation to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "hrdbTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

