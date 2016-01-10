/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.tokeninfo;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a token info.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/tokeninfo", requiresAuthentication = true, scope = "account") // NOI18N.
public interface TokenInfo {

    /**
     * Gets the id of this token info.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the name of this token info.
     * @return A {@code String} instance, never {@code null}.
     */
    String getName();

    /**
     * Gets a set of permissions attached to this token info.
     * @return A non-modifiable {@code Set<TokenInfoPermission>} instance, never {@code null}, should never be empty.
     */
    @SetValue
    Set<TokenInfoPermission> getPermissions();
}
