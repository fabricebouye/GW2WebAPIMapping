/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.masteries;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a mastery.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.account.masteries.AccountMastery
 */
@APIv2(endpoint = "v2/masteries") // NOI18N.
public interface Mastery {

    /**
     * Gets the id of this mastery.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this mastery.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the i18n requirement of this mastery.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getRequirement();

    /**
     * Gets the sort order of this mastery.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets the URL to the background of this mastery.
     * @return An {@code URLValue} instance, never {@code null}.
     */
    @URLValue
    URLReference getBackground();

    /**
     * Gets the region in which this mastery is enabled.
     * @return A {@code MasteryRegion} instance, never {@code null}.
     */
    MasteryRegion getRegion();

    /**
     * Gets a set of all levels in this mastery.
     * @return A non-modifiable {@code Set<MasteryLevel>}, never {@code null}.
     */
    @SetValue
    Set<MasteryLevel> getLevels();
}
