package ovh.glitchlabs.more_other_food.datagen;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import ovh.glitchlabs.more_other_food.Other_food;

public class ModBlockStateProvidor extends BlockStateProvider {
    public ModBlockStateProvidor(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Other_food.MODID, exFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {
//        BlockWithItem(ModBlocks.STEEL_BLOCK);
    }

    private void BlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
