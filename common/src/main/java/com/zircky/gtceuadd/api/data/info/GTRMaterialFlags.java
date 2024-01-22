package com.zircky.gtceuadd.api.data.info;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class GTRMaterialFlags {
  public static final MaterialFlag GENERATE_PLATE_T2 = new MaterialFlag.Builder("generate_plate_t2") // Double
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_PLATE_T3 = new MaterialFlag.Builder("generate_plate_t3") //Triple
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_PLATE_T4 = new MaterialFlag.Builder("generate_plate_t4") //Quadruple
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_PLATE_T5 = new MaterialFlag.Builder("generate_plate_t5") //Quintuple
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_PLATE_T9 = new MaterialFlag.Builder("generate_plate_t9") //Dense
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_INGOT_T2 = new MaterialFlag.Builder("generate_ingot_t2") // Double
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_INGOT_T3 = new MaterialFlag.Builder("generate_ingot_t3") //Triple
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_INGOT_T4 = new MaterialFlag.Builder("generate_ingot_t4") //Quadruple
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_INGOT_T5 = new MaterialFlag.Builder("generate_ingot_t5") //Quintuple
      .requireProps(PropertyKey.INGOT)
      .build();
  public static final MaterialFlag GENERATE_INGOT_T9 = new MaterialFlag.Builder("generate_ingot_t9") //Dense
      .requireProps(PropertyKey.INGOT)
      .build();


}
