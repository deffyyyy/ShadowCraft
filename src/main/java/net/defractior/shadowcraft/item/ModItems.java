package net.defractior.shadowcraft.item;

import net.defractior.shadowcraft.ShadowCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.defractior.shadowcraft.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShadowCraft.MODID);

    public static final DeferredItem<BlockItem> DARKSTONE = registerBlockItem(ModBlocks.DARKSTONE);
    public static final DeferredItem<BlockItem> COBBLED_DARKSTONE = registerBlockItem(ModBlocks.COBBLED_DARKSTONE);
    public static final DeferredItem<BlockItem> POLISHED_DARKSTONE = registerBlockItem(ModBlocks.POLISHED_DARKSTONE);
    public static final DeferredItem<BlockItem> CHISELED_DARKSTONE = registerBlockItem(ModBlocks.CHISELED_DARKSTONE);
    public static final DeferredItem<BlockItem> DARK_LIMESTONE = registerBlockItem(ModBlocks.DARK_LIMESTONE);
    public static final DeferredItem<BlockItem> MARBLE = registerBlockItem(ModBlocks.MARBLE);

    public static final DeferredItem<BlockItem> DARK_DRIPSTONE_BLOCK = registerBlockItem(ModBlocks.DARK_DRIPSTONE_BLOCK);

    public static final DeferredItem<BlockItem> FORGOTTEN_CORAL_BLOCK = registerBlockItem(ModBlocks.FORGOTTEN_CORAL_BLOCK);
    public static final DeferredItem<BlockItem> ROCKY_FORGOTTEN_CORAL_BLOCK = registerBlockItem(ModBlocks.ROCKY_FORGOTTEN_CORAL_BLOCK);

    public static final DeferredItem<BlockItem> ASH = registerBlockItem(ModBlocks.ASH);
    public static final DeferredItem<BlockItem> GREY_SAND = registerBlockItem(ModBlocks.GREY_SAND);
    public static final DeferredItem<BlockItem> WET_GREY_SAND = registerBlockItem(ModBlocks.WET_GREY_SAND);

    public static final DeferredItem<BlockItem> ONYX_BLOCK = registerBlockItem(ModBlocks.ONYX_BLOCK);

    public static final DeferredItem<BlockItem> RED_LEAVES = registerBlockItem(ModBlocks.RED_LEAVES);

    public static final DeferredItem<BlockItem> DARKWOOD_LOG = registerBlockItem(ModBlocks.DARKWOOD_LOG);
    public static final DeferredItem<BlockItem> DARKWOOD_WOOD = registerBlockItem(ModBlocks.DARKWOOD_WOOD);
    public static final DeferredItem<BlockItem> STRIPPED_DARKWOOD_LOG = registerBlockItem(ModBlocks.STRIPPED_DARKWOOD_LOG);
    public static final DeferredItem<BlockItem> STRIPPED_DARKWOOD_WOOD = registerBlockItem(ModBlocks.STRIPPED_DARKWOOD_WOOD);
    public static final DeferredItem<BlockItem> DARKWOOD_PLANKS = registerBlockItem(ModBlocks.DARKWOOD_PLANKS);

    public static final DeferredItem<BlockItem> ASHWOOD_LOG = registerBlockItem(ModBlocks.ASHWOOD_LOG);
    public static final DeferredItem<BlockItem> ASHWOOD_WOOD = registerBlockItem(ModBlocks.ASHWOOD_WOOD);
    public static final DeferredItem<BlockItem> STRIPPED_ASHWOOD_LOG = registerBlockItem(ModBlocks.STRIPPED_ASHWOOD_LOG);
    public static final DeferredItem<BlockItem> STRIPPED_ASHWOOD_WOOD = registerBlockItem(ModBlocks.STRIPPED_ASHWOOD_WOOD);
    public static final DeferredItem<BlockItem> ASHWOOD_PLANKS = registerBlockItem(ModBlocks.ASHWOOD_PLANKS);

    private static DeferredItem<BlockItem> registerBlockItem(DeferredBlock<Block> block) {
        return ITEMS.registerSimpleBlockItem(block.getId().getPath(), block);
    }

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}