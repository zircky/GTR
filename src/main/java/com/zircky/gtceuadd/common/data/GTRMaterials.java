package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.zircky.gtceuadd.common.data.materials.*;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.Collection;


@SuppressWarnings("unused")
public class GTRMaterials {
  public static void init() {
    GTRCustomMaterial.register();
    GTRCemicalMaterial.register();
    GTRPlatinumLine.register();
    GTRMonazite.register();
    GTRNaquadahLineStuff.register();
    GTRTungstenLine.register();
    GTRSuperconductor.register();
    GTRBotaniaMaterial.register();
    NucC.register();
//    GTRFluid.register();
  }

  public static void modifyMaterials () {
    GTRModifyMaterials.init();
  }

  // Mod Material
  public static Material Infinity;
  public static Material InfinityCatalyst;
  public static Material CosmicNeutronium;
  public static Material Bedrockium;
  public static Material CobaltIINitrate; //Formula Co(NO3)2 только пыль
  public static Material CobaltIIHydroxide; //Formula Co(OH)2 только пыль
  public static Material ChaoticDraconium;
  public static Material DynamicInfinity;
  public static Material SkySteel;


  // Chemical
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

  // Botania Material
  public static Material ManaSteel;
  public static Material Terrasteel;
  public static Material ElvenElementium;
  public static Material Livingrock;
  public static Material GaiaSpirit;
  public static Material Livingwood;
  public static Material Dreamwood;
  public static Material ManaDiamond;
  public static Material BotaniaDragonstone;


  // PlatinumLine
  public static Material PlatinumMetallicPowder;
  public static Material PlatinumResidue;
  public static Material PlatinumConcentrate;
  public static Material PlatinumSalt;
  public static Material RefinedPlatlinumSalt;
  public static Material RepercipitatedPlatinum;
  public static Material PalladiumEnrichedAmmonia;
  public static Material PalladiumMetallicPowder;
  public static Material PalladiumSalt;
  public static Material RepercipitatedPalladium;
  public static Material FormicAcid;
  public static Material PotassiumDisulfate;
  public static Material RhodiumSulfateSolution;
  public static Material LeachResidue;
  public static Material CrudeRhodiumMetal;
  public static Material RhodiumSalt;
  public static Material RhodiumSaltSolution;
  public static Material ZincSulfate;
  public static Material SodiumNitrate;
  public static Material RhodiumNitrate;
  public static Material RhodiumFilterCake;
  public static Material RhodiumFilterCakeSolution;
  public static Material ReprecipitatedRhodium;
  public static Material RarestMetalResidue;
  public static Material SodiumRuthenate;
  public static Material RutheniumTetroxideSolution;
  public static Material HotRutheniumTetroxideSolution;
  public static Material OsmiumSolution;
  public static Material SludgeDustResidue;
  public static Material IridiumDioxide;
  public static Material MetallicSludgeResidue;
  public static Material AcidicIridiumSolution;

  // Monazite Chain Materials
  public static Material MuddyMonaziteRareEarthSolution;
  public static Material DilutedMonaziteRareEarthMud;
  public static Material HafniaZirconiaBlend;
  public static Material ThoriumDioxide;
  public static Material MonaziteSulfate;
  public static Material RedZircon;
  public static Material DilutedMonaziteSulfate;
  public static Material AmmoniumNitrateSolution;
  public static Material AcidicMonazitePowder;
  public static Material MonaziteRareEarthFiltrate;
  public static Material ThoriumPhosphateCake;
  public static Material NeutralizedMonaziteRareEarthFiltrate;
  public static Material MonaziteRareEarthHydroxideConcentrate;
  public static Material UraniumFiltrate;
  public static Material DriedMonaziteRareEarthConcentrate;
  public static Material NitrogenatedMonaziteRareEarthConcentrate;
  public static Material NitricLeachedMonaziteMixture;
  public static Material NitricMonaziteLeachedConcentrate;
  public static Material CeriumDioxide;
  public static Material CeriumChloride;
  public static Material CooledMonaziteRareEarthConcentrate;
  public static Material MonaziteRarerEarthSediment;
  public static Material HeterogenousHalogenicMonaziteRareEarthMixture;
  public static Material SamaricResidue;
  public static Material SaturatedMonazatiteRareEarth;
  public static Material EuropiumIIIOxide;
  public static Material Oxalate;
  public static Material CeriumOxalate;
  public static Material CeriumIIIOxide;
  public static Material NeutralizedUraniumFiltrate;
  public static Material Hafnia;
  public static Material Zirconia;
  public static Material HafniumTetrachloride;
  public static Material HafniumTetrachlorideSolution;
  public static Material LowPurityHafnium;
  public static Material HafniumIodide;
  public static Material ZirconiumTetrachloride;
  public static Material ZirconiumTetrachlorideSolution;
  public static Material ThoriumPhosphateConcentrate;
  public static Material Alumina;
  public static Material EuropiumOxide;
  public static Material VanadiumPentoxide;
  public static Material SodiumFormate;
  public static Material SodiumSulfate;


