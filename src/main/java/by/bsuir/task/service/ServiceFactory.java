package by.bsuir.task.service;

import by.bsuir.task.service.impl.ApplianceServiceImpl;

/**
 * Factory of an appliance service.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Gets the instance of a factory.
     *
     * @return instance of a factory.
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

    /**
     * Gets the appliance service.
     *
     * @return appliance service.
     */
    public ApplianceService getApplianceService() {

        return applianceService;
    }
}
