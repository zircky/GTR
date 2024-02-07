package com.zircky.gtceuadd;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import com.zircky.gtceuadd.common.data.GTRItems;
import com.zircky.gtceuadd.common.data.GTRMachines;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import com.zircky.gtceuadd.common.data.GTRRecipeTypes;
import com.zircky.gtceuadd.data.GTRDatagen;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(GTCEuAdd.MOD_ID)
public class GTCEuAdd {
  public static final String
      MOD_ID = "gtceuadd",
      MOD_NAME = "GTCEuAdd";
  private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
  public static MaterialRegistry MATERIAL_REGISTRY;

  public GTCEuAdd() {
    GTCEuAdd.init();
    var bus = FMLJavaModLoadingContext.get().getModEventBus();
    bus.register(this);

//    bus.addGenericListener(MachineDefinition.class, GTRRegistries::registerMachine);
  }

  public static void init() {
    GTRItems.init();

    GTRDatagen.init();

    GTRRegistries.REGISTRATE.registerRegistrate();
  }

  public static ResourceLocation id(String path) {
    return new ResourceLocation(MOD_ID, FormattingUtil.toLowerCaseUnder(path));
  }

  @SubscribeEvent
  public void registerMaterialRegistryEvent(MaterialRegistryEvent event) {
    MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(GTCEuAdd.MOD_ID);
  }

  @SubscribeEvent
  public void registerMaterials(MaterialEvent event) {
    GTRMaterials.init();
  }

  @SubscribeEvent
  public void modifyMaterials(PostMaterialEvent event) {
    GTRMaterials.modifyMaterials();
  }

  @SubscribeEvent
  public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
    GTRRecipeTypes.init();
  }

  @SubscribeEvent
  public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
    GTRMachines.init();
  }

}
