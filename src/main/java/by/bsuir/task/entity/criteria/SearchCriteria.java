package by.bsuir.task.entity.criteria;

/**
 * Encapsulates all constants associated with search criteria.
 */
public final class SearchCriteria {
    /**
     * Private constructor to remove the ability of instantiating search criteria.
     */
    private SearchCriteria() {
    }

    /*
     * Searches by common fields.
     */
    public enum Common {
        PRICE
    }

    /**
     * Searches by oven fields.
     */
    public enum Oven {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Searches by Laptop fields.
     */
    public enum Laptop {
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
    }

    /**
     * Searches by Refrigerator fields.
     */
    public enum Refrigerator {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Searches by VacuumCleaner fields.
     */
    public enum VacuumCleaner {
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Searches by TabletPC fields.
     */
    public enum TabletPC {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Searches by Speakers fields.
     */
    public enum Speakers {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
    }

    /**
     * Searches by Kettle fields.
     */
    public enum Kettle {
        POWER_CONSUMPTION, WATER_CAPACITY, COLOR
    }
}

