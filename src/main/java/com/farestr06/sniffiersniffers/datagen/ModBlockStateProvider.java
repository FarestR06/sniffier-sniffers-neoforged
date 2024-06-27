package com.farestr06.sniffiersniffers.datagen;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SniffierSniffersMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MACABRE_BLOCK.get());
        models().withExistingParent("block/synthwave_panel", "block/sculk_vein")
                .texture("sculk_vein", "block/synthwave_panel")
                .texture("particle", "block/synthwave_panel")
                .renderType("cutout");
        models().withExistingParent("block/pride_panel", "block/sculk_vein")
                .texture("sculk_vein", "block/pride_panel")
                .texture("particle", "block/pride_panel")
                .renderType("cutout");
    }
}
