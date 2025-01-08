package com.zircky.gtceuadd.api.data.chemical.info.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_PLATE;

public class GTRMateralFlags {
  public static final MaterialFlag GENERATE_SINGULARITY = new MaterialFlag.Builder("generate_singularity").build();
  public static final MaterialFlag GENERATE_NANITE = new MaterialFlag.Builder("generate_nanite").build();
  public static final MaterialFlag GENERATE_SUPERDENSE = new MaterialFlag.Builder("generate_superdense").build();


  public static final MaterialFlag GENERATE_TRIPLE = new MaterialFlag.Builder("generate_triple")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();

public static final MaterialFlag GENERATE_QUADRUPLE = new MaterialFlag.Builder("generate_quadruple")
      .requireFlags(GENERATE_PLATE, GENERATE_TRIPLE)
      .requireProps(PropertyKey.INGOT)
      .build();

public static final MaterialFlag GENERATE_QUINTULE = new MaterialFlag.Builder("generate_quintuple")
      .requireFlags(GENERATE_PLATE, GENERATE_QUADRUPLE)
      .requireProps(PropertyKey.INGOT)
      .build();

}
