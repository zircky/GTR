package com.zircky.gtceuadd.api.data.chemical.info.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_PLATE;

public class GTRMateralFlags {
  public static final MaterialFlag GENERATE_SINGULARITY = new MaterialFlag.Builder("generate_singularity").build();
  public static final MaterialFlag GENERATE_NANITE = new MaterialFlag.Builder("generate_nanite").build();

  public static final MaterialFlag GENERATE_TRIPLE = new MaterialFlag.Builder("generate_triple")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_QUADRUPLE = new MaterialFlag.Builder("generate_quadruple")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_QUINTULE = new MaterialFlag.Builder("generate_quintuple")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_SUPERDENSE = new MaterialFlag.Builder("generate_superdense")
      .requireFlags(GENERATE_TRIPLE)
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_BLOCK_ONE = new MaterialFlag.Builder("generate_bolck_one")
      .build();

  public static final MaterialFlag GENERATE_BLOCK_TWO = new MaterialFlag.Builder("generate_block_two").build();

  public static final MaterialFlag GENERATE_BLOCK_THREE = new MaterialFlag.Builder("generate_block_three").build();

  public static final MaterialFlag GENERATE_BLOCK_FOUR = new MaterialFlag.Builder("generate_block_four").build();

  public static final MaterialFlag GENERATE_BLOCK_FIVE = new MaterialFlag.Builder("generate_block_five").build();

  public static final MaterialFlag GENERATE_BLOCK_SIX = new MaterialFlag.Builder("generate_block_six").build();

  public static final MaterialFlag GENERATE_BLOCK_SEVEN = new MaterialFlag.Builder("generate_block_seven").build();

  public static final MaterialFlag GENERATE_BLOCK_EIGHT = new MaterialFlag.Builder("generate_block_eight").build();

  public static final MaterialFlag GENERATE_BLOCK_NINE = new MaterialFlag.Builder("generate_block_nine").build();

}
