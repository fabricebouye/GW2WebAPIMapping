/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

import api.web.gw2.mapping.core.CoinAmount;
import api.web.gw2.mapping.core.CoinValue;
import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a guild log event.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/log", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface LogEvent {

    /**
     * Gets the id of this log event.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the time of this log event.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getTime();

    /**
     * Gets the name of the user responsible for this log event.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getUser();

    /**
     * Gets the type of this log event.
     * @return A {@code LogEventType} instance, never {@code null}.
     */
    LogEventType getType();

    /**
     * Gets the id of the item for a treasury or stash log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * @see LogEventType#TREASURY
     * @see LogEventType#STASH
     */
    @IdValue
    @OptionalValue
    OptionalInt getItemId();

    /**
     * Gets the count of the item for a treasury or stash log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * @see LogEventType#TREASURY
     * @see LogEventType#STASH
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getCount();

    /**
     * Gets the message of the day for a motd log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#MOTD
     */
    @OptionalValue
    Optional<String> getMotd();

    /**
     * Gets the upgrade id of an upgrade log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * @see LogEventType#UPGRADE
     */
    @IdValue
    @OptionalValue
    OptionalInt getUpgradeId();

    /**
     * Gets the operation of a stash log event.
     * @return An {@code Optional<LogEventStashOperation>} instance, never {@code null}.
     * @see LogEventType#STASH
     */
    @OptionalValue
    Optional<LogEventStashOperation> getOperation();

    /**
     * Gets the amount of coin of a stash log event.
     * @return An {@code Optional<CoinAmount>} instance, never {@code null}.
     * @see LogEventType#STASH
     */
    @CoinValue
    @OptionalValue
    Optional<CoinAmount> getCoins();

    /**
     * Gets the action of an upgrade log event.
     * @return An {@code Optional<LogEventUpgradeAction>} instance, never {@code null}.
     * @see LogEventType#UPGRADE
     */
    @OptionalValue
    Optional<LogEventUpgradeAction> getAction();

    /**
     * Gets the activity of an influence log event.
     * @return An {@code Optional<LogEventUpgradeAction>} instance, never {@code null}.
     * @see LogEventType#INFLUENCE
     */
    @OptionalValue
    Optional<LogEventInfluenceActivity> getActivity();

    /**
     * Gets the total number of participants of an influence log event.
     * @return An {@code OptionalInt} instance, never {@code null}.
     * <br>May be empty.
     * @see LogEventType#INFLUENCE
     */
    @QuantityValue
    @OptionalValue
    OptionalInt getTotalParticipants();

    /**
     * Gets the list of participants of an influence log event.
     * @return A non-modifiable {@code Set<String>} instance, never {@code null}; May be empty.
     * @see LogEventType#INFLUENCE
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    @SetValue
    Set<String> getParticipants();

    /**
     * Gets the initiator of an invited log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#RANK_CHANGE
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    @OptionalValue
    Optional<String> getInvitedBy();

    /**
     * Gets the initiator of a kick log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#KICK
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    @OptionalValue
    Optional<String> getKickedBy();

    /**
     * Gets the initiator of a rank change log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#RANK_CHANGE
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    @OptionalValue
    Optional<String> getChangedBy();

    /**
     * Gets the old rank of a rank change log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#RANK_CHANGE
     */
    @OptionalValue
    Optional<String> getOldRank();

    /**
     * Gets the new rank of a rank change log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#RANK_CHANGE
     */
    @OptionalValue
    Optional<String> getNewRank();

    /**
     * Gets the initiator of an invite decline log event.
     * @return An {@code Optional<String>} instance, never {@code null}.
     * @see LogEventType#INVITE_DECLINED
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    @OptionalValue
    Optional<String> getDeclinedBy();
}
