package org.example.springboot.test;

import java.lang.annotation.*;

/**
 * @author ninggelin
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TakeTime {
}
