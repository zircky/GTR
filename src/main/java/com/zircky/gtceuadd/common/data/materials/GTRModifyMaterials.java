package com.zircky.gtceuadd.common.data.materials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class GTRModifyMaterials {
  public static void init(){
    NaquadahAlloy.addFlags(GENERATE_ROUND);
    Neutronium.addFlags(GENERATE_LONG_ROD, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FINE_WIRE);
  }

}