  //TungstenLine
  public static Material TungstenTrioxide; //iconSet: SHINY, formula:WO3


  //
  public static Material SamariumOreConcentrate; //formula: ??Sm??
  public static Material DephosphatedSamariumConcentrat; //formula: ??Sm??
  public static Material SamariumOxid; //formula: Sm2O3
  public static Material Thorianite; //formula: ThO2 только пыль
  public static Material MuddySamariumRareEarthSolution; //formula: ???Sm??? только жидкость
  public static Material SamariumRareEarthMud; //formula: ??Sm?? только жидкость
  public static Material DilutedSamariumRareEarthSolution; //formula: ?Sm? только жидкость
  public static Material ImpureSamariumOxalate; //formula: ?Sm2(C2O4)3 только пыль
  public static Material ImpureSamatiumChloride; //formula: ?SmCl3 только пыль
  public static Material SamariumChlorideSodiumChlorideBlend; //formula?SmCl3NaCl только пыль
  public static Material RarestEarthResidue; //??? только пыль

  public static Material MoltenImpureSamariumChloride; //Formula: ?SmCl3 только пыль и жидкость
  public static Material ImpureLanthanumChloride; //Formula: ?LaCl3 только пыль

  //NaquadahLain
  public static Material Ether; //Formula: CH3CH2OCH2CH3 только жидкость
  public static Material AntimonyTrichlorideSolution; //Formula: SbCl3 только жидкость
  public static Material AntimonyPentachlorideSolution; //Formula: SbCl5 только жидкость
  public static Material AntimonyPentachloride; //Formula: SbCl5 только жидкость
  public static Material AntimonyPentafluoride; //Formula: SbF5 только жидкость
  public static Material AntimonyPentafluorideSolution; //Formula: SbF5 только жидкость
  //public static Material FluoroantimonicAcid; //Formula: HSbF6 только жидкость
  public static Material LowQualityNaquadahEmulsion; //Formula: ??NqGaAd?? только жидкость
  public static Material LowQualityNaquadahSolution; //Formula: ~??NqAd??~ только жидкость
  public static Material NaquadahOxideMixture; //Formula: ??NqTiGaAd?? только жидкость
  public static Material GalliumHydroxide; //Formula: Ga(OH)3 только пыль
  public static Material Ethyl1Hexanol; //Formula: C8H18O только жидкость (name 2-Ethyl-1-Hexanol)
  public static Material P507; //Formula: C8H18O только жидкость (name P-507)

  //
  public static Material NaquadahAdamantiumSolution; //Formula: ~NqAd~ только жидкость (Naquadah-Adamantium Solution)
  public static Material Fluorspar; //Formula:  только пыль ()
  public static Material FluorineRichWasteLiquid; // только жидкость (Fluorine-RichWasteLiquid)
  public static Material WasteLiquid; // только жидкость
  public static Material NaquadahRichSolution; //Formula: ~NqAd~ только жидкость (Naquadah-RichSolution)
  public static Material Naquadahine; //Formula: NqO2 только пыль

  public static Material EnrichedNaquadahRichSolution; //Formula: ~?Na+?~ только жидкость (Enriched-Naquadah-Rich Solution)
  public static Material ConcentratedEnrichedNaquadahSludge; //Formula: ?Na+? только пыль (Concentrated Enriched-Naquadah Sludge)
  public static Material EnrichedNaquadahSulphate; //Formula: Na+(SO4)2 только пыль (Enriched-Naquadah Sulphate)

