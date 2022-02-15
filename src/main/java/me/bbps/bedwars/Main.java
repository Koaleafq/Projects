package me.bbps.bedwars;

import me.bbps.bedwars.commands.GameSettingsCMDs;
import me.bbps.bedwars.trade.TradingMenu;
import me.bbps.bedwars.trade.event.OpenMenu;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static final String pluginSignature = ChatColor.GOLD + "[" + ChatColor.LIGHT_PURPLE + "BedWars" + ChatColor.GOLD + "]";

    public static TradingMenu tradingMenu = new TradingMenu();

    @Override
    public void onEnable() {
        System.out.println("Hello, plugin has been successfully loaded!");

    new GameSettingsCMDs(this);

        Bukkit.getPluginManager().registerEvents(new OpenMenu(), this);
    }

    @Override
    public void onDisable() {

    }

    public static String getPluginSignature() {return pluginSignature;}
}
