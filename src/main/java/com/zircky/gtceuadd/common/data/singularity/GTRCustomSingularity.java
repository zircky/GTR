package com.zircky.gtceuadd.common.data.singularity;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags.GENERATE_SINGULARITY;
import static com.zircky.gtceuadd.api.data.chemical.info.material.GTRMaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRCustomSingularity {
  public static final void register() {
    Nitronic = registerSingularity("nitronic", NitronicIcon);
    Psychotic = registerSingularity("psychotic", PsychoticIcon);
    Sphaghettic = registerSingularity("sphaghettic", SphaghetticIcon);
    Pneumatic = registerSingularity("pneumatic", PneumaticIcon);
    Cryptic = registerSingularity("cryptic", CrypticIcon);
    Historic = registerSingularity("historic", HistoricIcon);
    Meteoric = registerSingularity("meteoric", MeteoricIcon);
    Gastronomic = registerSingularity("gastronomic", GastronomicIcon);
    Chromatic = registerSingularity("chromatic", ChromaticIcon);
    Prismatic = registerSingularity("prismatic", PrismaticIcon);
    Robotic = registerSingularity("robotic", RoboticIcon);
    Galactic = registerSingularity("galactic", GalacticIcon);
    Hydrolic = registerSingularity("hydrolic", HydrolicIcon);
    Geologic = registerSingularity("geologic", GeologicIcon);
    Angelic = registerSingularity("angelic", AngelicIcon);
    Chronic = registerSingularity("chronic", ChronicIcon);

  }

  private static Material registerSingularity(String id, MaterialIconSet iconSet) {
    return new Material.Builder(GTCEu.id(id))
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(iconSet)
        .flags(GENERATE_SINGULARITY)
        .buildAndRegister();
  }
}
