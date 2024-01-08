package com.zircky.gtceuadd.fabric;

import com.zircky.gtceuadd.GTCEuAdd;
import net.fabricmc.api.ModInitializer;

public class GTCEuAddFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GTCEuAdd.init();
    }
}