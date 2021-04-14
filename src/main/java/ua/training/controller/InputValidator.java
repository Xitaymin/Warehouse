package ua.training.controller;

import static ua.training.view.View.*;




public class InputValidator {
    //todo add Optional
    public int getValidQuantityValue(InputReader reader) {
        int result;
        result = reader.getFirstNumberValue();
        while (result < 0) {
            showMessage(INCORRECT_QUANTITY_INPUT);
            result = reader.getFirstNumberValue();
        }
        return result;
    }
}
