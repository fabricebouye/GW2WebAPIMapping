/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;

/**
 * Defines a skill duration fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillDurationFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.DURATION}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.DURATION;
    }
    
    /**
    * Gets the duration of this fact.
    * @return A {@code Duration} instance, never {@code null}.
    */
    @DurationValue
    Duration getDuration();
}
