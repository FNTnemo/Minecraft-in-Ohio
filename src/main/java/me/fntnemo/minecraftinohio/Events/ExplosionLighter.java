package me.fntnemo.minecraftinohio.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExplosionLighter implements Listener {

    @EventHandler
    public void explosion(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(event.getAction() == Action.RIGHT_CLICK_BLOCK &&
        player.getInventory().getItemInHand().getType() == Material.FLINT_AND_STEEL
        ){

            player.getWorld().createExplosion(event.getClickedBlock().getLocation(), 9);

        }
    }

}
