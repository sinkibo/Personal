/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */

package com.cnk.travelogix.masterdata.dao;

import java.util.List;

import com.cnk.travelogix.masterdata.core.model.BankAccountDetailModel;


/**
 * Data Access for looking up AccountNumer in BankDetail
 */
public interface BankDetailDao
{

	/**
	 * @param accountNumber
	 *
	 * @return List of BankDetail Records
	 */

	List<BankAccountDetailModel> findSupplierBankByAccountNumber(String accountNumber);
}