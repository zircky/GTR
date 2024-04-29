package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRMonazite {
  public static final void register() {
    MuddyMonaziteRareEarthSolution = FluidBuilder("muddy_monazite_rare_earth_solution", 0x694C22, FluidStorageKeys.LIQUID, new FluidBuilder(), ROUGH, "??LaNdZr??");
    DilutedMonaziteRareEarthMud = FluidBuilder("diluted_monazite_rare_earth_mud", 0x835D27, FluidStorageKeys.LIQUID, new FluidBuilder(), ROUGH, "??LaNdHf??");
    HafniaZirconiaBlend = DustBuilder("hafnia_zirconia_blend", 0xC1A47A, METALLIC, "??HfZr??");
    ThoriumDioxide = DustBuilder("thorium_dioxide", 0x33312E, METALLIC, "ThO2");
    MonaziteSulfate = DustBuilder("monazite_sulfate", 0x5C421B, METALLIC, "??CeEu??");
    RedZircon = DustBuilder("red_zircon", 0xDB2025, SHINY, "ZrSiO4", DECOMPOSITION_BY_ELECTROLYZING);
    DilutedMonaziteSulfate = FluidBuilder("diluted_monazite_sulfate", 0x5C421B, SHINY, "??LaNd??");
    AmmoniumNitrateSolution = FluidBuilder("ammonium_nitrate_solution", 0xFFFFFF, SHINY, "NH4NO3");
    AcidicMonazitePowder = DustBuilder("acidic_monazite_powder", 0x241740, ROUGH, "????");
    MonaziteRareEarthFiltrate = DustBuilder("monazite_rare_earth_filtrate", 0x1A1525, ROUGH, "????");
    ThoriumPhosphateCake = DustBuilder("thorium_phosphate_cake", 0xBF2948, ROUGH, "??ThP??");
    NeutralizedMonaziteRareEarthFiltrate = DustBuilder("neutralized_monazite_rare_earth_filtrate", 0x2B1946, ROUGH, "????");
    MonaziteRareEarthHydroxideConcentrate = DustBuilder("monazite_rare_earth_hydroxide_concentrate", 0x453221, ROUGH, "????");
    UraniumFiltrate = DustBuilder("uranium_filtrate", 0x224521, ROUGH, "??U??");
    DriedMonaziteRareEarthConcentrate = DustBuilder("dried_monazite_rare_earth_concentrate", 0x453221, ROUGH, "????");
    NitrogenatedMonaziteRareEarthConcentrate = FluidBuilder("nitrogenated_monazite_rare_earth_concentrate", 0x453221, FluidStorageKeys.LIQUID, new FluidBuilder(), ROUGH, "??LaNd??");
    NitricLeachedMonaziteMixture = FluidBuilder("nitric_leached_monazite_mixture", 0x9122A8, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC);
    NitricMonaziteLeachedConcentrate = FluidBuilder("nitric_monazatie_leached_concentrate", 0xF6C62C, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC, "??LaNd??");
    CeriumDioxide = DustBuilder("cerium_dioxide", 0xDEE6E7, SHINY, "CeO2");
    CeriumChloride = DustBuilder("cerium_chloride", 0xDEE6E7, SHINY, "CeCl3");
    CooledMonaziteRareEarthConcentrate = DustBuilder("cooled_monazite_rare_earth_concentrate", 0x5B480B, METALLIC, "????");
    MonaziteRarerEarthSediment = DustBuilder("monaziterarer_earth_sediment", 0x5B480B, METALLIC, "????");
    HeterogenousHalogenicMonaziteRareEarthMixture = DustBuilder("heterogenic_halogenic_monazite_rare_earth_mixture", 0x5B480B, METALLIC, "????");
    SamaricResidue = DustBuilder("samaric_residue", 0xC4AB94, METALLIC, "??SmGd??");
    EuropiumIIIOxide = DustBuilder("europium_iii_oxide", 0xF4C8F4, METALLIC, "????");
    Oxalate = FluidBuilder("oxalate", 0x47AD1F, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC, "H2C2O4");
    CeriumOxalate = DustBuilder("cerium_oxalate", 0xE4D7C5, ROUGH, "Ce2(C2O4)3");
    CeriumIIIOxide = DustBuilder("cerium_iii_oxide", 0xD8DA2F, ROUGH, "Ce2O3");
    NeutralizedUraniumFiltrate = DustBuilder("neutralized_uranium_filtrate", 0xA62424, ROUGH, "??U??");
    Hafnia = DustBuilder("hafnia", 0xBA9288, METALLIC, "HfO2");
    Zirconia = DustBuilder("zirconia", 0x7F4334, METALLIC, "ZrO2");
    HafniumTetrachloride = DustBuilder("hafnium_tetrachloride", 0xE2DEDD, METALLIC, "HfCl4");
    HafniumTetrachlorideSolution = FluidBuilder("hafnium_tetrachloride_solution", 0xE2DEDD, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC, "HfCl4");
    LowPurityHafnium = DustBuilder("low_purity_hafnium", 0xCCC3C1, METALLIC, "??Hf??");
    HafniumIodide = DustBuilder("hafnium_idodide", 0xCB3818, METALLIC, "HfI4", DISABLE_DECOMPOSITION);
    ZirconiumTetrachloride = DustBuilder("zirconium_tetrachloride", 0xA6786E, METALLIC, "ZrCl4");
    ZirconiumTetrachlorideSolution = FluidBuilder("zirconium_tetrachloride_solution", 0xA6786E, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC, "ZrCl4");
    ThoriumPhosphateConcentrate = DustBuilder("thorium_phosphate_concentrate", 0xE27717, ROUGH, "??ThP??");
    Alumina = DustBuilder("alumina", 0x64B5BF, SHINY, "Al2O3");
    EuropiumOxide = DustBuilder("europium_oxide", 0xEBE2EC, ROUGH, "EuO");
    VanadiumPentoxide = DustBuilder("vanadium_pentoxide", 0xD0BD3F, SHINY, "V205", DECOMPOSITION_BY_ELECTROLYZING);
    SodiumFormate = FluidBuilder("sodium_formate", 0xE33BA7, FluidStorageKeys.LIQUID, new FluidBuilder(), METALLIC, "HCOONa");
    SodiumSulfate = DustBuilder("sodium_sulfate", 0xE33BA7, SHINY, "Na2SO4", DECOMPOSITION_BY_ELECTROLYZING);
  }
}
