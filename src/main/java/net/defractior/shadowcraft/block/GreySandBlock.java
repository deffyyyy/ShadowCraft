package net.defractior.shadowcraft.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

/**
 * Grey Sand. When exposed to water on any adjacent side, it turns into Wet Grey Sand.
 */
public class GreySandBlock extends FallingBlock {
    public static final MapCodec<GreySandBlock> CODEC = simpleCodec(GreySandBlock::new);

    public GreySandBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }

    private boolean isTouchingWater(Level level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            FluidState fluidState = level.getFluidState(pos.relative(direction));
            if (fluidState.is(Fluids.WATER)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, net.minecraft.world.level.block.Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
        if (!level.isClientSide && isTouchingWater(level, pos)) {
            level.setBlockAndUpdate(pos, ModBlocks.WET_GREY_SAND.get().defaultBlockState());
        }
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        if (!level.isClientSide && isTouchingWater(level, pos)) {
            level.setBlockAndUpdate(pos, ModBlocks.WET_GREY_SAND.get().defaultBlockState());
        }
    }
}
