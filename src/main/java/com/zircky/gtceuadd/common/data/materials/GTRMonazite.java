package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;

public class GTRMonazite {
  public static final void register() {
    MuddyMonaziteRareEarthSolution = Builder("muddy_monazite_rare_earth_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x694C22).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??LaNdZr??", true);

    DilutedMonaziteRareEarthMud = Builder("diluted_monazite_rare_earth_mud")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x835D27).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??LaNdHf??", true);

    HafniaZirconiaBlend = Builder("hafnia_zirconia_blend")
        .dust(1)
        .color(0xC1A47A).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("??HfZr??", true);

    ThoriumDioxide = Builder("thorium_dioxide")
        .dust(1)
        .color(0x33312E).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ThO2", true);

    MonaziteSulfate = Builder("monazite_sulfate")
        .dust(1)
        .color(0x5C421B).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("??CeEu??", true);

    RedZircon = Builder("red_zircon")
        .dust(1)
        .color(0xDB2025).iconSet(SHINY)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .components(Zirconium, 1, SiliconDioxide, 2, Oxygen, 2)
        .buildAndRegister()
        .setFormula("ZrSiO4", true);

    DilutedMonaziteSulfate = Builder("diluted_monazite_sulfate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x5C421B).iconSet(SHINY)
        .buildAndRegister()
        .setFormula("??LaNd??", true);

    AmmoniumNitrateSolution = Builder("ammonium_nitrate_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xFFFFFF)
        .buildAndRegister()
        .setFormula("NH4NO3", true);

    AcidicMonazitePowder = Builder("acidic_monazite_powder")
        .dust(1)
        .color(0x241740).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("????", true);

    MonaziteRareEarthFiltrate = Builder("monazite_rare_earth_filtrate")
        .dust(1)
        .color(0x1A1525).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("????", true);

    ThoriumPhosphateCake = Builder("thorium_phosphate_cake")
        .dust(1)
        .color(0xBF2948).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??ThP??", true);

    NeutralizedMonaziteRareEarthFiltrate = Builder("neutralized_monazite_rare_earth_filtrate")
        .dust(1)
        .color(0x2B1946).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("????", true);

    MonaziteRareEarthHydroxideConcentrate = Builder("monazite_rare_earth_hydroxide_concentrate")
        .dust(1)
        .color(0x453221).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("????", true);

    UraniumFiltrate = Builder("uranium_filtrate")
        .dust(1)
        .color(0x224521).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??U??", true);

    DriedMonaziteRareEarthConcentrate = Builder("dried_monazite_rare_earth_concentrate")
        .dust(1)
        .color(0x453221).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("????", true);

    NitrogenatedMonaziteRareEarthConcentrate = Builder("nitrogenated_monazite_rare_earth_concentrate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x453221).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??LaNd??", true);

    NitricLeachedMonaziteMixture = Builder("nitric_leached_monazite_mixture")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x9122A8)
        .buildAndRegister();

    NitricMonaziteLeachedConcentrate = Builder("nitric_monazatie_leached_concentrate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xF6C62C)
        .buildAndRegister()
        .setFormula("??LaNd??", true);

    CeriumDioxide = Builder("cerium_dioxide")
        .dust(1)
        .color(0xDEE6E7)
        .buildAndRegister()
        .setFormula("CeO2", true);

    CeriumChloride = Builder("cerium_chloride")
        .dust(1)
        .color(0xDEE6E7)
        .buildAndRegister()
        .setFormula("CeCl3", true);

    CooledMonaziteRareEarthConcentrate = Builder("cooled_monazite_rare_earth_concentrate")
        .dust(1)
        .color(0x5B480B).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("????", true);

    MonaziteRarerEarthSediment = Builder("monaziterarer_earth_sediment")
        .dust(1)
        .color(0x5B480B).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("????", true);

    HeterogenousHalogenicMonaziteRareEarthMixture = Builder("heterogenic_halogenic_monazite_rare_earth_mixture")
        .dust(1)
        .color(0x5B480B).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("????", true);

    SamaricResidue = Builder("samaric_residue")
        .dust(1)
        .color(0xC4AB94).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("??SmGd??", true);

    EuropiumIIIOxide = Builder("europium_iii_oxide")
        .dust(1)
        .color(0xF4C8F4).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("????", true);

    Oxalate = Builder("oxalate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x47AD1F)
        .buildAndRegister()
        .setFormula("H2C2O4", true);

    CeriumOxalate = Builder("cerium_oxalate")
        .dust(1)
        .color(0xE4D7C5).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ce2(C2O4)3", true);

    CeriumIIIOxide = Builder("cerium_iii_oxide")
        .dust(1)
        .color(0xD8DA2F).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ce2O3", true);

    NeutralizedUraniumFiltrate = Builder("neutralized_uranium_filtrate")
        .dust(1)
        .color(0xA62424).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??U??", true);

    Hafnia = Builder("hafnia")
        .dust(1)
        .color(0xBA9288).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("HfO2", true);

    Zirconia = Builder("zirconia")
        .dust(1)
        .color(0x7F4334).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ZrO2", true);

    HafniumTetrachloride = Builder("hafnium_tetrachloride")
        .dust(1)
        .color(0xE2DEDD).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("HfCl4", true);

    HafniumTetrachlorideSolution = Builder("hafnium_tetrachloride_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xE2DEDD).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("HfCl4", true);

    LowPurityHafnium = Builder("low_purity_hafnium")
        .dust(1).fluid()
        .color(0xCCC3C1).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("??Hf??", true);

    HafniumIodide = Builder("hafnium_idodide")
        .dust(1)
        .color(0xCB3818).iconSet(METALLIC)
        .components(LowPurityHafnium, 1, Iodine, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister()
        .setFormula("HfI4", true);

    ZirconiumTetrachloride = Builder("zirconium_tetrachloride")
        .dust(1)
        .color(0xA6786E).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ZrCl4", true);

    ZirconiumTetrachlorideSolution = Builder("zirconium_tetrachloride_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xA6786E).iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ZrCl4", true);

    ThoriumPhosphateConcentrate = Builder("thorium_phosphate_concentrate")
        .dust()
        .color(0xE27717).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("??ThP??", true);

    Alumina = Builder("alumina")
        .dust()
        .color(0x64B5BF).iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Al2O3", true);

    EuropiumOxide = Builder("europium_oxide")
        .dust()
        .color(0xEBE2EC).iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("EuO", true);

    VanadiumPentoxide = Builder("vanadium_pentoxide")
        .dust()
        .color(0xD0BD3F).iconSet(SHINY)
        .components(Vanadium, 2, Oxygen, 5)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("V2O5", true);

    SodiumFormate = Builder("sodium_formate")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xE33BA7)
        .buildAndRegister()
        .setFormula("HCOONa", true);

    SodiumSulfate = Builder("sodium_sulfate")
        .dust()
        .color(0xE33BA7)
        .components(Sulfur, 1, Oxygen, 4, Sodium, 2)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("Na2SO4", true);
  }
}
