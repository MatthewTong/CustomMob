package my.Juicyz.CustomMob;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        CustomEntityType.registerEntities();
    }
    
    @Override
    public void onDisable() {
        CustomEntityType.unregisterEntities();
        
        //TODO iterate through all the entities and if it is custom, despawn or change to normal
    }
}
