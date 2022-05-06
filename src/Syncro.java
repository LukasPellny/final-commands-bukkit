import org.bukkit.plugin.java.JavaPlugin;

public class Syncro extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Aktiviert.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Deaktiviert.");
    }
}
