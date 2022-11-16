package by.bsuir.task.entity;

import by.bsuir.task.entity.criteria.SearchCriteria;

/**
 * Represents the laptop appliance.
 */
public class Laptop extends Appliance {
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    @Override
    public String toString() {
        return String.format("Laptop: PRICE=%.2f, BATTERY_CAPACITY=%.1f, OS=%s, MEMORY_ROM=%d, SYSTEM_MEMORY=%d, CPU=%.1f, DISPLAY_INCHS=%d",
                getPrice(), getBatteryCapacity(), getOs(), getMemoryRom(), getSystemMemory(), getCpu(), getDisplayInches());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Laptop.valueOf(key)) {
            case BATTERY_CAPACITY -> getBatteryCapacity() == Double.parseDouble(String.valueOf(value));
            case OS -> getOs().equals(value);
            case MEMORY_ROM -> getMemoryRom() == (Integer) value;
            case SYSTEM_MEMORY -> getSystemMemory() == (Integer) value;
            case CPU -> getCpu() == Double.parseDouble(String.valueOf(value));
            case DISPLAY_INCHS -> getDisplayInches() == (Integer) value;
            default -> super.matches(key, value);
        };
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
}
