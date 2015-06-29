/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import java.util.Set;

/**
 * Default implementation of a guild emblem.
 * @author Fabrice Bouyé
 */
final class DefaultEmblem implements Emblem {

    int backgroundId;
    int foregroundId;
    Set<EmblemFlag> flags;
    int backgroundColorId;
    int foregroundPrimaryColorId;
    int foregroundSecondaryColorId;

    /**
     * Creates a new empty instance.
     */
    DefaultEmblem() {
    }

    @Override
    public int getBackgroundId() {
        return backgroundId;
    }

    @Override
    public int getForegroundId() {
        return foregroundId;
    }

    @Override
    public Set<EmblemFlag> getFlags() {
        return flags;
    }

    @Override
    public int getBackgroundColorId() {
        return backgroundColorId;
    }

    @Override
    public int getForegroundPrimaryColorId() {
        return foregroundPrimaryColorId;
    }

    @Override
    public int getForegroundSecondaryColorId() {
        return foregroundSecondaryColorId;
    }
}
