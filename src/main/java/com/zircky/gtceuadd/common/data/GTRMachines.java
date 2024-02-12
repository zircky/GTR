package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;
//import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;


public class GTRMachines {
  public final static int[] ALL_TIERS = GTValues.tiersBetween(ULV, GTCEuAPI.isHighTier() ? MAX : UHV);

  public final static MachineDefinition[] SCANNER = registerSimpleMachines("scanner", GTRRecipeTypes.SCANNER_RECIPES);

/*  public final static MultiblockMachineDefinition NUCLER_REACTOR = GTRRegistries.REGISTRATE.multiblock("nucler_reactor", );


  public static MultiblockMachineDefinition registerNuclerReactor(String name, int tier, GTRecipeType recipeType, Supplier<? extends Block> casing, ResourceLocation casingTexture, ResourceLocation overlayModel) {
    return GTRRegistries.REGISTRATE.multiblock(name, holder -> new )
  }*/

  public static void init() {

  }
}
