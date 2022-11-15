package ru.nerology.javaqa;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Player> registeredPlayers = new ArrayList<>();

    public void register(Player player) {
        registeredPlayers.add(player);
    }

    boolean isRegistered(String name) {
        for (Player player : registeredPlayers) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int round(String playerName1, String playerName2) {
        if (!isRegistered(playerName1)) {
            throw new NotRegisteredException(playerName1 + " not registered");
        }

        if (!isRegistered(playerName2)) {
            throw new NotRegisteredException(playerName2 + " not registered");
        }

        Player player1 = null, player2 = null;

        for (Player player : registeredPlayers) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }

            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            return 2;
        } else return 0;
    }
}
