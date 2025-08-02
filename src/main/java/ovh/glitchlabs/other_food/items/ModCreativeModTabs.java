package ovh.glitchlabs.other_food.items;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ovh.glitchlabs.other_food.Other_food;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Other_food.MODID);

    public static final Supplier<CreativeModeTab> OTHER_FOOD_TAB = CREATIVE_MODE_TAB.register("other_food_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.BLUE_CANDLE))
                    .title(Component.translatable("creativetab.other_food.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.EMPTY_CAN);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
