package me.bbps.bedwars.trade.event;

import me.bbps.bedwars.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class OpenMenu implements Listener {

    @EventHandler
    public void onVillagerClick(PlayerInteractEntityEvent event){
        if (event.getRightClicked().getType() == EntityType.VILLAGER){
            if (event.getRightClicked().getName().equals("Жлобский торговец")){
                event.getPlayer().openInventory(Main.tradingMenu.getInventory());
            }
        }
    }
}