  public static Material LowQualityNaquadriaPhosphate; //Formula: ??Nq*3(PO4)4?? только пыль
  public static Material IndiumPhosphate; //Formula: InPO4 только пыль
  public static Material NaquadriaRichSolution; //Formula: ~?Na*?~ только жидкость (Naquadria-Rich Solution)
  public static Material LowQualityNaquadriaSulphate; //Formula: ??Nq*(SO4)2?? только пыль и жидкость
  public static Material NaquadriaSulphate; //Formula: Nq*(SO4)2 только пыль


  //Super wire
  public static Material ManganesePhosphideBase;
  public static Material MagnesiumDiborideBase;
  public static Material MercuryBariumCalciumCuprateBase;
  public static Material UraniumTriplatinumBase;
  public static Material SamariumIronArsenicOxideBase;
  public static Material IndiumTinBariumTitaniumCuprateBase;
  public static Material UraniumRhodiumDinaquadideBase;
  public static Material EnrichedNaquadahTriniumEuropiumDuranideBase;
  public static Material RutheniumTriniumAmericiumNeutronateBase;

  //Nucler
  public static Material ThoriumNitrate; // Formula Th(NO3)4 только жидкость
  public static Material ThoriumHydroxide; // Formula Th(NO3)4 только пыль

  public static Material CSolder;

  // GTNH
  public static Material MagnetohydrodynamicallyConstrainedStarMatter;
  public static Material WhiteDwarfMatter;
  public static Material Eternity;
  public static Material Magmatter;
  public static Material Spacetime;
  public static Material Universium;
  public static Material SupercriticalSteam;
  public static Material Draconium;
  public static Material AwakenedDraconium;
  public static Material MonolithAlloy; //Составт сплава: Steel, Cr, Ni, Co, Mn, Nb, V, Al, Si, Zn, Cu, Ti, Bi, Sn, Pb, Ag, Au, Pt, Rh, Pd, Re, Mg, Zr, Hf, Ir, (итрий), Mo, W, Ti, Ta Цвет "Серый"

  //NuclerCraft
  public static Material ManganeseOxide; //
  public static Material NiobiumTin; //
  public static Material Zircaloy; //
  public static Material Thermoconducting; //
  public static Material ZirconiumMolybdenum; //
  public static Material Extreme; //
  //public static Material Magnesium; //
  public static Material TinSilver; //
  public static Material PyroliticCarbon; //
  public static Material ManganeseDioxide; //
  public static Material ToughAlloy; //
  //public static Material Potassium; //
  public static Material Ferroboron; //
  public static Material SuperAlloy; //
  public static Material Aluminum; //
  public static Material SicSicCmc; //
  public static Material HardCarbon; //
  //public static Material Zirconium; //
//  public static Material Strontium;
  public static Material LithiumManganeseDioxide; //
  public static Material LeadPlatinum; //
//  public static Material Hafnium;

  //gem
  public static Material BoronArsenide; //
  public static Material Carobbiite; //
  public static Material Villiaumite; //
  public static Material Fluorite; //
  public static Material BoronNitride; //
  public static Material Rhodochrosite; //


  public static void addFluid(Material material) {
    material.setProperty(PropertyKey.FLUID, new FluidProperty());
    material.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
  }

  public static void addIngot(Material material) {
    material.setProperty(PropertyKey.INGOT, new IngotProperty());
  }

  public static void addDust(Material material) {
    material.setProperty(PropertyKey.DUST, new DustProperty());
  }

