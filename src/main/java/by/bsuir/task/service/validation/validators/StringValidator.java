package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;

/**
 * Implements simple value validator for button type.
 */
public class StringValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return ((String) obj).length() != 0;
        } catch (Exception e) {
            return false;
        }
    }
}
