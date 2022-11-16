package by.bsuir.task.entity;

import by.bsuir.task.entity.criteria.SearchCriteria;
import by.bsuir.task.entity.enums.FilterType;

/**
 * Represents the laptop appliance.
 */
public class VacuumCleaner extends Appliance {
    private int powerConsumption;
    private FilterType filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    @Override
    public String toString() {
        return String.format("VacuumCleaner : PRICE=%.2f, POWER_CONSUMPTION=%d, FILTER_TYPE=%s, BAG_TYPE=%s, WAND_TYPE=%s, MOTOR_SPEED_REGULATION=%d, CLEANING_WIDTH=%d",
                getPrice(), getPowerConsumption(), getFilterType().toString(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.VacuumCleaner.valueOf(key)) {
            case POWER_CONSUMPTION -> getPowerConsumption() == (Integer) value;
            case FILTER_TYPE -> getFilterType() == FilterType.valueOf((String) value);
            case BAG_TYPE -> getBagType().equals(value);
            case WAND_TYPE -> getWandType().equals(value);
            case MOTOR_SPEED_REGULATION -> getMotorSpeedRegulation() == (Integer) value;
            case CLEANING_WIDTH -> getCleaningWidth() == (Integer) value;
            default -> super.matches(key, value);
        };
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
