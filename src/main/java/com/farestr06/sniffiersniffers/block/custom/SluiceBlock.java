package com.farestr06.sniffiersniffers.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HopperBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SluiceBlock extends HopperBlock {

    private static final VoxelShape TOP = Block.box(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape FUNNEL = Block.box(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
    private static final VoxelShape BASE = Shapes.or(FUNNEL, TOP);
    private static final VoxelShape DOWN_SHAPE = Shapes.or(BASE, Block.box(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
    private static final VoxelShape EAST_SHAPE = Shapes.or(BASE, Block.box(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
    private static final VoxelShape NORTH_SHAPE = Shapes.or(BASE, Block.box(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
    private static final VoxelShape SOUTH_SHAPE = Shapes.or(BASE, Block.box(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
    private static final VoxelShape WEST_SHAPE = Shapes.or(BASE, Block.box(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
    private static final VoxelShape DOWN_INTERACTION_SHAPE = TOP;
    private static final VoxelShape EAST_INTERACTION_SHAPE = Shapes.or(TOP, Block.box(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
    private static final VoxelShape NORTH_INTERACTION_SHAPE = Shapes.or(TOP, Block.box(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
    private static final VoxelShape SOUTH_INTERACTION_SHAPE = Shapes.or(TOP, Block.box(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
    private static final VoxelShape WEST_INTERACTION_SHAPE = Shapes.or(TOP, Block.box(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

    public SluiceBlock(Properties p_54039_) {
        super(p_54039_);
    }

    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return switch (pState.getValue(FACING)) {
            case DOWN -> DOWN_SHAPE;
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> BASE;
        };
    }

    @Override
    protected VoxelShape getInteractionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return switch (pState.getValue(FACING)) {
            case DOWN -> DOWN_INTERACTION_SHAPE;
            case NORTH -> NORTH_INTERACTION_SHAPE;
            case SOUTH -> SOUTH_INTERACTION_SHAPE;
            case WEST -> WEST_INTERACTION_SHAPE;
            case EAST -> EAST_INTERACTION_SHAPE;
            default -> TOP;
        };
    }
}
