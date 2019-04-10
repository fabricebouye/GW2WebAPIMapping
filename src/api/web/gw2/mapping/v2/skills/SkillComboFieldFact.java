/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a skill combo field fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillComboFieldFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.COMBO_FIELD}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.COMBO_FIELD;
    }

    /**
     * Gets the combo field type of this fact.
     * @return A {@code SkillComboFieldType} instance, never {@code null}.
     */
    SkillComboFieldType getFieldType();
}
