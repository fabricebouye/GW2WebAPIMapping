/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.v1.APIv1;

/**
 * Define all WvW match details bonus.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public interface MatchDetailsBonus {

    /**
     * Gets a shorthand description of the bonus.
     * @return A {@code String}, never {@code null}.
     */
    String getType();

    /**
     * Gets the owner of the bonus.
     * @return A {@code MatchDetailsBonusOwner} instance, never {@code null}.
     */
    MatchDetailsBonusOwner getOwner();

}
