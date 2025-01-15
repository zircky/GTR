package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags.GENERATE_QUINTULE;

public class GTRMaterialBase {
  public static Material.Builder Builder(String id){
    return new Material.Builder(GTCEu.id(id));
  }
  public static final List<MaterialFlag> SNDART_FLAGS = new ArrayList<>();
  public static final List<MaterialFlag> REF = new ArrayList<>();
  public static final List<MaterialFlag> RSTD_METAL = new ArrayList<>();

  static {
    SNDART_FLAGS.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE, GENERATE_TRIPLE, GENERATE_NANITE, GENERATE_SUPERDENSE, GENERATE_QUADRUPLE, GENERATE_QUINTULE));
    REF.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME));
    RSTD_METAL.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS));
  }
}
