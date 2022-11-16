package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the Oven appliance.
 */
public class Oven extends Appliance {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    @Override
    public String toString() {
        return String.format("Oven : PRICE=%.2f, POWER_CONSUMPTION=%d, WEIGHT=%d, CAPACITY=%d, DEPTH=%d, HEIGHT=%.1f, WIDTH=%.1f",
                getPrice(), getPowerConsumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Oven.valueOf(key)) {
            case POWER_CONSUMPTION -> getPowerConsumption() == (Integer) value;
            case WEIGHT -> getWeight() == (Integer) value;
            case CAPACITY -> getCapacity() == (Integer) value;
            case DEPTH -> getDepth() == (Integer) value;
            case HEIGHT -> getHeight() == Double.parseDouble(String.valueOf(value));
            case WIDTH -> getWidth() == Double.parseDouble(String.valueOf(value));
            default -> super.matches(key, value);
        };
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
