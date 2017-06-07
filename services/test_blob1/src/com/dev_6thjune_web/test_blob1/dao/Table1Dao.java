/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/
package com.dev_6thjune_web.test_blob1.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.dev_6thjune_web.test_blob1.Table1;

/**
 * Specifies methods used to obtain and modify Table1 related information
 * which is stored in the database.
 */
@Repository("test_blob1.Table1Dao")
public class Table1Dao extends WMGenericDaoImpl<Table1, Integer> {

    @Autowired
    @Qualifier("test_blob1Template")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

