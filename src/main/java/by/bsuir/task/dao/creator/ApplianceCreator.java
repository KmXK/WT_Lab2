package by.bsuir.task.dao.creator;

import by.bsuir.task.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * Represents factory of an appliance from values.
 */
public interface ApplianceCreator {
    /**
     * Creates the appliance of a correct type from
     * attributes saved in string.
     *
     * @param nodes string with attributes from xml file.
     * @return appliance of a correct type.
     */
    Appliance create(NodeList nodes);
}
