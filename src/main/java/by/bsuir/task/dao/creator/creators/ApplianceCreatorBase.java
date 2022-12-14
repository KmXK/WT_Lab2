package by.bsuir.task.dao.creator.creators;

import by.bsuir.task.dao.creator.ApplianceCreator;
import by.bsuir.task.entity.Appliance;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public abstract class ApplianceCreatorBase<T extends Appliance> implements ApplianceCreator {
    private static final String PRICE = "price";

    /**
     * {@inheritDoc}
     */
    @Override
    public final Appliance create(NodeList nodes) {
        T entity = getInstance();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                String key = node.getNodeName();
                String text = node.getTextContent();
                if (PRICE.equals(key)) {
                    entity.setPrice(Double.parseDouble(text));
                } else {
                    parse(entity, key, text);
                }
            }
        }

        return entity;
    }

    /**
     * Creates new instance of type T.
     *
     * @return new instance of type T.
     */
    protected abstract T getInstance();

    /**
     * Sets the property value.
     *
     * @param entity instance of type T.
     * @param key    property name.
     * @param value  property value.
     */
    protected abstract void parse(T entity, String key, String value);
}
