package com.farestr06.sniffiersniffers.datagen;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
