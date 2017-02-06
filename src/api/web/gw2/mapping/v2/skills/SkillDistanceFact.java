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
 * Defines a skill distance fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillDistanceFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.DISTANCE}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.DISTANCE;
    }

    /**
     * Gets the distance value.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getDistance();
}
