package com.data.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidatorBai3.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmailBai3 {
    String message() default "Email không hợp lệ (theo chuẩn tùy chỉnh)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}