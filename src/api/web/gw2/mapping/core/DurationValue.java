/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The JSON value defines a duration in seconds or milliseconds.
 * @author Fabrice Bouyé
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DurationValue {

    /**
     * The flavor of this duration.
     * <br>As of now durations in the GW2 API can be of 2 flavors:
     * <ul>
     * <li>{@code MILLIS} - ;</li>
     * <li>{@code SECONDS} - For character's age, traits, etc.</li>
     * </ul>
     * @author Fabrice Bouyé
     */
    enum Flavor {
        MILLIS, SECONDS;
    }

    /**
     * The flavor of this id.
     * <br>Default value is {@code IdValue.Flavor.SECONDS}.
     * @return An {@code IdValue.Flavor} instance, never {@code null}.
     * @see DurationValue.Flavor#MILLIS
     * @see DurationValue.Flavor#SECONDS
     */
    public Flavor flavor() default Flavor.SECONDS;
}
