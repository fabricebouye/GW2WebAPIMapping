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
 * Defines a skill healing adjust fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillHealingAdjustFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.HEALING_ADJUST}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.HEALING_ADJUST;
    }

    /**
     * Gets the amount of time this healing adjust hits.
     * @return An {@code int}.
     */
    @QuantityValue
    int getHitCount();
}
