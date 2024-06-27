package com.farestr06.sniffiersniffers.block;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import com.farestr06.sniffiersniffers.block.custom.PanelBlock;
import com.farestr06.sniffiersniffers.block.custom.SluiceBlock;
import com.farestr06.sniffiersniffers.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SniffierSniffersMod.MOD_ID);

    public static final DeferredBlock<Block> MACABRE_BLOCK = registerBlockAndItem(
        BLOCKS.registerSimpleBlock("macabre_block", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
    );

    public static final DeferredBlock<SluiceBlock> SLUICE = registerBlockAndItem(
            BLOCKS.registerBlock(
                    "sluice",
                    SluiceBlock::new,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)
            )
    );

    public static final DeferredBlock<PanelBlock> SYNTHWAVE_PANEL = registerBlockAndItem(
            BLOCKS.registerBlock(
                    "synthwave_panel",
                    PanelBlock::new,
                    BlockBehaviour.Properties.of()
                            .hasPostProcess((pState, pLevel, pPos) -> true)
                            .lightLevel(value -> 1)
                            .emissiveRendering((pState, pLevel, pPos) -> true)
                            .noOcclusion()
                            .mapColor(MapColor.COLOR_PURPLE)
                            .sound(SoundType.COPPER)
                            .requiresCorrectToolForDrops()
                            .strength(1.5f, 6f)
            )
    );
    public static final DeferredBlock<PanelBlock> PRIDE_PANEL = registerBlockAndItem(
            BLOCKS.registerBlock(
                    "pride_panel",
                    PanelBlock::new,
                    BlockBehaviour.Properties.of()
                            .hasPostProcess((pState, pLevel, pPos) -> true)
                            .lightLevel(value -> 1)
                            .emissiveRendering((pState, pLevel, pPos) -> true)
                            .noOcclusion()
                            .mapColor(MapColor.COLOR_PINK)
                            .sound(SoundType.COPPER)
                            .requiresCorrectToolForDrops()
                            .strength(1.5f, 6f)
            )
    );

    private static <T extends Block> DeferredBlock<T> registerBlockAndItem(DeferredBlock<T> deferredBlock) {
        ModItems.ITEMS.registerSimpleBlockItem(deferredBlock, new Item.Properties());
        return deferredBlock;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
