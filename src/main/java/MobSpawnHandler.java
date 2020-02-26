import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobSpawnHandler implements Listener {
    private String worldName;
    MobSpawnHandler(String worldName){
        this.worldName = worldName;
    }

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event){
        LivingEntity entity = event.getEntity();
        if("spawn".equals(entity.getWorld().getName())){
            if(entity instanceof MagmaCube || entity instanceof EnderDragon){
                //nothing
            }else{
                event.setCancelled(true);
            }
        }
    }
}
