package me.bbps.bedwars.trade;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class MenuSlot {
    private Material icon;
    private List<TradeItemSlot> contents = new ArrayList<>();
    private final Inventory inventory;

    public MenuSlot(Material icon, List<TradeItemSlot> contents){
        this.icon = icon;
        this.contents = contents;

        this.inventory = Bukkit.createInventory(null, 9);

        for (TradeItemSlot tradeItemSlot: contents){
            inventory.addItem(tradeItemSlot.getItemToSell());
        }
    }

    public Material getIcon() {
        return icon;
    }

    public void setIcon(Material icon) {
        this.icon = icon;
    }

    public List<TradeItemSlot> getContents() {
        return contents;
    }

    public void setContents(List<TradeItemSlot> contents) {
        this.contents = contents;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
