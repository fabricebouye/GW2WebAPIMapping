/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Map;

/**
 * Defines the equipment stats set of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public interface CharacterEquipmentStats {

    /**
     * Gets the id of this equipment stats set.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    @MapValue
    Map<CharacterEquipmentAttribute, Integer> getAttributes();
}
