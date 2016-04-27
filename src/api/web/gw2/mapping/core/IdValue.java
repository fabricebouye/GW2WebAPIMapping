/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
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
 * The JSON value defines an id.
 * @author Fabrice Bouyé
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface IdValue {

    /**
     * Value used for initialization and filtering.
     */
    public static final int DEFAULT_INTEGER_ID = -1;
    /**
     * Value used for initialization and filtering.
     */
    public static final String DEFAULT_STRING_ID = ""; // NOI18N.

    /**
     * The flavor of this id.
     * <br>As of now ids in the GW2 API can be of 2 flavors:
     * <ul>
     * <li>{@code STRING} - for accounts, guilds, tokens, continents, maps, files, events, PvP matches, WvW objectives;</li>
     * <li>{@code INTEGER} - Pretty much for anything else.</li>
     * </ul>
     * @author Fabrice Bouyé
     */
    public enum Flavor {
        /**
         * The id is stored as a {@code String}.
         */
        STRING,
        /**
         * The id is stored as an {@code int} or an {@code Integer}.
         */
        INTEGER;
    }

    /**
     * The flavor of this id.
     * <br>Default value is {@code IdValue.Flavor.INTEGER}.
     * @return An {@code IdValue.Flavor} instance, never {@code null}.
     * @see IdValue.Flavor#INTEGER
     * @see IdValue.Flavor#STRING
     */
    public Flavor flavor() default Flavor.INTEGER;
}
