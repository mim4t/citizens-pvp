import org.bukkit.plugin.java.JavaPlugin;

public class CitizensPVP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PvP Bot Plugin Enabled");
        getServer().getPluginManager().registerEvents(new BotAI(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("PvP Bot Plugin Disabled");
    }
}
