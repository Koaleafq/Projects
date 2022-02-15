package me.bbps.bedwars.trade;

import org.bukkit.Material;

public enum VaultType {
    BRONZE(Material.BRICK, "Бронза"),
    IRON(Material.IRON_INGOT, "Железо"),
    GOLD(Material.GOLD_INGOT, "Золото"),
    BUY_MARK(Material.RED_STAINED_GLASS_PANE, "");


    public Material material;
    public String name;


    VaultType(Material material, String name){
        this.material = material;
        this.name = name;
    }
}
