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
 * The JSON value defines a crafting level value.
 * @author Fabrice Bouyé
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface CraftingLevelValue {

    /**
     * Define the novice [ 0 - 74 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int NOVICE = 0;
    /**
     * Define the initiate [ 75 - 49 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int INITIATE = 75;
    /**
     * Defined the apprentice [ 150 - 224 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int APPRENTICE = 150;
    /**
     * Defined the journeyman [ 225 -299 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int JOURNEYMAN = 225;
    /**
     * Defined the adept [ 300 - 399 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int ADEPT = 300;
    /**
     * Defined the master [ 400 - 499 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int MASTER = 400;
    /**
     * Defined the grand master [ 500 ] crafting level: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int GRAND_MASTER = 500;

    /**
     * The minimum crafting level in the game: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int MIN_LEVEL = NOVICE;
    /**
     * The maximum crafting level in the game: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int MAX_LEVEL = GRAND_MASTER;

}
