package by.bsuir.task.service.validation.validators;

import by.bsuir.task.service.validation.ValueValidator;
import by.bsuir.task.entity.enums.ColorType;

/**
 * Implements simple value validator for color type.
 */
public class ColorValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            ColorType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
