package ovh.glitchlabs.other_food.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ovh.glitchlabs.other_food.Other_food;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Other_food.MODID);
//Food

    public static final DeferredItem<Item> BEEF_JERKY = ITEMS.register("beef_jerky",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEEF_JERKY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
};