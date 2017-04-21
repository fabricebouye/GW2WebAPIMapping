/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.sab;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a Super Adventure Box flute song unlocked by the character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/sab", requiresAuthentication = true, scope = {"characters", "progression"}) // NOI18N.
public interface CharacterSabSong {

    /**
     * Gets the id of this song.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the name of the song unlocked.
     * @return A {@code String}, never {@code null}.
     */
    String getName();
}
