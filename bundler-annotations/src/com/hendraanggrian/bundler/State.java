package com.hendraanggrian.bundler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Bind state to field with this annotation.
 * Field cannot be private as it would be inaccessible to binding class.
 * <pre><code>
 * {@literal @}State("EXTRA_COUNTRY") String country;
 * </code></pre>
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface State {

    String SUFFIX = "_StateBinding";

    /**
     * Key in bundle key-value pair.
     * Leave it empty to use field name as the key.
     */
    String value() default "";
}