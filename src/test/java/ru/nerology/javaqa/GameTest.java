package ru.nerology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {
    Game game = new Game();

    @BeforeEach
    void setup() {
        game.register("playerMinus1", -1);
        game.register("playerZero", 0);
        game.register("player1", 1);
        game.register("player2", 2);
        game.register("player3", 3);
        game.register("player4", 4);
        game.register("player5", 5);
    }

    @Test
    void registerZeroTest() {

        int expected = 0;
        int actual = game.round("player3", "player3");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void register1Test() {

        int expected = 1;
        int actual = game.round("playerZero", "playerMinus1");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void register2Test() {

        int expected = 2;
        int actual = game.round("playerMinus1", "playerZero");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void unregisteredFirstPlayerExceptionTest() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("player6", "playerZero");
        });


    }

    @Test
    void unregisteredSecondPlayerExceptionTest() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("player5", "player6");
        });
    }


}
