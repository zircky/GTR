package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.GTValues.HV;
import static com.gregtechceu.gtceu.api.GTValues.MV;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.RADIOACTIVE;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRSuperconductor {
  public static void register() {
    ManganesePhosphideBase = Builder("manganese_phosphide_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1368))
        .color(0xE1B454).secondaryColor(0x223033).iconSet(METALLIC)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .components(Manganese, 1, Phosphorus, 1)
        .cableProperties(GTValues.V[GTValues.LV], 1, 2, true, 78)
        .blastTemp(1200, BlastProperty.GasTier.LOW)
        .buildAndRegister();

    MagnesiumDiborideBase = Builder("magnesium_diboride_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1103))
        .color(0x603c1a).secondaryColor(0x423e39).iconSet(METALLIC)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .components(Magnesium, 1, Boron, 2)
        .cableProperties(GTValues.V[GTValues.MV], 1, 2, true, 78)
        .blastTemp(2500, BlastProperty.GasTier.LOW, GTValues.VA[HV], 1000)
        .buildAndRegister();

    MercuryBariumCalciumCuprateBase = Builder("mercury_barium_calcium_cuprate_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1075))
        .color(0x777777).secondaryColor(0x3f2e2e).iconSet(SHINY)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .components(Mercury, 1, Barium, 2, Calcium, 2, Copper, 3, Oxygen, 8)
        .cableProperties(GTValues.V[GTValues.HV], 2, 8, true, 78)
        .blastTemp(3300, BlastProperty.GasTier.LOW, GTValues.VA[HV], 1500)
        .buildAndRegister();

    UraniumTriplatinumBase = Builder("uranium_triplatinum_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1882))
        .color(0x457045).secondaryColor(0x66ff00).iconSet(RADIOACTIVE)
        .flags(DECOMPOSITION_BY_CENTRIFUGING)
        .components(Uranium238, 1, Platinum, 3)
        .cableProperties(GTValues.V[GTValues.EV], 3, 16, true, 30)
        .blastTemp(4400, BlastProperty.GasTier.MID, GTValues.VA[GTValues.EV], 1000)
        .buildAndRegister()
        .setFormula("UPt3", true);

    SamariumIronArsenicOxideBase = Builder("samarium_iron_arsenic_oxide_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1347))
        .color(0x850e85).secondaryColor(0x332f33).iconSet(SHINY)
        .flags(DECOMPOSITION_BY_CENTRIFUGING)
        .components(Samarium, 1, Iron, 1, Arsenic, 1, Oxygen, 1)
        .cableProperties(GTValues.V[GTValues.IV], 4, 64, true, 30)
        .blastTemp(5200, BlastProperty.GasTier.MID, GTValues.VA[GTValues.EV], 1500)
        .buildAndRegister();

    IndiumTinBariumTitaniumCuprateBase = Builder("indium_tin_barium_titanium_cuprate_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1012))
        .color(0x686760).secondaryColor(0x673300).iconSet(METALLIC)
        .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FINE_WIRE)
        .components(Indium, 4, Tin, 2, Barium, 2, Titanium, 1, Copper, 7, Oxygen, 14)
        .cableProperties(GTValues.V[GTValues.LuV], 6, 256, true, 5)
        .blastTemp(6000, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV], 1000)
        .buildAndRegister();

    UraniumRhodiumDinaquadideBase = Builder("uranium_rhodium_dinaquadide_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(3410))
        .color(0x232020).secondaryColor(0xff009c).iconSet(RADIOACTIVE)
        .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
        .components(Uranium238, 1, Rhodium, 1, Naquadah, 2)
        .cableProperties(GTValues.V[GTValues.ZPM], 8, 1024, true, 5)
        .blastTemp(9000, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV], 1500)
        .buildAndRegister()
        .setFormula("URhNq2", true);

    EnrichedNaquadahTriniumEuropiumDuranideBase = Builder("enriched_naquadah_trinium_europium_duranide_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(5930))
        .color(0xc5c1a4).secondaryColor(0x2b0645).iconSet(METALLIC)
        .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
        .components(NaquadahEnriched, 4, Trinium, 3, Europium, 2, Duranium, 1)
        .cableProperties(GTValues.V[GTValues.UV], 12, 4096, true, 3)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.LuV], 1000)
        .buildAndRegister();

    RutheniumTriniumAmericiumNeutronateBase = Builder("ruthenium_trinium_americium_neutronate_base")
        .ingot()
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(23691))
        .color(0x897b76).secondaryColor(0x00c0ff).iconSet(RADIOACTIVE)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .components(Ruthenium, 1, Trinium, 2, Americium, 1, Neutronium, 2, Oxygen, 8)
        .cableProperties(GTValues.V[GTValues.UHV], 16, 16384, true, 3)
        .blastTemp(10800, BlastProperty.GasTier.HIGHER)
        .buildAndRegister();

  }
}
