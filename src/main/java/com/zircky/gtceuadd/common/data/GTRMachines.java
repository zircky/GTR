package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.gtceuadd.api.registries.GTRRegistries;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.abilities;
import static com.gregtechceu.gtceu.api.pattern.Predicates.blocks;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;
//import static com.gregtechceu.gtceu.common.data.GTMachines.registerSimpleMachines;


public class GTRMachines {
  public final static int[] ALL_TIERS = GTValues.tiersBetween(ULV, GTCEuAPI.isHighTier() ? MAX : UHV);

  public final static MachineDefinition[] SCANNER = registerSimpleMachines("scanner", GTRRecipeTypes.SCANNER_RECIPES);
  public final static MultiblockMachineDefinition COMPONENT_ASSEMBLY_LINE = GTRRegistries.REGISTRATE.multiblock("component_assembly_line", WorkableElectricMultiblockMachine::new)
      .langValue("Component Assembly Line")
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(GTRRecipeTypes.ComponentAssemblyLineRecipes)
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
          .where('O', blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1)))
          .where('F', blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.IMPORT_FLUIDS)).setMinGlobalLimited(1))
          .where('T', blocks(GTBlocks.MATERIAL_BLOCKS.get(TagPrefix.frameGt, GTMaterials.TungstenSteel).get()))
          .where('E', blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY)))
          .where('I', blocks(CASING_STEEL_SOLID.get()).or(Predicates.abilities(PartAbility.IMPORT_ITEMS)).setMinGlobalLimited(1))
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
      .register();

/*  public final static MultiblockMachineDefinition NUCLER_REACTOR = GTRRegistries.REGISTRATE.multiblock("nucler_reactor", );


  public static MultiblockMachineDefinition registerNuclerReactor(String name, int tier, GTRecipeType recipeType, Supplier<? extends Block> casing, ResourceLocation casingTexture, ResourceLocation overlayModel) {
    return GTRRegistries.REGISTRATE.multiblock(name, holder -> new )
  }*/

  public static void init() {

  }
}
