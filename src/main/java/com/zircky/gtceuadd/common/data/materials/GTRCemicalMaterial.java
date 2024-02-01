package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;

@SuppressWarnings("unused")
public class GTRCemicalMaterial {
  public static final MaterialIconSet InfinityIcon = new MaterialIconSet("infinity", SHINY);
  public static final void register() {
    Infinity = Builder("infinity")
        .ingot().fluid().ore().dust()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_ROTOR, GENERATE_FOIL, GENERATE_DENSE, GENERATE_SPRING_SMALL)
        .color(0xFFFFFF).iconSet(InfinityIcon)
//        .element(GTNNElement.IF2)
        .blastTemp(10800, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UHV], 54562)
        .buildAndRegister();

    InfinityCatalyst = Builder("infinity_catalyst")
        .dust().ore()
        .color(0xE5E2E1).iconSet(SAND)
        //.element(GTNNElement.IF)
        .buildAndRegister();

    CosmicNeutronium = Builder("cosmic_neutronium")
        .ingot().fluid().ore().dust()
        .color(0x11111b).iconSet(SHINY)
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_ROUND, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FOIL, GENERATE_DENSE, GENERATE_SPRING_SMALL)
        //.element(GTNNElement.SpNt)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 21825)
        .buildAndRegister();

    Bedrockium = Builder("bedrocium")
        .ingot().fluid().dust()
        .color(0x11111b).iconSet(SAND)
        .itemPipeProperties(2048, 16)
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_ROUND, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FOIL, GENERATE_DENSE, GENERATE_SPRING_SMALL, GENERATE_SPRING, GENERATE_FINE_WIRE)
        //.element(GTNNElement.SpNt)
        .cableProperties(GTValues.UHV, 2, 1)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 21825)
        .buildAndRegister();

    CuBe = Builder("cube")
        .ingot().dust()
        .color(0xAC4A09)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1000, BlastProperty.GasTier.LOW)
        .buildAndRegister();

    ScAl = Builder("scal")
        .ingot().dust()
        .color(0xC9C9C9)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1300, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.MV], 1300)
        .buildAndRegister();

    BAM = Builder("bam")
        .ingot().dust()
        .color(0x737373)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
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
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1350)
        .buildAndRegister();

    Hastelloy = Builder("hastelloy")
        .ingot().dust()
        .color(0x404040)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1340)
        .buildAndRegister();

    CuNiFe = Builder("cunife")
        .ingot().dust()
        .color(0xD6B689)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
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
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1100)
        .buildAndRegister();

    Hydronalium = Builder("hydronalium")
        .ingot().dust()
        .color(0xACB0B3)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(1100)
        .buildAndRegister();

    Vanasteel = Builder("vanasteel")
        .ingot().dust()
        .color(0x999E7B)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(2100, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Mischmetal = Builder("mischmetal")
        .ingot().dust()
        .color(0x111111)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    GreenGold = Builder("green_gold")
        .ingot().dust()
        .color(0xA1AC63)
        .components(Gold, 3, Silver, 1) //4
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    WhiteGold = Builder("white_gold")
        .ingot().dust()
        .color(0x979797)
        .components(Gold, 6, Palladium, 1, Nickel, 1, Zinc, 1) //8
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Shibuichi = Builder("shibuichi")
        .ingot().dust()
        .color(0x161616)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
        .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Tombak = Builder("tombak")
        .ingot().dust()
        .color(0xB7671B)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
        .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
        .buildAndRegister();

    Pewter = Builder("pewter")
        .ingot().dust()
        .color(0xC8D1CA)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
        .blastTemp(3541, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    CortenSteel = Builder("corten_steel")
        .ingot().dust()
        .color(0x7C370D)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    Shakudo = Builder("shakudo")
        .ingot().dust()
        .color(0x111024)
        .components()
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
        .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
        .buildAndRegister();

    PurpleGold = Builder("purple_gold")
        .ingot().dust()
        .color(0x844684)
        .components(Aluminium, 1, Gold, 3) //4
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
        .blastTemp(4512, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM],  3600)
        .buildAndRegister();

    RawSalt = Builder("raw_salt")
        .dust().ore()
        .color(0xB7B1A6)
        .buildAndRegister();

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
