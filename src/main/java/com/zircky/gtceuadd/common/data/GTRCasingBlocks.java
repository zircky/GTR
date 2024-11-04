package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.common.data.blocks.GTRCoilBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;

import java.util.function.Supplier;

import static com.gregtechceu.gtceu.common.data.GTBlocks.createCasingBlock;

@SuppressWarnings("unused")
public class GTRCasingBlocks {

  public static BlockEntry<GTRCoilBlock> COIL_INFINITY;


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
  public static final BlockEntry<Block> RadiantNaquadahAlloyCasing = createCasingBlock("radiant_naquadah_alloy_casing", GTCEuAdd.id("block/casings/solid/radiant_naquadah_alloy_casing"));
  public static final BlockEntry<Block> MiningBlackPlutoniumCasing = createCasingBlock("mining_black_plutonium_casing", GTCEuAdd.id("block/casings/solid/mining_black_plutonium_casing"));
  public static final BlockEntry<Block> ContainmentFieldMachineCasing = createCasingBlock("containment_field_machine_casing", GTCEuAdd.id("block/casings/solid/containment_field_machine_casing"));
  public static final BlockEntry<Block> MiningNeutroniumCasing = createCasingBlock("mining_neutronium_casing", GTCEuAdd.id("block/casings/solid/mining_neutronium_casing"));

  public static final BlockEntry<Block> GLASS_HV = createGlassCasingBlock("glass_hv", GTCEuAdd.id("block/casings/transparent/glass_hv"), () -> RenderType::cutoutMipped);


  public static void init() {
  }

  private static BlockEntry<Block> createGlassCasingBlock(String name, ResourceLocation texture,
                                                          Supplier<Supplier<RenderType>> type) {
    return createCasingBlock(name, GlassBlock::new, texture, () -> Blocks.GLASS, type);
  }
}



