package com.zircky.gtceuadd.data.recipe.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static appeng.api.util.AEColor.TRANSPARENT;
import static appeng.core.definitions.AEParts.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class AppliedEnergistics2Recipe {
  public static void init(Consumer<FinishedRecipe> provider) {
    AE2Recipe(provider);
  }

  public static void AE2Recipe(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/inscribers", new ItemStack(AEBlocks.INSCRIBER.asItem()),
        "FPF", "CMC", "FPF",
        'F', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'P', new ItemStack(GTItems.ELECTRIC_PISTON_EV.asItem()),
        'M', GTMachines.FORMING_PRESS[4].asStack(),
        'C', new ItemStack(GTItems.VOLTAGE_COIL_MV.asItem()));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_access_point", new ItemStack(AEBlocks.WIRELESS_ACCESS_POINT.asItem()),
        " W ", "SCS", "dGw",
        'G', new ItemStack(GLASS_CABLE.item(TRANSPARENT)),
        'W', new ItemStack(AEItems.WIRELESS_RECEIVER.asItem()),
        'C', new ItemStack(AEItems.CALCULATION_PROCESSOR.asItem()),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.TitaniumTungstenCarbide));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/crystal_processing_charger", new ItemStack(AEBlocks.CHARGER.asItem()),
        "PFP", "CMC", "PFP",
        'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'F', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'C', new UnificationEntry(TagPrefix.cableGtSingle, GTMaterials.Copper),
        'M', GTMachines.ELECTROLYZER[4].asStack());

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/io_condenser", new ItemStack(AEBlocks.CONDENSER.asItem()),
        "DPD", "PMP", "DPD",
        'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'D', new ItemStack(GTItems.ELECTRIC_PISTON_IV),
        'M', new ItemStack(GTMachines.HULL[5].getBlock()));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/energy_energy_acceptor", new ItemStack(AEBlocks.ENERGY_ACCEPTOR.asItem()),
        "DPD", "PMP", "DPD",
        'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'M', new UnificationEntry(TagPrefix.plate, GTMaterials.Glowstone));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/energy_vibration_chamber", new ItemStack(AEBlocks.VIBRATION_CHAMBER.asItem()),
        "DSD", "sMw", "DED",
        'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.TitaniumTungstenCarbide),
        'E', new ItemStack(AEBlocks.ENERGY_ACCEPTOR),
        'M', GTMachines.ELECTRIC_FURNACE[4].asStack());

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/crystal_processing_growth_accelerator", new ItemStack(AEBlocks.GROWTH_ACCELERATOR.asItem()),
        "DGD", "CMC", "DED",
        'D', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'G', new ItemStack(AEBlocks.QUARTZ_GLASS),
        'C', new ItemStack(GLASS_CABLE.item(TRANSPARENT)),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR),
        'M', GTMachines.AUTOCLAVE[5].asStack());

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/crafting/patterns_blank", new ItemStack(AEItems.BLANK_PATTERN),
        "GPG", "PCP", "ATA",
        'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'G', new ItemStack(AEBlocks.QUARTZ_GLASS),
        'C', new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz),
        'A', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Aluminium),
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide));


    COMPRESSOR_RECIPES.recipeBuilder("ae2/decorative/quartz_block")
        .inputItems(new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz), 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_BLOCK))
        .duration(600).EUt(16).save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ae2/decorative/quartz_glass_alloy")
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.CertusQuartz), 5)
        .inputItems(TagPrefix.block, GTMaterials.Glass, 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_GLASS, 4))
        .duration(400).EUt(16).save(provider);

    BLAST_RECIPES.recipeBuilder("ae2/decorative/quartz_glass_blast")
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.CertusQuartz), 5)
        .inputItems(TagPrefix.block, GTMaterials.Glass, 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_GLASS, 4))
        .blastFurnaceTemp(1000)
        .duration(400).EUt(16).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/decorative/quartz_vibrant_glass")
        .inputItems(new ItemStack(AEBlocks.QUARTZ_GLASS))
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Glowstone), 8)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_VIBRANT_GLASS))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/decorative/quartz_fixture")
        .inputItems(new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED))
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.Tantalum))
        .outputItems(new ItemStack(AEBlocks.QUARTZ_FIXTURE))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    COMPRESSOR_RECIPES.recipeBuilder("ae2/decorative/fluix_block")
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 4))
        .outputItems(new ItemStack(AEBlocks.FLUIX_BLOCK))
        .duration(600).EUt(16).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder(GTCEuAdd.id("ae2/sky_dust_x1"))
        .inputItems(new ItemStack(AEItems.SKY_DUST))
        .circuitMeta(1)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.BasalticMineralSand, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Olivine, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Obsidian, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Basalt, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Flint, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.RareEarth, 1, 2000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.LV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder(GTCEuAdd.id("ae2/sky_dust_x9"))
        .inputItems(new ItemStack(AEItems.SKY_DUST, 18))
        .circuitMeta(2)
        .chancedOutput(TagPrefix.dust, GTMaterials.BasalticMineralSand, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Olivine, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Obsidian, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Basalt, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Flint, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.RareEarth, 1, 9000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.MV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SKY_STONE_BLOCK, 8))
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .outputItems(new ItemStack(AEBlocks.SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_smooth_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK, 8))
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .outputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor_print")
        .notConsumable(AEItems.CALCULATION_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.CertusQuartz))
        .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor_print")
        .notConsumable(AEItems.ENGINEERING_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Diamond))
        .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/logic_processor_print")
        .notConsumable(AEItems.LOGIC_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.RoseGold))
        .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/silicon_print")
        .notConsumable(AEItems.SILICON_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Silicon))
        .outputItems(new ItemStack(AEItems.SILICON_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor")
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor")
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/logic_processor")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("ae2/misc/tiny_tnt")
        .inputItems(new ItemStack(Blocks.TNT))
        .outputItems(new ItemStack(AEBlocks.TINY_TNT))
        .duration(20 * 30).EUt(5).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/quantum_ring")
        .inputItems(new ItemStack(AEBlocks.ENERGY_CELL))
        .inputItems(new UnificationEntry(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 2))
        .inputItems(new ItemStack(SMART_DENSE_CABLE.item(TRANSPARENT)))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.QUANTUM_RING))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/quantum_link")
        .inputItems(new UnificationEntry(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.FLUIX_PEARL, 4))
        .inputItems(new ItemStack(AEBlocks.QUARTZ_GLASS))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.QUANTUM_LINK))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/spatial_io_pylon")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FLUIX_DUST, 2))
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.SPATIAL_PYLON))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/spatial_io_port")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .inputItems(new ItemStack(AEBlocks.IO_PORT))
        .inputItems(new ItemStack(AEBlocks.SPATIAL_PYLON))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.SPATIAL_IO_PORT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/controller")
        .inputItems(new UnificationEntry(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 2))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CONTROLLER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/storage_drive")
        .inputItems(new UnificationEntry(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(CustomTags.EV_CIRCUITS)
        .inputItems(new ItemStack(AEBlocks.CHEST))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.DRIVE))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/storage_chest")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CHEST))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/interfaces_interface")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.INTERFACE))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/pattern_providers_interface")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .inputItems(Blocks.CRAFTING_TABLE.asItem(), 2)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.PATTERN_PROVIDER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/cell_workbench")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new ItemStack(GTItems.COVER_SCREEN))
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CELL_WORKBENCH))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/io_port")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 3)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 3))
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .inputItems(new ItemStack(AEBlocks.DRIVE, 2))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.IO_PORT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/energy_energy_cell")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Titanium), 4)
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.FLUIX_DUST))
        .inputItems(new ItemStack(AEBlocks.FLUIX_BLOCK))
        .inputItems(new UnificationEntry(TagPrefix.cableGtQuadruple, GTMaterials.Aluminium))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.ENERGY_CELL))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/energy_dense_energy_cell")
        .inputItems(CustomTags.LuV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEBlocks.ENERGY_CELL, 5))
        .inputItems(GTMachines.BATTERY_BUFFER_16[4])
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_unit")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(CustomTags.LV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_accelerator")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 2))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_ACCELERATOR))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_monitor")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(STORAGE_MONITOR.asItem())
        .outputItems(new ItemStack(AEBlocks.CRAFTING_MONITOR))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/molecular_assembler")
        .inputItems(GTMachines.ASSEMBLER[5])
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .circuitMeta(3)
        .inputFluids(GTMaterials.Glass.getFluid(288))
        .outputItems(new ItemStack(AEBlocks.MOLECULAR_ASSEMBLER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/1k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_1K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_1K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/4k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_4K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_4K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/16k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_16K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_16K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/64k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_64K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_64K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/256k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_256K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_256K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);



  }
}
