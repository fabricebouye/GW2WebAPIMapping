/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;

/**
 * Defines the track cost of a skill.
 * @author Fabrice Bouyé
 */
public interface ProfessionSkillTrackCost extends ProfessionTrackCost {

    @Override
    default ProfessionTrackCostType getType() {
        return ProfessionTrackCostType.SKILL;
    }

    /**
    * Gets the skill id of this cost.
    * @return An {@code int}.
    */
    @IdValue
    int getSkillId();
}
