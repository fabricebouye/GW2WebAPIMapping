/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.training;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a character's training track advancement.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/training", requiresAuthentication = true, scope = {"characters", "builds"}) // NOI18N.
public interface CharacterTraining {

    /**
     * Gets the id of this character's training track.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.professions.ProfessionTrack#getId()
     */
    @IdValue
    int getId();

    /**
     * Gets the amount of points  spent on this track.
     * @return An {@code int}.
     */
    @QuantityValue
    int getSpent();

    /**
     * Indicates whether this track if fully trained.
     * @return {@code True} if the test is verifies, {@code false} otherwise.
     */
    boolean isDone();
}
