/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Define a WvW match map bonus.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public interface WvwMatchMapBonus {

    /**
     * Gets the type of this bonus.
     * @return A {@code WvwMatchMapBonusType} instance, never {@code null}.
     */
    WvwMatchMapBonusType getType();

    /**
     * Gets the type of this bonus.
     * @return A {@code WvwMatchMapBonusType} instance, never {@code null}.
     */
    WvwMatchTeam getOwner();
}
