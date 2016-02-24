/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matches;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v1.APIv1;
import java.time.LocalDate;

/**
 * Defines a WvW match.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/matches.json") // NOI18N.
public interface Match {

    /**
     * Gets the id of this match.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getWvwMatchId();

    /**
     * Gets the id of the red world.
     * @return An {@code int}
     */
    @IdValue
    int getRedWorldId();

    /**
     * Gets the id of the blue world.
     * @return An {@code int}
     */
    @IdValue
    int getBlueWorldId();

    /**
     * Gets the id of the green world.
     * @return An {@code int}
     */
    @IdValue
    int getGreenWorldId();

    /**
     * Gets a timestamp of the start time of this match.
     * @return A {@code LocalDate} instance, never {@code null}.
     */
    LocalDate getStartTime();

    /**
     * Gets a timestamp of the start time of this match.
     * @return A {@code LocalDate} instance, never {@code null}.
     */
    LocalDate getEndTime();

}
