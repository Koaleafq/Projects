package me.bbps.bedwars.arena;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private List<Location> spawnsList;
    private List<Location> bedsList;
    private List<Location> villagerList;

    private List<Player> playersOnArena;

    private Location lobbyLocation;

    private List<Location> playerJoinLocation;

    private boolean isArenaLive;
    private int playerPerTeam;
    private int numberOfteams;


    public Arena(int playerPerTeam, int numberOfteams){
        this.playerPerTeam = playerPerTeam;
        this.numberOfteams = numberOfteams;

        spawnsList = new ArrayList<>();
        bedsList = new ArrayList<>();
        villagerList = new ArrayList<>();

        playersOnArena = new ArrayList<>();

        playerJoinLocation = new ArrayList<>();
        isArenaLive = false;
    }

    public void sendArenaMessage(String msg){
        for (Player player:playersOnArena){
            player.sendMessage(msg);
        }
    }
    public void playArenaSound(Sound sound){
        for (Player player: playersOnArena){
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 10, 10);
        }
    }


    public void joinPlayer(Player player){
        playersOnArena.add(player);
        playerJoinLocation.add(player.getLocation());

        player.teleport(lobbyLocation);
    }

    public void kickPlayer(Player player){
        player.teleport(playerJoinLocation.get(playersOnArena.indexOf(player)));
        playerJoinLocation.remove(playersOnArena.indexOf(player));
        playersOnArena.remove(player);
    }

    public void addSpawn(Location spawnLocation){
        spawnsList.add(spawnLocation);
    }
    public void addBed(Location bedLocation){
        bedsList.add(bedLocation);
    }
    public void addVillager(Location villagerLocation){
        villagerList.add(villagerLocation);
    }

    public void setLobbyLocation(Location lobbyLocation) {
        this.lobbyLocation = lobbyLocation;
    }

    public void setArenaLive(boolean arenaLive) {
        isArenaLive = arenaLive;
    }

    public void setPlayerPerTeam(int playerPerTeam) {
        this.playerPerTeam = playerPerTeam;
    }

    public void setNumberOfteams(int numberOfteams) {
        this.numberOfteams = numberOfteams;
    }

    public List<Location> getSpawnsList() {
        return spawnsList;
    }

    public List<Location> getBedsList() {
        return bedsList;
    }

    public List<Location> getVillagerList() {
        return villagerList;
    }

    public List<Player> getPlayersOnArena() {
        return playersOnArena;
    }

    public Location getLobbyLocation() {
        return lobbyLocation;
    }

    public List<Location> getPlayerJoinLocation() {
        return playerJoinLocation;
    }

    public boolean isArenaLive() {
        return isArenaLive;
    }

    public int getPlayerPerTeam() {
        return playerPerTeam;
    }

    public int getNumberOfteams() {
        return numberOfteams;
    }


}

