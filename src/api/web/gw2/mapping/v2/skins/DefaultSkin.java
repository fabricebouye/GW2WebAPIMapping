/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import java.net.URL;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * Default implementation of a skin.
 * @author Fabrice Bouyé
 */
final class DefaultSkin implements Skin {

    int id = -1;
    String name = "";
    SkinType type = SkinType.UNKNOWN;
    Set<SkinFlag> flags = Collections.EMPTY_SET;
    Set<SkinRestriction> restrictions = Collections.EMPTY_SET;
    Optional<URL> icon = Optional.empty();
    Optional<String> description = Optional.empty();
    Optional<SkinDetails> details = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    public DefaultSkin() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public SkinType getType() {
        return type;
    }

    @Override
    public Set<SkinFlag> getFlags() {
        return flags;
    }

    @Override
    public Set<SkinRestriction> getRestrictions() {
        return restrictions;
    }

    @Override
    public Optional<URL> getIcon() {
        return icon;
    }

    @Override
    public Optional<String> getDescription() {
        return description;
    }

    @Override
    public Optional<SkinDetails> getDetails() {
        return details;
    }
}
