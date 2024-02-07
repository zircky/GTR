package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.zircky.gtceuadd.common.data.materials.*;


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

  public static Material Draconium;
  public static Material AwakenedDraconium;

  //Nucler
  public static Material ThoriumNitrate; // Formula Th(NO3)4 только жидкость
  public static Material ThoriumHydroxide; // Formula Th(NO3)4 только пыль
}
