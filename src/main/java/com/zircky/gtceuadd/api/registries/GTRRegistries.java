package com.zircky.gtceuadd.api.registries;

import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GTCEuAdd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class GTRRegistries {
  public static final GTRegistrate REGISTRATE = GTRegistrate.create(GTCEuAdd.MOD_ID);

  public GTRRegistries(){}
}
