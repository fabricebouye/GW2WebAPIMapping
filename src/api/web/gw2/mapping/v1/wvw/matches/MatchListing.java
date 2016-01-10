/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matches;

import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Set;

/**
 * Defines a WvW match listing.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/matches.json") // NOI18N.
public interface MatchListing {

    /**
     * Gets a set of all currently ongoing WvW matches.
     * @return A non-modifiable {@code Set<Match>}, never {@code null}.
     */
    @SetValue
    Set<Match> getWvwMatches();

}
