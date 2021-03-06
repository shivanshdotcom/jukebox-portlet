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

package org.liferay.jukebox.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;

import org.liferay.jukebox.model.Song;
import org.liferay.jukebox.service.SongLocalServiceUtil;

/**
 * @author Julio Camarero
 * @deprecated As of 7.0.0, replaced by {@link SongLocalServiceUtil#getExportActionableDynamicQuery()}
 * @generated
 */
@Deprecated
public abstract class SongActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public SongActionableDynamicQuery() {
		setBaseLocalService(SongLocalServiceUtil.getService());
		setClass(Song.class);

		setClassLoader(org.liferay.jukebox.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("songId");
	}
}