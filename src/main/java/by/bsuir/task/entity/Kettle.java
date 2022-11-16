package by.bsuir.task.entity;

import by.bsuir.task.entity.criteria.SearchCriteria;
import by.bsuir.task.entity.enums.ColorType;

public class Kettle extends Appliance {
    private int powerConsumption;
    private double waterCapacity;
    private ColorType color;

    @Override
    public String toString() {
        return String.format("Kettle : PRICE=%.2f, POWER_CONSUMPTION=%d, WATER_CAPACITY=%.2f, COLOR=%s",
        getPrice(), getPowerConsumption(), getWaterCapacity(), getColor().toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Kettle.valueOf(key)) {
            case POWER_CONSUMPTION -> getPowerConsumption() == Integer.parseInt(String.valueOf(value));
            case WATER_CAPACITY -> getWaterCapacity() == Double.parseDouble(String.valueOf(value));
            case COLOR -> getColor() == ColorType.valueOf(String.valueOf(value));
            default -> super.matches(key, value);
        };
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(double waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }
}
