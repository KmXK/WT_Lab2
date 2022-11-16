package by.bsuir.task.dao;

import by.bsuir.task.entity.criteria.Criteria;
import by.bsuir.task.entity.Appliance;

import java.util.List;

/**
 * Interface of an appliance dao class
 */
public interface ApplianceDAO {
    /**
     * Finds all the appliances that match the given criteria.
     *
     * @param criteria criteria that shall be matched in an appliance.
     * @return array of appliances that match the criteria or null is criteria is invalid.
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Finds all the appliances.
     *
     * @return array of all appliances.
     */
    List<Appliance> getAll();
}
