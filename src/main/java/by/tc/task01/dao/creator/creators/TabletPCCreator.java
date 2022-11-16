package by.tc.task01.dao.creator.creators;

import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.enums.ColorType;

/**
 * Represents creator of a tabletPC appliance.
 */
public class TabletPCCreator extends ApplianceCreatorBase<TabletPC> {
    private static final String BATTERY_CAPACITY = "batteryCapacity";
    private static final String DISPLAY_INCHES = "displayInches";
    private static final String MEMORY_ROM = "memoryRom";
    private static final String FLASH_MEMORY_CAPACITY = "flashMemoryCapacity";
    private static final String COLOR = "color";

    /**
     * {@inheritDoc}
     */
    @Override
    protected TabletPC getInstance() {
        return new TabletPC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void parse(TabletPC entity, String key, String value) {
        switch (key) {
            case BATTERY_CAPACITY -> entity.batteryCapacity = Integer.parseInt(value);
            case DISPLAY_INCHES -> entity.displayInches = Integer.parseInt(value);
            case MEMORY_ROM -> entity.memoryRom = Integer.parseInt(value);
            case FLASH_MEMORY_CAPACITY -> entity.flashMemoryCapacity = Integer.parseInt(value);
            case COLOR -> entity.color = ColorType.valueOf(value.toUpperCase());
            default -> throw new IllegalArgumentException("Invalid appliance's attribute.");
        }
    }
}
