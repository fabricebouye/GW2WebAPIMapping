/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.sab;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a Super Adventure Box zone completed by the character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/sab", requiresAuthentication = true, scope = {"characters", "progression"}) // NOI18N.
public interface CharacterSabZone {

    /**
     * Gets the id of this zone.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the id (index?) of the world of this zone.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getWorld();

    /**
     * Gets the id (index?) of the zone in given world of this zone.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getZone();

    /**
     * Gets the mode of this zone.
     * @return A {@code CharacterSabMode}, never {@code null}.
     * @see CharacterSabMode
     */
    CharacterSabMode getMode();
}
