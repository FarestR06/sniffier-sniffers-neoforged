package com.farestr06.sniffiersniffers.datagen;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SniffierSniffersMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MACABRE_BLOCK.get());
    }
}
