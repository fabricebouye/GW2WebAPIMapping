/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of a guild emblem.
 * @author Fabrice Bouyé
 */
final class DefaultGuildDetailsEmblem implements GuildDetailsEmblem {

    int backgroundId = -1;
    int foregroundId = -1;
    Set<GuildDetailsEmblemFlag> flags = Collections.EMPTY_SET;
    int backgroundColorId = -1;
    int foregroundPrimaryColorId = -1;
    int foregroundSecondaryColorId = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultGuildDetailsEmblem() {
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
    public Set<GuildDetailsEmblemFlag> getFlags() {
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
