package com.zircky.gtceuadd.api.registries;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GTCEuAdd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class GTRRegistries {
  public static final GTRegistrate REGISTRATE = GTRegistrate.create(GTCEuAdd.MOD_ID);
  public static MaterialRegistry MATERIAL_REGISTRY;


  @SubscribeEvent
  public void registerMaterialRegistryEvent(MaterialRegistryEvent event) {
    MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(GTCEuAdd.MOD_ID);
  }

  @SubscribeEvent
  public void registerMaterials(MaterialEvent event) {
    GTRMaterials.init();
  }

  public GTRRegistries(){}
}
