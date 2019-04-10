/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines the response received when directly querying this sub-endpoint.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public interface CharacterEquipmentResponse {

    /**
     * Gets the equipment of this character.
     * @return A non-modifiable {@code List<CharacterEquipment>} instance, never
     * {@code null}:
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#BUILDS
     * @see api.web.gw2.mapping.v2.tokeninfo.TokenInfoPermission#INVENTORIES
     */
    @ListValue
    List<CharacterEquipment> getEquipment();
}
