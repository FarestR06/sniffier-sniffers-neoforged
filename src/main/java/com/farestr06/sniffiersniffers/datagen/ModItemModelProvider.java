package com.farestr06.sniffiersniffers.datagen;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.block.ModBlocks;
import com.farestr06.sniffiersniffers.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SniffierSniffersMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TORCHFRUIT.get());
        basicItem(ModItems.RAW_MACABRE.get());
        basicItem(ModItems.MACABRE_INGOT.get()); //TODO: Add recipes
        basicItem(ModItems.MACABRE_NUGGET.get()); //TODO: Add recipes

        createCubeAllBlockItemModel(ModBlocks.MACABRE_BLOCK);
        createGeneratedBlockItemModel(ModBlocks.SYNTHWAVE_PANEL);
        createGeneratedBlockItemModel(ModBlocks.PRIDE_PANEL);
    }

    private void createCubeAllBlockItemModel(DeferredBlock<? extends Block> block) {
        withExistingParent("item/" + block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }
    private void createGeneratedBlockItemModel(DeferredBlock<? extends Block> block) {
        withExistingParent("item/" + block.getId().getPath(), mcLoc("item/generated")).texture("layer_0", "block/" + block.getId().getPath());
    }
}
