package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;
import by.bsuir.task.entity.enums.FilterType;

/**
 * Implements simple value validator for filter type.
 */
public class FilterTypeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            FilterType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
