package com.zircky.gtceuadd.common.data.blocks.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.pattern.TraceabilityPredicate;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.AssemblyLineMachine;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.zircky.gtceuadd.common.data.GTRRecipeTypes;
import net.minecraft.network.chat.Component;

import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.pattern.Predicates.abilities;
import static com.gregtechceu.gtceu.api.pattern.Predicates.blocks;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_GRATE;
import static com.gregtechceu.gtceu.common.data.GTMachines.ITEM_IMPORT_BUS;
import static com.gregtechceu.gtceu.common.registry.GTRegistration.REGISTRATE;
import static com.zircky.gtceuadd.common.data.GTRMachines.CIRCUIT_ASSEMBLER_R_M;

public class CircuitAssembler {
  public static void register() {

    CIRCUIT_ASSEMBLER_R_M = REGISTRATE.multiblock("circuit_assembler_r_m", AssemblyLineMachine::new)
        .rotationState(RotationState.ALL)
        .recipeType(GTRRecipeTypes.CIRCUIT_ASSEMBLER_R_M_RECIPES)
        .alwaysTryModifyRecipe(true)
//        .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTRecipeModifiers.SUBTICK_PARALLEL, GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
        .appearanceBlock(CASING_STEEL_SOLID)
        .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
            .aisle("FIF", "RTR", "SAG", "#Y#")
            .aisle("FIF", "RTR", "DAG", "#Y#").setRepeatable(3, 15)
            .aisle("FOF", "RTR", "DAG", "#Y#")
            .where('S', Predicates.controller(blocks(definition.getBlock())))
            .where('F', blocks(CASING_STEEL_SOLID.get())
                .or(
                    Predicates.abilities(PartAbility.IMPORT_FLUIDS_1X).setMaxGlobalLimited(6)))
            .where('O',
                Predicates.abilities(PartAbility.EXPORT_ITEMS)
                    .addTooltips(Component.translatable("gtceu.multiblock.pattern.location_end")))
            .where('Y',
                blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY)
                    .setMinGlobalLimited(1).setMaxGlobalLimited(2)))
            .where('I', blocks(ITEM_IMPORT_BUS[0].getBlock()))
            .where('G', blocks(CASING_GRATE.get()))
            .where('A', blocks(CASING_ASSEMBLY_CONTROL.get()))
            .where('R', blocks(CASING_LAMINATED_GLASS.get()))
            .where('T', blocks(CASING_ASSEMBLY_LINE.get()))
            .where('D', dataHatchPredicate(blocks(CASING_GRATE.get())))
            .where('#', Predicates.any())
            .build())
        .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
            GTCEu.id("block/multiblock/assembly_line"))
        .register();
  }

  private static TraceabilityPredicate dataHatchPredicate(TraceabilityPredicate def) {
    // if research is enabled, require the data hatch, otherwise use a grate instead
    if (ConfigHolder.INSTANCE.machines.enableResearch) {
      return abilities(PartAbility.DATA_ACCESS, PartAbility.OPTICAL_DATA_RECEPTION)
          .setExactLimit(1)
          .or(def);
    }
    return def;
  }
}
