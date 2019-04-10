/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.skins;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a mount skin dye slot.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mounts/skins") // NOI18N.
public interface MountSkinDyeSlot {
    /**
     * Gets the id of the color to apply to this dye slot.
     * @return An {@code int}.
     */
    @IdValue
    int getColorId();

    /**
     * Gets the material used by this dye slot.
     * @return A {@code MountDyeSlotMaterial} instance, never {@code null}.
     * @see MountDyeSlotMaterial
     */
    MountDyeSlotMaterial getMaterial();
}
