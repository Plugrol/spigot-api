/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package de.kissenpvp.spigot.api.base;

import de.kissenpvp.api.base.Kissen;
import de.kissenpvp.api.base.plugin.KissenPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

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

    @Override public @NotNull File getFile()
    {
        return super.getFile();
    }

    @Override public JarFile getJarFile() throws IOException
    {
        return new JarFile(getFile());
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
        return Kissen.getInstance();
    }
}
