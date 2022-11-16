package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
            case POWER_CONSUMPTION -> entity.powerConsumption = Integer.parseInt(value);
            case WEIGHT -> entity.weight = Integer.parseInt(value);
            case FREEZER_CAPACITY -> entity.freezerCapacity = Integer.parseInt(value);
            case OVERALL_CAPACITY -> entity.overallCapacity = Integer.parseInt(value);
            case HEIGHT -> entity.height = Double.parseDouble(value);
            case WIDTH -> entity.width = Double.parseDouble(value);
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
