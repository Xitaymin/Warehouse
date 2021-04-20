package ua.training.controller;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class InputValidatorTest {

    InputValidator validator = new InputValidator();
    InputReader reader = mock(InputReader.class);

    @Test
    public void checkIfOnlyValidDataReturns(){
        when(reader.getText()).thenReturn("1993-14-22","199304-22","adbc-db-cs","1993-4-22");
        LocalDate wantedDate = LocalDate.of(1993,4,22);
        LocalDate actualDate = validator.getDate(reader);
        verify(reader,times(4)).getText();
        assertEquals(wantedDate, actualDate);
    }

    @Test
    public void checkIfOnlyValidQuantityReturns(){
        when(reader.getFirstNumberValue()).thenReturn(-5,2);
        assertEquals(2,validator.getQuantity(reader));
    }
    @Test
    public void checkIfOnlyValidPeriodReturns(){
        when(reader.getText()).thenReturn("5y");
        assertEquals(Period.of(5,0,0),validator.getPeriod(reader));
        when(reader.getText()).thenReturn("15D");
        assertEquals(Period.of(0,0,15),validator.getPeriod(reader));
        when(reader.getText()).thenReturn("2W");
        assertEquals(Period.of(0,0,14),validator.getPeriod(reader));
        when(reader.getText()).thenReturn("1m");
        assertEquals(Period.of(0,1,0),validator.getPeriod(reader));
        when(reader.getText()).thenReturn("incorrectInput","P5Y","4m");
        assertEquals(Period.of(0,4,0),validator.getPeriod(reader));
    }

    @Test
    public void checkIfOnlyValidPhoneNumberReturns(){
        when(reader.getText()).thenReturn("not a number","5547","+15557354889");
        assertEquals("+15557354889",validator.getPhoneNumber(reader));
    }

    @Test
    public void checkIfOnlyValidPriceReturns(){
        when(reader.getFirstNumberValue()).thenReturn(-50,170);
        assertEquals(new BigDecimal(170), validator.getPrice(reader));
    }


}