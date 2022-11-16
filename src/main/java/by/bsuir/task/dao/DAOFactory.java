package by.bsuir.task.dao;

import by.bsuir.task.dao.impl.ApplianceDAOImpl;

/**
 * Factory class of ApplianceDAO
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory() {
    }

    /**
     * Gets the instance of factory
     *
     * @return instance of factory
     */
    public static DAOFactory getInstance() {
        return instance;
    }

    /**
     * Gets the instance of appliance DAO
     *
     * @return instance of appliance DAO
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
