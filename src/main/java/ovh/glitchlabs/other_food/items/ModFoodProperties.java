package ovh.glitchlabs.other_food.items;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BEEF_JERKY = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .build();
}
