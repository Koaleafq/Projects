package me.bbps.bedwars.trade;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.swing.plaf.MenuBarUI;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TradingMenu {
    private final List<MenuSlot> menu;
    private Inventory inventory = null;


    public TradingMenu(){
        menu = Arrays.asList(
                new MenuSlot(
                        Material.SANDSTONE,
                        Arrays.asList(
                                new TradeItemSlot(
                                        new ItemStack(VaultType.BUY_MARK.material),
                                        "Блоки"
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.SANDSTONE, 2),
                                        VaultType.BRONZE, 1
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.END_STONE, 1),
                                        VaultType.BRONZE, 7
                                )
                        )
                ),
                new MenuSlot(
                        Material.IRON_CHESTPLATE,
                        Arrays.asList(
                                new TradeItemSlot(
                                        new ItemStack(VaultType.BUY_MARK.material),
                                        "Броня"
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.LEATHER_HELMET,1),
                                        VaultType.BRONZE, 1,
                                        "Кожанная каска",
                                        Map.of(
                                                Enchantment.DURABILITY, 3
                                        )

                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.LEATHER_LEGGINGS,1),
                                        VaultType.BRONZE, 1,
                                        "Кожанные штаны",
                                        Map.of(
                                                Enchantment.DURABILITY, 3
                                        )

                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.LEATHER_BOOTS,1),
                                        VaultType.BRONZE, 1,
                                        "Кожанные черевички",
                                        Map.of(
                                                Enchantment.DURABILITY, 3
                                        )

                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.CHAINMAIL_CHESTPLATE,1),
                                        VaultType.IRON, 1,
                                        "Нагрудник Первого Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.PROTECTION_ENVIRONMENTAL, 1

                                        )

                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.CHAINMAIL_CHESTPLATE,1),
                                        VaultType.IRON, 3,
                                        "Нагрудник Второго Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.PROTECTION_ENVIRONMENTAL, 2

                                        )

                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.CHAINMAIL_CHESTPLATE,1),
                                        VaultType.IRON, 7,
                                        "Нагрудник Третьего Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.PROTECTION_ENVIRONMENTAL, 3

                                        )

                                )
                        )
                ),
                new MenuSlot(
                        Material.IRON_SWORD,
                        Arrays.asList(
                                new TradeItemSlot(
                                        new ItemStack(VaultType.BUY_MARK.material),
                                        "Оружие"
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.STICK),
                                        VaultType.BRONZE, 10,
                                        "Откидывалка",
                                        Map.of(
                                                Enchantment.KNOCKBACK, 2
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.GOLDEN_SWORD),
                                        VaultType.IRON, 2,
                                        "Меч Первого Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.DAMAGE_ALL, 1
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.GOLDEN_SWORD),
                                        VaultType.IRON, 5,
                                        "Меч Второго Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.DAMAGE_ALL, 2
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.IRON_SWORD),
                                        VaultType.GOLD, 5,
                                        "Железный меч ",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.DAMAGE_ALL, 1,
                                                Enchantment.KNOCKBACK, 2
                                        )
                                )


                        )
                ),
                new MenuSlot(
                        Material.BOW,
                        Arrays.asList(
                                new TradeItemSlot(
                                        new ItemStack(VaultType.BUY_MARK.material),
                                        "Луки"
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.BOW),
                                        VaultType.GOLD, 3,
                                        "Лук Первого Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.ARROW_INFINITE, 1
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.BOW),
                                        VaultType.GOLD, 7,
                                        "Лук Второго Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.ARROW_INFINITE, 1,
                                                Enchantment.ARROW_DAMAGE, 1,
                                                Enchantment.ARROW_KNOCKBACK,1
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.BOW),
                                        VaultType.GOLD, 12,
                                        ChatColor.RED + "Лук Третьего Уровня",
                                        Map.of(
                                                Enchantment.DURABILITY, 3,
                                                Enchantment.ARROW_INFINITE, 1,
                                                Enchantment.ARROW_DAMAGE, 3,
                                                Enchantment.ARROW_KNOCKBACK,2
                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.ARROW),
                                        VaultType.GOLD, 1,
                                        "Стрела",
                                        Map.of(

                                        )
                                )
                        )

                ),
                new MenuSlot(
                        Material.ENDER_PEARL,
                        Arrays.asList(
                                new TradeItemSlot(
                                        new ItemStack(VaultType.BUY_MARK.material),
                                        "Дополнительное"
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.ENDER_PEARL),
                                        VaultType.GOLD, 15,
                                        "Жемчуг Эндера",
                                        Map.of(

                                        )
                                ),
                                new TradeItemSlot(
                                        new ItemStack(Material.POTION),
                                        VaultType.GOLD, 10,
                                        Arrays.asList(
                                                new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 0)
                                        ),
                                        "Зелье Силы"
                                )

                        )
                )
        );

        inventory = Bukkit.createInventory(null, 9, "Traiding");

        for (MenuSlot menuSlot: menu){
            inventory.addItem(new ItemStack(menuSlot.getIcon()));
        }

    }

    public List<MenuSlot> getMenu() {
        return menu;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
