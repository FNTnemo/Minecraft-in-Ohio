package me.fntnemo.minecraftinohio;

import me.fntnemo.minecraftinohio.Events.ExplosionLighter;
import me.fntnemo.minecraftinohio.Events.TreeAttack;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        run();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void run(){
        Bukkit.getPluginManager().registerEvents(new ExplosionLighter(), this);
        Bukkit.getPluginManager().registerEvents(new TreeAttack(), this);
    }
}
