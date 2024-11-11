package com.zircky.gtceuadd.api.enums;

import com.zircky.gtceuadd.api.GTRValues;

import static com.gregtechceu.gtceu.api.GTValues.V;

public class TierEU {
  // Do NOT use these for crafting recipes as they are exactly 1A! Use RECIPE_ULV etc.
  public static final long ULV = V[VoltageIndex.ULV];
  public static final long LV = V[VoltageIndex.LV];
  public static final long MV = V[VoltageIndex.MV];
  public static final long HV = V[VoltageIndex.HV];
  public static final long EV = V[VoltageIndex.EV];
  public static final long IV = V[VoltageIndex.IV];
  public static final long LuV = V[VoltageIndex.LuV];
  public static final long ZPM = V[VoltageIndex.ZPM];
  public static final long UV = V[VoltageIndex.UV];
  public static final long UHV = V[VoltageIndex.UHV];
  public static final long UEV = V[VoltageIndex.UEV];
  public static final long UIV = V[VoltageIndex.UIV];
  public static final long UXV = V[VoltageIndex.UXV];
  public static final long OpV = V[VoltageIndex.OpV];
  public static final long MAX = V[VoltageIndex.MAX];

  // Use me for recipes.
  public static final long RECIPE_ULV = GTRValues.VP[VoltageIndex.ULV];
  public static final long RECIPE_LV = GTRValues.VP[VoltageIndex.LV];
  public static final long RECIPE_MV = GTRValues.VP[VoltageIndex.MV];
  public static final long RECIPE_HV = GTRValues.VP[VoltageIndex.HV];
  public static final long RECIPE_EV = GTRValues.VP[VoltageIndex.EV];
  public static final long RECIPE_IV = GTRValues.VP[VoltageIndex.IV];
  public static final long RECIPE_LuV = GTRValues.VP[VoltageIndex.LuV];
  public static final long RECIPE_ZPM = GTRValues.VP[VoltageIndex.ZPM];
  public static final long RECIPE_UV = GTRValues.VP[VoltageIndex.UV];
  public static final long RECIPE_UHV = GTRValues.VP[VoltageIndex.UHV];
  public static final long RECIPE_UEV = GTRValues.VP[VoltageIndex.UEV];
  public static final long RECIPE_UIV = GTRValues.VP[VoltageIndex.UIV];
  public static final long RECIPE_UXV = GTRValues.VP[VoltageIndex.UXV];
  public static final long RECIPE_OpV = GTRValues.VP[VoltageIndex.OpV];
  public static final long RECIPE_MAX = GTRValues.VP[VoltageIndex.MAX];
}
