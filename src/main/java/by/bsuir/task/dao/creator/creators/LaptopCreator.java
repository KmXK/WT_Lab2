package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.entity.Laptop;

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
            case BATTERY_CAPACITY -> entity.setBatteryCapacity(Double.parseDouble(value));
            case OS -> entity.setOs(value);
            case MEMORY_ROM -> entity.setMemoryRom(Integer.parseInt(value));
            case SYSTEM_MEMORY -> entity.setSystemMemory(Integer.parseInt(value));
            case CPU -> entity.setCpu(Double.parseDouble(value));
            case DISPLAY_INCHS -> entity.setDisplayInches(Integer.parseInt(value));
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
