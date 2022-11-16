package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.entity.Oven;

/**
 * Represents creator of a oven appliance.
 */
public class OvenCreator extends ApplianceCreatorBase<Oven> {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String WEIGHT = "weight";
    private static final String CAPACITY = "capacity";
    private static final String DEPTH = "depth";
    private static final String HEIGHT = "height";
    private static final String WIDTH = "width";

    /**
     * {@inheritDoc}
     */
    @Override
    protected Oven getInstance() {
        return new Oven();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(Oven entity, String key, String value) {
        switch (key) {
            case POWER_CONSUMPTION -> entity.setPowerConsumption(Integer.parseInt(value));
            case WEIGHT -> entity.setWeight(Integer.parseInt(value));
            case CAPACITY -> entity.setCapacity(Integer.parseInt(value));
            case DEPTH -> entity.setDepth(Integer.parseInt(value));
            case HEIGHT -> entity.setHeight(Double.parseDouble(value));
            case WIDTH -> entity.setWidth(Double.parseDouble(value));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
