/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.wvw.objectives.ObjectiveType;
import java.time.ZonedDateTime;
import java.util.Optional;

/**
 * Defines a WvW match map objective.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public interface MatchMapObjective {

    /**
     * Gets the id of this objective.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the type of this objective.
     * @return An {@code ObjectiveType} instance, never {@code null}.
     */
    ObjectiveType getType();

    /**
     * Gets the owner of this objective.
     * @return A {@code MatchTeam} instance, never {@code null}.
     */
    MatchTeam getOwner();

    /**
     * Gets the time at which this objective was last flipped.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getLastFlipped();

    /**
     * Gets the guild that owns this objective.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    Optional<String> getClaimedBy();

    /**
     * Gets the time that this objective was clained at.
     * @return An {@code Optional<ZonedDateTime>} instance, never {@code null}.
     */
    @OptionalValue
    @DateValue
    Optional<ZonedDateTime> getClaimedAt();
}
