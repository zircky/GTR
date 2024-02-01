package com.zircky.gtceuadd.common.data.materials;

import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRTungstenLine {
  public static void register(){
    TungstenTrioxide = Builder("tungsten_trioxide")
        .dust()
        .secondaryColor(0xffffff)
        .buildAndRegister();
  }
}
