/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import java.util.Set;

/**
 * Defines a profession training track.
 * @author Fabrice Bouyé
 */
public interface ProfessionTrack {

    /**
     * Gets the id of this training track.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the category of the track.
     * @return A {@code ProfessionTrackCategory} instance, never {@code null}.
     */
    ProfessionTrackCategory getCategory();

    /**
     * Gets the i18n name of the track.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the track details.
     * @return A non-modifiable {@code Set<ProfessionTrackCost>} instance, never {@code null}.
     */
    @SetValue
    Set<ProfessionTrackCost> getTrack();
}
