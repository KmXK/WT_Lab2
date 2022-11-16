package by.bsuir.task.entity;

import by.bsuir.task.entity.criteria.SearchCriteria;

/**
 * Represents the refrigerator appliance.
 */
public class Refrigerator extends Appliance {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    @Override
    public String toString() {
        return String.format("Refrigerator : PRICE=%.2f, POWER_CONSUMPTION=%d, WEIGHT=%d, FREEZER_CAPACITY=%d, OVERALL_CAPACITY=%.1f, HEIGHT=%.1f, WIDTH=%.1f",
                getPrice(), getPowerConsumption(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Refrigerator.valueOf(key)) {
            case POWER_CONSUMPTION -> getPowerConsumption() == (Integer) value;
            case WEIGHT -> getWeight() == (Integer) value;
            case FREEZER_CAPACITY -> getFreezerCapacity() == (Integer) value;
            case OVERALL_CAPACITY -> getOverallCapacity() == Double.parseDouble(String.valueOf(value));
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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
