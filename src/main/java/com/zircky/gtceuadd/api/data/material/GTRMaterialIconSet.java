package com.zircky.gtceuadd.api.data.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.DULL;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;

public class GTRMaterialIconSet {
  public static final MaterialIconSet InfinityIcon = new MaterialIconSet("infinity", SHINY);
  public static final MaterialIconSet LIVINGROCK = new MaterialIconSet("livingrock", SHINY);
  public static final MaterialIconSet LIVINGWOOD = new MaterialIconSet("livingwood", SHINY);
  public static final MaterialIconSet DREAMWOOD = new MaterialIconSet("dreamwood", SHINY);

  public static final MaterialIconSet DynamicInfinityIcon = new MaterialIconSet("dynamic_infinity", SHINY);
  public static final MaterialIconSet EternityIcon = new MaterialIconSet("eternity", SHINY);
  public static final MaterialIconSet WhiteDwarfMatterIcon = new MaterialIconSet("white_dwarf_matter", SHINY);
  public static final MaterialIconSet MagnetohydrodynamicallyConstrainedStarMatterIcon = new MaterialIconSet("magnetohydrodynamically_constrained_star_matter", DULL);
}
