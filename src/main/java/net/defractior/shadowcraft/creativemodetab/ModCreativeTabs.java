package net.defractior.shadowcraft.creativemodetab;

import net.defractior.shadowcraft.ShadowCraft;
import net.defractior.shadowcraft.block.ModBlocks;
import net.defractior.shadowcraft.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShadowCraft.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SHADOWCRAFT_TAB = CREATIVE_MODE_TABS.register("shadowcraft_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.shadowcraft"))
                    .icon(() -> ModBlocks.FORGOTTEN_CORAL_BLOCK.get().asItem().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ASH.get());
                        output.accept(ModItems.DARKSTONE.get());
                        output.accept(ModItems.COBBLED_DARKSTONE.get());
                        output.accept(ModItems.POLISHED_DARKSTONE.get());
                        output.accept(ModItems.CHISELED_DARKSTONE.get());
                        output.accept(ModItems.DARK_LIMESTONE.get());
                        output.accept(ModItems.MARBLE.get());
                        output.accept(ModItems.DARK_DRIPSTONE_BLOCK.get());
                        output.accept(ModItems.FORGOTTEN_CORAL_BLOCK.get());
                        output.accept(ModItems.ROCKY_FORGOTTEN_CORAL_BLOCK.get());
                        output.accept(ModItems.GREY_SAND.get());
                        output.accept(ModItems.WET_GREY_SAND.get());
                        output.accept(ModItems.ONYX_BLOCK.get());
                        output.accept(ModItems.RED_LEAVES.get());
                        output.accept(ModItems.DARKWOOD_LOG.get());
                        output.accept(ModItems.DARKWOOD_WOOD.get());
                        output.accept(ModItems.STRIPPED_DARKWOOD_LOG.get());
                        output.accept(ModItems.STRIPPED_DARKWOOD_WOOD.get());
                        output.accept(ModItems.DARKWOOD_PLANKS.get());
                        output.accept(ModItems.ASHWOOD_LOG.get());
                        output.accept(ModItems.ASHWOOD_WOOD.get());
                        output.accept(ModItems.STRIPPED_ASHWOOD_LOG.get());
                        output.accept(ModItems.STRIPPED_ASHWOOD_WOOD.get());
                        output.accept(ModItems.ASHWOOD_PLANKS.get());
                    }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}