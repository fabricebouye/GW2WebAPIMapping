/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Define a WvW match details score.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
@ImplementationSpecific
public interface MatchDetailsScore {

    /**
     * A singleton instance that represents an empty score.
     */
    public static final MatchDetailsScore EMPTY = new DefaultMatchDetailsScore();

    /**
     * Gets the score of the red faction.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getRedScore();

    /**
     * Gets the score of the blue faction.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getBlueScore();

    /**
     * Gets the score of the green faction.
     * @return An {@code int}.
     */
    @ImplementationSpecific
    @QuantityValue
    int getGreenScore();

}
