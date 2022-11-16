package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

/**
 * Main class of a console program.
 */
public class Main {

    /**
     * Main method.
     *
     * @param args console arguments.
     */
    public static void main(String[] args) {

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        ////////////////////OVENS WITH FIXED CAPACITY////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.CAPACITY.toString(), 3);

        List<Appliance> appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        ////////////////////TABLETS WITH FIXED COLOR, DISPLAY SIZE AND MEMORY ROM////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

        appliances = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliances);

        ////////////////////ALL OVENS//////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

    }

}
