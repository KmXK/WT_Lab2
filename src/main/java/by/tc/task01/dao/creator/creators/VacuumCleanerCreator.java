package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.enums.FilterType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
            case POWER_CONSUMPTION -> entity.powerConsumption = Integer.parseInt(value);
            case FILTER_TYPE -> entity.filterType = FilterType.valueOf(value.toUpperCase());
            case BAG_TYPE -> entity.bagType = value;
            case WAND_TYPE -> entity.wandType = value;
            case MOTOR_SPEED_REGULATION -> entity.motorSpeedRegulation = Integer.parseInt(value);
            case CLEANING_WIDTH -> entity.cleaningWidth = Integer.parseInt(value);
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
