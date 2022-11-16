package by.bsuir.task.service.impl;

import by.bsuir.task.service.validation.Validator;
import by.bsuir.task.dao.ApplianceDAO;
import by.bsuir.task.dao.DAOFactory;
import by.bsuir.task.entity.Appliance;
import by.bsuir.task.entity.criteria.Criteria;
import by.bsuir.task.service.ApplianceService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of appliance service that works with
 * appliance DAO's implementation.
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        return applianceDAO.find(criteria);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getMin(Comparator<Appliance> comparator) {
        List<Appliance> appliances = DAOFactory.getInstance().getApplianceDAO().getAll();
        return getMin(comparator, appliances);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getMin(Comparator<Appliance> comparator, List<Appliance> appliances) {
        Appliance min = appliances.stream().min(comparator).orElse(null);
        if (min != null) {
            return appliances.stream()
                    .filter(p -> comparator.compare(p, min) == 0)
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getMax(Comparator<Appliance> comparator) {
        List<Appliance> appliances = DAOFactory.getInstance().getApplianceDAO().getAll();
        return getMax(comparator, appliances);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getMax(Comparator<Appliance> comparator, List<Appliance> appliances) {
        Appliance max = appliances.stream().max(comparator).orElse(null);
        if (max != null) {
            return appliances.stream()
                    .filter(p -> comparator.compare(p, max) == 0)
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }
}
