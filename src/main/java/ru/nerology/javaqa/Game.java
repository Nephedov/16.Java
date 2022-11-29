package ru.nerology.javaqa;


import java.util.HashMap;

public class Game {

    private HashMap<String, Integer> registeredPlayers = new HashMap<>();

    public void register(String playerName, int playerStrength) {
        registeredPlayers.put(playerName, playerStrength);
    }

    boolean isRegistered(String name) {
        return registeredPlayers.containsKey(name);
    }

    public HashMap <String, Integer> findAll() {
        return registeredPlayers;
    }


    public int round(String playerName1, String playerName2) {
        if (!isRegistered(playerName1)) {
            throw new NotRegisteredException(playerName1 + " not registered");
        }

        if (!isRegistered(playerName2)) {
            throw new NotRegisteredException(playerName2 + " not registered");
        }

        int firstPlayerStrength = findAll().get(playerName1);
        int secondPlayerStrength = findAll().get(playerName2);

        if (firstPlayerStrength > secondPlayerStrength) {
            return 1;
        } else if (firstPlayerStrength < secondPlayerStrength) {
            return 2;
        } else {
            return 0;
        }
    }
}
