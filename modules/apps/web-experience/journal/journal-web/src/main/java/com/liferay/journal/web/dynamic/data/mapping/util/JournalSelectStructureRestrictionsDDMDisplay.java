/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.journal.web.dynamic.data.mapping.util;

import com.liferay.dynamic.data.mapping.util.DDMDisplay;
import com.liferay.journal.constants.JournalPortletKeys;
import com.liferay.portal.kernel.util.Portal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = {"javax.portlet.name=" + JournalPortletKeys.JOURNAL + ".selectStructureRestriction"},
	service = DDMDisplay.class
)
public class JournalSelectStructureRestrictionsDDMDisplay
	extends JournalDDMDisplay {

	@Override
	public String getPortletId() {
		return JournalPortletKeys.JOURNAL + ".selectStructureRestriction";
	}

	@Override
	public boolean isShowAddStructureButton() {
		return false;
	}

	@Override
	public boolean isShowConfirmSelectStructure() {
		return false;
	}

	@Reference(unbind = "-")
	protected void setPortal(Portal portal) {
		this.portal = portal;
	}

}