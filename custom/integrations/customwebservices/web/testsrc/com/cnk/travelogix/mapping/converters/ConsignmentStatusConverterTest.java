/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.mapping.converters;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.basecommerce.enums.ConsignmentStatus;

import junit.framework.Assert;
import ma.glasnost.orika.metadata.Type;

import org.junit.Test;


@UnitTest
public class ConsignmentStatusConverterTest
{
	private final ConsignmentStatusConverter converter = new ConsignmentStatusConverter();
	private final String stringStatus = ConsignmentStatus.PICKUP_COMPLETE.toString();
	private final ConsignmentStatus status = ConsignmentStatus.PICKUP_COMPLETE;

	@Test
	public void testConvertFrom()
	{
		final ConsignmentStatus result = converter.convertFrom(stringStatus, (Type<ConsignmentStatus>) null);
		Assert.assertEquals(status, result);
	}

	@Test
	public void testConvertTo()
	{
		final String result = converter.convertTo(status, (Type<String>) null);
		Assert.assertEquals(stringStatus, result);
	}
}
