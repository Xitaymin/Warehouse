package ua.training.controller;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputReaderTest {

    @Test
    public void testIfUserTextInputReceived(){
        String input = "Correct input";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        InputReader reader = new InputReader(new Scanner(System.in));
        assertEquals(input, reader.getText());
    }

    @Test
    public void testIfUserNumberInputReceived(){
        int input = 1;
        System.setIn(new ByteArrayInputStream(String.valueOf(input).getBytes(StandardCharsets.UTF_8)));
        InputReader reader = new InputReader(new Scanner(System.in));
        assertEquals(input, reader.getNumber());
    }

    @Test
    public void checkIfOnlyFirstNumberValueReturns(){
        String  input = "Notanumber Anotherincorrectinput 5 7";
        InputReader reader = new InputReader(new Scanner(input).useDelimiter(" "));
        assertEquals(5,reader.getFirstNumberValue());
    }



    }


