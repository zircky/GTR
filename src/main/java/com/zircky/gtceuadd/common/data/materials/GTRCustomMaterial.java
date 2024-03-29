package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SAND;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.zircky.gtceuadd.api.data.material.GTRMaterialIconSet.InfinityIcon;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

public class GTRCustomMaterial {

  public static final void register() {

    Infinity = Builder("infinity")
        .ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(35200)).ore().dust()
        .appendFlags(SNDART_FLAGS, DECOMPOSITION_BY_ELECTROLYZING)
        .color(0xFFFFFF).iconSet(InfinityIcon)
        .fluidPipeProperties(10000000, 200000, true)

        .blastTemp(10800, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UHV], 54562)
        .cableProperties(GTValues.V[GTValues.MAX], 8192, 0, true, 30)
        .rotorStats(256.0f, 21.0f,262144000)
        .toolStats(ToolProperty.Builder.of(256.0f, 21.0f, 262144000, 17).enchantability(20).addTypes(GTToolType.MORTAR).build())
        .buildAndRegister();

    InfinityCatalyst = Builder("infinity_catalyst")
        .ingot().dust().ore()
        .color(0xE5E2E1).iconSet(SAND)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.IF)
        .blastTemp(10800, BlastProperty.GasTier.MID, GTValues.VA[GTValues.UV], 26190)
        .rotorStats(64.0f, 14.0f,131072000)
        .toolStats(ToolProperty.Builder.of(64.0f, 14.0f, 131072000, 10).enchantability(20).addTypes(GTToolType.MORTAR).build())
        .buildAndRegister();

    CosmicNeutronium = Builder("cosmic_neutronium")
        .ingot().fluid().ore().dust()
        .color(0x11111b).iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.SpNt)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 21825)
        .rotorStats(96.0f, 16.0f,16384000)
        .toolStats(ToolProperty.Builder.of(96.0f, 16.0f, 16384000, 12).enchantability(20).addTypes(GTToolType.MORTAR).build())
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
