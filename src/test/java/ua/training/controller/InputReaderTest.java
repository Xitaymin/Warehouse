package ua.training.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class InputReaderTest {

    @Test
    public void testIfUserTextInputReceived(){
        String input = "Correct input";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        InputReader reader = new InputReader(new Scanner(System.in));
        Assertions.assertEquals(input, reader.getText());
    }

    @Test
    public void testIfUserNumberInputReceived(){
        int input = 1;
        System.setIn(new ByteArrayInputStream(String.valueOf(input).getBytes(StandardCharsets.UTF_8)));
        InputReader reader = new InputReader(new Scanner(System.in));
        Assertions.assertEquals(input, reader.getNumber());
    }

    @Test
    public void testIfNumberAfterIncorrectInputsReceived(){
        String [] inputs = {"Not a number","Another incorrect input","5","7"};

        System.setIn(new ByteArrayInputStream((inputs[0]).getBytes(StandardCharsets.UTF_8)));
        InputReader reader = new InputReader(new Scanner(System.in));
        reader.getFirstNumberValue();

    }



    }


