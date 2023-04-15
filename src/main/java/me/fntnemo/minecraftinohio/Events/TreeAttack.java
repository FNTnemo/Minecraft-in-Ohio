package me.fntnemo.minecraftinohio.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TreeAttack implements Listener {

    @EventHandler
    public void onTreeHit(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Material clickedBlock = event.getClickedBlock().getType();

        if(event.getAction() == Action.LEFT_CLICK_BLOCK &&
               (clickedBlock == Material.OAK_LOG ||
                clickedBlock == Material.SPRUCE_LOG ||
                clickedBlock == Material.JUNGLE_LOG ||
                clickedBlock == Material.BIRCH_LOG ||
                clickedBlock == Material.DARK_OAK_LOG ||
                clickedBlock == Material.ACACIA_LOG)
        ){

            player.damage(5);
            player.sendMessage(ChatColor.RED + "Нетрош меня!!!");

        }
    }
}
