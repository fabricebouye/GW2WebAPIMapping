/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all recipe types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/recipes") // NOI18N.
public enum RecipeType {

    /**
     * Defines an axe recipe type.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines an long bow recipe type.
     */
    LONG_BOW("LongBow"), // NOI18N.
    /**
     * Defines a dagger type.
     */
    DAGGER("Dagger"), // NOI18N.
    /**
     * Defines a focus recipe type.
     */
    FOCUS("Focus"), // NOI18N.
    /**
     * Defines a great sword recipe type.
     */
    GREATSWORD("Greatsword"), // NOI18N.
    /**
     * Defines a hammer recipe type.
     */
    HAMMER("Hammer"), // NOI18N.
    /**
     * Defines a harpoon recipe type.
     */
    HARPOON("Harpoon"), // NOI18N.
    /**
     * Defines a mace recipe type.
     */
    MACE("Mace"), // NOI18N.
    /**
     * Defines a pistol recipe type.
     */
    PISTOL("Pistol"), // NOI18N.
    /**
     * Defines a riffe recipe type.
     */
    RIFLE("Rifle"), // NOI18N.
    /**
     * Defines a scepter recipe type.
     */
    SCEPTER("Scepter"), // NOI18N.
    /**
     * Defines a shield recipe type.
     */
    SHIELD("Shield"), // NOI18N.
    /**
     * Defines short bow recipe type.
     */
    SHORT_BOW("ShortBow"), // NOI18N.
    /**
     * Defines an speargun recipe type.
     */
    SPEARGUN("Speargun"), // NOI18N.
    /**
     * Defines a staff recipe type.
     */
    STAFF("Staff"), // NOI18N.
    /**
     * Defines an sword recipe type.
     */
    SWORD("Sword"), // NOI18N.
    /**
     * Defines a torch recipe type.
     */
    TORCH("Torch"), // NOI18N.
    /**
     * Defines a trident recipe type.
     */
    TRIDENT("Trident"), // NOI18N.
    /**
     * Defines a warhorn recipe type.
     */
    WARHORN("Warhorn"), // NOI18N.
    /**
     * Defines the boots recipe type.
     */
    BOOTS("Boots"), // NOI18N.
    /**
     * Defines the coat (breast plate) recipe type.
     */
    COAT("Coat"), // NOI18N.
    /**
     * Defines the gloves recipe type.
     */
    GLOVES("Gloves"), // NOI18N.
    /**
     * Defines the helm recipe type.
     */
    HELM("Helm"), // NOI18N.
    /**
     * Defines the leggings recipe type.
     */
    LEGGINGS("Leggings"), // NOI18N.
    /**
     * Defines the shoulders recipe type.
     */
    SHOULDERS("Shoulders"), // NOI18N.
    /**
     * Defines the accessory recipe type.
     */
    ACCESSORY("Accessory"), // NOI18N.
    /**
     * Defines the amulet recipe type.
     */
    AMULET("Amulet"), // NOI18N.
    /**
     * Defines the ring recipe type.
     */
    RING("Ring"), // NOI18N.
    /**
     * Defines the dessert recipe type.
     */
    DESSERT("Dessert"), // NOI18N.
    /**
     * Defines the feast (ie: feast, plate, cauldron, etc.) recipe type.
     */
    FEAST("Feast"), // NOI18N.
    /**
     * Defines the cooking ingredient recipe type.
     */
    INGREDIENT_COOKING("IngredientCooking"), // NOI18N.
    /**
     * Defines the meal recipe type.
     */
    MEAL("Meal"), // NOI18N.
    /**
     * Defines the seasoning recipe type.
     */
    SEASONING("Seasoning"), // NOI18N.
    /**
     * Defines the snack recipe type.
     */
    SNACK("Snack"), // NOI18N.
    /**
     * Defines the soup recipe type.
     */
    SOUP("Soup"), // NOI18N.
    /**
     * Defines the component recipe type.
     */
    COMPONENT("Component"), // NOI18N.
    /**
     * Defines the inscription recipe type.
     */
    INSCRIPTION("Inscription"), // NOI18N.
    /**
     * Defines the insignia recipe type.
     */
    INSIGNIA("Insignia"), // NOI18N.
    /**
     * Defines the refinement recipe type.
     */
    REFINEMENT("Refinement"), // NOI18N.
    /**
     * Defines the glob of ectoplasm refinement recipe type.
     */
    REFINEMENT_ECTOPLASM("RefinementEctoplasm"), // NOI18N.
    /**
     * Defines the obsidian shard refinement recipe type.
     */
    REFINEMENT_OBSIDIAN("RefinementObsidian"), // NOI18N.
    /**
     * Defines the backpack recipe type.
     */
    BACKPACK("Backpack"), // NOI18N.
    /**
     * Defines the bag recipe type.
     */
    BAG("Bag"), // NOI18N.
    /**
     * Defines the bulk recipe type.
     */
    BULK("Bulk"), // NOI18N.
    /**
     * Defines the consumable recipe type.
     */
    CONSUMABLE("Consumable"), // NOI18N.
    /**
     * Defines the dye recipe type.
     */
    DYE("Dye"), // NOI18N.
    /**
     * Defines the potion recipe type.
     */
    POTION("Potion"), // NOI18N.
    /**
     * Defines the upgrade component recipe type.
     */
    UPGRADE_COMPONENT("UpgradeComponent"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private RecipeType(final String value) {
        this.value = value;
    }
}
