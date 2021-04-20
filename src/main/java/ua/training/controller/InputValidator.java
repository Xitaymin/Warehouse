package ua.training.controller;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

import static ua.training.view.View.*;

public class InputValidator {
    //todo add Optional
    public int getQuantity(InputReader reader) {
        int result;
        result = reader.getFirstNumberValue();
        while (result < 0) {
            showMessage(INCORRECT_QUANTITY_INPUT);
            result = reader.getFirstNumberValue();
        }
        return result;
    }

    public LocalDate getDate(InputReader reader) {
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
            catch (ArrayIndexOutOfBoundsException e){
                showMessage(INCORRECT_INPUT_FORMAT);
                continue;
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

    public Period getPeriod(InputReader reader) {
        String input;
        Period period;
        while (true){
        input = reader.getText();
        /*
        Period parse method takes input String in format PnT - where n - quantity and T is letter that describes time unit may d,m,w,y in any case.
        */
        if(input.matches("^\\d{1,4}[dwymDWMY]$")){
            period = Period.parse("P"+input);
            return period;
        }
        else {
            showMessage(INCORRECT_PERIOD_INPUT);
        }
        }
    }

    public String getPhoneNumber(InputReader reader) {
        String input = reader.getText();
        while (!input.matches("^\\+\\d{11,15}$")){
            showMessage(INCORRECT_PHONE_NUMBER_INPUT);
            input = reader.getText();
        }
        return input;
    }

    public BigDecimal getPrice(InputReader reader) {
        int input = reader.getFirstNumberValue();
        while (input<0){
            showMessage(INCORRECT_PRICE);
            input = reader.getFirstNumberValue();
        }
        return new BigDecimal(input);
    }
}
