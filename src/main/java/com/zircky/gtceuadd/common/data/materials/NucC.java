package com.zircky.gtceuadd.common.data.materials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.MAGNETIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

public class NucC {
  public static final void register() {
    ManganeseOxide = IngotBuilder("manganese_oxide", 0x1A3F0D, 0x425E17, SNDART_FLAGS, METALLIC, 1924, "MnO");
    NiobiumTin = IngotBuilder("niobium_tin", 0xC4C4C4, 0xC0C0C0, SNDART_FLAGS, METALLIC, 2403, "Nb3Sn");
    Zircaloy = IngotBuilder("zircaloy", 0xF6FAF5, 0xFFCC00, SNDART_FLAGS, METALLIC);
    Thermoconducting = IngotBuilder("thermoconducting", 0x354630, 0x343B29, SNDART_FLAGS, METALLIC, 2500);
    ZirconiumMolybdenum = IngotBuilder("zirconium_molybdenum", 0xF3F9F1, 0xFFFFFF, SNDART_FLAGS, METALLIC, 2900);
    Extreme = IngotBuilder("extreme", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    TinSilver = IngotBuilder("tin_silver", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    PyroliticCarbon = IngotBuilder("pyrolitic_carbon", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    ManganeseDioxide = IngotBuilder("manganese_dioxide", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    ToughAlloy = IngotBuilder("tough_alloy", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Ferroboron = IngotBuilder("ferroboron", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    SuperAlloy = IngotBuilder("super_alloy", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Aluminum = IngotBuilder("aluminum", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    SicSicCmc = IngotBuilder("sic_sic_cmc", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    HardCarbon = IngotBuilder("hard_carbon", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    LithiumManganeseDioxide = IngotBuilder("lithium_manganese_dioxide", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    LeadPlatinum = IngotBuilder("lead_platinum", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    BoronArsenide = GemBuilder("boron_arsenide", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Carobbiite = GemBuilder("carobbiite", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Villiaumite = GemBuilder("villiaumite", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Fluorite = GemBuilder("fluorite", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    BoronNitride = GemBuilder("boron_nitride", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, METALLIC);
    Rhodochrosite = GemBuilder("rhodochrosite", 0xFFFFFF, 0xFFFFFF, SNDART_FLAGS, MAGNETIC);

  }
}
