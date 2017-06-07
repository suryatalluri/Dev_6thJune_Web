/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/
package com.dev_6thjune_web.db123testing.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.dev_6thjune_web.db123testing.AllTypes;
import com.dev_6thjune_web.db123testing.service.AllTypesService;


/**
 * Controller object for domain model class AllTypes.
 * @see AllTypes
 */
@RestController("DB123Testing.AllTypesController")
@Api(value = "AllTypesController", description = "Exposes APIs to work with AllTypes resource.")
@RequestMapping("/DB123Testing/AllTypes")
public class AllTypesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllTypesController.class);

    @Autowired
	@Qualifier("DB123Testing.AllTypesService")
	private AllTypesService allTypesService;

	@ApiOperation(value = "Creates a new AllTypes instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public AllTypes createAllTypes(@RequestBody AllTypes allTypes) {
		LOGGER.debug("Create AllTypes with information: {}" , allTypes);

		allTypes = allTypesService.create(allTypes);
		LOGGER.debug("Created AllTypes with information: {}" , allTypes);

	    return allTypes;
	}

	@ApiOperation(value = "Creates a new AllTypes instance.This API should be used when the AllTypes instance has fields that requires multipart data.")
	@RequestMapping(method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllTypes createAllTypes(MultipartHttpServletRequest multipartHttpServletRequest) {
    	AllTypes allTypes = WMMultipartUtils.toObject(multipartHttpServletRequest, AllTypes.class, "DB123Testing"); 
        LOGGER.debug("Creating a new AllTypes with information: {}" , allTypes);
        return allTypesService.create(allTypes);
    }


    @ApiOperation(value = "Returns the AllTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllTypes getAllTypes(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting AllTypes with id: {}" , id);

        AllTypes foundAllTypes = allTypesService.getById(id);
        LOGGER.debug("AllTypes details with id: {}" , foundAllTypes);

        return foundAllTypes;
    }

    @ApiOperation(value = "Retrieves content for the given BLOB field in AllTypes instance" )
    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces="application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public DownloadResponse getAllTypesBLOBContent(@PathVariable("id") Integer id, @PathVariable("fieldName") String fieldName, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam(value="download", defaultValue = "false") boolean download) {

        LOGGER.debug("Retrieves content for the given BLOB field {} in AllTypes instance" , fieldName);

        if(!WMRuntimeUtils.isLob(AllTypes.class, fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        AllTypes allTypes = allTypesService.getById(id);

        return WMMultipartUtils.buildDownloadResponseForBlob(allTypes, fieldName, httpServletRequest, download);
    }

    @ApiOperation(value = "Updates the AllTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllTypes editAllTypes(@PathVariable("id") Integer id, @RequestBody AllTypes allTypes) throws EntityNotFoundException {
        LOGGER.debug("Editing AllTypes with id: {}" , allTypes.getId());

        allTypes.setId(id);
        allTypes = allTypesService.update(allTypes);
        LOGGER.debug("AllTypes details with id: {}" , allTypes);

        return allTypes;
    }

    @ApiOperation(value = "Updates the AllTypes instance associated with the given id.This API should be used when AllTypes instance fields that require multipart data.") 
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllTypes editAllTypes(@PathVariable("id") Integer id, MultipartHttpServletRequest multipartHttpServletRequest) throws EntityNotFoundException {
        AllTypes newAllTypes = WMMultipartUtils.toObject(multipartHttpServletRequest, AllTypes.class, "DB123Testing");
        newAllTypes.setId(id);

        AllTypes oldAllTypes = allTypesService.getById(id);
        WMMultipartUtils.updateLobsContent(oldAllTypes, newAllTypes);
        LOGGER.debug("Updating AllTypes with information: {}" , newAllTypes);

        return allTypesService.update(newAllTypes);
    }

    @ApiOperation(value = "Deletes the AllTypes instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAllTypes(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting AllTypes with id: {}" , id);

        AllTypes deletedAllTypes = allTypesService.delete(id);

        return deletedAllTypes != null;
    }

    /**
     * @deprecated Use {@link #findAllTypes(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of AllTypes instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllTypes> searchAllTypesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AllTypes list");
        return allTypesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AllTypes instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllTypes> findAllTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AllTypes list");
        return allTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AllTypes instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllTypes> filterAllTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AllTypes list");
        return allTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportAllTypes(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return allTypesService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of AllTypes instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countAllTypes( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting AllTypes");
		return allTypesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getAllTypesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return allTypesService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AllTypesService instance
	 */
	protected void setAllTypesService(AllTypesService service) {
		this.allTypesService = service;
	}

}

