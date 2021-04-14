package ua.training.view;

public class View {
    public static final String REQUEST_PRODUCT_NAME_INPUT = "Enter product name.";
    public static final String REQUEST_MANUFACTURER_NAME_INPUT = "Enter manufacturer name.";
    public static final String REQUEST_PRODUCT_QUANTITY_INPUT = "Enter product quantity. The number must be greater than zero.";
    public static final String INCORRECT_QUANTITY_INPUT = "Entered number is not a number or less than zero. Please, repeat input.";
    public static final String NOT_A_NUMBER = "Entered value must be a number. Please, repeat input.";
    public static final String REQUEST_MANUFACTURING_DATE = "Enter manufacturing date of the product in format yyyy-mm-dd.";
    public static final String INCORRECT_NUMBER_INPUT = "One of the entered values is not a number. Please,check and repeat input.";
    public static final String INCORRECT_DATE_INPUT = "The date doesn't exist. Please, check and repeat input.";

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
