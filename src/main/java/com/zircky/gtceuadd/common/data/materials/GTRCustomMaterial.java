package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTElements;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FINE_WIRE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SAND;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

public class GTRCustomMaterial {
  public static final MaterialIconSet InfinityIcon = new MaterialIconSet("infinity", SHINY);
  public static final void register() {

    Infinity = Builder("infinity")
        .ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(35200)).ore().dust()
        .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_ROTOR, GENERATE_FOIL, GENERATE_DENSE, GENERATE_SPRING_SMALL)
        .color(0xFFFFFF).iconSet(InfinityIcon)
        .fluidPipeProperties(10000000, 200000, true)
//        .element(GTNNElement.IF2)
        .blastTemp(10800, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UHV], 54562)
        .cableProperties(GTValues.V[GTValues.MAX], 8192, 0, true, 30)
        .buildAndRegister();

    InfinityCatalyst = Builder("infinity_catalyst")
        .ingot().dust().ore()
        .color(0xE5E2E1).iconSet(SAND)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.IF)
        .blastTemp(10800, BlastProperty.GasTier.MID, GTValues.VA[GTValues.UV], 26190)
        .buildAndRegister();

    CosmicNeutronium = Builder("cosmic_neutronium")
        .ingot().fluid().ore().dust()
        .color(0x11111b).iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.SpNt)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 21825)
        .buildAndRegister();

    Bedrockium = Builder("bedrockium")
        .ingot().fluid().dust()
        .color(0x11111b).iconSet(SAND)
        .itemPipeProperties(512, 64)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.SpNt)
        .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 17460)
        .buildAndRegister();

    Draconium = Builder("draconium")
        .ingot().dust()
        .color(0x7A44B0).secondaryColor(0x7851A9)
        .appendFlags(SNDART_FLAGS)
        .cableProperties(GTValues.V[GTValues.UEV], 8, 4)
        .buildAndRegister()
        .setFormula("D", true);

    AwakenedDraconium = Builder("awakened_draconium")
        .ingot().dust()
        .color(0xF44E00).secondaryColor(0xD84F13)
        .appendFlags(SNDART_FLAGS)
        .fluidPipeProperties(10000000, 150000, true)
        .cableProperties(GTValues.V[GTValues.MAX], 1, 16, true, 3)
        .buildAndRegister()
        .setFormula("D*", true);

  }
}
