package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;

/**
 * Implements simple value validator for button type.
 */
public class RangeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            String range = (String) obj;
            String[] ind = range.split("-");
            if (ind.length != 2)
                return false;
            for (int i = 0; i < ind.length; i++)
                if (Double.parseDouble(ind[i]) < 0)
                    return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
