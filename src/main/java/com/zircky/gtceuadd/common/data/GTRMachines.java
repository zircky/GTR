package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IRotorHolderMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.pattern.TraceabilityPredicate;
import com.gregtechceu.gtceu.api.pattern.predicates.SimplePredicate;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeTurbineMachine;
import com.lowdragmc.lowdraglib.utils.BlockInfo;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.block.multiblock.ComponentAssemblyLineM;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import com.zircky.gtceuadd.common.data.blocks.machines.CircuitAssembler;
import com.zircky.gtceuadd.common.machine.multiblock.generator.XLLargeTurbineMachine;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;
import static com.zircky.gtceuadd.common.data.GTRCasingBlocks.MiningBlackPlutoniumCasing;
import static com.zircky.gtceuadd.common.data.GTRCasingBlocks.RadiantNaquadahAlloyCasing;
//import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;


public class GTRMachines {
  public final static int[] ALL_TIERS = GTValues.tiersBetween(ULV, GTCEuAPI.isHighTier() ? MAX : UHV);

  public static MultiblockMachineDefinition CIRCUIT_ASSEMBLER_R_M;
  public static MachineDefinition[] CIRCUIT_ASSEMBLER_R = registerSimpleMachines("circuit_assembler_r", GTRRecipeTypes.CIRCUIT_ASSEMBLER_R_RECIPES);

  /*public final static MultiblockMachineDefinition COMPONENT_ASSEMBLY_LINE = GTRRegistries.REGISTRATE.multiblock("component_assembly_line", ComponentAssemblyLineM::new)
      .langValue("Component Assembly Line")
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.ComponentAssemblyLineRecipes)
      .recipeModifier(ComponentAssemblyLineM::componentAssemblyLineRecipe)
      .appearanceBlock(CASING_STEEL_SOLID)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("CCCCCCCCC", "C##OOO##C", "C#######C", "C#######C", "C#######C", "C#######C", "CC#####CC", "#CCCCCCC#", "RCCCCCCCR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#A###A#G", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "GP#####PG", "GP#CCC#PG", "GP#####PG", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "GP#####PG", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "CP#####PC", "CP#CCC#PC", "CP#####PC", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#A###A#G", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "GP#####PG", "GP#CCC#PG", "GP#####PG", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "GP#####PG", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "CP#####PC", "CP#CCC#PC", "CP#####PC", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#A###A#G", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "GP#####PG", "GP#CCC#PG", "GP#####PG", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "GP#####PG", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "CP#####PC", "CP#CCC#PC", "CP#####PC", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#A###A#G", "GL#####LG", "GL#####LG", "C#######C", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "GP#####PG", "GP#CCC#PG", "GP#####PG", "GP#####PG", "GP##L##PG", "CPP#A#PPC", "R#######R", "RC#####CR", "###CKC###")
          .aisle("FCCCCCCCF", "G##T#T##G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RC#####CR", "###CkC###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "GP#####PG", "GL#####LG", "GL#####LG", "CL#####LC", "R#######R", "RC#####CR", "###KKK###")
          .aisle("FCCCCCCCF", "G#######G", "G##CCC##G", "G#######G", "G#######G", "G#######G", "C#######C", "R#######R", "RECCCCCER", "###CKC###")
          .aisle("CCCCCCCCC", "C##T#T##C", "C##III##C", "C##III##C", "C#######C", "C#######C", "CC#MMM#CC", "#CCMSMCC#", "###MMM###", "###CKC###")
          .where('S', Predicates.controller(blocks(definition.getBlock())))
          .where('C', blocks(CASING_STEEL_SOLID.get()))
          .where('O', blocks(CASING_STEEL_SOLID.get()).or(abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1)))
          .where('F', blocks(CASING_STEEL_SOLID.get()).or(abilities(PartAbility.IMPORT_FLUIDS)).setMinGlobalLimited(1))
          .where('T', blocks(GTBlocks.MATERIAL_BLOCKS.get(TagPrefix.frameGt, GTMaterials.TungstenSteel).get()))
          .where('E', blocks(CASING_STEEL_SOLID.get()).or(abilities(PartAbility.INPUT_ENERGY)))
          .where('I', blocks(CASING_STEEL_SOLID.get()).or(abilities(PartAbility.IMPORT_ITEMS)).setMinGlobalLimited(1))
          .where('G', blocks(CASING_LAMINATED_GLASS.get()))
          .where('P', blocks(CASING_PTFE_INERT.get()))
          .where('A', blocks(CASING_ASSEMBLY_CONTROL.get()))
          .where('L', blocks(CASING_GRATE.get()))
          .where('M', blocks(CASING_STEEL_SOLID.get()).or(abilities(PartAbility.MAINTENANCE)).setMinGlobalLimited(1))
          .where("R", blocks(FILTER_CASING.get()))
          .where('K', blocks(CASING_TITANIUM_GEARBOX.get()))
          .where('#', Predicates.air())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
          GTCEu.id("block/multiblock/assembly_line"), false)
      .register();*/

