/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.DurationValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Defines a skill buff fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillBuffFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.BUFF}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.BUFF;
    }

    /**
     * Gets the duration of this buff in seconds.
     * @return An {@code Optional<Duration>} instance, never {@code null}.
     */
    @OptionalValue
    @DurationValue
    Optional<Duration> getDuration();

    /**
     * Gets the i18n status of this fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getStatus();

    /**
     * Gets the i18n description of this fact.
     * @return A {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getDescription();

    /**
     * Gets the number of stack applied.
     * @return A {@code OptionalInt} instance, never {@code null}.
     * <br>If present, the value is &ge; 0.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getApplyCount();
}
