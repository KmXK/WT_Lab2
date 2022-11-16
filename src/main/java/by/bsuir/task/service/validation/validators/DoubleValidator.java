package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;

/**
 * Implements simple value validator for double type.
 */
public class DoubleValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return Double.parseDouble(String.valueOf(obj)) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
