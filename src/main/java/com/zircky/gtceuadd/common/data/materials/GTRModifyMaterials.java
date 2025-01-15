package com.zircky.gtceuadd.common.data.materials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags.GENERATE_SINGULARITY;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRModifyMaterials {
  public static void init(){
    NaquadahAlloy.addFlags(GENERATE_ROUND);
    Neutronium.addFlags(GENERATE_LONG_ROD, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FINE_WIRE);
    ManganesePhosphide.addFlags(NO_UNIFICATION);
    MagnesiumDiboride.addFlags(NO_UNIFICATION);
    MercuryBariumCalciumCuprate.addFlags(NO_UNIFICATION);
    UraniumTriplatinum.addFlags(NO_UNIFICATION);
    SamariumIronArsenicOxide.addFlags(NO_UNIFICATION);
    IndiumTinBariumTitaniumCuprate.addFlags(NO_UNIFICATION);
    UraniumRhodiumDinaquadide.addFlags(NO_UNIFICATION);
    EnrichedNaquadahTriniumEuropiumDuranide.addFlags(NO_UNIFICATION);
    RutheniumTriniumAmericiumNeutronate.addFlags(NO_UNIFICATION);
    Tantalum.addFlags(GENERATE_ROD);
    Iridium.addFlags(GENERATE_DENSE);
    TitaniumTungstenCarbide.addFlags(GENERATE_BOLT_SCREW, GENERATE_DENSE);
    CertusQuartz.addFlags(GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_DENSE);
    NetherQuartz.addFlags(GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_DENSE);
    Quartzite.addFlags(GENERATE_ROD, GENERATE_BOLT_SCREW);
    Copper.addFlags(GENERATE_BOLT_SCREW, GENERATE_RING);
    Nickel.addFlags(GENERATE_BOLT_SCREW);
    Diamond.addFlags(GENERATE_DENSE);
    RoseGold.addFlags(GENERATE_DENSE);


    addIngot(Graphite);
    addIngot(Lithium);
    addIngot(Sodium);
    addIngot(Calcium);
    addIngot(Boron);

//    addFluid(AmmoniumChloride);

    modifySingularyty();
  }

  public static void modifySingularyty() {
    Coal.addFlags(GENERATE_SINGULARITY);
    Emerald.addFlags(GENERATE_SINGULARITY);
    Diamond.addFlags(GENERATE_SINGULARITY);
    Aluminum.addFlags(GENERATE_SINGULARITY);
    Bronze.addFlags(GENERATE_SINGULARITY);
    Charcoal.addFlags(GENERATE_SINGULARITY);
    Electrum.addFlags(GENERATE_SINGULARITY);
    Invar.addFlags(GENERATE_SINGULARITY);
    Magnesium.addFlags(GENERATE_SINGULARITY);
    Osmium.addFlags(GENERATE_SINGULARITY);
    Ruby.addFlags(GENERATE_SINGULARITY);
    Sapphire.addFlags(GENERATE_SINGULARITY);
    Steel.addFlags(GENERATE_SINGULARITY);
    Titanium.addFlags(GENERATE_SINGULARITY);
    Tungsten.addFlags(GENERATE_SINGULARITY);
    Uranium235.addFlags(GENERATE_SINGULARITY);
    Zinc.addFlags(GENERATE_SINGULARITY);
    Palladium.addFlags(GENERATE_SINGULARITY);
    DamascusSteel.addFlags(GENERATE_SINGULARITY);
    BlackSteel.addFlags(GENERATE_SINGULARITY);
    Iridium.addFlags(GENERATE_SINGULARITY);
    NetherStar.addFlags(GENERATE_SINGULARITY);
    Platinum.addFlags(GENERATE_SINGULARITY);
    Naquadria.addFlags(GENERATE_SINGULARITY);
    Plutonium241.addFlags(GENERATE_SINGULARITY);
    Europium.addFlags(GENERATE_SINGULARITY);
    Graphite.addFlags(GENERATE_SINGULARITY);
    Cobalt.addFlags(GENERATE_SINGULARITY);
    EnderPearl.addFlags(GENERATE_SINGULARITY);
    Lead.addFlags(GENERATE_SINGULARITY);
    Nickel.addFlags(GENERATE_SINGULARITY);
    Iron.addFlags(GENERATE_SINGULARITY);
    Gold.addFlags(GENERATE_SINGULARITY);
    Silver.addFlags(GENERATE_SINGULARITY);
    NaquadahAlloy.addFlags(GENERATE_SINGULARITY);
    NaquadahEnriched.addFlags(GENERATE_SINGULARITY);
    Copper.addFlags(GENERATE_SINGULARITY);
    HSSE.addFlags(GENERATE_SINGULARITY);
    HSSG.addFlags(GENERATE_SINGULARITY);
    HSSS.addFlags(GENERATE_SINGULARITY);

  }

}
