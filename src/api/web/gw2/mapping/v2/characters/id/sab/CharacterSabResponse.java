/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.sab;

import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines the response received when directly querying this sub-endpoint.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/sab", requiresAuthentication = true, scope = {"characters", "progression"}) // NOI18N.
public interface CharacterSabResponse {

    /**
     * Gets the SAB zone info for this character.
     * @return A {@code List<CharacterSabZone>}, never {@code null}. May be
     * empty.
     */
    @ListValue
    List<CharacterSabZone> getZones();

    /**
     * Gets the unlocks info for this character.
     * @return A {@code List<CharacterSabUnlock>}, never {@code null}. May be
     * empty.
     */
    @ListValue
    List<CharacterSabUnlock> getUnlocks();

    /**
     * Gets the songs for this character.
     * @return A {@code List<CharacterSabSong>}, never {@code null}. May be
     * empty.
     */
    @ListValue
    List<CharacterSabSong> getSongs();
}
