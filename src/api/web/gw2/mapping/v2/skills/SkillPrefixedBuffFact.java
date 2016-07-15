/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;

/**
 * Defines a skill prefixed buff fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillPrefixedBuffFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.PREFIXED_BUFF}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.PREFIXED_BUFF;
    }

    /**
     * Gets the duration of this fact in seconds.
     * @return A {@code Duration} instance, never {@code null}.
     */
    @DurationValue
    Duration getDuration();

    /**
     * Gets the localized status of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getStatus();

    /**
     * Gets the localized description of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the application count of this fact.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getApplyCount();

    /**
     * Gets the prefix of this fact.
     * @return A {@code SkillPrefix} instance, never {@code null}.
     */
    SkillPrefix getPrefix();
}
