package net.defractior.shadowcraft.block;

import net.defractior.shadowcraft.ShadowCraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ShadowCraft.MODID);

    public static final DeferredBlock<Block> DARKSTONE = registerBlock("darkstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));
    public static final DeferredBlock<Block> COBBLED_DARKSTONE = registerBlock("cobbled_darkstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE));
    public static final DeferredBlock<Block> POLISHED_DARKSTONE = registerBlock("polished_darkstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));
    public static final DeferredBlock<Block> CHISELED_DARKSTONE = registerBlock("chiseled_darkstone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));
    public static final DeferredBlock<Block> DARK_LIMESTONE = registerBlock("dark_limestone",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));
    public static final DeferredBlock<Block> MARBLE = registerBlock("marble",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));

    public static final DeferredBlock<Block> DARK_DRIPSTONE_BLOCK = registerBlock("dark_dripstone_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK));

    public static final DeferredBlock<Block> FORGOTTEN_CORAL_BLOCK = registerBlock("forgotten_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK));
    public static final DeferredBlock<Block> ROCKY_FORGOTTEN_CORAL_BLOCK = registerBlock("rocky_forgotten_coral_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK));

    public static final DeferredBlock<Block> ASH = registerBlock("ash",
            props -> new FunnyFallingBlock(props),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).strength(0.4F));
    public static final DeferredBlock<Block> GREY_SAND = registerBlock("grey_sand",
            props -> new GreySandBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.SAND));
    public static final DeferredBlock<Block> WET_GREY_SAND = registerBlock("wet_grey_sand",
            props -> new FunnyFallingBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.SAND));

    public static final DeferredBlock<Block> ONYX_BLOCK = registerBlock("onyx_block",
            BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK));

    public static final DeferredBlock<Block> RED_LEAVES = registerBlock("red_leaves",
            props -> new LeavesBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<Block> DARKWOOD_LOG = registerBlock("darkwood_log",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final DeferredBlock<Block> DARKWOOD_WOOD = registerBlock("darkwood_wood",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<Block> STRIPPED_DARKWOOD_LOG = registerBlock("stripped_darkwood_log",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final DeferredBlock<Block> STRIPPED_DARKWOOD_WOOD = registerBlock("stripped_darkwood_wood",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<Block> DARKWOOD_PLANKS = registerBlock("darkwood_planks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<Block> ASHWOOD_LOG = registerBlock("ashwood_log",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final DeferredBlock<Block> ASHWOOD_WOOD = registerBlock("ashwood_wood",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<Block> STRIPPED_ASHWOOD_LOG = registerBlock("stripped_ashwood_log",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final DeferredBlock<Block> STRIPPED_ASHWOOD_WOOD = registerBlock("stripped_ashwood_wood",
            props -> new RotatedPillarBlock(props), BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<Block> ASHWOOD_PLANKS = registerBlock("ashwood_planks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    private static DeferredBlock<Block> registerBlock(String name, BlockBehaviour.Properties properties) {
        return registerBlock(name, Block::new, properties);
    }

    private static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> factory.apply(properties));
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}