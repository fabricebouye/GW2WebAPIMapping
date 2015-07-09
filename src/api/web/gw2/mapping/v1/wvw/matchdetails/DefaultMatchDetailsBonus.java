/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

/**
 * Default implementation of a WvW match bonus.
 * @author Fabrice Bouyé
 */
final class DefaultMatchDetailsBonus implements MatchDetailsBonus {

    String type;
    MatchDetailsBonusOwner owner = MatchDetailsBonusOwner.UNKNOWN;

    /**
     * Creates a new empty instance.
     */
    DefaultMatchDetailsBonus() {
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public MatchDetailsBonusOwner getOwner() {
        return owner;
    }

}
