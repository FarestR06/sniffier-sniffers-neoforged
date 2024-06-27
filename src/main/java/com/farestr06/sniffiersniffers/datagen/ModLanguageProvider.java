package com.farestr06.sniffiersniffers.datagen;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.block.ModBlocks;
import com.farestr06.sniffiersniffers.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, SniffierSniffersMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(ModBlocks.SLUICE, "Sluice");
        addBlock(ModBlocks.PRIDE_PANEL, "Prismatic Panel (Pride)");
        addBlock(ModBlocks.SYNTHWAVE_PANEL, "Prismatic Panel (Synthwave)");
        addBlock(ModBlocks.MACABRE_BLOCK, "Block of Macabre");
        addItem(ModItems.RAW_MACABRE, "Raw Macabre");
        addItem(ModItems.MACABRE_INGOT, "Macabre Ingot");
        addItem(ModItems.MACABRE_NUGGET, "Macabre Nugget");
        addItem(ModItems.TORCHFRUIT, "Torchfruit");
    }
}
