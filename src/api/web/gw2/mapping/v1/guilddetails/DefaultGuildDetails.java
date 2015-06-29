/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.guilddetails;

/**
 * Default implementation of the details of a guild.
 * @author Fabrice Bouyé
 */
final class DefaultGuildDetails implements GuildDetails {

    String guildId;
    String guildName;
    String tag;
    Emblem emblem;

    /**
     * Creates a new empty instance.
     */
    DefaultGuildDetails() {
    }

    @Override
    public String getGuildId() {
        return guildId;
    }

    @Override
    public String getGuildName() {
        return guildName;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public Emblem getEmblem() {
        return emblem;
    }
}
