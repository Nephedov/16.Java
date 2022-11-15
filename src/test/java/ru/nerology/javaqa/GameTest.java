package ru.nerology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {
    Game game = new Game();
    Player playerMinus1 = new Player(-1, "Player-1", -1);
    Player playerZero = new Player(0, "Player0", 0);
    Player player1 = new Player(1, "Player1", 1);
    Player player2 = new Player(2, "Player2", 2);
    Player player3 = new Player(3, "Player3", 3);
    Player player4 = new Player(4, "Player4", 4);
    Player player5 = new Player(5, "Player5", 5);

    @BeforeEach
    void setup() {
        game.register(playerMinus1);
        game.register(playerZero);
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
    }

    @Test
    void registerZeroTest() {

        int expected = 0;
        int actual = game.round("Player3", "Player3");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void register1Test() {

        int expected = 1;
        int actual = game.round("Player0", "Player-1");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void register2Test() {

        int expected = 2;
        int actual = game.round("Player-1", "Player0");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void unregisteredFirstPlayerExceptionTest() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Player6", "Player0");
        });


    }

    @Test
    void unregisteredSecondPlayerExceptionTest() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Player5", "Player6");
        });
    }


}
