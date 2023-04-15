package me.fntnemo.minecraftinohio.Events;

import net.kyori.adventure.text.event.ClickEvent;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class TreeAttack implements Listener {

    @EventHandler
    public void onTreeHit(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Material clickedBlock = event.getClickedBlock().getType();

        if(event.getAction() == Action.LEFT_CLICK_BLOCK &&
        clickedBlock == Material.OAK_LOG){
            player.damage(10);
        }
    }
}
