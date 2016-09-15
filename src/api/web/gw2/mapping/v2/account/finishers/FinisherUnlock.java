/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.account.finishers;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;

/**
 * Defines an inventory slot.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.finishers.Finisher
 */
// @todo Check if unlocks permission required or not.
@APIv2(endpoint = "v2/account/finishers", requiresAuthentication = true, scope = "unlocks") // NOI18N.
public interface FinisherUnlock {

    /**
     * Gets the id of the finisher unlocked.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.finishers.Finisher#getId() 
     */
    @IdValue
    int getId();

    /**
     * Indicates whether this unlock is permanent.
     * @return {@code True} if the property is verified, {@code false} otherwise.
     */
    boolean isPermanent();

    /**
     * Indicates the quantity for this non-permanent finisher.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getQuantity();

}
