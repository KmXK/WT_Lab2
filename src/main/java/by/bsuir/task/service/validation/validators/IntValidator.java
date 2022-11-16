package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;

/**
 * Implements simple value validator for int type.
 */
public class IntValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return (Integer) obj > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
