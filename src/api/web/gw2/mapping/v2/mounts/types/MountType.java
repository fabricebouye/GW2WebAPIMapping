/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.types;

import api.web.gw2.mapping.core.*;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines mount types.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mounts/types") // NOI18N.
public enum MountType {
    /**
     * Defines mount: Griffon.
     */
    GRIFFON("griffon"), // NOI18N.
    /**
     * Defines mount: Jackal.
     */
    JACKAL("jackal"), // NOI18N.
    /**
     * Defines mount: Raptor.
     */
    RAPTOR("raptor"), // NOI18N.
    /**
     * Defines mount: Roller Beetle.
     */
    ROLLER_BEETLE("roller_beetle"), // NOI18N.
    /**
     * Defines mount: Skimmer.
     */
    SKIMMER("skimmer"), // NOI18N.
    /**
     * Defines mount: Skyscale.
     */
    @ImplementationSpecific
    SKYSCALE("skyscale"), // NOI18N.
    /**
     * Defines mount: Springer.
     */
    SPRINGER("springer"), // NOI18N.
    /**
     * Defines mount: Warclaw.
     */
    WARCLAW("warclaw"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    MountType(final String value) {
        this.value = value;
    }
}
