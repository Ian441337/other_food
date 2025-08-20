package ovh.glitchlabs.more_other_food.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ovh.glitchlabs.more_other_food.Other_food;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Other_food.MODID);

    public static final DeferredItem<Item> FRUIT_JAR = ITEMS.register("fruit_jar",
            () -> new Item(new Item.Properties()));

//Food

    public static final DeferredItem<Item> BEEF_JERKY = ITEMS.register("beef_jerky",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEEF_JERKY)));

    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));

    public static final DeferredItem<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JAM)));

    public static final DeferredItem<Item> BERRY_JAM = ITEMS.register("berry_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JAM)));

    // Warme Gerichte

    public static final DeferredItem<Item> FISH_STEW = ITEMS.register("fish_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FISH_STEW)));

    public static final DeferredItem<Item> MUSHROOM_RISOTTO = ITEMS.register("mushroom_risotto",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUSHROOM_RISOTTO)));

    public static final DeferredItem<Item> BAKED_POTATO_WITH_CHEESE = ITEMS.register("baked_potato_with_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAKED_POTATO_WITH_CHEESE)));

    // Süßspeisen & Desserts
    public static final DeferredItem<Item> CHOCOLATE_CHIP_COOKIE = ITEMS.register("chocolate_chip_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_CHIP_COOKIE)));

    public static final DeferredItem<Item> STRAWBERRY_TART = ITEMS.register("strawberry_tart",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY_TART)));

    public static final DeferredItem<Item> HONEY_CAKE = ITEMS.register("honey_cake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_CAKE)));

    public static final DeferredItem<Item> ICE_CREAM_BOWL = ITEMS.register("ice_cream_bowl",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ICE_CREAM_BOWL)));

    // Getränke
    public static final DeferredItem<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HOT_CHOCOLATE)));

    public static final DeferredItem<Item> BERRY_SMOOTHIE = ITEMS.register("berry_smoothie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BERRY_SMOOTHIE)));

    public static final DeferredItem<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COFFEE)));

    // Internationale Küche
    public static final DeferredItem<Item> SUSHI_ROLL = ITEMS.register("sushi_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUSHI_ROLL)));

    public static final DeferredItem<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TACO)));

    public static final DeferredItem<Item> PIZZA_SLICE = ITEMS.register("pizza_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIZZA_SLICE)));

    public static final DeferredItem<Item> RAMEN_BOWL = ITEMS.register("ramen_bowl",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAMEN_BOWL)));

    // Spezielle Effekte
    public static final DeferredItem<Item> ENERGY_BAR = ITEMS.register("energy_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENERGY_BAR)));

    public static final DeferredItem<Item> GOLDEN_DONUT = ITEMS.register("golden_donut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDEN_DONUT).rarity(net.minecraft.world.item.Rarity.RARE)));

    public static final DeferredItem<Item> SPICY_CHILI = ITEMS.register("spicy_chili",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SPICY_CHILI)));

    // Snacks & Fingerfood
    public static final DeferredItem<Item> PRETZEL = ITEMS.register("pretzel",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PRETZEL)));

    public static final DeferredItem<Item> CHEESE_CRACKERS = ITEMS.register("cheese_crackers",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE_CRACKERS)));

    public static final DeferredItem<Item> POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.POPCORN)));

    // Frühstück
    public static final DeferredItem<Item> PANCAKES = ITEMS.register("pancakes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PANCAKES)));

    public static final DeferredItem<Item> WAFFLES = ITEMS.register("waffles",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WAFFLES)));

    public static final DeferredItem<Item> CEREAL_BOWL = ITEMS.register("cereal_bowl",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CEREAL_BOWL)));

    public static final DeferredItem<Item> BAGEL_WITH_CREAM_CHEESE = ITEMS.register("bagel_with_cream_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAGEL_WITH_CREAM_CHEESE)));

    // Sandwiches & Wraps
    public static final DeferredItem<Item> CLUB_SANDWICH = ITEMS.register("club_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CLUB_SANDWICH)));

    public static final DeferredItem<Item> BURRITO = ITEMS.register("burrito",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BURRITO)));

    public static final DeferredItem<Item> WRAP = ITEMS.register("wrap",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WRAP)));

    public static final DeferredItem<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_CHEESE)));

    // Meeresfrüchte
    public static final DeferredItem<Item> LOBSTER_TAIL = ITEMS.register("lobster_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LOBSTER_TAIL)));

    public static final DeferredItem<Item> SHRIMP_COCKTAIL = ITEMS.register("shrimp_cocktail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHRIMP_COCKTAIL)));

    public static final DeferredItem<Item> FISH_AND_CHIPS = ITEMS.register("fish_and_chips",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FISH_AND_CHIPS)));

    // Exotische Früchte
    public static final DeferredItem<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MANGO)));

    public static final DeferredItem<Item> PINEAPPLE_SLICE = ITEMS.register("pineapple_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PINEAPPLE_SLICE)));

    public static final DeferredItem<Item> DRAGON_FRUIT = ITEMS.register("dragon_fruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DRAGON_FRUIT)));

    // Gegrilltes & BBQ
    public static final DeferredItem<Item> BBQ_RIBS = ITEMS.register("bbq_ribs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BBQ_RIBS)));

    public static final DeferredItem<Item> GRILLED_SALMON = ITEMS.register("grilled_salmon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_SALMON)));

    public static final DeferredItem<Item> CORN_ON_THE_COB = ITEMS.register("corn_on_the_cob",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN_ON_THE_COB)));

    // Gesunde Optionen
    public static final DeferredItem<Item> QUINOA_SALAD = ITEMS.register("quinoa_salad",
            () -> new Item(new Item.Properties().food(ModFoodProperties.QUINOA_SALAD)));

    public static final DeferredItem<Item> ACAI_BOWL = ITEMS.register("acai_bowl",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ACAI_BOWL)));

    public static final DeferredItem<Item> PROTEIN_SHAKE = ITEMS.register("protein_shake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PROTEIN_SHAKE)));

    // Magische/Mystische Items
    public static final DeferredItem<Item> ENCHANTED_APPLE_PIE = ITEMS.register("enchanted_apple_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENCHANTED_APPLE_PIE).rarity(net.minecraft.world.item.Rarity.EPIC)));

    public static final DeferredItem<Item> MYSTIC_MUSHROOM_SOUP = ITEMS.register("mystic_mushroom_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MYSTIC_MUSHROOM_SOUP).rarity(net.minecraft.world.item.Rarity.UNCOMMON)));

    public static final DeferredItem<Item> ELIXIR_OF_STRENGTH = ITEMS.register("elixir_of_strength",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ELIXIR_OF_STRENGTH).rarity(net.minecraft.world.item.Rarity.RARE)));

    // Partysnacks
    public static final DeferredItem<Item> BIRTHDAY_CAKE_SLICE = ITEMS.register("birthday_cake_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BIRTHDAY_CAKE_SLICE)));

    public static final DeferredItem<Item> PARTY_MIX = ITEMS.register("party_mix",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PARTY_MIX)));

    public static final DeferredItem<Item> CHAMPAGNE_FLUTE = ITEMS.register("champagne_flute",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHAMPAGNE_FLUTE)));

    // Comfort Food
    public static final DeferredItem<Item> MAC_AND_CHEESE = ITEMS.register("mac_and_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MAC_AND_CHEESE)));

    public static final DeferredItem<Item> CHICKEN_NOODLE_SOUP = ITEMS.register("chicken_noodle_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_NOODLE_SOUP)));

    public static final DeferredItem<Item> MEATLOAF = ITEMS.register("meatloaf",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEATLOAF)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
};