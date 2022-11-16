package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.enums.ColorType;

/**
 * Represents the TabletPC appliance.
 */
public class TabletPC extends Appliance {
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private ColorType color;

    @Override
    public String toString() {
        return String.format("TabletPC : PRICE=%.2f, BATTERY_CAPACITY=%d, DISPLAY_INCHES=%d, MEMORY_ROM=%d, FLASH_MEMORY_CAPACITY=%d, COLOR=%s",
                getPrice(), getBatteryCapacity(), getDisplayInches(), getMemoryRom(), getFlashMemoryCapacity(), getColor().toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.TabletPC.valueOf(key)) {
            case BATTERY_CAPACITY -> getBatteryCapacity() == (Integer) value;
            case DISPLAY_INCHES -> getDisplayInches() == (Integer) value;
            case MEMORY_ROM -> getMemoryRom() == (Integer) value;
            case FLASH_MEMORY_CAPACITY -> getFlashMemoryCapacity() == (Integer) value;
            case COLOR -> getColor() == ColorType.valueOf((String) value);
            default -> super.matches(key, value);
        };
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }
}
