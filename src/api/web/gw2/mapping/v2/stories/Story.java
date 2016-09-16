/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.stories;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.characters.CharacterRace;
import java.util.Set;

/**
 * Defines a story (an entry in the character's story journal that contains personal story and living world).
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/stories")
public interface Story {

    /**
     * Gets the id of this story.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the id of the season to which this story belongs to.
     * @return A {@code String} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.stories.seasons.StorySeason#getId() 
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getSeason();

    /**
     * Gets the i18n name of this story.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the i18n description of this story.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the i18n in-game date of this story.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getTimeline();

    /**
     * Gets the minimum level required to do this story.
     * @return An {@code int}.
     */
    @LevelValue
    int getLevel();

    /**
     * Gets the sorting order of this story.
     * @return An {@code int}.
     */
    @QuantityValue
    int getOrder();

    /**
     * Gets all chapters in this story.
     * @return A non-modifiable {@code Set<StoryChapter>} instance, never {@code null}.
     */
    @SetValue
    Set<StoryChapter> getChapters();

    /**
     * Gets all races that are eligible to do this story.
     * <br>If empty, all races can do this story.
     * @return A non-modifiable {@code Set<CharacterRace>} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.characters.CharacterRace
     */
    @SetValue
    Set<CharacterRace> getRaces();

    /**
     * Gets all flags that restrict access to this story.
     * <br>If empty, there is no access restriction.
     * @return A non-modifiable {@code Set<StoryFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<StoryFlag> getFlags();
}
