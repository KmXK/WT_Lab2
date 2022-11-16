package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
            case POWER_CONSUMPTION -> entity.powerConsumption = Integer.parseInt(value);
            case NUMBER_OF_SPEAKERS -> entity.numberOfSpeakers = Integer.parseInt(value);
            case FREQUENCY_RANGE -> entity.frequencyRange = value;
            case CORD_LENGTH -> entity.cordLength = Integer.parseInt(value);
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
