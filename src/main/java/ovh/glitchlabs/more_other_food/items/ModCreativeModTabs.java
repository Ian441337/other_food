package ovh.glitchlabs.more_other_food.items;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ovh.glitchlabs.more_other_food.Other_food;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Other_food.MODID);

    public static final Supplier<CreativeModeTab> OTHER_FOOD_TAB = CREATIVE_MODE_TAB.register("other_food_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.BLUE_CANDLE))
                    .title(Component.translatable("creativetab.other_food.tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.FRUIT_JAR);

                        output.accept(ModItems.BEEF_JERKY);
                        output.accept(ModItems.TOAST);
                        output.accept(ModItems.APPLE_JAM);
                        output.accept(ModItems.BERRY_JAM);

                        // Warme Gerichte
                        output.accept(ModItems.FISH_STEW);
                        output.accept(ModItems.MUSHROOM_RISOTTO);
                        output.accept(ModItems.BAKED_POTATO_WITH_CHEESE);

                        // Süßspeisen & Desserts
                        output.accept(ModItems.CHOCOLATE_CHIP_COOKIE);
                        output.accept(ModItems.STRAWBERRY_TART);
                        output.accept(ModItems.HONEY_CAKE);
                        output.accept(ModItems.ICE_CREAM_BOWL);

                        // Getränke
                        output.accept(ModItems.HOT_CHOCOLATE);
                        output.accept(ModItems.BERRY_SMOOTHIE);
                        output.accept(ModItems.COFFEE);

                        // Internationale Küche
                        output.accept(ModItems.SUSHI_ROLL);
                        output.accept(ModItems.TACO);
                        output.accept(ModItems.PIZZA_SLICE);
                        output.accept(ModItems.RAMEN_BOWL);

                        // Spezielle Effekte
                        output.accept(ModItems.ENERGY_BAR);
                        output.accept(ModItems.GOLDEN_DONUT);
                        output.accept(ModItems.SPICY_CHILI);

                        // Snacks & Fingerfood
                        output.accept(ModItems.PRETZEL);
                        output.accept(ModItems.CHEESE_CRACKERS);
                        output.accept(ModItems.POPCORN);
                        output.accept(ModItems.NACHOS);

                        // Frühstück
                        output.accept(ModItems.PANCAKES);
                        output.accept(ModItems.WAFFLES);
                        output.accept(ModItems.CEREAL_BOWL);
                        output.accept(ModItems.BAGEL_WITH_CREAM_CHEESE);

                        // Sandwiches & Wraps
                        output.accept(ModItems.CLUB_SANDWICH);
                        output.accept(ModItems.BURRITO);
                        output.accept(ModItems.WRAP);
                        output.accept(ModItems.GRILLED_CHEESE);

                        // Meeresfrüchte
                        output.accept(ModItems.LOBSTER_TAIL);
                        output.accept(ModItems.SHRIMP_COCKTAIL);
                        output.accept(ModItems.FISH_AND_CHIPS);

                        // Exotische Früchte
                        output.accept(ModItems.MANGO);
                        output.accept(ModItems.PINEAPPLE_SLICE);
                        output.accept(ModItems.DRAGON_FRUIT);

                        // Gegrilltes & BBQ
                        output.accept(ModItems.BBQ_RIBS);
                        output.accept(ModItems.GRILLED_SALMON);
                        output.accept(ModItems.CORN_ON_THE_COB);

                        // Gesunde Optionen
                        output.accept(ModItems.QUINOA_SALAD);
                        output.accept(ModItems.ACAI_BOWL);
                        output.accept(ModItems.PROTEIN_SHAKE);

                        // Magische/Mystische Items
                        output.accept(ModItems.ENCHANTED_APPLE_PIE);
                        output.accept(ModItems.MYSTIC_MUSHROOM_SOUP);
                        output.accept(ModItems.ELIXIR_OF_STRENGTH);

                        // Partysnacks
                        output.accept(ModItems.BIRTHDAY_CAKE_SLICE);
                        output.accept(ModItems.PARTY_MIX);
                        output.accept(ModItems.CHAMPAGNE_FLUTE);

                        // Comfort Food
                        output.accept(ModItems.MAC_AND_CHEESE);
                        output.accept(ModItems.CHICKEN_NOODLE_SOUP);
                        output.accept(ModItems.MEATLOAF);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
