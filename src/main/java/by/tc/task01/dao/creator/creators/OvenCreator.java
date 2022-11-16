package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
            case POWER_CONSUMPTION -> entity.powerConsumption = Integer.parseInt(value);
            case WEIGHT -> entity.weight = Integer.parseInt(value);
            case CAPACITY -> entity.capacity = Integer.parseInt(value);
            case DEPTH -> entity.depth = Integer.parseInt(value);
            case HEIGHT -> entity.height = Double.parseDouble(value);
            case WIDTH -> entity.width = Double.parseDouble(value);
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
