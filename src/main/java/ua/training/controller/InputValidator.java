package ua.training.controller;

import java.time.DateTimeException;
import java.time.LocalDate;

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

    public LocalDate getValidDate(InputReader reader) {
        LocalDate manufacturingDate;
        String input;
        while (true){
            input = reader.getText();
            String [] splitedInput = input.split("-",3);
            try{
                int year = Integer.parseInt(splitedInput[0]);
                int month = Integer.parseInt(splitedInput[1]);
                int day = Integer.parseInt(splitedInput[2]);
                manufacturingDate = LocalDate.of(year,month,day);
            }
            catch (NumberFormatException e){
                showMessage(INCORRECT_NUMBER_INPUT);
                continue;
            }
            catch (DateTimeException e){
                showMessage(INCORRECT_DATE_INPUT);
                continue;
            }
            break;
        }
        return manufacturingDate;
    }
}
