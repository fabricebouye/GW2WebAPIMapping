/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a skill heal fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillHealFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.HEAL}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.HEAL;
    }

    /**
     * Gets the amount of time this heal hits.
     * @return An {@code int}.
     */
    @QuantityValue
    int getHitCount();
}
