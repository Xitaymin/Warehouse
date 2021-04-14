package ua.training.view;

public class View {
    public static final String REQUEST_PRODUCT_NAME_INPUT = "Enter product name.";
    public static final String REQUEST_MANUFACTURER_NAME_INPUT = "Enter manufacturer name.";
    public static final String REQUEST_PRODUCT_QUANTITY_INPUT = "Enter product quantity. The number must be greater than zero.";
    public static final String INCORRECT_QUANTITY_INPUT = "Entered number is not a number or less than zero. Please, repeat input.";
    public static final String NOT_A_NUMBER = "Entered value must be a number. Please, repeat input.";

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
