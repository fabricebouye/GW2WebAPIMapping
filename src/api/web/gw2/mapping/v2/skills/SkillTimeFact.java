/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
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
 * Defines a skill time fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillTimeFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.TIME}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.TIME;
    }

    /**
     * Gets the duration of this fact in seconds.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue
    Duration getDuration();
}
