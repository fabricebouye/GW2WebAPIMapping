/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation will be attached to classes that are used in the API v2.
 * @author Fabrice Bouyé
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(APIv2Container.class)
public @interface APIv2 {

    /**
     * Gets the endpoint on which this type is queried.
     * @return A {@code String}, never {@code null}.
     */
    String endpoint() default "v2"; // NOI18N.

    /**
     * This endpoint requires authenticated access.
     * @return {@code true} if the property is verified, {@code false} otherwise.
     */
    boolean requiresAuthentication() default false;

    /**
     * This endpoint requires a specific application key scope.
     * @return A {@code String}, never {@code null}.
     */
    String scope() default ""; // NOI18N.
}
