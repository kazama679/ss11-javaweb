package com.data.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueCategoryNameValidatorBai89.class)
@Documented
public @interface UniqueCategoryNameBai89 {
    String message() default "Tên danh mục phải là duy nhất";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}