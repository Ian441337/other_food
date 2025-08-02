package ovh.glitchlabs.other_food.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ovh.glitchlabs.other_food.Other_food;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Other_food.MODID);
//Food

    public static final DeferredItem<Item> CANNED_MELON = ITEMS.register("canned_melon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANNED_MELON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
};