  public final static MultiblockMachineDefinition TEST = GTRRegistries.REGISTRATE.multiblock("test", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.TEST_RESIPES)
      .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
      .appearanceBlock(CASING_STEEL_SOLID)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("XXX", "XXX", "XXX")
          .aisle("XXX", "X#X", "XXX")
          .aisle("XXX", "XSX", "XXX")
          .where('S', Predicates.controller(blocks(definition.getBlock())))
          .where('X', blocks(CASING_STEEL_SOLID.get()).setMinGlobalLimited(14)
              .or(Predicates.autoAbilities(definition.getRecipeTypes()))
              .or(Predicates.autoAbilities(true, true, false)))
          .where('#', Predicates.air())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
          GTCEu.id("block/multiblock/vacuum_freezer"), false)
      .compassNodeSelf().register();

  public final static MultiblockMachineDefinition MEGA_MIXER = GTRRegistries.REGISTRATE.multiblock("mega_mixer", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.MEGA_MIXER_RECIPES)
      .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
      .appearanceBlock(RadiantNaquadahAlloyCasing)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("CCCCCCCCCCCCCCCCCCC")
          .aisle("CCCCCCCCCCCCCCCCCCC")
          .aisle("CCCCCCCCCCCCCCCCCCC")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("#CCCCCCCCCCCCCCCCC#")
          .aisle("CCCCCCCCCCCCCCCCCCC")
          .aisle("CCCCCCCCCCCCCCCCCCC", "#CDDDDDDDDDDDDDDDC#")
          .aisle("CCCCCCCCCCCCCCCCCCC", "#CDDDDDDD~DDDDDDDC#")

          .where('~', Predicates.controller(blocks(definition.getBlock())))
          .where('C', blocks(MiningBlackPlutoniumCasing.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY)).setMaxGlobalLimited(4))
          .where('D', blocks(RadiantNaquadahAlloyCasing.get()).or(Predicates.abilities(PartAbility.MAINTENANCE)).setMaxGlobalLimited(1))


          .where('#', Predicates.air())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_frost_proof"),
                    GTCEu.id("block/multiblock/vacuum_freezer"))
      .compassSections(GTCompassSections.TIER[HV])
      .compassNodeSelf()
      .register();

