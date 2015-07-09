/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Optional;

/**
 * Defines a WvW match details objective.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public interface MatchDetailsObjective {

    /**
     * Gets the id of this objective.
     * @return An {@code int}
     */
    @IdValue
    int getId();

    /**
     * Gets the owner of this objective.
     * @return A {@code MatchDetailsObjectiveOwner} instance, never {@code null}.
     */
    MatchDetailsObjectiveOwner getOwner();

    /**
     * Gets the guild that owns this objective.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    Optional<String> getOwnerGuild();

}
