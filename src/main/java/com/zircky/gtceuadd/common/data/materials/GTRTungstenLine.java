package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import static com.zircky.gtceuadd.common.data.GTRMaterials.DustBuilder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.TungstenTrioxide;

public class GTRTungstenLine {
  public static void register(){
    TungstenTrioxide = DustBuilder("tungsten_trioxide", 0xffffff, 0xffffff, MaterialIconSet.SHINY);
  }
}
