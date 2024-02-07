package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Oxygen;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRPlatinumLine {
  public static final void register() {
    PlatinumMetallicPowder = Builder("platinum_metallic_powder")
        .dust(1)
        .color(0xF0EC9A)
        .iconSet(MaterialIconSet.BRIGHT)
        .buildAndRegister()
        .setFormula("??PtPdIrOsRhRu??", true);

    PlatinumResidue = Builder("platinum_residue")
        .dust(1)
        .color(0x64601C)
        .buildAndRegister()
        .setFormula("??IrOsRhRu", true);

    PlatinumConcentrate = Builder("platinum_concentrate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
        .buildAndRegister();

    PlatinumSalt = Builder("platinum_salt")
        .dust(1)
        .color(0xF0EC9A).iconSet(MaterialIconSet.DULL)
        .buildAndRegister();

    RefinedPlatlinumSalt = Builder("refined_platinum_salt")
        .dust(1)
        .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
        .buildAndRegister();

    RepercipitatedPlatinum = Builder("repercipitated_platinum")
        .dust(1)
        .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
        .buildAndRegister()
        .setFormula("PtCl", true);

    PalladiumEnrichedAmmonia = Builder("palladium_enriched_ammonia")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x65655E)
        .buildAndRegister()
        .setFormula("?Pd", true);

    PalladiumMetallicPowder = Builder("palladium_metallic_powder")
        .dust(1)
        .color(0x65655E).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??Pd??", true);

    PalladiumSalt = Builder("palladium_salt")
        .dust(1)
        .color(0x65655E).iconSet(METALLIC)
        .buildAndRegister();

    RepercipitatedPalladium = Builder("reprecipitated_palladium")
        .dust(1)
        .color(0x65655E).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Pd2NH4", true);

    FormicAcid = Builder("formic_acid")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xDCA358)
        .buildAndRegister()
        .setFormula("CH2O2", true);

    PotassiumDisulfate = Builder("potassium_disulfate")
        .dust(1).fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xEEA23E)
        .buildAndRegister()
        .setFormula("K2S2O7", true);

    RhodiumSulfateSolution = Builder("diluted_rhodium_sulfate_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xDB973B)
        .buildAndRegister();

    LeachResidue = Builder("leach_residue")
        .dust(1)
        .color(0x543A17)
        .buildAndRegister()
        .setFormula("??IrOsRu??", true);

    CrudeRhodiumMetal = Builder("crude_rhodium_metal")
        .dust(1)
        .color(0xDB973B).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??Rh??", true);

    RhodiumSalt = Builder("rhodium_salt")
        .dust(1)
        .color(0xDB973B).iconSet(SHINY)
        .buildAndRegister();

    RhodiumSaltSolution = Builder("rhodium_salt_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x91AEC4)
        .buildAndRegister();

    ZincSulfate = Builder("zinc_sulfate")
        .dust(1)
        .color(0x7C4D0E).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ZnSO4", true);

    SodiumNitrate = Builder("sodium_nitrate")
        .dust(1)
        .color(0x498EC2)
        .buildAndRegister()
        .setFormula("NaNo3", true);

    RhodiumNitrate = Builder("rhodium_nitrate")
        .dust(1)
        .color(0x614A0F).iconSet(METALLIC)
        .buildAndRegister();

    RhodiumFilterCake = Builder("rhodium_filter_cake")
        .dust(1)
        .color(0x614A0F).iconSet(METALLIC)
        .buildAndRegister();

    RhodiumFilterCakeSolution = Builder("rhodium_filter_cake_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x4C6584)
        .buildAndRegister();

    ReprecipitatedRhodium = Builder("reprecipitated_rhodium")
        .dust(1)
        .color(0xDB973B).iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Rh2NH4", true);

    RarestMetalResidue = Builder("rarest_metal_residue")
        .dust(1)
        .color(0x5C4E35).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("??OsIr??", true);

    SodiumRuthenate = Builder("sodium_ruthenate")
        .dust(1)
        .color(0x3290BD).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na2RuO3", true);

    RutheniumTetroxideSolution = Builder("ruthenium_tetroxide_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x9FAAAF)
        .buildAndRegister()
        .setFormula("???", true);

    HotRutheniumTetroxideSolution = Builder("hot_ruthenium_tetroxide_solution")
        .gas()
        .color(0x9FAAAF)
        .buildAndRegister()
        .setFormula("???", true);

    OsmiumSolution = Builder("osmium_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x7E6642)
        .buildAndRegister()
        .setFormula("???", true);

    SludgeDustResidue = Builder("sludge_dust_residue")
        .dust(1)
        .color(0x775A30)
        .flags(DECOMPOSITION_BY_CENTRIFUGING)
        .components(SiliconDioxide, 3, Gold, 2)
        .buildAndRegister()
        .setFormula("(SiO2)3Au2", true);

    IridiumDioxide = Builder("iridium_dioxide")
        .dust(1)
        .color(0x694B20).iconSet(ROUGH)
        .flags(DISABLE_DECOMPOSITION)
        .components(Iridium, 1, Oxygen, 2)
        .buildAndRegister()
        .setFormula("IrO2", true);

    MetallicSludgeResidue = Builder("metallic_sludge_residue")
        .dust(1)
        .color(0x694B20).iconSet(ROUGH)
        .flags(DECOMPOSITION_BY_CENTRIFUGING)
        .components(Nickel, 1, Copper, 1)
        .buildAndRegister()
        .setFormula("NiCu", true);

    AcidicIridiumSolution = Builder("acidic_iridium_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x694B20)
        .buildAndRegister()
        .setFormula("???", true);


  }
}
