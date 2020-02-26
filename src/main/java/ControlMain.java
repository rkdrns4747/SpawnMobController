import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ControlMain extends JavaPlugin{
    private String worldName;

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(new MobSpawnHandler(worldName),this);
    }
}
