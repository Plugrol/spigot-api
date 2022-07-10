package de.kissenpvp.spigot.api.base;

import de.kissenpvp.api.base.plugin.KissenPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class KissenPluginSpigot extends JavaPlugin implements KissenPlugin
{
    private boolean started = false;

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
}
