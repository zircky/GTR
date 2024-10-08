package com.zircky.gtceuadd.data.recipe.addition.ae2.network;

import appeng.api.util.AEColor;
import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import appeng.hooks.AEToolItem;
import com.electronwill.nightconfig.core.utils.ObservedMap;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTCovers;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.gtceuadd.data.recipe.GTRCraftingComponent;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static appeng.core.definitions.AEParts.CRAFTING_TERMINAL;
import static appeng.core.definitions.AEParts.TERMINAL;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.WIREMILL_RECIPES;
import static com.zircky.gtceuadd.data.recipe.GTRCraftingComponent.ANCHOR;
import static com.zircky.gtceuadd.data.recipe.GTRCraftingComponent.registerCableAnchorRecipes;

public class Parts {
  public static void init(Consumer<FinishedRecipe> provider) {
    parts(provider);
  }

  public static void parts(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/terminals_crafting", CRAFTING_TERMINAL.stack(),
        "dTr", "QCQ", "PSP",
        'T', new ItemStack(TERMINAL),
        'Q', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'P', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'C', Blocks.CRAFTING_TABLE.asItem(),
        'S', new ItemStack(AEItems.ENGINEERING_PROCESSOR));

    WIREMILL_RECIPES.recipeBuilder("ae2/network/parts/quartz_fiber_part_c")
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.CertusQuartz), 2)
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.QUARTZ_FIBER))
        .duration(80).EUt(GTValues.VA[GTValues.HV]).save(provider);
    WIREMILL_RECIPES.recipeBuilder("ae2/network/parts/quartz_fiber_part_n")
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.NetherQuartz), 8)
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.QUARTZ_FIBER))
        .duration(80).EUt(GTValues.VA[GTValues.HV]).save(provider);
    WIREMILL_RECIPES.recipeBuilder("ae2/network/parts/quartz_fiber_part_q")
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.Quartzite), 4)
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.QUARTZ_FIBER))
        .duration(80).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/level_emitter")
        .inputItems(new ItemStack(Blocks.REDSTONE_TORCH))
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .outputItems(new ItemStack(AEParts.LEVEL_EMITTER))
        .duration(200).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/energy_level_emitter")
        .inputItems(new ItemStack(Blocks.REDSTONE_TORCH))
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz), 2)
        .outputItems(new ItemStack(AEParts.ENERGY_LEVEL_EMITTER))
        .duration(200).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/toggle_bus")
        .inputItems(new ItemStack(AEParts.LEVEL_EMITTER))
        .inputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT), 2))
        .outputItems(new ItemStack(AEParts.TOGGLE_BUS))
        .duration(200).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/toggle_bus_alt")
        .inputItems(new ItemStack(AEParts.INVERTED_TOGGLE_BUS))
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.TOGGLE_BUS))
        .duration(100).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/toggle_bus_inverted_alt")
        .inputItems(new ItemStack(AEParts.TOGGLE_BUS))
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.INVERTED_TOGGLE_BUS))
        .duration(100).EUt(GTValues.VA[GTValues.HV]).save(provider);

    registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_", ANCHOR);

    ASSEMBLER_RECIPES.recipeBuilder("ae2network/parts/panels_monitor")
        .inputItems(new ItemStack(AEParts.SEMI_DARK_MONITOR))
        .circuitMeta(3)
        .outputItems(new ItemStack(AEParts.MONITOR))
        .duration(100).EUt(GTValues.VA[GTValues.MV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2network/parts/panels_semi_dark_monitor_alt", new ItemStack(AEParts.SEMI_DARK_MONITOR),
        "dTh", "SMS", "GRG",
        'T', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'M', new ItemStack(GTItems.COVER_SCREEN),
        'G', new UnificationEntry(TagPrefix.plate, GTMaterials.Glowstone),
        'R', new UnificationEntry(TagPrefix.plate, GTMaterials.RedAlloy));

    ASSEMBLER_RECIPES.recipeBuilder("ae2network/parts/panels_semi_dark_monitor_alt")
        .inputItems(new ItemStack(AEParts.DARK_MONITOR))
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.SEMI_DARK_MONITOR))
        .duration(100).EUt(GTValues.VA[GTValues.MV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2network/parts/panels_dark_monitor")
        .inputItems(new ItemStack(AEParts.SEMI_DARK_MONITOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEParts.DARK_MONITOR))
        .duration(100).EUt(GTValues.VA[GTValues.MV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/storage_bus", new ItemStack(AEParts.STORAGE_BUS),
        "dCh", "SIS", "NPN",
        'C', Tags.Items.CHESTS_WOODEN,
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'I', new ItemStack(AEParts.INTERFACE),
        'N', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'P', new ItemStack(GTItems.ELECTRIC_PISTON_MV));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/storage_bus_alt")
        .inputItems(Tags.Items.CHESTS_WOODEN)
        .inputItems(new ItemStack(AEParts.INTERFACE.asItem()))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz), 2)
        .inputItems(new ItemStack(GTItems.ELECTRIC_PISTON_MV))
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz))
        .outputItems(new ItemStack(AEParts.STORAGE_BUS))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/import_bus", new ItemStack(AEParts.IMPORT_BUS),
        "dTh", "SAS", "NPN",
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'A', new ItemStack(AEItems.ANNIHILATION_CORE),
        'N', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'P', new ItemStack(GTItems.ELECTRIC_PISTON_MV));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/import_bus_alt")
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz), 2)
        .inputItems(new ItemStack(GTItems.ELECTRIC_PISTON_MV))
        .outputItems(new ItemStack(AEParts.IMPORT_BUS))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/export_bus", new ItemStack(AEParts.EXPORT_BUS),
        "dTh", "SFS", "NPN",
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'F', new ItemStack(AEItems.FORMATION_CORE),
        'N', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'P', new ItemStack(GTItems.ELECTRIC_PISTON_MV));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/export_bus_alt")
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz), 2)
        .inputItems(new ItemStack(GTItems.ELECTRIC_PISTON_MV))
        .outputItems(new ItemStack(AEParts.EXPORT_BUS))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/tunnels_me", new ItemStack(AEParts.ME_P2P_TUNNEL),
        "dTh", "SES", "FFF",
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'F', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/tunnels_me_alt")
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz), 2)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 3))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .outputItems(new ItemStack(AEParts.ME_P2P_TUNNEL))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/formation_plane", new ItemStack(AEParts.FORMATION_PLANE),
        "dHh", "SFS", "UUU",
        'H', new ItemStack(Blocks.HOPPER),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'U', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'F', new ItemStack(AEItems.FORMATION_CORE));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/formation_plane_alt")
        .inputItems(new ItemStack(Blocks.HOPPER))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz), 2)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 3))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .outputItems(new ItemStack(AEParts.FORMATION_PLANE))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/annihilation_plane", new ItemStack(AEParts.ANNIHILATION_PLANE),
        "dPh", "SFS", "UUU",
        'H', new ItemStack(AEItems.CERTUS_QUARTZ_PICK),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'U', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'F', new ItemStack(AEItems.FORMATION_CORE));

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/parts/annihilation_plane_alt")
        .inputItems(new ItemStack(AEItems.CERTUS_QUARTZ_PICK))
        .inputItems(new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz), 2)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 3))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .outputItems(new ItemStack(AEParts.ANNIHILATION_PLANE))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/terminals", new ItemStack(TERMINAL),
        "NQN","PES","NdN",
        'N', new UnificationEntry(TagPrefix.rod, GTMaterials.NetherQuartz),
        'Q', new UnificationEntry(TagPrefix.screw, GTMaterials.Quartzite),
        'P', new ItemStack(AEParts.SEMI_DARK_MONITOR),
        'E', CustomTags.EV_CIRCUITS,
        'S', new UnificationEntry(TagPrefix.plate, GTMaterials.StainlessSteel));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/terminals_pattern_access", new ItemStack(AEParts.PATTERN_ACCESS_TERMINAL),
        "dTr","SIS","NEN",
        'T', new ItemStack(TERMINAL),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'I', new ItemStack(AEParts.INTERFACE),
        'N', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/parts/terminals_pattern_encoding", new ItemStack(AEParts.PATTERN_ENCODING_TERMINAL),
        "dTr","SPS","NEN",
        'T', new ItemStack(TERMINAL),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'P', new ItemStack(AEItems.BLANK_PATTERN),
        'N', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR));

  }

  public static String[] materials = {"iron", "copper", "Bronze", "Tin", "Steel", "Aluminium", "Lead", "Lead", "Nickel", "Silver", "Brass", "Invar", "StainlessSteel", "Titanium"};

}

