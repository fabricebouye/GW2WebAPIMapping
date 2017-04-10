/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.characters.id.inventory;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines inventory binding.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/inventory", requiresAuthentication = true, scope = "inventories") // NOI18N.
public enum CharacterInventoryBinding {
    /**
     * The item is account bound.
     */
    ACCOUNT("Account"), // NOI18N.
    /**
     * The item is character bound.
     */
    CHARACTER("Character"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CharacterInventoryBinding(final String value) {
        this.value = value;
    }
}
