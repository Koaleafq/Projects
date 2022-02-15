package me.bbps.bedwars.commands;

import me.bbps.bedwars.Main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GameSettingsCMDs implements CommandExecutor {


    public GameSettingsCMDs(Main plugin) {
        Objects.requireNonNull(plugin.getCommand("bwSetup")).setExecutor(this); // /bwSetup createArena ArenaName


    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String cmd, @NotNull String[] args) {
        if (!(commandSender instanceof Player)){
            System.out.println("Only player can perform this command!");
            return true;
        }
        // /bwSetup createArena ArenaName
        // args == [0: createArena, 1: arenaName]
        Player player = (Player) commandSender;


        if (player.isOp()){
            if (args[0].equalsIgnoreCase("createArena")){
                player.sendMessage(ChatColor.GREEN + "Arena has been created!");
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 10, 10);

            }
        }
        else {
            System.out.println("Only OP can use this command!");
            return true;
        }
        return false;
    }
}
