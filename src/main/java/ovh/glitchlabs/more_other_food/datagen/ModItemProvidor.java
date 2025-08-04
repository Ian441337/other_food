package ovh.glitchlabs.more_other_food.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import ovh.glitchlabs.more_other_food.Other_food;
import ovh.glitchlabs.more_other_food.items.ModItems;

public class ModItemProvidor extends ItemModelProvider {
    public ModItemProvidor(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Other_food.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FRUIT_JAR.get());

        basicItem(ModItems.BEEF_JERKY.get());
        basicItem(ModItems.TOAST.get());
        basicItem(ModItems.APPLE_JAM.get());

        // Warme Gerichte
        basicItem(ModItems.FISH_STEW.get());
        basicItem(ModItems.MUSHROOM_RISOTTO.get());
        basicItem(ModItems.BAKED_POTATO_WITH_CHEESE.get());

        // Süßspeisen & Desserts
        basicItem(ModItems.CHOCOLATE_CHIP_COOKIE.get());
        basicItem(ModItems.STRAWBERRY_TART.get());
        basicItem(ModItems.HONEY_CAKE.get());
        basicItem(ModItems.ICE_CREAM_BOWL.get());

        // Getränke
        basicItem(ModItems.HOT_CHOCOLATE.get());
        basicItem(ModItems.BERRY_SMOOTHIE.get());
        basicItem(ModItems.COFFEE.get());

        // Internationale Küche
        basicItem(ModItems.SUSHI_ROLL.get());
        basicItem(ModItems.TACO.get());
        basicItem(ModItems.PIZZA_SLICE.get());
        basicItem(ModItems.RAMEN_BOWL.get());

        // Spezielle Effekte
        basicItem(ModItems.ENERGY_BAR.get());
        basicItem(ModItems.GOLDEN_DONUT.get());
        basicItem(ModItems.SPICY_CHILI.get());

        // Snacks & Fingerfood
        basicItem(ModItems.PRETZEL.get());
        basicItem(ModItems.CHEESE_CRACKERS.get());
        basicItem(ModItems.POPCORN.get());
        basicItem(ModItems.NACHOS.get());

        // Frühstück
        basicItem(ModItems.PANCAKES.get());
        basicItem(ModItems.WAFFLES.get());
        basicItem(ModItems.CEREAL_BOWL.get());
        basicItem(ModItems.BAGEL_WITH_CREAM_CHEESE.get());

        // Sandwiches & Wraps
        basicItem(ModItems.CLUB_SANDWICH.get());
        basicItem(ModItems.BURRITO.get());
        basicItem(ModItems.WRAP.get());
        basicItem(ModItems.GRILLED_CHEESE.get());

        // Meeresfrüchte
        basicItem(ModItems.LOBSTER_TAIL.get());
        basicItem(ModItems.SHRIMP_COCKTAIL.get());
        basicItem(ModItems.FISH_AND_CHIPS.get());

        // Exotische Früchte
        basicItem(ModItems.MANGO.get());
        basicItem(ModItems.PINEAPPLE_SLICE.get());
        basicItem(ModItems.DRAGON_FRUIT.get());

        // Gegrilltes & BBQ
        basicItem(ModItems.BBQ_RIBS.get());
        basicItem(ModItems.GRILLED_SALMON.get());
        basicItem(ModItems.CORN_ON_THE_COB.get());

        // Gesunde Optionen
        basicItem(ModItems.QUINOA_SALAD.get());
        basicItem(ModItems.ACAI_BOWL.get());
        basicItem(ModItems.PROTEIN_SHAKE.get());

        // Magische/Mystische Items
        basicItem(ModItems.ENCHANTED_APPLE_PIE.get());
        basicItem(ModItems.MYSTIC_MUSHROOM_SOUP.get());
        basicItem(ModItems.ELIXIR_OF_STRENGTH.get());

        // Partysnacks
        basicItem(ModItems.BIRTHDAY_CAKE_SLICE.get());
        basicItem(ModItems.PARTY_MIX.get());
        basicItem(ModItems.CHAMPAGNE_FLUTE.get());

        // Comfort Food
        basicItem(ModItems.MAC_AND_CHEESE.get());
        basicItem(ModItems.CHICKEN_NOODLE_SOUP.get());
        basicItem(ModItems.MEATLOAF.get());
    }
}
