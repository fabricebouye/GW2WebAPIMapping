/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import java.util.Optional;

/**
 * Default implementation of a WvW match objective.
 * @author Fabrice Bouyé
 */
final class DefaultMatchDetailsObjective implements MatchDetailsObjective {

    int id = -1;
    MatchDetailsObjectiveOwner owner = MatchDetailsObjectiveOwner.UNKNOWN;
    Optional<String> ownerGuild = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    DefaultMatchDetailsObjective() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public MatchDetailsObjectiveOwner getOwner() {
        return owner;
    }

    @Override
    public Optional<String> getOwnerGuild() {
        return ownerGuild;
    }
}
