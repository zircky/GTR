package com.zircky.gtceuadd.common.block;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.block.ICompAssLineCasingType;
import com.zircky.gtceuadd.api.block.ITier;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.Map;

import static com.zircky.gtceuadd.common.block.BlockTier.*;
import static com.zircky.gtceuadd.common.data.GTRCasingBlocks.*;

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
  Compassline_Casing_MAX(TIER13, "Compassline_Casing_MAX", GTCEuAdd.id("block/casings/solid/compassline_casing_max"));

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

  @Getter
  private enum CompAssLineCasingEntry {
    Compassline_Casing_LV(TIER0.tier(), CompAssLine_Casing_LV),
    Compassline_Casing_MV(TIER1.tier(), CompAssLine_Casing_MV),
    Compassline_Casing_HV(TIER2.tier(), CompAssLine_Casing_HV),
    Compassline_Casing_EV(TIER3.tier(), CompAssLine_Casing_EV),
    Compassline_Casing_IV(TIER4.tier(), CompAssLine_Casing_IV),
    Compassline_Casing_LuV(TIER5.tier(), CompAssLine_Casing_LuV),
    Compassline_Casing_ZPM(TIER6.tier(), CompAssLine_Casing_ZPM),
    Compassline_Casing_UV(TIER7.tier(), CompAssLine_Casing_UV),
    Compassline_Casing_UHV(TIER8.tier(), CompAssLine_Casing_UHV),
    Compassline_Casing_UEV(TIER9.tier(), CompAssLine_Casing_UEV),
    Compassline_Casing_UIV(TIER10.tier(), CompAssLine_Casing_UIV),
    Compassline_Casing_UXV(TIER11.tier(), CompAssLine_Casing_UXV),
    Compassline_Casing_OpV(TIER12.tier(), CompAssLine_Casing_OpV),
    Compassline_Casing_MAX(TIER13.tier(), CompAssLine_Casing_MAX);


    private final int tier;
    private final BlockEntry<Block> compAssLineCasing;

    CompAssLineCasingEntry(int tier, BlockEntry<Block> compAssLine) {
      this.tier = tier;
      this.compAssLineCasing = compAssLine;
    }
  }

  public static CompAssLineCasing getByTier(int tier) {
    return CompAssLine.All_CompasslineCasings_Tier.get(tier);
  }

  @Nullable
  public static CompAssLineCasing getByName(@Nullable String name) {
    return CompAssLine.All_Compassline_Casings.get(name);
  }

  public static CompAssLineCasing getByNameOrDefault(@Nullable String name) {
    var type = getByName(name);
    if (type == null) {
      return Compassline_Casing_LV;
    }
    return type;
  }

  public ICompAssLineCasingType compAssLineCasingType() {
    return this;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getTier() {
    return tier.tier();
  }

  @Override
  public BlockEntry<Block> getCompAssLineCasing(int tier) {
    return CompAssLineCasingEntry.values()[tier].getCompAssLineCasing();
  }

  @Override
  public ResourceLocation getResourceLocation() {
    return resourceLocation;
  }
}

