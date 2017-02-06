/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the base type for a skill fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public interface SkillFact {

    /**
     * Gets the localized description of this skill fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getText();

    /**
     * Gets the URL to the icon this skill fact.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the type of this skill fact.
     * @return A {@code SkillFactType} instance, never {@code null}.
     */
    SkillFactType getType();
}
