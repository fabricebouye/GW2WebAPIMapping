/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.transactions;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Default implementation of a transaction.
 * @author Fabrice Bouyé
 */
final class DefaultTransaction implements Transaction {

    int id;
    int itemId;
    int price;
    int quantity;
    LocalDate created;
    Optional<LocalDate> purchased = Optional.empty();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getItemId() {
        return itemId;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public LocalDate getCreated() {
        return created;
    }

    @Override
    public Optional<LocalDate> getPurchased() {
        return purchased;
    }
}
