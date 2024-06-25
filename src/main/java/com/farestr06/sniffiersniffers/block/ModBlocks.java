package com.farestr06.sniffiersniffers.block;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SniffierSniffersMod.MOD_ID);

    public static final DeferredBlock<Block> MACABRE_BLOCK = BLOCKS.registerSimpleBlock(
            "macabre_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_RED)
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
