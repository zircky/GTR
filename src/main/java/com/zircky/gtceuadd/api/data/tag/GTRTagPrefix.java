package com.zircky.gtceuadd.api.data.tag;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.gtceuadd.api.data.chemical.info.material.GTRMateralFlags;
import com.zircky.gtceuadd.api.data.chemical.info.material.GTRMaterialIconType;


public class GTRTagPrefix {

  public static final TagPrefix singularity = new TagPrefix("singularity")
      .defaultTagPath("singularitys/%s")
      .unformattedTagPath("singularitys")
      .materialAmount(GTValues.M)
      .materialIconType(GTRMaterialIconType.singularity)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_SINGULARITY));

  public static final TagPrefix nanite = new TagPrefix("nanite")
      .defaultTagPath("nanites/%s")
      .unformattedTagPath("nanites")
      .materialAmount(GTValues.M)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_NANITE));

  public static final TagPrefix plateTriple = new TagPrefix("plateTriple")
      .idPattern("triple_%s_plate")
      .defaultTagPath("triple_plates/%s")
      .unformattedTagPath("triple_plates")
      .langValue("Triple %s Plate")
      .materialAmount(GTValues.M * 3)
      .materialIconType(MaterialIconType.plateTriple)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_TRIPLE));

  public static final TagPrefix plateQuadruple = new TagPrefix("plateQuadruple")
      .idPattern("quadruple_%s_plate")
      .defaultTagPath("quadruple_plates/%s")
      .unformattedTagPath("quadruple_plates")
      .langValue("Quadruple %s Plate")
      .materialAmount(GTValues.M * 4)
      .materialIconType(MaterialIconType.plateQuadruple)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_QUADRUPLE));

  public static final TagPrefix plateQuintuple = new TagPrefix("plateQuintuple")
      .idPattern("quintuple_%s_plate")
      .defaultTagPath("quintuple_plates/%s")
      .unformattedTagPath("quintuple_plates")
      .langValue("Quintuple %s Plate")
      .materialAmount(GTValues.M * 5)
      .materialIconType(MaterialIconType.plateQuintuple)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_QUINTULE));


  public static final TagPrefix superdense = new TagPrefix("superdense")
      .idPattern("superdense_%s_plate")
      .defaultTagPath("superdense_plates/%s")
      .unformattedTagPath("superdense_plates")
      .langValue("Superdense %s Plate")
      .materialAmount(GTValues.M * 64)
      .materialIconType(GTRMaterialIconType.superdense)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_SUPERDENSE));


  public static void init() {

  }
}
