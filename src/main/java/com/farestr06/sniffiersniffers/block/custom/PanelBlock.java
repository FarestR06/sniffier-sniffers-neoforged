package com.farestr06.sniffiersniffers.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

public class PanelBlock extends MultifaceBlock {

    public static final MapCodec<PanelBlock> CODEC = simpleCodec(PanelBlock::new);
    private final MultifaceSpreader unused = new MultifaceSpreader(new UnusedSpreaderConfig());

    public PanelBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends MultifaceBlock> codec() {
        return CODEC;
    }

    @Deprecated
    @Override
    public @NotNull MultifaceSpreader getSpreader() {
        return unused;
    }

    class UnusedSpreaderConfig extends MultifaceSpreader.DefaultSpreaderConfig {

        public UnusedSpreaderConfig() {
            super(PanelBlock.this);
        }

        @Override
        @ParametersAreNonnullByDefault
        protected boolean stateCanBeReplaced(BlockGetter pLevel, BlockPos pPos, BlockPos pSpreadPos, Direction pDirection, BlockState pState) {
            return super.stateCanBeReplaced(pLevel, pPos, pSpreadPos, pDirection, pState);
        }
    }
}
