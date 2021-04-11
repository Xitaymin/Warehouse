package ua.training.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Product implements Cloneable {
    private String name;
    private String manufacturer;
    private int quantity;
    private LocalDate manufacturingDate;
    private Period shelfLife;
    private String supplier;
    private String supplierNumber;
    private String manufacturerNumber;
    private BigDecimal price;

    public Product(String name, String manufacturer, int quantity, LocalDate manufacturingDate, Period shelfLife,
                   String supplier, String supplierNumber, String manufacturerNumber, BigDecimal price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
        this.shelfLife = shelfLife;
        this.supplier = supplier;
        this.supplierNumber = supplierNumber;
        this.manufacturerNumber = manufacturerNumber;
        this.price = price;
    }

    public Product(String name, String manufacturer, int quantity, LocalDate manufacturingDate, Period shelfLife,
                   String manufacturerNumber, BigDecimal price) {
        this(name,manufacturer,quantity,manufacturingDate,shelfLife,manufacturer,manufacturerNumber,manufacturerNumber,price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Period getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Period shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getManufacturerNumber() {
        return manufacturerNumber;
    }

    public void setManufacturerNumber(String manufacturerNumber) {
        this.manufacturerNumber = manufacturerNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        throw new AssertionError("Missed Cloneable");
    }


}
