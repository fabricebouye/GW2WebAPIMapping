/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.LocalizedResource;

/**
 * Defines a buff.
 * @author Fabrice Bouyé
 */
public interface Buff {
    /**
    * Gets the id of the skill of this buff.
    * @return An {@code int}
    */
    int getSkillId();

    /**
    * Gets the localized description of this buff.
    * @return A {@code String} instance, never {@code null}.
    */
    @LocalizedResource
    String getDescription();    
}
