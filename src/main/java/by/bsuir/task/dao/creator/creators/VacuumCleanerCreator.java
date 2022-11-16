package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.entity.VacuumCleaner;
import by.bsuir.task.entity.enums.FilterType;

/**
 * Represents creator of a vacuum cleaner appliance.
 */
public class VacuumCleanerCreator extends ApplianceCreatorBase<VacuumCleaner> {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String FILTER_TYPE = "filterType";
    private static final String BAG_TYPE = "bagType";
    private static final String WAND_TYPE = "wandType";
    private static final String MOTOR_SPEED_REGULATION = "motorSpeedRegulation";
    private static final String CLEANING_WIDTH = "cleaningWidth";

    /**
     * {@inheritDoc}
     */
    @Override
    protected VacuumCleaner getInstance() {
        return new VacuumCleaner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(VacuumCleaner entity, String key, String value) {
        switch (key) {
            case POWER_CONSUMPTION -> entity.setPowerConsumption(Integer.parseInt(value));
            case FILTER_TYPE -> entity.setFilterType(FilterType.valueOf(value.toUpperCase()));
            case BAG_TYPE -> entity.setBagType(value);
            case WAND_TYPE -> entity.setWandType(value);
            case MOTOR_SPEED_REGULATION -> entity.setMotorSpeedRegulation(Integer.parseInt(value));
            case CLEANING_WIDTH -> entity.setCleaningWidth(Integer.parseInt(value));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
