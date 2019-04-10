/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

import api.web.gw2.mapping.core.Coord2DValue;
import api.web.gw2.mapping.core.Coord3DValue;
import api.web.gw2.mapping.v2.wvw.WvwMapType;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.Point2D;
import api.web.gw2.mapping.core.Point3D;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;

/**
 * Defines a WvW objective.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/objectives") // NOI18N.
public interface WvwObjective {

    /**
     * Gets the id of this objective.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n abstract name of this objective.
     * <br>Note: this may not be the same as the name in game.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the id of the sector containing this objective.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getSectorId();

    /**
     * Gets the type of this objective.
     * @return A {@code WvwObjectiveType} instance, never {@code null}.
     */
    WvwObjectiveType getType();

    /**
     * Gets the map type of this objective.
     * @return A {@code WvwMapType} instance, never {@code null}.
     */
    WvwMapType getMapType();

    /**
     * Gets the if of the map of this objective.
     * @return An {@code int}.
     */
    @IdValue
    int getMapId();

    /**
     * Gets the coordinates of this objective.
     * @return An {@code Point3D} instance, never {@code null}.
     */
    @Coord3DValue
    Point3D getCoord();

    /**
     * Gets the coordinates of of the label for this objective.
     * @return An {@code Point2D} instance, never {@code null}.
     */
    @Coord2DValue
    Point2D getLabelCoord();

    /**
     * Gets the URL to the marker icon for this objective.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getMarker();

    /**
     * Gets the chat link needed to pass this objective to other players.
     * @return A {@code String} instance, never {@code null}.
     * <br>Old JSON files from earlier versions of the API or objectives that
     * cannot be linked may return an empty {@code string}.
     */
    String getChatLink();

    /**
     * Gets the id of the upgrade of this objective.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @IdValue
    @OptionalValue
    OptionalInt getUpgradeId();
}
