package com.zircky.gtceuadd.common.data.materials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.addFluid;
import static com.zircky.gtceuadd.common.data.GTRMaterials.addIngot;

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
    CertusQuartz.addFlags(GENERATE_BOLT_SCREW, GENERATE_ROD);
    NetherQuartz.addFlags(GENERATE_BOLT_SCREW, GENERATE_ROD);

    addIngot(Graphite);
    addIngot(Lithium);
    addIngot(Sodium);
    addIngot(Calcium);
    addIngot(Boron);

//    addFluid(AmmoniumChloride);
  }

}
