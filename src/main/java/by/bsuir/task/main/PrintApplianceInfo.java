package by.bsuir.task.main;

import by.bsuir.task.entity.Appliance;

import java.util.List;

/**
 * Helper class of printing laboratory work results.
 */
public class PrintApplianceInfo {

    /**
     * Prints the information about all of appliances.
     * If array is empty "No appliances found" is printed.
     * If object is null "Find error" is printed.
     *
     * @param appliances return value appliance service find method.
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null)
            System.out.println("--- Error has been found.");
        else if (appliances.size() == 0) {
            System.out.println("--- No appliances found.");
        } else {
            StringBuilder sb = new StringBuilder();
            System.out.printf("--- %d appliances have been founded:\n", appliances.size());
            for (int i = 0; i < appliances.size(); i++) {
                System.out.printf("    %d. %s\n", i + 1, appliances.get(i));
            }
        }
    }
}
