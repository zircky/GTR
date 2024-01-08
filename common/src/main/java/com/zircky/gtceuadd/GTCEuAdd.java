package com.zircky.gtceuadd;

import com.zircky.gtceuadd.api.registries.GTRRegistries;
import com.zircky.gtceuadd.common.data.GTRItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GTCEuAdd {
    public static final String
            MOD_ID = "gtceuadd",
            MOD_NAME = "GTCEuAdd";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        GTRItems.init();

        GTRRegistries.REGISTRATE.registerRegistrate();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
