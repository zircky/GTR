package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;

import static com.gregtechceu.gtceu.api.GTValues.MAX;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

public class GTRCustomMaterial {

  public static final void register() {
    Infinity = Builder("infinity")
        .ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(35200).customStill()).ore().dust()
        .appendFlags(SNDART_FLAGS, DECOMPOSITION_BY_ELECTROLYZING)
        .color(0xFFFFFF).iconSet(InfinityIcon)
        .fluidPipeProperties(10000000, 200000, true)
        .blastTemp(10800, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UHV], 54562)
        .cableProperties(GTValues.V[MAX], 8192, 0, true, 30)
        .rotorStats(158000, 256, 21.0f,262144000 )
        .toolStats(toolStats(256.0f, 21.0f, 262144000, 17, 20, GTToolType.MORTAR))
        .buildAndRegister();

    InfinityCatalyst = Builder("infinity_catalyst")
        .ingot().dust().ore()
        .color(0xE5E2E1).iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.IF)
        .blastTemp(10800, BlastProperty.GasTier.MID, GTValues.VA[GTValues.UV], 26190)
        .rotorStats(15000, 64, 14.0f,131072000)
        .toolStats(ToolProperty.Builder.of(64.0f, 14.0f, 131072000, 10).enchantability(20).addTypes(GTToolType.MORTAR).build())
        .buildAndRegister();

    CosmicNeutronium = Builder("cosmic_neutronium")
        .ingot().fluid().ore().dust()
        .color(0x11111b).iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.SpNt)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 21825)
        .rotorStats( 10000,96, 16.0f,16384000)
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
        .appendFlags(SNDART_FLAGS, GENERATE_SINGULARITY)
        .cableProperties(GTValues.V[GTValues.UEV], 8, 4)
        .buildAndRegister()
        .setFormula("D", true);

    AwakenedDraconium = Builder("awakened_draconium")
        .ingot().dust()
        .color(0xF44E00).secondaryColor(0xD84F13)
        .appendFlags(SNDART_FLAGS, GENERATE_SINGULARITY)
        .fluidPipeProperties(10000000, 150000, true)
        .cableProperties(GTValues.V[GTValues.UIV], 8192, 32, true, 3)
        .buildAndRegister()
        .setFormula("D*", true);

    ChaoticDraconium = Builder("chaotic_draconium")
        .ingot().dust().fluid()
        .color(0x030302).secondaryColor(0x0F110E).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS, GENERATE_SINGULARITY)
        .cableProperties(GTValues.V[GTValues.UXV], 32768, 16, true, 3)
        .buildAndRegister()
        .setFormula("CD*", true);

    DynamicInfinity = Builder("dynamic_infinity")
        .ingot().dust().color(0x3B3C36)
        .iconSet(DynamicInfinityIcon)
        .appendFlags(SNDART_FLAGS)
        .cableProperties(GTValues.V[MAX], 2097152, 0, true, 5)
        .buildAndRegister()
        .setFormula("*DI*", true);

    WhiteDwarfMatter = IngotBuilder("white_dwarf_matter", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, WhiteDwarfMatterIcon, "");
    Eternity = IngotBuilder("eternity", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, EternityIcon, "");
//    SupercriticalSteam = FluidBuilder("sc_steam", 0x1C1C1C, 0x1C1C1C, FluidStorageKeys.LIQUID, new FluidBuilder().temperature(650), SHINY);
    MagnetohydrodynamicallyConstrainedStarMatter = IngotBuilder("magnetohydrodynamically_constrained_star_matter", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, MagnetohydrodynamicallyConstrainedStarMatterIcon, FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1870).customStill(), "");
    MonolithAlloy = IngotBuilder("monolith_alloy", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC, "");

    SkySteel = IngotBuilder("sky_steel", 0x000000, 0xFFFFFF, SNDART_FLAGS, METALLIC, "SkFe");



  }
}
