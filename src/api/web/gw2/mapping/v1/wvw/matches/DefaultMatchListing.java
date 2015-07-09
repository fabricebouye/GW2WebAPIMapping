/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matches;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of a WvW match listing.
 * @author Fabrice Bouyé
 */
final class DefaultMatchListing implements MatchListing {

    Set<Match> wvwMatches = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultMatchListing() {
    }

    @Override
    public Set<Match> getWvwMatches() {
        return wvwMatches;
    }
}
