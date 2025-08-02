package ovh.glitchlabs.other_food.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import ovh.glitchlabs.other_food.Other_food;
import ovh.glitchlabs.other_food.items.ModItems;

public class ModItemProvidor extends ItemModelProvider {
    public ModItemProvidor(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Other_food.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        basicItem(ModItems.STEEL_INGOT.get());
    }
}
