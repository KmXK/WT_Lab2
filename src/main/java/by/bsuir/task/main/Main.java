package by.bsuir.task.main;

import by.bsuir.task.entity.criteria.Criteria;
import by.bsuir.task.entity.criteria.SearchCriteria;
import by.bsuir.task.entity.Appliance;
import by.bsuir.task.service.ApplianceService;
import by.bsuir.task.service.ServiceFactory;

import java.util.Comparator;
import java.util.List;

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

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

        List<Appliance> appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        ////////////////////TABLETS WITH FIXED COLOR, DISPLAY SIZE AND MEMORY ROM////

        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

        appliances = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliances);

        ////////////////////ALL KETTLES////////////////////////////////////////////

        Criteria kettleCriteria = new Criteria(SearchCriteria.Kettle.class.getSimpleName());

        appliances = service.find(kettleCriteria);

        PrintApplianceInfo.print(appliances);

        ////////////////////MINIMAL PRICE APPLIANCE////////////////////////////////

        List<Appliance> minPriceAppliances = service.getMin(Comparator.comparing(Appliance::getPrice));

        PrintApplianceInfo.print(minPriceAppliances);
    }
}