  public static void addGas(Material material) {
    material.setProperty(PropertyKey.FLUID, new FluidProperty());
    material.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.GAS, new FluidBuilder());
  }

  public static void addOre(Material material) {
    material.setProperty(PropertyKey.ORE, new OreProperty());
  }

  public static ToolProperty toolStats(float harvestSpeed, float attackDamage, int durability, int harvestLevel, int enchantability, GTToolType... types) {
    return ToolProperty.Builder.of(harvestSpeed, attackDamage, durability, harvestLevel).enchantability(enchantability).addTypes(types).build();
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, String formula, int blastTemp, BlastProperty.GasTier gasTier, int eutOverride) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .blastTemp(blastTemp, gasTier, eutOverride)
        .buildAndRegister()
        .setFormula(formula, true);
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, String formula, int blastTemp, BlastProperty.GasTier gasTier, int eutOverride, int durationOverride) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .blastTemp(blastTemp, gasTier, eutOverride, durationOverride)
        .buildAndRegister()
        .setFormula(formula, true);
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, int blastTemp, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .blastTemp(blastTemp)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, int blastTemp) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .blastTemp(blastTemp)
        .buildAndRegister();
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister();
  }

  public static Material IngotBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, FluidStorageKey key, FluidBuilder builder, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid(key, builder)
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material IngotBuilder(String id, int color, int color1, MaterialIconSet iconSet, String formula, MaterialFlag... flags) {
    return new Material.Builder(GTCEu.id(id))
        .ingot().dust().fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .flags(flags)
        .buildAndRegister().setFormula(formula, true);
  }


  public static Material DustBuilder(String id, int color, int color1, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister();
  }

  public static Material DustBuilder(String id, int color, int color1, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material DustBuilder(String id, int color, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).iconSet(iconSet)
        .buildAndRegister();
  }

  public static Material DustBuilder(String id, int color, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material DustBuilder(String id, int color, int color1, MaterialIconSet iconSet, Collection<MaterialFlag> flags, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister()
        .setFormula(formula, true);
  }

  public static Material DustBuilder(String id, int color, MaterialIconSet iconSet, Collection<MaterialFlag> flags, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).iconSet(iconSet)
        .buildAndRegister()
        .setFormula(formula, true);
  }

  public static Material DustBuilder(String id, int color, int color1, MaterialIconSet iconSet, String formula, MaterialFlag... flags) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material DustBuilder(String id, int color, MaterialIconSet iconSet, String formula, MaterialFlag... flags) {
    return new Material.Builder(GTCEu.id(id))
        .dust()
        .color(color).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material DustCusBuilder(String id, MaterialIconSet iconSet, Collection<MaterialFlag> flags, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .dust().iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister()
        .setFormula(formula, true);
  }

  public static Material DustCusBuilder(String id, MaterialIconSet iconSet, String formula, MaterialFlag... flags) {
    return new Material.Builder(GTCEu.id(id))
        .dust().iconSet(iconSet)
        .flags(flags)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material GemBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .gem().dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister();
  }

  public static Material GemBuilder(String id, int color, int color1, Collection<MaterialFlag> flags, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .gem().dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .appendFlags(flags)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material GemBuilder(String id, int color, int color1, MaterialIconSet iconSet, String formula, MaterialFlag... flags) {
    return new Material.Builder(GTCEu.id(id))
        .gem().dust()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .flags(flags)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material FluidBuilder(String id, int color, int color1, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }
  public static Material FluidBuilder(String id, int color, int color1, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .fluid()
        .color(color).secondaryColor(color1).iconSet(iconSet)
        .buildAndRegister();
  }

  public static Material FluidBuilder(String id, int color, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .fluid()
        .color(color).iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material FluidBuilder(String id, int color, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .fluid()
        .color(color).iconSet(iconSet)
        .buildAndRegister();
  }

  public static Material FluidBuilder(String id, int color, int color1, FluidStorageKey key, FluidBuilder builder, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .fluid(key, builder)
        .color(color).secondaryColor(color1)
        .iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }
  public static Material FluidBuilder(String id, int color, int color1, FluidStorageKey key, FluidBuilder builder, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .fluid(key, builder)
        .color(color).secondaryColor(color1)
        .iconSet(iconSet)
        .buildAndRegister();
  }

  public static Material FluidBuilder(String id, int color, FluidStorageKey key, FluidBuilder builder, MaterialIconSet iconSet, String formula) {
    return new Material.Builder(GTCEu.id(id))
        .fluid(key, builder)
        .color(color)
        .iconSet(iconSet)
        .buildAndRegister().setFormula(formula, true);
  }

  public static Material FluidBuilder(String id, int color, FluidStorageKey key, FluidBuilder builder, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .fluid(key, builder)
        .color(color)
        .iconSet(iconSet)
        .buildAndRegister();
  }




}
