/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.tokeninfo;

import java.util.Set;

/**
 * Default implementation of a token info.
 * @author Fabrice Bouyé
 */
final class DefaultTokenInfo implements TokenInfo {

    String id;
    String name;
    Set<TokenInfoPermission> permissions;

    /**
     * Creates an empty instance.
     */
    DefaultTokenInfo() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<TokenInfoPermission> getPermissions() {
        return permissions;
    }
}
