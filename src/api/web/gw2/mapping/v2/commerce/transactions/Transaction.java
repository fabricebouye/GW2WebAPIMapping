/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.transactions;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Defines a transaction.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/commerce/transactions", requiresAuthentication = true) // NOI18N.
public interface Transaction {

    /**
     * Gets the id of the transaction.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the id of the item.
     * @return An {@code int}.
     */
    @IdValue
    int getItemId();

    /**
     * Gets the price in coins.
     * @return A {@code CoinAmount} instance, never {@code null}.
     */
    @CoinValue
    CoinAmount getPrice();

    /**
     * Gets the quantity of the item.
     * @return An {@code int}.
     */
    @QuantityValue
    int getQuantity();

    /**
     * Gets the time of creation.
     * @return A {@code LocalDate} instance, never {@code null}.
     */
    LocalDate getCreated();

    /**
     * Gets the time of purchase.
     * @return An {@code Optional<LocalDate>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<LocalDate> getPurchased();
}
