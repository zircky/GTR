package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;

public class GTRMaterialBase {
  public static Material.Builder Builder(String id){
    return new Material.Builder(GTCEu.id(id));
  }
}
