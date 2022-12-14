package by.bsuir.task.dao.impl;

import by.bsuir.task.dao.ApplianceDAO;
import by.bsuir.task.dao.creator.ApplianceCreator;
import by.bsuir.task.dao.creator.ApplianceCreatorFactory;
import by.bsuir.task.entity.Appliance;
import by.bsuir.task.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Implementation of an appliance dao that reads
 * the information from file in resources folder
 */
public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String RESOURCES_APPLIANCES_TXT = "./src/main/resources/appliances_db.txt";
    private static final String RESOURCES_APPLIANCES_XML = "./src/main/resources/appliances.xml";

    /**
     * {@inheritDoc}
     * Assumes that file is in the correct format.
     */
    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> matches = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(RESOURCES_APPLIANCES_XML));
            doc.getDocumentElement().normalize();
            NodeList nodes = doc.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    if (criteria.getGroupSearchName() != null &&
                            !node.getNodeName().equalsIgnoreCase(criteria.getGroupSearchName()))
                        continue;

                    ApplianceCreator ac = ApplianceCreatorFactory.getInstance().getCreator(node.getNodeName());
                    Appliance appliance = ac.create(node.getChildNodes());

                    Map<String, Object> criterias = criteria.getSearchCriteria();

                    boolean isValid = true;

                    for (Map.Entry<String, Object> entry : criterias.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();

                        if (!appliance.matches(key, value)) {
                            isValid = false;
                            break;
                        }
                    }

                    if (isValid) {
                        matches.add(appliance);
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }

        if (matches.size() != 0)
            return matches;
        else
            return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getAll() {
        List<Appliance> matches = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(RESOURCES_APPLIANCES_XML));
            doc.getDocumentElement().normalize();
            NodeList nodes = doc.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    ApplianceCreator ac = ApplianceCreatorFactory.getInstance().getCreator(node.getNodeName());
                    Appliance appliance = ac.create(node.getChildNodes());
                    matches.add(appliance);
                }
            }
        } catch (Exception e) {
            return null;
        }

        if (matches.size() != 0)
            return matches;
        else
            return Collections.emptyList();
    }
}