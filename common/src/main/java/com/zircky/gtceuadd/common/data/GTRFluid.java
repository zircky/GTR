package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRFluid {
  public static void register() {
    Syngas = new Material.Builder("syngas")
      .fluid(FluidStorageKeys.GAS, new FluidBuilder().temperature(500))
      .color(0xFF484848)
      .buildAndRegister();

    Acrylic_acid = new Material.Builder("acrylic_acid")
      .fluid()
      .color(0xFF919191)
      .buildAndRegister();

    Chloromethane = new Material.Builder("chloromethane")
      .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(290))
      .color(0xFFC8C8C8)
      .buildAndRegister();

    Silicone = new Material.Builder("silicone")
      .fluid()
      .color(0xFF98A6B3)
      .buildAndRegister();


  }
}
