/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a character's WvW ability.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters", requiresAuthentication = true, scope = "characters") // NOI18N.
public interface CharacterAbility {

    /**
     * Gets the id of the WvW ability in the character's description.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the rank of the WvW ability in the character's description.
     * @return An {@code int}.
     */
    @QuantityValue
    int getRank();
}
