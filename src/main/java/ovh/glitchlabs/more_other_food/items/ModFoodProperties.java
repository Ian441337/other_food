package ovh.glitchlabs.more_other_food.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BEEF_JERKY = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.4f)
            .build();

    public static final FoodProperties TOAST = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.1f)
            .build();

    public static final FoodProperties JAM = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.2f)
            .build();

    public static final FoodProperties FISH_STEW = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.3f)
            .build();

    public static final FoodProperties MUSHROOM_RISOTTO = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .build();

    public static final FoodProperties BAKED_POTATO_WITH_CHEESE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.0f)
            .build();

    // Süßspeisen & Desserts
    public static final FoodProperties CHOCOLATE_CHIP_COOKIE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .fast()
            .build();

    public static final FoodProperties STRAWBERRY_TART = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .build();

    public static final FoodProperties HONEY_CAKE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.8f)
            .build();

    public static final FoodProperties ICE_CREAM_BOWL = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0f)
            .build();

    // Getränke
    public static final FoodProperties HOT_CHOCOLATE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 0.8f)
            .build();

    public static final FoodProperties BERRY_SMOOTHIE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0f)
            .build();

    public static final FoodProperties COFFEE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1.0f)
            .build();

    // Internationale Küche
    public static final FoodProperties SUSHI_ROLL = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .build();

    public static final FoodProperties TACO = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.1f)
            .build();

    public static final FoodProperties PIZZA_SLICE = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.4f)
            .build();

    public static final FoodProperties RAMEN_BOWL = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.5f)
            .build();

    // Spezielle Effekte
    public static final FoodProperties ENERGY_BAR = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.9f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 400, 0), 1.0f)
            .build();

    public static final FoodProperties GOLDEN_DONUT = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.8f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1200, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodProperties SPICY_CHILI = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0f)
            .build();

    // Snacks & Fingerfood
    public static final FoodProperties PRETZEL = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.6f)
            .fast()
            .build();

    public static final FoodProperties CHEESE_CRACKERS = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .fast()
            .build();

    public static final FoodProperties POPCORN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .fast()
            .build();

    public static final FoodProperties NACHOS = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.9f)
            .build();

    // Frühstück
    public static final FoodProperties PANCAKES = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .build();

    public static final FoodProperties WAFFLES = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.1f)
            .build();

    public static final FoodProperties CEREAL_BOWL = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.9f)
            .build();

    public static final FoodProperties BAGEL_WITH_CREAM_CHEESE = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.3f)
            .build();

    // Sandwiches & Wraps
    public static final FoodProperties CLUB_SANDWICH = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(1.7f)
            .build();

    public static final FoodProperties BURRITO = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.8f)
            .build();

    public static final FoodProperties WRAP = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.2f)
            .build();

    public static final FoodProperties GRILLED_CHEESE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.1f)
            .build();

    // Meeresfrüchte
    public static final FoodProperties LOBSTER_TAIL = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0), 0.9f)
            .build();

    public static final FoodProperties SHRIMP_COCKTAIL = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0), 0.7f)
            .build();

    public static final FoodProperties FISH_AND_CHIPS = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(1.5f)
            .build();

    // Exotische Früchte
    public static final FoodProperties MANGO = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60, 0), 0.3f)
            .build();

    public static final FoodProperties PINEAPPLE_SLICE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 0.4f)
            .build();

    public static final FoodProperties DRAGON_FRUIT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 1), 0.8f)
            .build();

    // Gegrilltes & BBQ
    public static final FoodProperties BBQ_RIBS = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(2.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0), 0.6f)
            .build();

    public static final FoodProperties GRILLED_SALMON = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.4f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 0), 0.5f)
            .build();

    public static final FoodProperties CORN_ON_THE_COB = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.0f)
            .build();

    // Gesunde Optionen
    public static final FoodProperties QUINOA_SALAD = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 0.8f)
            .build();

    public static final FoodProperties ACAI_BOWL = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0f)
            .build();

    public static final FoodProperties PROTEIN_SHAKE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 0.7f)
            .build();

    // Magische/Mystische Items
    public static final FoodProperties ENCHANTED_APPLE_PIE = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(2.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodProperties MYSTIC_MUSHROOM_SOUP = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 0.5f)
            .build();

    public static final FoodProperties ELIXIR_OF_STRENGTH = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1), 1.0f)
            .alwaysEdible()
            .build();

    // Partysnacks
    public static final FoodProperties BIRTHDAY_CAKE_SLICE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f)
            .build();

    public static final FoodProperties PARTY_MIX = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.7f)
            .fast()
            .build();

    public static final FoodProperties CHAMPAGNE_FLUTE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 600, 0), 1.0f)
            .build();

    // Comfort Food
    public static final FoodProperties MAC_AND_CHEESE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.4f)
            .build();

    public static final FoodProperties CHICKEN_NOODLE_SOUP = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 0.6f)
            .build();

    public static final FoodProperties MEATLOAF = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(1.6f)
            .build();
}
