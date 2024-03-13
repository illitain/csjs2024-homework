package ru.croc.javaschool2024.surname.task5;

import java.util.Objects;

/**
 * Класс для представления товара интрнет-магазина.
 *
 * @author pgoftenyuk
 */
public class Product {
    private final String code;
    private final String name;
    private double price;
    private String description;


    /**
     * Конструктор.
     *
     * @param code        Артикул
     * @param name        Наименование
     * @param price       Цена
     * @param description Описание
     */
    public Product(String code, String name, double price, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
            "code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

