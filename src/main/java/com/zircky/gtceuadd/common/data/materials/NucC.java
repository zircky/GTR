package com.zircky.gtceuadd.common.data.materials;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

public class NucC {
  public static final void register() {
    ManganeseOxide = Builder("manganese_oxide")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .color(0x1A3F0D).secondaryColor(0x425E17)
        .components(Manganese, 1, Oxygen, 1)
        .blastTemp(1924)
        .buildAndRegister();

    NiobiumTin = Builder("niobium_tin")
        .ingot().dust().fluid()
        .color(0xC4C4C4).secondaryColor(0xC0C0C0)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2403)
        .components(Niobium, 3, Tin, 1)
        .buildAndRegister();

    Zircaloy = Builder("zircaloy")
        .ingot().dust().fluid()
        .color(0xF6FAF5)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Thermoconducting = Builder("thermoconducting")
        .ingot().dust().fluid()
        .color(0x354630).secondaryColor(0x343B29)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2500)
        .buildAndRegister();

    ZirconiumMolybdenum = Builder("zirconium_molybdenum")
        .ingot().dust().fluid()
        .color(0xF3F9F1).secondaryColor(0xFFFFFF)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2900)
        .buildAndRegister();

    Extreme = Builder("extreme")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    TinSilver = Builder("tin_silver")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    PyroliticCarbon = Builder("pyrolitic_carbon")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    ManganeseDioxide = Builder("manganese_dioxide")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    ToughAlloy = Builder("tough_alloy")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Ferroboron = Builder("ferroboron")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    SuperAlloy = Builder("super_alloy")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Aluminum = Builder("aluminum")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    SicSicCmc = Builder("sic_sic_cmc")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    HardCarbon = Builder("hard_carbon")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    BoronArsenide = Builder("boron_arsenide")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    LithiumManganeseDioxide = Builder("lithium_manganese_dioxide")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    LeadPlatinum = Builder("lead_platinum")
        .ingot().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Carobbiite = Builder("carobbiite")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Villiaumite = Builder("villiaumite")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Fluorite = Builder("fluorite")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    BoronNitride = Builder("rhodochrosite")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Rhodochrosite = Builder("boron_nitride")
        .gem().dust().fluid()
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

  }
}
