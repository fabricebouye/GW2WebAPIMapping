/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

/**
 * Default implementation of a WvW match score.
 * @author Fabrice Bouyé
 */
final class DefaultMatchDetailsScore implements MatchDetailsScore {

    final int[] scores = new int[3];

    /**
     * Creates a new empty instance;
     */
    DefaultMatchDetailsScore() {
    }

    @Override
    public int getRedScore() {
        return scores[0];
    }

    @Override
    public int getBlueScore() {
        return scores[1];
    }

    @Override
    public int getGreenScore() {
        return scores[2];
    }
}
