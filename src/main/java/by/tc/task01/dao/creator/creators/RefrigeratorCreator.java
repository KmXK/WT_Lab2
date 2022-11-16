package by.tc.task01.dao.creator.creators;

import by.tc.task01.entity.Refrigerator;

/**
 * Represents creator of a refrigerator appliance.
 */
public class RefrigeratorCreator extends ApplianceCreatorBase<Refrigerator> {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String WEIGHT = "weight";
    private static final String FREEZER_CAPACITY = "freezerCapacity";
    private static final String OVERALL_CAPACITY = "overallCapacity";
    private static final String HEIGHT = "height";
    private static final String WIDTH = "width";

    /**
     * {@inheritDoc}
     */
    @Override
    protected Refrigerator getInstance() {
        return new Refrigerator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(Refrigerator entity, String key, String value) {
        switch (key) {
            case POWER_CONSUMPTION -> entity.setPowerConsumption(Integer.parseInt(value));
            case WEIGHT -> entity.setWeight(Integer.parseInt(value));
            case FREEZER_CAPACITY -> entity.setFreezerCapacity(Integer.parseInt(value));
            case OVERALL_CAPACITY -> entity.setOverallCapacity(Double.parseDouble(value));
            case HEIGHT -> entity.setHeight(Double.parseDouble(value));
            case WIDTH -> entity.setWidth(Double.parseDouble(value));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
