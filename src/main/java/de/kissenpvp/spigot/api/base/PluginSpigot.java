/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package de.kissenpvp.spigot.api.base;

import de.kissenpvp.api.base.Kissen;
import de.kissenpvp.api.base.plugin.KissenPlugin;
import de.kissenpvp.core.base.KissenCore;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class PluginSpigot extends JavaPlugin implements KissenPlugin
{
    private boolean started = false;

    @Override public final void onDisable()
    {
        super.onDisable();
    }

    @Override public final void onEnable()
    {
        super.onEnable();
    }

    @Override public final void onLoad()
    {
        super.onLoad();
    }

    @Override public abstract String getPackage();

    @Override @NotNull public File getFile()
    {
        return super.getFile();
    }

    @Override public boolean onPreStart()
    {
        return preStart();
    }

    @Override public final boolean onStart()
    {
        return start();
    }

    @Override public File getFolder()
    {
        return super.getDataFolder();
    }

    @Override public final boolean onPostStart()
    {
        started = postStart();
        return started;
    }

    @Override public final void onStop()
    {
        stop();
    }

    @Override public boolean isStarted()
    {
        return started;
    }

    @Override public KissenPlugin getInstance()
    {
        return this;
    }

    @Override public boolean preStart()
    {
        return KissenPlugin.super.preStart();
    }

    @Override public abstract boolean start();

    @Override public boolean postStart()
    {
        return KissenPlugin.super.postStart();
    }

    @Override public abstract void stop();

    @Override public final Kissen getCore()
    {
        return KissenCore.getInstance();
    }
}
