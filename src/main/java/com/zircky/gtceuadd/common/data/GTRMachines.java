package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.zircky.gtceuadd.api.registries.GTRRegistries;

import static com.gregtechceu.gtceu.api.GTValues.*;


public class GTRMachines {
  public final static int[] ALL_TIERS = GTValues.tiersBetween(ULV, GTCEuAPI.isHighTier() ? MAX : UHV);

  public final static MachineDefinition[] SCANNER = registerSimpleMachines("scanner", GTRRecipeTypes.SCANNER_RECIPES);

  public static void init() {

  }
}
