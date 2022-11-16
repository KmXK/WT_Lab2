package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a laptop appliance.
 */
public class LaptopCreator extends ApplianceCreatorBase<Laptop> {
    private static final String BATTERY_CAPACITY = "batteryCapacity";
    private static final String OS = "os";
    private static final String MEMORY_ROM = "memoryRom";
    private static final String SYSTEM_MEMORY = "systemMemory";
    private static final String CPU = "cpu";
    private static final String DISPLAY_INCHS = "displayInchs";

    /**
     * {@inheritDoc}
     */
    @Override
    protected Laptop getInstance() {
        return new Laptop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(Laptop entity, String key, String value) {
        switch (key) {
            case BATTERY_CAPACITY -> entity.batteryCapacity = Double.parseDouble(value);
            case OS -> entity.os = value;
            case MEMORY_ROM -> entity.memoryRom = Integer.parseInt(value);
            case SYSTEM_MEMORY -> entity.systemMemory = Integer.parseInt(value);
            case CPU -> entity.cpu = Double.parseDouble(value);
            case DISPLAY_INCHS -> entity.displayInches = Integer.parseInt(value);
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
