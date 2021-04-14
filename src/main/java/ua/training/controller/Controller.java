package ua.training.controller;

import ua.training.model.Product;

import java.util.Scanner;

import static ua.training.view.View.*;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private Product product;
    private ProductDTO productDTO = new ProductDTO();
    private DateParser dateParser = new DateParser();
    private InputValidator validator = new InputValidator();
    InputReader reader = new InputReader(new Scanner(System.in));

    public void processUserInput() {
        showMessage(REQUEST_PRODUCT_NAME_INPUT);
        productDTO.setName(reader.getText());
        showMessage(REQUEST_MANUFACTURER_NAME_INPUT);
        productDTO.setManufacturer(reader.getText());
        showMessage(REQUEST_PRODUCT_QUANTITY_INPUT);
        productDTO.setQuantity(validator.getValidQuantityValue(reader));
//        showMessage(REQUEST_MANUFACTURING_DATE);
//        productDTO.setManufacturingDate(validator.getValidDate(reader));
//        showMessage(REQUEST_SHELF_LIFE);
//        productDTO.setShelfLife(validator.getValidPeriod(reader));
//        showMessage(REQUEST_SUPPLIER_NAME);
//        productDTO.setSupplier(reader.getText());
//        showMessage(REQUEST_MANUFACTURER_PHONE);
//        productDTO.setManufacturerNumber(validator.getPhoneNumber(reader));
//        showMessage(REQUEST_SUPPLIER_PHONE);
//        productDTO.setManufacturerNumber(validator.getPhoneNumber(reader));
//        showMessage(REQUEST_PRICE_INPUT);
//        productDTO.setPrice(validator.getPrice(reader.getNumber()));
    }

    public void makeProductItemFromManufacturer() {
        product = new Product(productDTO.getName(), productDTO.getManufacturer(), productDTO.getQuantity(),
                              productDTO.getManufacturingDate(), productDTO.getShelfLife(),
                              productDTO.getManufacturerNumber(), productDTO.getPrice());
    }

    public void makeProductItem() {
        product = new Product(productDTO.getName(), productDTO.getManufacturer(), productDTO.getQuantity(),
                              productDTO.getManufacturingDate(), productDTO.getShelfLife(), productDTO.getSupplier(),
                              productDTO.getSupplierNumber(), productDTO.getManufacturerNumber(), productDTO.getPrice()

        );
    }


    /*
    todo
    organize input and output data:

    Get user String without validation
    - get user input with product supplier as String

    - get user input with shelf life and parse as Period
    - get user input with product manufacturing date and parse as LocalDate
    - get user input with manufacturer number and check that it contains only appropriate symbols
    - get user input with supplier number and check that it contains only appropriate symbols
    - get user input with product price and check if it is greater then zero
    -

     */
}
