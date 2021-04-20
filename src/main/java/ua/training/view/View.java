package ua.training.view;

public class View {
    public static final String REQUEST_PRODUCT_NAME_INPUT = "Enter product name.";
    public static final String REQUEST_MANUFACTURER_NAME_INPUT = "Enter manufacturer name.";
    public static final String REQUEST_PRODUCT_QUANTITY_INPUT = "Enter product quantity. The number must be greater than zero.";
    public static final String INCORRECT_QUANTITY_INPUT = "Entered number is not a number or less than zero. Please, repeat input.";
    public static final String NOT_A_NUMBER = "Entered value must be a number. Please, repeat input.";
    public static final String REQUEST_MANUFACTURING_DATE = "Enter manufacturing date of the product in format yyyy-mm-dd.";
    public static final String INCORRECT_NUMBER_INPUT = "One or several of the entered values is not a number. Please,check and repeat input.";
    public static final String INCORRECT_DATE_INPUT = "The date doesn't exist. Please, check and repeat input.";
    public static final String REQUEST_SHELF_LIFE = "Enter product shelf life in format: XXd or XXw or XXy. For example 4d means 4 days, 14w - 14 weeks, 5m - 5 month, 1y - one year.";
    public static final String INCORRECT_INPUT_FORMAT = "Check format of your input. Year, month and date should be separated by -. Please, repeat your input." ;
    public static final String INCORRECT_PERIOD_INPUT = "Entered period value is not correct. Please, check and repeat input." ;
    public static final String REQUEST_SUPPLIER_NAME = "Please enter supplier name." ;
    public static final String REQUEST_MANUFACTURER_PHONE = "Please enter manufacturer phone number in  format +XXХХХХХХХХХ (11 digits). For example +1555735486." ;
    public static final String INCORRECT_PHONE_NUMBER_INPUT = "Entered phone number is not correct. Please, check and repeat input.";
    public static final String REQUEST_SUPPLIER_PHONE = "Enter supplier phone number in  format +XXХХХХХХХХХ (11 digits). For example +1555735486.";
    public static final String REQUEST_PRICE_INPUT = "Please enter product price in USD.";
    public static final String INCORRECT_PRICE = "Price should be greater than 0. Please, check and repeat input.";


    public static void showMessage(String message) {
        System.out.println(message);
    }
}
