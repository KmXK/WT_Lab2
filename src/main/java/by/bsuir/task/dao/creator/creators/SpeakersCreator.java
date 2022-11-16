package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.entity.Speakers;

/**
 * Represents creator of a speakers appliance.
 */
public class SpeakersCreator extends ApplianceCreatorBase<Speakers> {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String NUMBER_OF_SPEAKERS = "numberOfSpeakers";
    private static final String FREQUENCY_RANGE = "frequencyRange";
    private static final String CORD_LENGTH = "cordLength";

    /**
     * {@inheritDoc}
     */
    @Override
    protected Speakers getInstance() {
        return new Speakers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(Speakers entity, String key, String value) {
        switch (key) {
            case POWER_CONSUMPTION -> entity.setPowerConsumption(Integer.parseInt(value));
            case NUMBER_OF_SPEAKERS -> entity.setNumberOfSpeakers(Integer.parseInt(value));
            case FREQUENCY_RANGE -> entity.setFrequencyRange(value);
            case CORD_LENGTH -> entity.setCordLength(Integer.parseInt(value));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
