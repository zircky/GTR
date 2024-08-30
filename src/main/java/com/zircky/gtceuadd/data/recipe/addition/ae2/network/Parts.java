package com.zircky.gtceuadd.data.recipe.addition.ae2.network;

import appeng.api.util.AEColor;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static appeng.core.definitions.AEParts.CRAFTING_TERMINAL;
import static appeng.core.definitions.AEParts.TERMINAL;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.WIREMILL_RECIPES;

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

      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_iron", new UnificationEntry(TagPrefix.bolt, GTMaterials.Iron));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_copper", new UnificationEntry(TagPrefix.bolt, GTMaterials.Copper));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_bronze", new UnificationEntry(TagPrefix.bolt, GTMaterials.Bronze));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_tin", new UnificationEntry(TagPrefix.bolt, GTMaterials.Tin));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_steel", new UnificationEntry(TagPrefix.bolt, GTMaterials.Steel), 2);
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_aluminium", new UnificationEntry(TagPrefix.bolt, GTMaterials.Aluminium), 2);
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_lead", new UnificationEntry(TagPrefix.bolt, GTMaterials.Lead));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_nickel", new UnificationEntry(TagPrefix.bolt, GTMaterials.Nickel));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_silver", new UnificationEntry(TagPrefix.bolt, GTMaterials.Silver));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_brass", new UnificationEntry(TagPrefix.bolt, GTMaterials.Brass));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_invar", new UnificationEntry(TagPrefix.bolt, GTMaterials.Invar));
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_stainless_steel", new UnificationEntry(TagPrefix.bolt, GTMaterials.StainlessSteel), 3);
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_titanium", new UnificationEntry(TagPrefix.bolt, GTMaterials.Titanium), 4);
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_titanium_tungsten_carbide", new UnificationEntry(TagPrefix.bolt, GTMaterials.TitaniumTungstenCarbide), 6);
      registerCableAnchorRecipes(provider, "ae2/network/parts/cable_anchor_tungsten_steel", new UnificationEntry(TagPrefix.bolt, GTMaterials.TungstenSteel), 16);
  }

  public static void registerCableAnchorRecipes(Consumer<FinishedRecipe> provider, String regName, UnificationEntry input) {
    VanillaRecipeHelper.addShapedRecipe(provider, regName, new ItemStack(AEParts.CABLE_ANCHOR),
        "Af", "sA",
        'A', input);
  }

  public static void registerCableAnchorRecipes(Consumer<FinishedRecipe> provider, String regName, UnificationEntry input, int count) {
    VanillaRecipeHelper.addShapedRecipe(provider, regName, new ItemStack(AEParts.CABLE_ANCHOR),
        "Af", "sA",
        'A', input, count);
  }

/*
  public static GTRComponent ANCHOR = new GTRComponent(Stream.of(new Object[][] {
    { 0, new UnificationEntry(TagPrefix.bolt, GTMaterials.Iron) },
    { 1, new UnificationEntry(TagPrefix.bolt, GTMaterials.Copper) },
    { 2, new UnificationEntry(TagPrefix.bolt, GTMaterials.Bronze) },
    { 3, new UnificationEntry(TagPrefix.bolt, GTMaterials.Tin) },
    { 4, new UnificationEntry(TagPrefix.bolt, GTMaterials.Steel), 2 },
    { 5, new UnificationEntry(TagPrefix.bolt, GTMaterials.Aluminium), 2 },
    { 6, new UnificationEntry(TagPrefix.bolt, GTMaterials.Lead) },
    { 7, new UnificationEntry(TagPrefix.bolt, GTMaterials.Nickel) },
    { 8, new UnificationEntry(TagPrefix.bolt, GTMaterials.Silver) },
    { 9, new UnificationEntry(TagPrefix.bolt, GTMaterials.Brass) },
    { 10, new UnificationEntry(TagPrefix.bolt, GTMaterials.Invar) },
    { 11, new UnificationEntry(TagPrefix.bolt, GTMaterials.StainlessSteel), 3 },
    { 12, new UnificationEntry(TagPrefix.bolt, GTMaterials.Titanium), 4 },

  }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));
*/

}

