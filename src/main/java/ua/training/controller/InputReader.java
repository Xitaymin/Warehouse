package ua.training.controller;

import java.util.Scanner;

import static ua.training.view.View.*;

public class InputReader {

    Scanner sc;

    public InputReader(Scanner scanner) {
        this.sc = scanner;
    }

    public String getText() {
        return sc.nextLine();
    }

    public int getNumber() {
        return sc.nextInt();
    }

    public int getFirstNumberValue() {
        while (!sc.hasNextInt()){
            showMessage(NOT_A_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }
}
