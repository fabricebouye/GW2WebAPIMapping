/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dungeons;

import api.web.gw2.mapping.core.ImplementationSpecific;

/**
 * Defines dungeons path types.
 * @author Fabrice Bouyé
 */
public enum DungeonPathType {
    /**
     * Defines a story dungeon path type.
     */
    STORY("Story"), // NOI18N.
    /**
     * Defines an explorable dungeondungeon path type.
     */
    EXPLORABLE("Explorable"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private DungeonPathType(final String value) {
        this.value = value;
    }
}
