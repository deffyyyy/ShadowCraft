package net.defractior.shadowcraft;


import net.defractior.shadowcraft.creativemodetab.ModCreativeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.defractior.shadowcraft.item.ModItems;
import net.defractior.shadowcraft.block.ModBlocks;


@Mod(ShadowCraft.MODID)
public class ShadowCraft {
    public static final String MODID = "shadowcraft";

    public ShadowCraft(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }


    }
