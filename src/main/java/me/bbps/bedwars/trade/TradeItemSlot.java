package me.bbps.bedwars.trade;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TradeItemSlot {
    private ItemStack itemToSell;
    private String name;
    private int price;
    private VaultType vaultType;

    // Простые предметы
    public TradeItemSlot(ItemStack itemStack, VaultType vaultType, int price){
        this.itemToSell = itemStack;
        List<String> lore = Arrays.asList(
                "",
                "Цена" + price + " " + vaultType.name
        );

        ItemMeta itemMeta =  itemStack.getItemMeta();
        itemMeta.setLore(lore);

        itemToSell.setItemMeta(itemMeta);

        this.vaultType = vaultType;
        this.price = price;
    }
    // Зачерованные предметы с кастомным именем
    public TradeItemSlot(ItemStack itemStack, VaultType vaultType, int price, String name, Map<Enchantment, Integer> enchantmentsMap){
        this.itemToSell = itemStack;

        for (Enchantment enchantment: enchantmentsMap.keySet()){
            itemToSell.addUnsafeEnchantment(enchantment, enchantmentsMap.get(enchantment));
        }
        List<String> lore = Arrays.asList(
                "",
                "Цена" + price + " " + vaultType.name
        );

        ItemMeta itemMeta =  itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemMeta.setDisplayName(name);

        itemToSell.setItemMeta(itemMeta);

        this.vaultType = vaultType;
        this.price = price;
        this.name = name;
    }
    // Зелья
    public TradeItemSlot(ItemStack itemStack, VaultType vaultType, int price, List<PotionEffect> potionEffectList, String name){
        this.itemToSell = itemStack;

        List<String> lore = Arrays.asList(
                "",
                "Цена" + price + " " + vaultType.name
        );

        PotionMeta potionMeta = (PotionMeta) itemStack.getItemMeta();
        potionMeta.setDisplayName(name);
        potionMeta.setLore(lore);

        itemStack.setItemMeta(potionMeta);

        for (PotionEffect potionEffect: potionEffectList){
            potionMeta.addCustomEffect(potionEffect, true);
        }
    }
    // Системный предмет
    public TradeItemSlot(ItemStack itemStack, String name){
        this.itemToSell = itemStack;


        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemToSell.setItemMeta(itemMeta);

        this.name = name;
    }

    public ItemStack getItemToSell() {
        return itemToSell;
    }

    public void setItemToSell(ItemStack itemToSell) {
        this.itemToSell = itemToSell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VaultType getVaultType() {
        return vaultType;
    }

    public void setVaultType(VaultType vaultType) {
        this.vaultType = vaultType;
    }
}
