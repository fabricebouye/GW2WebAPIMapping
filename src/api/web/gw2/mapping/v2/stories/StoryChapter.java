/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.stories;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a chapter in a story.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/stories")
public interface StoryChapter {

    /**
     * Gets the i18n name of the chapter.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();
}
