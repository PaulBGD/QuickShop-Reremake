/*
 * This file is a part of project QuickShop, the name is QuickUpdater.java
 *  Copyright (C) PotatoCraft Studio and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.maxgamer.quickshop.util.updater;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface QuickUpdater {
    @NotNull VersionType getCurrentRunning();

    @NotNull String getRemoteServerVersion();

    int getRemoteServerBuildId();

    boolean isLatest(@NotNull VersionType versionType);

    byte[] update(@NotNull VersionType versionType) throws IOException;

    void install(byte[] bytes) throws IOException;
}
