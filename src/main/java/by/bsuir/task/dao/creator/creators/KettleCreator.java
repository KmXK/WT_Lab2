package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.entity.Kettle;
import by.bsuir.task.entity.enums.ColorType;

/**
 * Represents creator of a laptop appliance.
 */
public class KettleCreator extends ApplianceCreatorBase<Kettle> {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String WATER_CAPACITY = "waterCapacity";
    private static final String COLOR = "color";

    /**
     * {@inheritDoc}
     */
    @Override
    protected Kettle getInstance() {
        return new Kettle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(Kettle entity, String key, String value) {
        switch (key) {
            case POWER_CONSUMPTION -> entity.setPowerConsumption(Integer.parseInt(value));
            case WATER_CAPACITY -> entity.setWaterCapacity(Double.parseDouble(value));
            case COLOR -> entity.setColor(ColorType.valueOf(value.toUpperCase()));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
