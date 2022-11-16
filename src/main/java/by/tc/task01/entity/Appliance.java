package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents a single object of appliance of the shop.
 */
public abstract class Appliance {
    private double price;

    /**
     * Returns true if appliance matches the given search criteria.
     * Method should be overridden in child class.
     *
     * @param key   field to match for.
     * @param value value of field.
     * @return true if appliance matches the given criteria, false otherwise.
     */
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Common.valueOf(key)) {
            case PRICE -> getPrice() == Double.parseDouble(String.valueOf(value));
        };
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
