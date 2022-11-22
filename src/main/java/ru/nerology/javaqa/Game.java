package ru.nerology.javaqa;


import java.util.HashMap;

public class Game {

    private HashMap<String, Integer> registeredPlayers = new HashMap<>();

    public void register(String playerName, int playerStrength) {
        registeredPlayers.put(playerName, playerStrength);
    }

    boolean isRegistered(String name) {
        for (String key : registeredPlayers.keySet()) {
            if (key.equals(name)) {
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

        int firstPlayerStrength = 0, secondPlayerStrength = 0;


        for (String key : registeredPlayers.keySet()) {
            if (key.equals(playerName1)) {
                int firstPlayerValue = registeredPlayers.get(key);
                firstPlayerStrength = firstPlayerValue;

            }

            if (key.equals(playerName2)) {
                int secondPlayerValue = registeredPlayers.get(key);
                secondPlayerStrength = secondPlayerValue;
            }
        }

        if (firstPlayerStrength > secondPlayerStrength) {
            return 1;
        } else if (firstPlayerStrength < secondPlayerStrength) {
            return 2;
        } else {
            return 0;
        }
    }
}
