package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.api.data.material.GTRMateralFlags.GENERATE_TRIPLE;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

@SuppressWarnings("unused")
public class GTRCemicalMaterial {
  public static final void register() {
    CuBe = Builder("cube")
        .ingot().dust()
        .color(0xAC4A09).iconSet(SHINY)
        .components()
        .appendFlags(SNDART_FLAGS, GENERATE_TRIPLE)
        .blastTemp(1000, BlastProperty.GasTier.LOW)
        .buildAndRegister();

    ScAl = Builder("scal")
        .ingot().dust()
        .color(0xC9C9C9)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1300, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.MV], 1300)
        .buildAndRegister();

    BAM = Builder("bam")
        .ingot().dust()
        .color(0x737373)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1250)
        .buildAndRegister();

    YAG = Builder("yag")
        .gem().dust()
        .color(0xE9B2FF)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
        .buildAndRegister();

    Nimonic = Builder("nimonic")
        .ingot().dust()
        .color(0x7A7168)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1350)
        .buildAndRegister();

    Hastelloy = Builder("hastelloy")
        .ingot().dust()
        .color(0x404040)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1340)
        .buildAndRegister();

    CuNiFe = Builder("cunife")
        .ingot().dust()
        .color(0xD6B689)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1356)
        .buildAndRegister();

    SiliconNitride = Builder("silicon_nitride")
        .gem().dust()
        .color(0xAEAEAE)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
        .buildAndRegister();

    SiliconCarbide = Builder("silicon_carbide")
        .gem().dust()
        .color(0x282828)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
        .buildAndRegister();

    TitaniumNitride = Builder("titanium_nitride")
        .ingot().dust()
        .color(0xFFAE00)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1100)
        .buildAndRegister();

    Hydronalium = Builder("hydronalium")
        .ingot().dust()
        .color(0xACB0B3)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1100)
        .buildAndRegister();

    Vanasteel = Builder("vanasteel")
        .ingot().dust()
        .color(0x999E7B)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2100, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Mischmetal = Builder("mischmetal")
        .ingot().dust()
        .color(0x111111)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    GreenGold = Builder("green_gold")
        .ingot().dust()
        .color(0xA1AC63)
        .components(Gold, 3, Silver, 1) //4
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    WhiteGold = Builder("white_gold")
        .ingot().dust()
        .color(0x979797)
        .components(Gold, 6, Palladium, 1, Nickel, 1, Zinc, 1) //8
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Shibuichi = Builder("shibuichi")
        .ingot().dust()
        .color(0x161616)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Tombak = Builder("tombak")
        .ingot().dust()
        .color(0xB7671B)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Pewter = Builder("pewter")
        .ingot().dust()
        .color(0xC8D1CA)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3541, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    CortenSteel = Builder("corten_steel")
        .ingot().dust()
        .color(0x7C370D)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    Shakudo = Builder("shakudo")
        .ingot().dust()
        .color(0x111024)
        .components()
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    PurpleGold = Builder("purple_gold")
        .ingot().dust()
        .color(0x844684)
        .components(Aluminium, 1, Gold, 3) //4
        .appendFlags(SNDART_FLAGS)
        .blastTemp(4512, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM],  3600)
        .buildAndRegister();

    RawSalt = Builder("raw_salt")
        .dust().ore()
        .color(0xB7B1A6)
        .buildAndRegister();

    CSolder = Builder("c_solder")
        .ingot().dust().fluid()
        .color(0x051F9E)
        .flags(GENERATE_PLATE, GENERATE_DENSE)
        .buildAndRegister()
        .setFormula("Sn90.7Ag3.6Cu0.7Cr5", true);

    Syngas = Builder("syngas")
        .fluid(FluidStorageKeys.GAS, new FluidBuilder().temperature(500))
        .color(0xFF484848)
        .buildAndRegister();

    AcrylicAcid = Builder("acrylic_acid")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xFF919191)
        .buildAndRegister();

//    Chloromethane = new Material.Builder("chloromethane")
//      .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(290))
//      .color(0xFFC8C8C8)
//      .buildAndRegister();

    Silicone = Builder("silicone")
        .fluid()
        .color(0xFF98A6B3)
        .buildAndRegister();

    SodiumCyanide = Builder("sodium_cyanide")
        .fluid()
        .color(0xFFDCDCDC)
        .buildAndRegister();
  }

}