//  public final static MultiblockMachineDefinition ExtremeHeatExchenger = GTRRegistries.REGISTRATE.multiblock("")

  public final static MultiblockMachineDefinition TurboSCSteamTurbine = registerXlSCSteamTurbine("turbo_sc_steam_turbine", ZPM,
      GTRRecipeTypes.SC_STEAM_TURBINE_FUELS, GTRCasingBlocks.ReinforcedSCTurbine, GTRCasingBlocks.TurbineShaft,
      GTCEuAdd.id("block/casings/solid/reinforced_sc_turbine"),
      GTCEu.id("block/multiblock/generator/large_steam_turbine"));


  public final static MultiblockMachineDefinition XLTurboSCSteamTurbine = registerXlSCSteamTurbine("xl_turbo_sc_steam_turbine", UV,
      GTRRecipeTypes.SC_STEAM_TURBINE_FUELS, GTRCasingBlocks.ReinforcedSCTurbine, GTRCasingBlocks.TurbineShaft,
      GTCEuAdd.id("block/casings/solid/reinforced_sc_turbine"),
      GTCEu.id("block/multiblock/generator/large_steam_turbine"));

  public static MultiblockMachineDefinition registerXlSCSteamTurbine(String name, int tier, GTRecipeType recipeType, Supplier<? extends Block> casing, Supplier<? extends Block> gear, ResourceLocation casingTexture, ResourceLocation overlayModel) {
    return GTRRegistries.REGISTRATE.multiblock(name, holder -> new XLLargeTurbineMachine(holder, tier))
        .rotationState(RotationState.NON_Y_AXIS)
        .recipeType(recipeType)
        .recipeModifier(LargeTurbineMachine::recipeModifier, true)
        .appearanceBlock(casing)
        .pattern(definition -> FactoryBlockPattern.start()
            .aisle("CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC")
            .aisle("CCCCCCC", "RGGGGGR", "CCCCCCC", "CCCCCCC", "RGGGGGR", "CCCCCCC", "CCCCCCC", "RGGGGGR", "CCCCCCC")
            .aisle("CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCMMMCC")
            .aisle("HCCCCCH", "HCCCCCH", "HCCCCCH", "HCCCCCH", "HCCCCCH", "HCCCCCH", "HCCCCCH", "HCCCCCH", "HCMSMCH")
            .aisle("CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCMMMCC")
            .aisle("CCCCCCC", "RGGGGGR", "CCCCCCC", "CCCCCCC", "RGGGGGR", "CCCCCCC", "CCCCCCC", "RGGGGGR", "CCCCCCC")
            .aisle("CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC", "CCCCCCC")
            .where('S', controller(blocks(definition.getBlock())))
            .where('G', blocks(gear.get()))
            .where('C', blocks(casing.get()))
            .where('R', new TraceabilityPredicate(new SimplePredicate(state -> MetaMachine.getMachine(state.getWorld(), state.getPos()) instanceof IRotorHolderMachine rotorHolder &&
                    state.getWorld().getBlockState(state.getPos().relative(rotorHolder.self().getFrontFacing())).isAir(),
                    () -> PartAbility.ROTOR_HOLDER.getAllBlocks().stream().map(BlockInfo::fromBlock).toArray(BlockInfo[]::new)))
                    .addTooltips(Component.translatable("gtceu.multiblock.pattern.clear_amount_3"))
                    .addTooltips(Component.translatable("gtceu.multiblock.pattern.error.limited.1", VN[tier]))
                /*.or(abilities(PartAbility.OUTPUT_ENERGY)).setExactLimit(1)*/)
            .where('H', blocks(casing.get())
                .or(autoAbilities(definition.getRecipeTypes(), false, false, true, true, true, true))
                .or(autoAbilities(true, false, false))
                .or(abilities(PartAbility.OUTPUT_ENERGY)).setMinGlobalLimited(1))
            .where('M', blocks(casing.get())
                .or(autoAbilities(false, true, false).setMinGlobalLimited(1)))
            .build())
        .recoveryItems(() -> new ItemLike[]{GTItems.MATERIAL_ITEMS.get(TagPrefix.dustTiny, GTMaterials.Ash).get()})
        .workableCasingRenderer(casingTexture, overlayModel, false)
        .tooltips(
            Component.translatable("gtceu.universal.tooltip.base_production_eut", V[tier] * 12),
            Component.translatable("gtceu.multiblock.turbine.efficiency_tooltip", VNF[tier]))
        .compassSections(GTCompassSections.TIER[HV])
        .compassNode("xl_turbo_turbine")
        .register();
  }

  public static MultiblockMachineDefinition registerSCSteamTurbine(String name, int tier, GTRecipeType recipeType, Supplier<? extends Block> casing, Supplier<? extends Block> gear, ResourceLocation casingTexture, ResourceLocation overlayModel) {
    return GTRRegistries.REGISTRATE.multiblock(name, holder -> new LargeTurbineMachine(holder, tier))
        .rotationState(RotationState.NON_Y_AXIS)
        .recipeType(recipeType)
        .recipeModifier(LargeTurbineMachine::recipeModifier, true)
        .appearanceBlock(casing)
        .pattern(definition -> FactoryBlockPattern.start()
            .aisle("CCCC", "CHHC", "CCCC")
            .aisle("CHHC", "RGGR", "CHHC")
            .aisle("CCCC", "CSHC", "CCCC")
            .where('S', controller(blocks(definition.getBlock())))
            .where('G', blocks(gear.get()))
            .where('C', blocks(casing.get()))
            .where('R', new TraceabilityPredicate(new SimplePredicate(state -> MetaMachine.getMachine(state.getWorld(), state.getPos()) instanceof IRotorHolderMachine rotorHolder &&
                state.getWorld().getBlockState(state.getPos().relative(rotorHolder.self().getFrontFacing())).isAir(),
                () -> PartAbility.ROTOR_HOLDER.getAllBlocks().stream().map(BlockInfo::fromBlock).toArray(BlockInfo[]::new)))
                .addTooltips(Component.translatable("gtceu.multiblock.pattern.clear_amount_3"))
                .addTooltips(Component.translatable("gtceu.multiblock.pattern.error.limited.1", VN[tier]))
                .setExactLimit(1)
                .or(abilities(PartAbility.OUTPUT_ENERGY)).setExactLimit(1))
            .where('H', blocks(casing.get())
                .or(autoAbilities(definition.getRecipeTypes(), false, false, true, true, true, true))
                .or(autoAbilities(true, true, false)))
            .build())
        .recoveryItems(() -> new ItemLike[]{GTItems.MATERIAL_ITEMS.get(TagPrefix.dustTiny, GTMaterials.Ash).get()})
        .workableCasingRenderer(casingTexture, overlayModel, false)
        .tooltips(
            Component.translatable("gtceu.universal.tooltip.base_production_eut", V[tier] * 2),
            Component.translatable("gtceu.multiblock.turbine.efficiency_tooltip", VNF[tier]))
        .compassSections(GTCompassSections.TIER[HV])
        .compassNode("xl_turbo_turbine")
        .register();
  }





  public static void init() {
    //CircuitAssembler.register();
  }
}
