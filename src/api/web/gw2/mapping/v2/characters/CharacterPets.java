/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a character's equipped pets (when the character is a Ranger).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true, scope = "characters") // NOI18N.
public interface CharacterPets {

    /**
     * Gets ids of equipped terrestrial pets.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @SetValue
    @IdValue
    Set<Integer> getTerrestrial();

    /**
     * Gets ids of equipped aquatic pets.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}.
     */
    @SetValue
    @IdValue
    Set<Integer> getAquatic();
}
