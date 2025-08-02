package ovh.glitchlabs.other_food.items;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CANNED_MELON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.6f)
            .build();
}
