package by.bsuir.task.service;

import by.bsuir.task.entity.Appliance;
import by.bsuir.task.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

/**
 * Interface of an appliance service.
 */
public interface ApplianceService {

    /**
     * Validates criteria and finds all the appliances
     * that match all given criteria.
     *
     * @param criteria criteria to match for.
     * @return appliance array that matched the criteria or null if criteria is invalid.
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Finds appliances with minimal value of some property.
     *
     * @param comparator specifies property to compare by
     * @param appliances limited list of appliances to search among
     * @return list of appliances with minimal value of desired property
     */
    List<Appliance> getMin(Comparator<Appliance> comparator, List<Appliance> appliances);

    /**
     * Finds appliances with minimal value of some property among all appliances.
     *
     * @param comparator specifies property to compare by
     * @return list of appliances with minimal value of desired property
     */
    List<Appliance> getMin(Comparator<Appliance> comparator);

    /**
     * Finds appliances with maximal value of some property.
     *
     * @param comparator specifies property to compare by
     * @param appliances limited list of appliances to search among
     * @return list of appliances with maximal value of desired property
     */
    List<Appliance> getMax(Comparator<Appliance> comparator, List<Appliance> appliances);

    /**
     * Finds appliances with maximal value of some property among all appliances.
     *
     * @param comparator specifies property to compare by
     * @return list of appliances with maximal value of desired property
     */
    List<Appliance> getMax(Comparator<Appliance> comparator);
}
