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

  public static final TagPrefix bolckOne = new TagPrefix("bolckOne")
      .defaultTagPath("bolckOnes/%s")
      .unformattedTagPath("bolckOnes")
      .materialAmount(GTValues.M)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_ONE));

  public static final TagPrefix bolckTwo = new TagPrefix("bolckTwo")
      .defaultTagPath("bolckTwos/%s")
      .unformattedTagPath("bolckTwos")
      .materialAmount(GTValues.M*2)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_TWO));

  public static final TagPrefix bolckThree = new TagPrefix("bolckThree")
      .defaultTagPath("bolckThrees/%s")
      .unformattedTagPath("bolckThrees")
      .materialAmount(GTValues.M*3)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_THREE));

  public static final TagPrefix bolckFour = new TagPrefix("bolckFour")
      .defaultTagPath("bolckFours/%s")
      .unformattedTagPath("bolckFours")
      .materialAmount(GTValues.M*4)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_FOUR));

  public static final TagPrefix bolckFive = new TagPrefix("bolckFive")
      .defaultTagPath("bolckFives/%s")
      .unformattedTagPath("bolckFives")
      .materialAmount(GTValues.M*5)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_FIVE));

  public static final TagPrefix bolckSix = new TagPrefix("bolckSix")
      .defaultTagPath("bolckSixs/%s")
      .unformattedTagPath("bolckSixs")
      .materialAmount(GTValues.M*6)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_SIX));

  public static final TagPrefix bolckSeven = new TagPrefix("bolckSeven")
      .defaultTagPath("bolckSevens/%s")
      .unformattedTagPath("bolckSevens")
      .materialAmount(GTValues.M*7)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_SEVEN));

  public static final TagPrefix bolckEight = new TagPrefix("bolckEight")
      .defaultTagPath("bolckEights/%s")
      .unformattedTagPath("bolckEights")
      .materialAmount(GTValues.M*8)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_EIGHT));

  public static final TagPrefix bolckNine = new TagPrefix("bolckNine")
      .defaultTagPath("bolckNines/%s")
      .unformattedTagPath("bolckNines")
      .materialAmount(GTValues.M*9)
      .materialIconType(GTRMaterialIconType.nanite)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GTRMateralFlags.GENERATE_BLOCK_NINE));

  public static void init() {

  }
}
