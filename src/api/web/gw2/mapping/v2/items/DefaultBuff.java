/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

/**
 * Default implementation of a buff.
 * @author Fabrice Bouyé
 */
final class DefaultBuff implements Buff {

    int skillId = -1;
    String description = "";

    /**
     * Creates a new empty instance.
     */
    DefaultBuff() {
    }

    @Override
    public int getSkillId() {
        return skillId;
    }

    @Override
    public String getDescription() {
        return description;
    }       
}
