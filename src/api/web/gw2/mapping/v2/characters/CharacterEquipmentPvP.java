/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;

/**
 * Defines the PvP equipment of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/<name>/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public interface CharacterEquipmentPvP {

    @IdValue
    int getAmulet();

    @IdValue
    int getRune();

    @ListValue
    @IdValue
    List<Integer> getSigils();
}
