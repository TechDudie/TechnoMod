package com.technodot.technomod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TechnoMod.MOD_ID)
public class TechnoMod {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "technomod";

    public TechnoMod() {
        //Register the ITEMS and BLOCKS deferred register to the mod event bus.
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
