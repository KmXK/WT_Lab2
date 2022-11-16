package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the Speakers appliance.
 */
public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    @Override
    public String toString() {
        return String.format("Speakers : PRICE=%.2f, OWER_CONSUMPTION=%d, NUMBER_OF_SPEAKERS=%d, FREQUENCY_RANGE=%s, CORD_LENGTH=%d",
                getPrice(), getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Speakers.valueOf(key)) {
            case POWER_CONSUMPTION -> getPowerConsumption() == (Integer) value;
            case NUMBER_OF_SPEAKERS -> getNumberOfSpeakers() == (Integer) value;
            case FREQUENCY_RANGE -> getFrequencyRange().equals(value);
            case CORD_LENGTH -> getCordLength() == (Integer) value;
            default -> super.matches(key, value);
        };
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
