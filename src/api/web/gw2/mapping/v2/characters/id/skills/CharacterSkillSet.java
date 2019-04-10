/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.skills;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.Set;

/**
 * Defines a character's equipped skills (slots 6-10).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/skills", requiresAuthentication = true, scope = {"characters", "builds"}) // NOI18N.
public interface CharacterSkillSet {

    /**
     * Get id of equipped heal skill.
     * @return An {@code int}.
     */
    @IdValue
    int getHeal();

    /**
     * Get id of equipped elite skill.
     * @return An {@code int}.
     */
    @IdValue
    int getElite();

    /**
     * Gets ids of equipped utility skills.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @SetValue
    Set<Integer> getUtilities();

    /**
     * Gets Revenant's legends.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    Set<Integer> getLegends();

    /**
     * Gets Ranger's pets.
     * @return An {@code Optional<CharacterSkillPets>} instance, never {@code null}.
     */
    Optional<CharacterSkillPets> getPets();
}
