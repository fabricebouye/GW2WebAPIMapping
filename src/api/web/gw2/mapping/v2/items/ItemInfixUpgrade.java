/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Optional;

/**
 * Defines an item infix upgrade.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemInfixUpgrade {

    @IdValue
    /**
     * Gets the id of this infix upgrade.
     * @return An {@code int}.
     * <br>Old JSON files from earlier versions of the API may return {@code -1}.
     */
    int getId();

    /**
     * Gets the list of attribute values on this infix upgrade.
     * @return A non-modifiable {@code List<ItemInfixUpgradeValue>}, never {@code null}.
     */
    @ListValue
    List<ItemInfixUpgradeAttributeValue> getAttributes();

    /**
     * Gets the buff on this upgrade.
     * @return An {@code Optional<ItemBuff>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemBuff> getBuff();
}
