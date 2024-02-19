package com.zircky.gtceuadd.common.block;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.block.ICompAssLineCasingType;
import com.zircky.gtceuadd.api.block.ITier;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.Map;

import static com.zircky.gtceuadd.common.block.BlockTier.*;

public enum CompAssLineCasing implements ICompAssLineCasingType {

  Compassline_Casing_LV(TIER0, "Compassline_Casing_LV", GTCEuAdd.id("block/casings/solid/compassline_casing_lv")),
  Compassline_Casing_MV(TIER1, "Compassline_Casing_MV", GTCEuAdd.id("block/casings/solid/compassline_casing_mv")),
  Compassline_Casing_HV(TIER2, "Compassline_Casing_HV", GTCEuAdd.id("block/casings/solid/compassline_casing_hv")),
  Compassline_Casing_EV(TIER3, "Compassline_Casing_EV", GTCEuAdd.id("block/casings/solid/compassline_casing_ev")),
  Compassline_Casing_IV(TIER4, "Compassline_Casing_IV", GTCEuAdd.id("block/casings/solid/compassline_casing_iv")),
  Compassline_Casing_LuV(TIER5, "Compassline_Casing_LuV", GTCEuAdd.id("block/casings/solid/compassline_casing_luv")),
  Compassline_Casing_ZPM(TIER6, "Compassline_Casing_ZPM", GTCEuAdd.id("block/casings/solid/compassline_casing_zpm")),
  Compassline_Casing_UV(TIER7, "Compassline_Casing_UV", GTCEuAdd.id("block/casings/solid/compassline_casing_uv")),
  Compassline_Casing_UHV(TIER8, "Compassline_Casing_UHV", GTCEuAdd.id("block/casings/solid/compassline_casing_uhv")),
  Compassline_Casing_UEV(TIER9, "Compassline_Casing_UEV", GTCEuAdd.id("block/casings/solid/compassline_casing_uev")),
  Compassline_Casing_UIV(TIER10, "Compassline_Casing_UIV", GTCEuAdd.id("block/casings/solid/compassline_casing_uiv")),
  Compassline_Casing_UXV(TIER11, "Compassline_Casing_UXV", GTCEuAdd.id("block/casings/solid/compassline_casing_uxv")),
  Compassline_Casing_OpV(TIER12, "Compassline_Casing_OpV", GTCEuAdd.id("block/casings/solid/compassline_casing_opv")),
  Compassline_Casing_MAX(TIER12, "Compassline_Casing_MAX", GTCEuAdd.id("block/casings/solid/compassline_casing_max"));

  static class CompAssLine {
    private static final Map<String, CompAssLineCasing> All_Compassline_Casings = new Object2ObjectOpenHashMap<>();
    private static final Map<Integer, CompAssLineCasing> All_CompasslineCasings_Tier = new Object2ObjectOpenHashMap<>();

  }

  private final ITier tier;
  private final String name;
  private final ResourceLocation resourceLocation;

  CompAssLineCasing(ITier tier, String name, ResourceLocation resourceLocation) {
    this.tier = tier;
    this.name = name;
    this.resourceLocation = resourceLocation;
    CompAssLine.All_Compassline_Casings.put(name, this);
    CompAssLine.All_CompasslineCasings_Tier.put(tier.tier(), this);
  }

  @Override
  public int getTier() {
    return 0;
  }

  @Override
  public BlockEntry<Block> getCompAssLineCasing() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public ResourceLocation getResourceLocation() {
    return null;
  }
}
}
