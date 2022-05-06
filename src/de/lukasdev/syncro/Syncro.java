package de.lukasdev.syncro;

import de.lukasdev.syncro.commands.discord;
import org.bukkit.plugin.java.JavaPlugin;

public class Syncro extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Aktiviert.");
        getCommand("mhadmin").setExecutor(new discord());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Deaktiviert.");
    }
}

