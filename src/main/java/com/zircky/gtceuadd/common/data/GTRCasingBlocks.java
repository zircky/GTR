package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraft.world.level.block.Block;

import static com.gregtechceu.gtceu.common.data.GTBlocks.createCasingBlock;

@SuppressWarnings("unused")
public class GTRCasingBlocks {

  public static BlockEntry<CoilBlock> COIL_INFINITY;

  public static final BlockEntry<Block> CompAssLine_Casing_LV = createCasingBlock("compassline_casing_lv", GTCEuAdd.id("block/casings/solid/compassline_casing_lv"));
  public static final BlockEntry<Block> CompAssLine_Casing_MV = createCasingBlock("compassline_casing_mv", GTCEuAdd.id("block/casings/solid/compassline_casing_mv"));
  public static final BlockEntry<Block> CompAssLine_Casing_HV = createCasingBlock("compassline_casing_hv", GTCEuAdd.id("block/casings/solid/compassline_casing_hv"));
  public static final BlockEntry<Block> CompAssLine_Casing_EV = createCasingBlock("compassline_casing_ev", GTCEuAdd.id("block/casings/solid/compassline_casing_ev"));
  public static final BlockEntry<Block> CompAssLine_Casing_IV = createCasingBlock("compassline_casing_iv", GTCEuAdd.id("block/casings/solid/compassline_casing_iv"));
  public static final BlockEntry<Block> CompAssLine_Casing_LuV = createCasingBlock("compassline_casing_luv", GTCEuAdd.id("block/casings/solid/compassline_casing_luv"));
  public static final BlockEntry<Block> CompAssLine_Casing_ZPM = createCasingBlock("compassline_casing_zpm", GTCEuAdd.id("block/casings/solid/compassline_casing_zpm"));
  public static final BlockEntry<Block> CompAssLine_Casing_UV = createCasingBlock("compassline_casing_uv", GTCEuAdd.id("block/casings/solid/compassline_casing_uv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UHV = createCasingBlock("compassline_casing_uhv", GTCEuAdd.id("block/casings/solid/compassline_casing_uhv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UEV = createCasingBlock("compassline_casing_uev", GTCEuAdd.id("block/casings/solid/compassline_casing_uev"));
  public static final BlockEntry<Block> CompAssLine_Casing_UIV = createCasingBlock("compassline_casing_uiv", GTCEuAdd.id("block/casings/solid/compassline_casing_uiv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UXV = createCasingBlock("compassline_casing_uxv", GTCEuAdd.id("block/casings/solid/compassline_casing_uxv"));
  public static final BlockEntry<Block> CompAssLine_Casing_OpV = createCasingBlock("compassline_casing_opv", GTCEuAdd.id("block/casings/solid/compassline_casing_opv"));
  public static final BlockEntry<Block> CompAssLine_Casing_MAX = createCasingBlock("compassline_casing_max", GTCEuAdd.id("block/casings/solid/compassline_casing_max"));
  public static final BlockEntry<Block> IridiumPlatedMachineCasing = createCasingBlock("iridium_plated_machine_casing", GTCEuAdd.id("block/casings/solid/iridium_plated_machine_casing"));
  public static final BlockEntry<Block> SCTurbine = createCasingBlock("sc_turbine", GTCEuAdd.id("block/casings/solid/sc_turbine"));
  public static final BlockEntry<Block> ReinforcedSCTurbine = createCasingBlock("reinforced_sc_turbine", GTCEuAdd.id("block/casings/solid/reinforced_sc_turbine"));
  public static final BlockEntry<Block> TurbineShaft = createCasingBlock("turbine_shaft", GTCEuAdd.id("block/casings/solid/turbine_shaft"));


  public static void init() {
  }
}
