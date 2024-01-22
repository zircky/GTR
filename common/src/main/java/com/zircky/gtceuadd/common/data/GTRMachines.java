package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import net.minecraft.network.chat.Component;

import javax.xml.stream.FactoryConfigurationError;

import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.GTValues.UHV;
import static com.gregtechceu.gtceu.api.pattern.Predicates.blocks;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.RIGHT;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.ITEM_IMPORT_BUS;
import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;


public class GTRMachines {
  public final static int[] HIGN_TIERS = new int[] {GTValues.TIER_COUNT};

  public final static MultiblockMachineDefinition COMPONENT_ASSEMBLY_LINE = REGISTRATE.multiblock("componemt_assembly_line", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.COMPONENT_ASSEMBLY_LINE_RECIPE)
      .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
      .appearanceBlock(CASING_STEEL_SOLID)
      .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
          .aisle("FIF", "RTR", "SAG", "#Y#")
          .aisle("FIF", "RTR", "GAG", "#Y#").setRepeatable(3, 15)
          .aisle("FOF", "RTR", "GAG", "#Y#")
          .where('S', Predicates.controller(blocks(definition.getBlock())))
          .where('F', blocks(CASING_STEEL_SOLID.get())
              .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS).setMaxGlobalLimited(4)))
          .where('O', Predicates.abilities(PartAbility.EXPORT_ITEMS).addTooltips(Component.translatable("gtceu.multiblock.pattern.location_end")))
          .where('Y', blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(3)))
          .where('I', blocks(ITEM_IMPORT_BUS[0].getBlock()))
          .where('G', blocks(CASING_GRATE.get()))
          .where('A', blocks(CASING_ASSEMBLY_CONTROL.get()))
          .where('R', blocks(CASING_LAMINATED_GLASS.get()))
          .where('T', blocks(CASING_ASSEMBLY_LINE.get()))
          .where('#', Predicates.any())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
          GTCEu.id("block/multiblock/componemt_assembly_line"), false)
//      .compassSections(GTCompassSections.TIER[UHV])
//      .compassNodeSelf()
      .register();

  public static void init() {

  }
}
