/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a skill attribute adjust fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillAttributeAdjustFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.ATTRIBUTE_ADJUST}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.ATTRIBUTE_ADJUST;
    }

    /**
     * Gets the value of this attribute adjust fact.
     * @return An {@code int}.
     */
    @QuantityValue
    int getValue();

    /**
     * Gets the target of this attribute adjust fact.
     * @return A {@code SkillAttribute} instance, never {@code null}.
     */
    SkillAttribute getTarget();
}
