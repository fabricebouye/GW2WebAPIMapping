/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Default implementation of an item infix upgrade.
 * @author Fabrice Bouyé
 */
final class DefaultItemInfixUpgrade implements ItemInfixUpgrade {

    List<ItemInfixUpgradeAttributeValue> attributes = Collections.EMPTY_LIST;
    Optional<ItemBuff> buff = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    DefaultItemInfixUpgrade() {
    }

    @Override
    public List<ItemInfixUpgradeAttributeValue> getAttributes() {
        return attributes;
    }

    @Override
    public Optional<ItemBuff> getBuff() {
        return buff;
    }
}
