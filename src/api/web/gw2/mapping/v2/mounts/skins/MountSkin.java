/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.skins;

import api.web.gw2.mapping.core.*;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.mounts.types.MountType;

import java.util.List;

/**
 * Defines a mount skin.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mounts/skins") // NOI18N.
public interface MountSkin {
    /**
     * Gets the id of this skin.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the localized name of this skin.
     * @return A {@code String}, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the URL to the icon of this skin.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets a non-modifiable list of all dye slots on this skin.
     * @return A non-modifiable {@code List<MountSkinDyeSlot>} instance, never {@code null}, may be empty.
     */
    @ListValue
    List<MountSkinDyeSlot> getDyeSlots();

    /**
     * Gets the mount type of this skin.
     * @return A {@code MountType} instance, never {@code null}.
     */
    MountType getMount();
}
