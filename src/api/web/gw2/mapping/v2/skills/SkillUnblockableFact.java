/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a skill unblockable fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills")
public interface SkillUnblockableFact extends SkillFact {

    /**
     * {@inheritDoc}
     * @return Always {@code SkillFactType.UNBLOCKABLE}.
     */
    @Override
    default SkillFactType getType() {
        return SkillFactType.UNBLOCKABLE;
    }

    /**
     * The value of this fact.
     * @return Always {@code true}.
     */
    default boolean getValue() {
        return true;
    }
}
