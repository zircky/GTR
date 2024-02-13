package com.zircky.gtceuadd.api.data.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_PLATE;

public class GTRMateralFlags {
  public static final MaterialFlag GENERATE_PLATE_TRIPLE = new MaterialFlag.Builder("generate_plate_triple")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
}
