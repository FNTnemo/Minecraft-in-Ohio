package me.fntnemo.minecraftinohio.Events;

import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class FlyingBoat implements Listener {
    @EventHandler
    public void onSpawn(EntitySpawnEvent event){
        if(event.getEntity() instanceof Boat){
            Boat boat = (Boat) event.getEntity();
            boat.setGravity(false);
        }
    }
}
