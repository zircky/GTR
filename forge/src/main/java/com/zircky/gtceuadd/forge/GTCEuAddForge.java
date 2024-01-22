package com.zircky.gtceuadd.forge;

import dev.architectury.platform.forge.EventBuses;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GTCEuAdd.MOD_ID)
public class GTCEuAddForge {
    public GTCEuAddForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(GTCEuAdd.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            GTCEuAdd.init();
    }
}