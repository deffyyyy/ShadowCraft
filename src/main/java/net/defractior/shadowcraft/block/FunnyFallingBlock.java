package net.defractior.shadowcraft.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class FunnyFallingBlock extends FallingBlock {
    public static final MapCodec<FunnyFallingBlock> CODEC = simpleCodec(FunnyFallingBlock::new);

    public FunnyFallingBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
}
