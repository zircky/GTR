package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class MaterialsUEVPlus {
  public static void register() {
    ProtoHalkoniteBase = Builder("protohalkonitebase")
        .fluid(FluidStorageKeys.MOLTEN, new FluidBuilder().temperature(10000).customStill())
        .color(0xFFFFFF)
        .buildAndRegister();

    HotProtoHalkonite = Builder("hotprotohalkonite")
        .ingot()
        .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR)
        .color(0xFFFFFF)
        .iconSet(HotProtoHalkoniteIcon)
        .buildAndRegister();

    ProtoHalkonite = Builder("protohalkonite")
        .ingot()
        .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR)
        .color(0xFFFFFF)
        .iconSet(ProtoHalkoniteIcon)
        .buildAndRegister();

    HotExoHalkonite = Builder("hotexohalkonite")
        .ingot()
        .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR)
        .color(0xFFFFFF)
        .iconSet(HotExoHalkoniteIcon)
        .buildAndRegister();

    ExoHalkonite = Builder("exohalkonite")
        .ingot()
        .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_FRAME, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR)
        .color(0xFFFFFF)
        .iconSet(ExoHalkoniteIcon)
        .buildAndRegister();


  }

}
