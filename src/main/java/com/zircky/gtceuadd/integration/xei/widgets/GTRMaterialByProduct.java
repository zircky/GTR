package com.zircky.gtceuadd.integration.xei.widgets;

import com.google.common.collect.ImmutableList;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.integration.xei.entry.item.ItemStackList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;

public class GTRMaterialByProduct {
  private static final List<TagPrefix> MATERIALS = new ArrayList<>();

  public static void addMaterialByProductPrefix(TagPrefix materialPrefix) {
    if (!MATERIALS.contains(materialPrefix)) {
      MATERIALS.add(materialPrefix);
    }
  }

  private static ImmutableList<TagPrefix> IN_PROCESSING_STEPS;

  protected final List<ItemStackList> itemInputs = new ArrayList<ItemStackList>();
  private int currentSlot;

  public GTRMaterialByProduct(Material material ) {
    if (IN_PROCESSING_STEPS == null) {
      IN_PROCESSING_STEPS = ImmutableList.of(
          TagPrefix.dust,
          TagPrefix.dustSmall,
          TagPrefix.dustTiny,
          TagPrefix.ingot,
          TagPrefix.nugget,
          TagPrefix.block,
          TagPrefix.plate,
          TagPrefix.plateDouble,
          TagPrefix.plateDense,
          TagPrefix.foil,
          TagPrefix.rod,
          TagPrefix.rodLong,
          TagPrefix.bolt,
          TagPrefix.screw,
          TagPrefix.ring,
          TagPrefix.round,
          TagPrefix.spring,
          TagPrefix.springSmall,
          TagPrefix.gear,
          TagPrefix.gearSmall,
          TagPrefix.rotor,
          TagPrefix.frameGt,
          TagPrefix.wireFine,
          TagPrefix.wireGtSingle,
          TagPrefix.wireGtDouble,
          TagPrefix.wireGtQuadruple,
          TagPrefix.wireGtOctal,
          TagPrefix.wireGtHex,
          TagPrefix.cableGtSingle,
          TagPrefix.cableGtDouble,
          TagPrefix.cableGtQuadruple,
          TagPrefix.cableGtOctal,
          TagPrefix.cableGtHex,
          TagPrefix.pipeTinyFluid,
          TagPrefix.pipeSmallFluid,
          TagPrefix.pipeNormalFluid,
          TagPrefix.pipeLargeFluid,
          TagPrefix.pipeHugeFluid,
          TagPrefix.pipeQuadrupleFluid,
          TagPrefix.pipeNonupleFluid,
          TagPrefix.pipeSmallItem,
          TagPrefix.pipeNormalItem,
          TagPrefix.pipeLargeItem,
          TagPrefix.pipeHugeItem
      );
    }

    MaterialProperties materialProperties = material.getProperties();
    currentSlot = 0;

    materialProperties.ensureSet(PropertyKey.DUST);
    materialProperties.ensureSet(PropertyKey.FLUID);
    materialProperties.ensureSet(PropertyKey.FLUID_PIPE);
    materialProperties.ensureSet(PropertyKey.ITEM_PIPE);
    materialProperties.ensureSet(PropertyKey.GEM);
    materialProperties.ensureSet(PropertyKey.INGOT);
    materialProperties.ensureSet(PropertyKey.EMPTY);

    for (TagPrefix prefix : MATERIALS) {
      itemInputs.add(ItemStackList.of(ChemicalHelper.get(prefix, material)));
    }

    for (TagPrefix prefix : IN_PROCESSING_STEPS) {
      itemInputs.add(ItemStackList.of(ChemicalHelper.get(prefix, material)));
    }

    currentSlot += 21;

    if(material.hasProperty(PropertyKey.GEM)) {
      addToInputs(new ItemStack((ItemLike) material.getMaterialInfo()));
    } else {
      addToInputs(ItemStack.EMPTY);
    }

  }

  private void addToInputs(ItemStack stack) {
    itemInputs.add(ItemStackList.of(stack));
  }

}
