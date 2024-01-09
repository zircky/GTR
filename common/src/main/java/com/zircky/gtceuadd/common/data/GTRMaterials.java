package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;


@SuppressWarnings("unused")
public class GTRMaterials {
  public static void init() {
//    GTRFluid.register();
  }

  public static Material CuBe;
  public static Material ScAl;
  public static Material BAM;
  public static Material YAG;
  public static Material Nimonic;
  public static Material Hastelloy;
  public static Material CuNiFe;
  public static Material SiliconNitride;
  public static Material SiliconCarbide;
  public static Material TitaniumNitride;
  public static Material Hydronalium;
  public static Material Vanasteel;
  public static Material Mischmetal;
  public static Material GreenGold;
  public static Material WhiteGold;
  public static Material Shibuichi;
  public static Material Tombak;
  public static Material Pewter;
  public static Material CortenSteel;
  public static Material Shakudo;
  public static Material PurpleGold;
  public static Material RawSalt;
  public static Material Syngas;
  public static Material AcrylicAcid;
  public static Material Silicone;
  public static Material SodiumCyanide;



  public static void register() {
    CuBe = new Material.Builder("cube")
      .ingot().dust()
      .color(0xAC4A09)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1000, BlastProperty.GasTier.LOW)
      .buildAndRegister();

    ScAl = new Material.Builder("scal")
      .ingot().dust()
      .color(0xC9C9C9)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1300, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.MV], 1300)
      .buildAndRegister();

    BAM = new Material.Builder("bam")
      .ingot().dust()
      .color(0x737373)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1250)
      .buildAndRegister();

    YAG = new Material.Builder("yag")
      .gem().dust()
      .color(0xE9B2FF)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
      .buildAndRegister();

    Nimonic = new Material.Builder("nimonic")
      .ingot().dust()
      .color(0x7A7168)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1350)
      .buildAndRegister();

    Hastelloy = new Material.Builder("hastelloy")
      .ingot().dust()
      .color(0x404040)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1340)
      .buildAndRegister();

    CuNiFe = new Material.Builder("cunife")
      .ingot().dust()
      .color(0xD6B689)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1356)
      .buildAndRegister();

    SiliconNitride = new Material.Builder("silicon_nitride")
      .gem().dust()
      .color(0xAEAEAE)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
      .buildAndRegister();

    SiliconCarbide = new Material.Builder("silicon_carbide")
      .gem().dust()
      .color(0x282828)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
      .buildAndRegister();

    TitaniumNitride = new Material.Builder("titanium_nitride")
      .ingot().dust()
      .color(0xFFAE00)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1100)
      .buildAndRegister();

    Hydronalium = new Material.Builder("hydronalium")
      .ingot().dust()
      .color(0xACB0B3)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(1100)
      .buildAndRegister();

    Vanasteel = new Material.Builder("vanasteel")
      .ingot().dust()
      .color(0x999E7B)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(2100, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    Mischmetal = new Material.Builder("mischmetal")
      .ingot().dust()
      .color(0x111111)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    GreenGold = new Material.Builder("green_gold")
      .ingot().dust()
      .color(0xA1AC63)
      .components(Gold, 3, Silver, 1) //4
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    WhiteGold = new Material.Builder("white_gold")
      .ingot().dust()
      .color(0x979797)
      .components(Gold, 6, Palladium, 1, Nickel, 1, Zinc, 1) //8
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(2700, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    Shibuichi = new Material.Builder("shibuichi")
      .ingot().dust()
      .color(0x161616)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
      .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    Tombak = new Material.Builder("tombak")
      .ingot().dust()
      .color(0xB7671B)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
      .blastTemp(3254, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV],  2100)
      .buildAndRegister();

    Pewter = new Material.Builder("pewter")
      .ingot().dust()
      .color(0xC8D1CA)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
      .blastTemp(3541, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
      .buildAndRegister();

    CortenSteel = new Material.Builder("corten_steel")
      .ingot().dust()
      .color(0x7C370D)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
      .buildAndRegister();

    Shakudo = new Material.Builder("shakudo")
      .ingot().dust()
      .color(0x111024)
      .components()
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR)
      .blastTemp(3870, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.IV],  2800)
      .buildAndRegister();

    PurpleGold = new Material.Builder("purple_gold")
      .ingot().dust()
      .color(0x844684)
      .components(Aluminium, 1, Gold, 3) //4
      .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_SMALL_GEAR, GENERATE_FOIL)
      .blastTemp(4512, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM],  3600)
      .buildAndRegister();

    RawSalt = new Material.Builder("raw_salt")
      .dust().ore()
      .color(0xB7B1A6)
      .buildAndRegister();

    Syngas = new Material.Builder("syngas")
      .fluid(FluidStorageKeys.GAS, new FluidBuilder().temperature(500))
      .color(0xFF484848)
      .buildAndRegister();

    AcrylicAcid = new Material.Builder("acrylic_acid")
      .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().attribute(FluidAttributes.ACID))
      .color(0xFF919191)
      .buildAndRegister();

//    Chloromethane = new Material.Builder("chloromethane")
//      .fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(290))
//      .color(0xFFC8C8C8)
//      .buildAndRegister();

    Silicone = new Material.Builder("silicone")
      .fluid()
      .color(0xFF98A6B3)
      .buildAndRegister();

    SodiumCyanide = new Material.Builder("sodium_cyanide")
      .fluid()
      .color(0xFFDCDCDC)
      .buildAndRegister();
  }
}
