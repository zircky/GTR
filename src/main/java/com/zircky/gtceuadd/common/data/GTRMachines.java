package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
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
import com.gregtechceu.gtceu.common.machine.multiblock.part.EnergyHatchPartMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.part.LaserHatchPartMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.lowdragmc.lowdraglib.utils.BlockInfo;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.registries.GTRRegistries;

import divinerpg.DivineRPG;
import divinerpg.registries.BlockRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.registerSimpleMachines;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.registerTieredMachines;


public class GTRMachines {
  public final static int[] ALL_TIERS = GTValues.tiersBetween(ULV, GTCEuAPI.isHighTier() ? MAX : UHV);

  public static MultiblockMachineDefinition CIRCUIT_ASSEMBLER_R_M;
  public static MachineDefinition[] CIRCUIT_ASSEMBLER_R = registerSimpleMachines("circuit_assembler_r", GTRRecipeTypes.CIRCUIT_ASSEMBLER_R_RECIPES);

  public static final MachineDefinition[] LASER_INPUT_HATCH_16384 = registerLaserHatch(IO.IN, 16384, PartAbility.INPUT_LASER, GTValues.tiersBetween(UV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_16384 = registerLaserHatch(IO.OUT, 16384, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(UV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_65536 = registerLaserHatch(IO.IN, 65536, PartAbility.INPUT_LASER, GTValues.tiersBetween(UHV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_65536 = registerLaserHatch(IO.OUT, 65536, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(UHV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_262144 = registerLaserHatch(IO.IN, 262144, PartAbility.INPUT_LASER, GTValues.tiersBetween(UEV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_262144 = registerLaserHatch(IO.OUT, 262144, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(UEV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_1048576 = registerLaserHatch(IO.IN, 1048576, PartAbility.INPUT_LASER, GTValues.tiersBetween(UIV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_1048576 = registerLaserHatch(IO.OUT, 1048576, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(UIV, GTCEuAPI.isHighTier() ? OpV : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_4194304 = registerLaserHatch(IO.IN, 4194304, PartAbility.INPUT_LASER, GTValues.tiersBetween(UXV, GTCEuAPI.isHighTier() ? MAX : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_4194304 = registerLaserHatch(IO.OUT, 4194304, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(UXV, GTCEuAPI.isHighTier() ? MAX : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_1677216 = registerLaserHatch(IO.IN, 1677216, PartAbility.INPUT_LASER, GTValues.tiersBetween(OpV, GTCEuAPI.isHighTier() ? MAX : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_1677216 = registerLaserHatch(IO.OUT, 1677216, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(OpV, GTCEuAPI.isHighTier() ? MAX : UHV));
  public static final MachineDefinition[] LASER_INPUT_HATCH_67108864 = registerLaserHatch(IO.IN, 67108864, PartAbility.INPUT_LASER, GTValues.tiersBetween(MAX, GTCEuAPI.isHighTier() ? MAX_TRUE : UHV));
  public static final MachineDefinition[] LASER_OUTPUT_HATCH_67108864 = registerLaserHatch(IO.OUT, 67108864, PartAbility.OUTPUT_LASER, GTValues.tiersBetween(MAX, GTCEuAPI.isHighTier() ? MAX_TRUE : UHV));

  public final static MultiblockMachineDefinition Endgame = GTRRegistries.REGISTRATE.multiblock("endgame", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.ENDGAME_RECIPES)
      .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
      .appearanceBlock(CASING_HIGH_TEMPERATURE_SMELTING)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "       HHH   HHH       ", "       HHH   HHH       ", "       HHH   HHH       ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "       HHH   HHH       ", "      A   RRR   A      ", "     H           H     ", "     H           H     ", "     H           H     ", "      R   FFF   R      ", "      R   FFF   R      ", "      R   FFF   R      ", "     H           H     ", "     H           H     ", "     H           H     ", "      A   RRR   A      ", "       HHH   HHH       ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "      A   RRR   A      ", "     A           A     ", "   HH             HH   ", "   HH             HH   ", "   HH             HH   ", "     R           R     ", "     R           R     ", "     R           R     ", "   HH             HH   ", "   HH             HH   ", "   HH             HH   ", "     A           A     ", "      A   RRR   A      ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "     A           A     ", "   AA             AA   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   RR             RR   ", "   RR             RR   ", "   RR             RR   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   AA             AA   ", "     A           A     ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "    A             A    ", "   A               A   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   R               R   ", "   R               R   ", "   R               R   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   A               A   ", "    A             A    ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "       HHH   HHH       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "   A               A   ", "   A               A   ", "  A                 A  ", " H                   H ", " H                   H ", " H                   H ", "  R                 R  ", "  R                 R  ", "  R                 R  ", " H                   H ", " H                   H ", " H                   H ", "  A                 A  ", "   A               A   ", "   A               A   ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "       HHH   HHH       ", "                       ")
          .aisle("       HHH   HHH       ", "      A   RRR   A      ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "   A               A   ", "  A                 A  ", "  A                 A  ", " A                   A ", "H                     H", "H                     H", "H                     H", " R                   R ", " R                   R ", " R                   R ", "H                     H", "H                     H", "H                     H", " A                   A ", "  A                 A  ", "  A                 A  ", "   A               A   ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "      A   RRR   A      ", "       HHH   HHH       ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("       HHH   HHH       ", "      R   FFF   R      ", "      R         R      ", "     R           R     ", "    R             R    ", "   R               R   ", "  R                 R  ", "  R                 R  ", " R                   R ", "H                     H", "H                     H", "H                     H", " F                   F ", " F                   F ", " F                   F ", "H                     H", "H                     H", "H                     H", " R                   R ", "  R                 R  ", "  R                 R  ", "   R               R   ", "    R             R    ", "     R           R     ", "      R         R      ", "      R   FFF   R      ", "       HHH   HHH       ")
          .aisle("       HHH   HHH       ", "      R   FFF   R      ", "      R         R      ", "     R           R     ", "    R             R    ", "   R               R   ", "  R                 R  ", "  R                 R  ", " R                   R ", "H                     H", "H                     H", "H                     H", " F                   F ", " F                   F ", " F                   F ", "H                     H", "H                     H", "H                     H", " R                   R ", "  R                 R  ", "  R                 R  ", "   R               R   ", "    R             R    ", "     R           R     ", "      R         R      ", "      R   FFF   R      ", "       HHH   HHH       ")
          .aisle("       HHH   HHH       ", "      R   FFF   R      ", "      R         R      ", "     R           R     ", "    R             R    ", "   R               R   ", "  R                 R  ", "  R                 R  ", " R                   R ", "H                     H", "H                     H", "H                     H", " F                   F ", " F                   F ", " F                   F ", "H                     H", "H                     H", "H                     H", " R                   R ", "  R                 R  ", "  R                 R  ", "   R               R   ", "    R             R    ", "     R           R     ", "      R         R      ", "      R   FFF   R      ", "       HHH   HHH       ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("      HHHHHHHHHHH      ", "     H           H     ", "     H           H     ", "    H             H    ", "   H               H   ", "  H                 H  ", " H                   H ", " H                   H ", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", "H                     H", " H                   H ", " H                   H ", "  H                 H  ", "   H               H   ", "    H             H    ", "     H           H     ", "     H           H     ", "      HHHHHHHHHHH      ")
          .aisle("       HHH   HHH       ", "      A   RRR   A      ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "   A               A   ", "  A                 A  ", "  A                 A  ", " A                   A ", "H                     H", "H                     H", "H                     H", " R                   R ", " R                   R ", " R                   R ", "H                     H", "H                     H", "H                     H", " A                   A ", "  A                 A  ", "  A                 A  ", "   A               A   ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "      A   RRR   A      ", "       HHH   HHH       ")
          .aisle("                       ", "       HHH   HHH       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "   A               A   ", "   A               A   ", "  A                 A  ", " H                   H ", " H                   H ", " H                   H ", "  R                 R  ", "  R                 R  ", "  R                 R  ", " H                   H ", " H                   H ", " H                   H ", "  A                 A  ", "   A               A   ", "   A               A   ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "       HHH   HHH       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "    A             A    ", "    A             A    ", "   A               A   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   R               R   ", "   R               R   ", "   R               R   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   A               A   ", "    A             A    ", "    A             A    ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "     A           A     ", "     A           A     ", "   AA             AA   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   RR             RR   ", "   RR             RR   ", "   RR             RR   ", "  H                 H  ", "  H                 H  ", "  H                 H  ", "   AA             AA   ", "     A           A     ", "     A           A     ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      A   RRR   A      ", "      A   RRR   A      ", "     A           A     ", "   HH             HH   ", "   HH             HH   ", "   HH             HH   ", "     R           R     ", "     R           R     ", "     R           R     ", "   HH             HH   ", "   HH             HH   ", "   HH             HH   ", "     A           A     ", "      A   RRR   A      ", "      A   RRR   A      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "       HHH   HHH       ", "      A   RRR   A      ", "     H           H     ", "     H           H     ", "     H           H     ", "      R   HHH   R      ", "      R   HSH   R      ", "      R   HHH   R      ", "     H           H     ", "     H           H     ", "     H           H     ", "      A   RRR   A      ", "       HHH   HHH       ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .aisle("                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "       HHH   HHH       ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "       HHH   HHH       ", "       HHH   HHH       ", "       HHH   HHH       ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "      HHHHHHHHHHH      ", "       HHH   HHH       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ", "                       ")
          .where('S', Predicates.controller(blocks(definition.getBlock())))
          .where('H', blocks(CASING_HIGH_TEMPERATURE_SMELTING.get()))
          .where('R', blocks(CASING_REACTION_SAFE.get()))
          .where('A', blocks(CASING_ATOMIC.get()))
          .where('F', blocks(FUSION_CASING_MK3.get()).setMinGlobalLimited(18)
              .or(autoAbilities(true, false, false))
              .or(abilities(PartAbility.INPUT_LASER).setMinGlobalLimited(1).setMaxGlobalLimited(9))
              .or(abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1).setMaxGlobalLimited(9))
              .or(abilities(PartAbility.IMPORT_FLUIDS).setMinGlobalLimited(1).setMaxGlobalLimited(9))
              .or(abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1).setMaxGlobalLimited(9))
              .or(abilities(PartAbility.EXPORT_FLUIDS).setMinGlobalLimited(1).setMaxGlobalLimited(9)))
          .where(' ', Predicates.air())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/gcym/high_temperature_smelting_casing"),
          GTCEu.id("block/multiblock/assembly_line"), false)
      .register();

  public final static MultiblockMachineDefinition CompressedBlocks = GTRRegistries.REGISTRATE.multiblock("compressed_blocks", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.COMPRESSED_BLOCKS_RECIPES)
      .recipeModifier(GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK))
      .appearanceBlock(CASING_ATOMIC)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("#TTTTTTT#", "DXXXXXXXD", "DXEAAAEXD", "DXGGGGGXD", "DXGGGGGXD", "DXGGGGGXD", "DXEAAAEXD", "DXXXXXXXD", "#TTTTTTT#")
          .aisle("TXXXXXXXT", "XXELKLEXX", "XB#####BX", "X#######X", "X#######X", "X#######X", "XB#####BX", "XXE#K#EXX", "TXXXXXXXT")
          .aisle("TXMMMMMXT", "XE##K##EX", "E#######E", "G###K###G", "G#######G", "G###K###G", "E#######E", "XE##K##EX", "TXPPPPPXT")
          .aisle("TXMMMMMXT", "XL#RKR#LX", "A#######A", "G##KKK##G", "G#######G", "G##KKK##G", "A#######A", "X###K###X", "TXPPPPPXT")
          .aisle("TXMMMMMXT", "XKKKKKKKX", "A###K###A", "G#KKKKK#G", "G#######G", "G#KKKKK#G", "A###K###A", "XKKKKKKKX", "TXPPPPPXT")
          .aisle("TXMMMMMXT", "XL#RKR#LX", "A#######A", "G##KKK##G", "G#######G", "G##KKK##G", "A#######A", "X###K###X", "TXPPPPPXT")
          .aisle("TXMMMMMXT", "XE##K##EX", "E#######E", "G###K###G", "G#######G", "G###K###G", "E#######E", "XE##K##EX", "TXPPPPPXT")
          .aisle("TXXXXXXXT", "XXELKLEXX", "XB#####BX", "X#######X", "X#######X", "X#######X", "XB#####BX", "XXE#K#EXX", "TXXXXXXXT")
          .aisle("#TTTTTTT#", "DQQQQQQQD", "DQQQQQQQD", "DQQQQQQQD", "DQQQSQQQD", "DQQQQQQQD", "DQQQQQQQD", "DQQQQQQQD", "#TTTTTTT#")
          .where('S', Predicates.controller(blocks(definition.getBlock())))
          .where('X', blocks(CASING_ATOMIC.get()))
          .where('Q', blocks(CASING_ATOMIC.get())
              .or(autoAbilities(definition.getRecipeTypes()))
              .or(autoAbilities(true, true, true))
              .or(abilities(PartAbility.EXPORT_ITEMS).setMaxGlobalLimited(2))
              .or(abilities(PartAbility.INPUT_ENERGY).setMaxGlobalLimited(1))
              .or(abilities(PartAbility.IMPORT_FLUIDS).setExactLimit(1))
              .or(abilities(PartAbility.EXPORT_FLUIDS).setMaxGlobalLimited(2)))
          .where('M', blocks(BlockRegistry.mortumBlock.get()))
          .where('T', blocks(ChemicalHelper.getBlock(TagPrefix.frameGt, GTRMaterials.TitaniumNitride)))
          .where('D', blocks(ChemicalHelper.getBlock(TagPrefix.frameGt, GTRMaterials.Draconium)))
          .where('E', blocks(BlockRegistry.edenBlock.get()))
          .where('L', blocks(ChemicalHelper.getBlock(TagPrefix.frameGt, GTRMaterials.ElvenElementium)))
          .where('K', blocks(BlockRegistry.skythernBlock.get()))
          .where('R', blocks(ChemicalHelper.getBlock(TagPrefix.frameGt, GTRMaterials.Terrasteel)))
          .where('A', blocks(BlockRegistry.apalachiaBlock.get()))
          .where('B', blocks(BlockRegistry.bloodgemBlock.get()))
          .where('G', blocks(CASING_LAMINATED_GLASS.get()))
          .where('P', blocks(CASING_SHOCK_PROOF.get()))
          .where('#', Predicates.air())
          .build())
      .workableCasingRenderer(GTCEu.id("block/casings/gcym/atomic_casing"),
          GTCEu.id("block/multiblock/assembly_line"), false)
      .register();


  public static MachineDefinition[] registerLaserHatch(IO io, int amperage, PartAbility ability, int... tiers) {
    String name = io == IO.IN ? "target" : "source";
    return registerTieredMachines(amperage + "a_laser_" + name + "_hatch",
        (holder, tier) -> new LaserHatchPartMachine(holder, io, tier, amperage),
        (tier, builder) -> builder
            .langValue(VNF[tier] + " " + FormattingUtil.formatNumbers(amperage) + "A Laser " +
                FormattingUtil.toEnglishName(name) + " Hatch")
            .rotationState(RotationState.ALL)
            .tooltips(Component.translatable("gtceu.machine.laser_hatch." + name + ".tooltip"),
                Component.translatable("gtceu.machine.laser_hatch.both.tooltip"),
                Component.translatable("gtceu.universal.disabled"))
            .abilities(ability)
            .overlayTieredHullRenderer("laser_hatch." + name)
            .register(),
        tiers);
  }

  public static void init() {
    //CircuitAssembler.register();
  }
}
