package com.zircky.gtceuadd.data.recipe;

import biomesoplenty.api.block.BOPBlocks;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.hollingsworth.arsnouveau.setup.registry.BlockRegistry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import vazkii.botania.common.block.BotaniaBlocks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.BIO_CHAFF;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static net.minecraft.world.item.Item.byBlock;

public class RecipeWood {
  public static void init(Consumer<FinishedRecipe> provider) {
    registerGTWoodRecipes(provider);
    registerWoodRecipes(provider);
    registerPyrolyseOvenRecipes(provider);
  }

  private static List<WoodTypeEntryDop> DEFAULT_ENTRIES;

  private static List<WoodTypeEntryDop> getDefaultEntries() {
    if (DEFAULT_ENTRIES == null) {
      final String mcModId = "minecraft";
      // .boat(GTItems.RUBBER_BOAT.asItem(), null) // TODO someone forgot boat textures.
      // rubber log does not have a tag
      // .boat(GTItems.TREATED_WOOD_BOAT.asItem(), null) // TODO someone forgot boat textures.
      // .boat(GTItems.RUBBER_BOAT.asItem(), null) // TODO someone forgot boat textures.
      // rubber log does not have a tag
      // .boat(GTItems.TREATED_WOOD_BOAT.asItem(), null) // TODO someone forgot boat textures.
      return DEFAULT_ENTRIES = Arrays.asList(
          new WoodTypeEntryDop.Builder(mcModId, "oak")
              .planks(Items.OAK_PLANKS, "oak_planks")
              .log(Items.OAK_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_OAK_LOG)
              .wood(Items.OAK_WOOD)
              .strippedWood(Items.STRIPPED_OAK_WOOD)
              .door(Items.OAK_DOOR, "oak_door")
              .trapdoor(Items.OAK_TRAPDOOR, "oak_trapdoor")
              .slab(Items.OAK_SLAB, "oak_slab")
              .fence(Items.OAK_FENCE, "oak_fence")
              .fenceGate(Items.OAK_FENCE_GATE, "oak_fence_gate")
              .stairs(Items.OAK_STAIRS, "oak_stairs")
              .boat(Items.OAK_BOAT, "oak_boat")
              .chestBoat(Items.OAK_CHEST_BOAT, "oak_chest_boat")
              .plate(Items.OAK_PRESSURE_PLATE, "oak_pressure_plate")
              .button(Items.OAK_BUTTON, "oak_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "spruce")
              .planks(Items.SPRUCE_PLANKS, "spruce_planks")
              .log(Items.SPRUCE_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_SPRUCE_LOG)
              .wood(Items.SPRUCE_WOOD)
              .strippedWood(Items.STRIPPED_SPRUCE_WOOD)
              .door(Items.SPRUCE_DOOR, "spruce_door")
              .trapdoor(Items.SPRUCE_TRAPDOOR, "spruce_trapdoor")
              .slab(Items.SPRUCE_SLAB, "spruce_slab")
              .fence(Items.SPRUCE_FENCE, "spruce_fence")
              .fenceGate(Items.SPRUCE_FENCE_GATE, "spruce_fence_gate")
              .stairs(Items.SPRUCE_STAIRS, "spruce_stairs")
              .boat(Items.SPRUCE_BOAT, "spruce_boat")
              .chestBoat(Items.SPRUCE_CHEST_BOAT, "spruce_chest_boat")
              .plate(Items.SPRUCE_PRESSURE_PLATE, "spruce_pressure_plate")
              .button(Items.SPRUCE_BUTTON, "spruce_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "birch")
              .planks(Items.BIRCH_PLANKS, "birch_planks")
              .log(Items.BIRCH_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_BIRCH_LOG)
              .wood(Items.BIRCH_WOOD)
              .strippedWood(Items.STRIPPED_BIRCH_WOOD)
              .door(Items.BIRCH_DOOR, "birch_door")
              .trapdoor(Items.BIRCH_TRAPDOOR, "birch_trapdoor")
              .slab(Items.BIRCH_SLAB, "birch_slab")
              .fence(Items.BIRCH_FENCE, "birch_fence")
              .fenceGate(Items.BIRCH_FENCE_GATE, "birch_fence_gate")
              .stairs(Items.BIRCH_STAIRS, "birch_stairs")
              .boat(Items.BIRCH_BOAT, "birch_boat")
              .chestBoat(Items.BIRCH_CHEST_BOAT, "birch_chest_boat")
              .plate(Items.BIRCH_PRESSURE_PLATE, "birch_pressure_plate")
              .button(Items.BIRCH_BUTTON, "birch_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "jungle")
              .planks(Items.JUNGLE_PLANKS, "jungle_planks")
              .log(Items.JUNGLE_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_JUNGLE_LOG)
              .wood(Items.JUNGLE_WOOD)
              .strippedWood(Items.STRIPPED_JUNGLE_WOOD)
              .door(Items.JUNGLE_DOOR, "jungle_door")
              .trapdoor(Items.JUNGLE_TRAPDOOR, "jungle_trapdoor")
              .slab(Items.JUNGLE_SLAB, "jungle_slab")
              .fence(Items.JUNGLE_FENCE, "jungle_fence")
              .fenceGate(Items.JUNGLE_FENCE_GATE, "jungle_fence_gate")
              .stairs(Items.JUNGLE_STAIRS, "jungle_stairs")
              .boat(Items.JUNGLE_BOAT, "jungle_boat")
              .chestBoat(Items.JUNGLE_CHEST_BOAT, "jungle_chest_boat")
              .plate(Items.JUNGLE_PRESSURE_PLATE, "jungle_pressure_plate")
              .button(Items.JUNGLE_BUTTON, "jungle_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "acacia")
              .planks(Items.ACACIA_PLANKS, "acacia_planks")
              .log(Items.ACACIA_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_ACACIA_LOG)
              .wood(Items.ACACIA_WOOD)
              .strippedWood(Items.STRIPPED_ACACIA_WOOD)
              .door(Items.ACACIA_DOOR, "acacia_door")
              .trapdoor(Items.ACACIA_TRAPDOOR, "acacia_trapdoor")
              .slab(Items.ACACIA_SLAB, "acacia_slab")
              .fence(Items.ACACIA_FENCE, "acacia_fence")
              .fenceGate(Items.ACACIA_FENCE_GATE, "acacia_fence_gate")
              .stairs(Items.ACACIA_STAIRS, "acacia_stairs")
              .boat(Items.ACACIA_BOAT, "acacia_boat")
              .chestBoat(Items.ACACIA_CHEST_BOAT, "acacia_chest_boat")
              .plate(Items.ACACIA_PRESSURE_PLATE, "acacia_pressure_plate")
              .button(Items.ACACIA_BUTTON, "acacia_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "dark_oak")
              .planks(Items.DARK_OAK_PLANKS, "dark_oak_planks")
              .log(Items.DARK_OAK_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_DARK_OAK_LOG)
              .wood(Items.DARK_OAK_WOOD)
              .strippedWood(Items.STRIPPED_DARK_OAK_WOOD)
              .door(Items.DARK_OAK_DOOR, "dark_oak_door")
              .trapdoor(Items.DARK_OAK_TRAPDOOR, "dark_oak_trapdoor")
              .slab(Items.DARK_OAK_SLAB, "dark_oak_slab")
              .fence(Items.DARK_OAK_FENCE, "dark_oak_fence")
              .fenceGate(Items.DARK_OAK_FENCE_GATE, "dark_oak_fence_gate")
              .stairs(Items.DARK_OAK_STAIRS, "dark_oak_stairs")
              .boat(Items.DARK_OAK_BOAT, "dark_oak_boat")
              .chestBoat(Items.DARK_OAK_CHEST_BOAT, "dark_oak_chest_boat")
              .plate(Items.DARK_OAK_PRESSURE_PLATE, "dark_oak_pressure_plate")
              .button(Items.DARK_OAK_BUTTON, "dark_oak_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "bamboo")
              .planks(Items.BAMBOO_PLANKS, "bamboo_planks")
              .logTag(TagUtil.createItemTag("bamboo_blocks", true))
              .log(Items.BAMBOO_BLOCK).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_BAMBOO_BLOCK)
              .door(Items.BAMBOO_DOOR, "bamboo_door")
              .trapdoor(Items.BAMBOO_TRAPDOOR, "bamboo_trapdoor")
              .slab(Items.BAMBOO_SLAB, "bamboo_slab")
              .fence(Items.BAMBOO_FENCE, "bamboo_fence")
              .fenceGate(Items.BAMBOO_FENCE_GATE, "bamboo_fence_gate")
              .stairs(Items.BAMBOO_STAIRS, "bamboo_stairs")
              .boat(Items.BAMBOO_RAFT, "bamboo_raft")
              .chestBoat(Items.BAMBOO_CHEST_RAFT, "bamboo_chest_raft")
              .plate(Items.BAMBOO_PRESSURE_PLATE, "bamboo_pressure_plate")
              .button(Items.BAMBOO_BUTTON, "bamboo_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "cherry")
              .planks(Items.CHERRY_PLANKS, "cherry_planks")
              .log(Items.CHERRY_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_CHERRY_LOG)
              .wood(Items.CHERRY_WOOD)
              .strippedWood(Items.STRIPPED_CHERRY_WOOD)
              .door(Items.CHERRY_DOOR, "cherry_door")
              .trapdoor(Items.CHERRY_TRAPDOOR, "cherry_trapdoor")
              .slab(Items.CHERRY_SLAB, "cherry_slab")
              .fence(Items.CHERRY_FENCE, "cherry_fence")
              .fenceGate(Items.CHERRY_FENCE_GATE, "cherry_fence_gate")
              .stairs(Items.CHERRY_STAIRS, "cherry_stairs")
              .boat(Items.CHERRY_BOAT, "cherry_boat")
              .chestBoat(Items.CHERRY_CHEST_BOAT, "cherry_chest_boat")
              .plate(Items.CHERRY_PRESSURE_PLATE, "cherry_pressure_plate")
              .button(Items.CHERRY_BUTTON, "cherry_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "mangrove")
              .planks(Items.MANGROVE_PLANKS, "mangrove_planks")
              .log(Items.MANGROVE_LOG).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_MANGROVE_LOG)
              .wood(Items.MANGROVE_WOOD)
              .strippedWood(Items.STRIPPED_MANGROVE_WOOD)
              .door(Items.MANGROVE_DOOR, "mangrove_door")
              .trapdoor(Items.MANGROVE_TRAPDOOR, "mangrove_trapdoor")
              .slab(Items.MANGROVE_SLAB, "mangrove_slab")
              .fence(Items.MANGROVE_FENCE, "mangrove_fence")
              .fenceGate(Items.MANGROVE_FENCE_GATE, "mangrove_fence_gate")
              .stairs(Items.MANGROVE_STAIRS, "mangrove_stairs")
              .boat(Items.MANGROVE_BOAT, "mangrove_boat")
              .chestBoat(Items.MANGROVE_CHEST_BOAT, "mangrove_chest_boat")
              .plate(Items.MANGROVE_PRESSURE_PLATE, "mangrove_pressure_plate")
              .button(Items.MANGROVE_BUTTON, "mangrove_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "crimson")
              .planks(Items.CRIMSON_PLANKS, "crimson_planks")
              .logTag(TagUtil.createItemTag("crimson_stems", true))
              .log(Items.CRIMSON_STEM).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_CRIMSON_STEM)
              .wood(Items.CRIMSON_HYPHAE)
              .strippedWood(Items.STRIPPED_CRIMSON_HYPHAE)
              .door(Items.CRIMSON_DOOR, "crimson_door")
              .trapdoor(Items.CRIMSON_TRAPDOOR, "crimson_trapdoor")
              .slab(Items.CRIMSON_SLAB, "crimson_slab")
              .fence(Items.CRIMSON_FENCE, "crimson_fence")
              .fenceGate(Items.CRIMSON_FENCE_GATE, "crimson_fence_gate")
              .stairs(Items.CRIMSON_STAIRS, "crimson_stairs")
              .plate(Items.CRIMSON_PRESSURE_PLATE, "crimson_pressure_plate")
              .button(Items.CRIMSON_BUTTON, "crimson_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(mcModId, "warped")
              .planks(Items.WARPED_PLANKS, "warped_planks")
              .logTag(TagUtil.createItemTag("warped_stems", true))
              .log(Items.WARPED_STEM).removeCharcoalRecipe()
              .strippedLog(Items.STRIPPED_WARPED_STEM)
              .wood(Items.WARPED_HYPHAE)
              .strippedWood(Items.STRIPPED_WARPED_HYPHAE)
              .door(Items.WARPED_DOOR, "warped_door")
              .trapdoor(Items.WARPED_TRAPDOOR, "warped_trapdoor")
              .slab(Items.WARPED_SLAB, "warped_slab")
              .fence(Items.WARPED_FENCE, "warped_fence")
              .fenceGate(Items.WARPED_FENCE_GATE, "warped_fence_gate")
              .stairs(Items.WARPED_STAIRS, "warped_stairs")
              .plate(Items.WARPED_PRESSURE_PLATE, "warped_pressure_plate")
              .button(Items.WARPED_BUTTON, "warped_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(GTCEu.MOD_ID, "rubber")
              .planks(GTBlocks.RUBBER_PLANK.asItem(), null)
              .log(GTBlocks.RUBBER_LOG.asItem()).addCharcoalRecipe()
              .strippedLog(GTBlocks.STRIPPED_RUBBER_LOG.asItem())
              .wood(GTBlocks.RUBBER_WOOD.asItem())
              .strippedWood(GTBlocks.STRIPPED_RUBBER_WOOD.asItem())
              .door(GTBlocks.RUBBER_DOOR.asItem(), null)
              .trapdoor(GTBlocks.RUBBER_TRAPDOOR.asItem(), null)
              .slab(GTBlocks.RUBBER_SLAB.asItem(), null).addSlabRecipe()
              .fence(GTBlocks.RUBBER_FENCE.asItem(), null)
              .fenceGate(GTBlocks.RUBBER_FENCE_GATE.asItem(), null)
              .stairs(GTBlocks.RUBBER_STAIRS.asItem(), null).addStairsRecipe()
              .plate(GTBlocks.RUBBER_PRESSURE_PLATE.asItem(), null)
              .button(GTBlocks.RUBBER_BUTTON.asItem(), null)
              // .boat(GTItems.RUBBER_BOAT.asItem(), null) // TODO someone forgot boat textures.
              .generateLogToPlankRecipe(false) // rubber log does not have a tag
              .registerAllTags()
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder(GTCEu.MOD_ID, "treated")
              .planks(GTBlocks.TREATED_WOOD_PLANK.asItem(), null)
              .door(GTBlocks.TREATED_WOOD_DOOR.asItem(), null)
              .trapdoor(GTBlocks.TREATED_WOOD_TRAPDOOR.asItem(), null)
              .slab(GTBlocks.TREATED_WOOD_SLAB.asItem(), null).addSlabRecipe()
              .fence(GTBlocks.TREATED_WOOD_FENCE.asItem(), null)
              .fenceGate(GTBlocks.TREATED_WOOD_FENCE_GATE.asItem(), null)
              .stairs(GTBlocks.TREATED_WOOD_STAIRS.asItem(), null).addStairsRecipe()
              .plate(GTBlocks.TREATED_WOOD_PRESSURE_PLATE.asItem(), null)
              .button(GTBlocks.TREATED_WOOD_BUTTON.asItem(), null)
              // .boat(GTItems.TREATED_WOOD_BOAT.asItem(), null) // TODO someone forgot boat textures.
              .material(TreatedWood)
              .generateLogToPlankRecipe(false)
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "fir")
              .planks(byBlock(BOPBlocks.FIR_PLANKS.get()), "fir_planks")
              .log(byBlock(BOPBlocks.FIR_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_FIR_LOG.get()))
              .wood(byBlock(BOPBlocks.FIR_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_FIR_WOOD.get()))
              .door(byBlock(BOPBlocks.FIR_DOOR.get()), "fir_door")
              .trapdoor(byBlock(BOPBlocks.FIR_TRAPDOOR.get()), "fir_trapdoor")
              .slab(byBlock(BOPBlocks.FIR_SLAB.get()), "fir_slab")
              .fence(byBlock(BOPBlocks.FIR_FENCE.get()), "fir_fence")
              .fenceGate(byBlock(BOPBlocks.FIR_FENCE_GATE.get()), "fir_fence_gate")
              .stairs(byBlock(BOPBlocks.FIR_STAIRS.get()), "fir_stairs")
              .plate(byBlock(BOPBlocks.FIR_PRESSURE_PLATE.get()), "fir_pressure_plate")
              .button(byBlock(BOPBlocks.FIR_BUTTON.get()), "fir_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "redwood")
              .planks(byBlock(BOPBlocks.REDWOOD_PLANKS.get()), "redwood_planks")
              .log(byBlock(BOPBlocks.REDWOOD_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_REDWOOD_LOG.get()))
              .wood(byBlock(BOPBlocks.REDWOOD_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_REDWOOD_WOOD.get()))
              .door(byBlock(BOPBlocks.REDWOOD_DOOR.get()), "redwood_door")
              .trapdoor(byBlock(BOPBlocks.REDWOOD_TRAPDOOR.get()), "redwood_trapdoor")
              .slab(byBlock(BOPBlocks.REDWOOD_SLAB.get()), "redwood_slab")
              .fence(byBlock(BOPBlocks.REDWOOD_FENCE.get()), "redwood_fence")
              .fenceGate(byBlock(BOPBlocks.REDWOOD_FENCE_GATE.get()), "redwood_fence_gate")
              .stairs(byBlock(BOPBlocks.REDWOOD_STAIRS.get()), "redwood_stairs")
              .plate(byBlock(BOPBlocks.REDWOOD_PRESSURE_PLATE.get()), "redwood_pressure_plate")
              .button(byBlock(BOPBlocks.REDWOOD_BUTTON.get()), "redwood_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "mahogany")
              .planks(byBlock(BOPBlocks.MAHOGANY_PLANKS.get()), "mahogany_planks")
              .log(byBlock(BOPBlocks.MAHOGANY_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_MAHOGANY_LOG.get()))
              .wood(byBlock(BOPBlocks.MAHOGANY_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get()))
              .door(byBlock(BOPBlocks.MAHOGANY_DOOR.get()), "mahogany_door")
              .trapdoor(byBlock(BOPBlocks.MAHOGANY_TRAPDOOR.get()), "mahogany_trapdoor")
              .slab(byBlock(BOPBlocks.MAHOGANY_SLAB.get()), "mahogany_slab")
              .fence(byBlock(BOPBlocks.MAHOGANY_FENCE.get()), "mahogany_fence")
              .fenceGate(byBlock(BOPBlocks.MAHOGANY_FENCE_GATE.get()), "mahogany_fence_gate")
              .stairs(byBlock(BOPBlocks.MAHOGANY_STAIRS.get()), "mahogany_stairs")
              .plate(byBlock(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get()), "mahogany_pressure_plate")
              .button(byBlock(BOPBlocks.MAHOGANY_BUTTON.get()), "mahogany_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "jacaranda")
              .planks(byBlock(BOPBlocks.JACARANDA_PLANKS.get()), "jacaranda_planks")
              .log(byBlock(BOPBlocks.JACARANDA_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_JACARANDA_LOG.get()))
              .wood(byBlock(BOPBlocks.JACARANDA_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_JACARANDA_WOOD.get()))
              .door(byBlock(BOPBlocks.JACARANDA_DOOR.get()), "jacaranda_door")
              .trapdoor(byBlock(BOPBlocks.JACARANDA_TRAPDOOR.get()), "jacaranda_trapdoor")
              .slab(byBlock(BOPBlocks.JACARANDA_SLAB.get()), "jacaranda_slab")
              .fence(byBlock(BOPBlocks.JACARANDA_FENCE.get()), "jacaranda_fence")
              .fenceGate(byBlock(BOPBlocks.JACARANDA_FENCE_GATE.get()), "jacaranda_fence_gate")
              .stairs(byBlock(BOPBlocks.JACARANDA_STAIRS.get()), "jacaranda_stairs")
              .plate(byBlock(BOPBlocks.JACARANDA_PRESSURE_PLATE.get()), "jacaranda_pressure_plate")
              .button(byBlock(BOPBlocks.JACARANDA_BUTTON.get()), "jacaranda_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "palm")
              .planks(byBlock(BOPBlocks.PALM_PLANKS.get()), "palm_planks")
              .log(byBlock(BOPBlocks.PALM_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_PALM_LOG.get()))
              .wood(byBlock(BOPBlocks.PALM_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_PALM_WOOD.get()))
              .door(byBlock(BOPBlocks.PALM_DOOR.get()), "palm_door")
              .trapdoor(byBlock(BOPBlocks.PALM_TRAPDOOR.get()), "palm_trapdoor")
              .slab(byBlock(BOPBlocks.PALM_SLAB.get()), "palm_slab")
              .fence(byBlock(BOPBlocks.PALM_FENCE.get()), "palm_fence")
              .fenceGate(byBlock(BOPBlocks.PALM_FENCE_GATE.get()), "palm_fence_gate")
              .stairs(byBlock(BOPBlocks.PALM_STAIRS.get()), "palm_stairs")
              .plate(byBlock(BOPBlocks.PALM_PRESSURE_PLATE.get()), "palm_pressure_plate")
              .button(byBlock(BOPBlocks.PALM_BUTTON.get()), "palm_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "willow")
              .planks(byBlock(BOPBlocks.WILLOW_PLANKS.get()), "willow_planks")
              .log(byBlock(BOPBlocks.WILLOW_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_WILLOW_LOG.get()))
              .wood(byBlock(BOPBlocks.WILLOW_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_WILLOW_WOOD.get()))
              .door(byBlock(BOPBlocks.WILLOW_DOOR.get()), "willow_door")
              .trapdoor(byBlock(BOPBlocks.WILLOW_TRAPDOOR.get()), "willow_trapdoor")
              .slab(byBlock(BOPBlocks.WILLOW_SLAB.get()), "willow_slab")
              .fence(byBlock(BOPBlocks.WILLOW_FENCE.get()), "willow_fence")
              .fenceGate(byBlock(BOPBlocks.WILLOW_FENCE_GATE.get()), "willow_fence_gate")
              .stairs(byBlock(BOPBlocks.WILLOW_STAIRS.get()), "willow_stairs")
              .plate(byBlock(BOPBlocks.WILLOW_PRESSURE_PLATE.get()), "willow_pressure_plate")
              .button(byBlock(BOPBlocks.WILLOW_BUTTON.get()), "willow_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "dead")
              .planks(byBlock(BOPBlocks.DEAD_PLANKS.get()), "dead_planks")
              .log(byBlock(BOPBlocks.DEAD_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_DEAD_LOG.get()))
              .wood(byBlock(BOPBlocks.DEAD_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_DEAD_WOOD.get()))
              .door(byBlock(BOPBlocks.DEAD_DOOR.get()), "dead_door")
              .trapdoor(byBlock(BOPBlocks.DEAD_TRAPDOOR.get()), "dead_trapdoor")
              .slab(byBlock(BOPBlocks.DEAD_SLAB.get()), "dead_slab")
              .fence(byBlock(BOPBlocks.DEAD_FENCE.get()), "dead_fence")
              .fenceGate(byBlock(BOPBlocks.DEAD_FENCE_GATE.get()), "dead_fence_gate")
              .stairs(byBlock(BOPBlocks.DEAD_STAIRS.get()), "dead_stairs")
              .plate(byBlock(BOPBlocks.DEAD_PRESSURE_PLATE.get()), "dead_pressure_plate")
              .button(byBlock(BOPBlocks.DEAD_BUTTON.get()), "dead_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "magic")
              .planks(byBlock(BOPBlocks.MAGIC_PLANKS.get()), "magic_planks")
              .log(byBlock(BOPBlocks.MAGIC_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_MAGIC_LOG.get()))
              .wood(byBlock(BOPBlocks.MAGIC_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_MAGIC_WOOD.get()))
              .door(byBlock(BOPBlocks.MAGIC_DOOR.get()), "magic_door")
              .trapdoor(byBlock(BOPBlocks.MAGIC_TRAPDOOR.get()), "magic_trapdoor")
              .slab(byBlock(BOPBlocks.MAGIC_SLAB.get()), "magic_slab")
              .fence(byBlock(BOPBlocks.MAGIC_FENCE.get()), "magic_fence")
              .fenceGate(byBlock(BOPBlocks.MAGIC_FENCE_GATE.get()), "magic_fence_gate")
              .stairs(byBlock(BOPBlocks.MAGIC_STAIRS.get()), "magic_stairs")
              .plate(byBlock(BOPBlocks.MAGIC_PRESSURE_PLATE.get()), "magic_pressure_plate")
              .button(byBlock(BOPBlocks.MAGIC_BUTTON.get()), "magic_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "umbran")
              .planks(byBlock(BOPBlocks.UMBRAN_PLANKS.get()), "umbran_planks")
              .log(byBlock(BOPBlocks.UMBRAN_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_UMBRAN_LOG.get()))
              .wood(byBlock(BOPBlocks.UMBRAN_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_UMBRAN_WOOD.get()))
              .door(byBlock(BOPBlocks.UMBRAN_DOOR.get()), "umbran_door")
              .trapdoor(byBlock(BOPBlocks.UMBRAN_TRAPDOOR.get()), "umbran_trapdoor")
              .slab(byBlock(BOPBlocks.UMBRAN_SLAB.get()), "umbran_slab")
              .fence(byBlock(BOPBlocks.UMBRAN_FENCE.get()), "umbran_fence")
              .fenceGate(byBlock(BOPBlocks.UMBRAN_FENCE_GATE.get()), "umbran_fence_gate")
              .stairs(byBlock(BOPBlocks.UMBRAN_STAIRS.get()), "umbran_stairs")
              .plate(byBlock(BOPBlocks.UMBRAN_STAIRS.get()), "umbran_pressure_plate")
              .button(byBlock(BOPBlocks.UMBRAN_STAIRS.get()), "umbran_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("biomesoplenty", "hellbark")
              .planks(byBlock(BOPBlocks.HELLBARK_PLANKS.get()), "hellbark_planks")
              .log(byBlock(BOPBlocks.HELLBARK_LOG.get())).removeCharcoalRecipe()
              .strippedLog(byBlock(BOPBlocks.STRIPPED_HELLBARK_LOG.get()))
              .wood(byBlock(BOPBlocks.HELLBARK_WOOD.get()))
              .strippedWood(byBlock(BOPBlocks.STRIPPED_HELLBARK_WOOD.get()))
              .door(byBlock(BOPBlocks.HELLBARK_DOOR.get()), "hellbark_door")
              .trapdoor(byBlock(BOPBlocks.HELLBARK_TRAPDOOR.get()), "hellbark_trapdoor")
              .slab(byBlock(BOPBlocks.HELLBARK_SLAB.get()), "hellbark_slab")
              .fence(byBlock(BOPBlocks.HELLBARK_FENCE.get()), "hellbark_fence")
              .fenceGate(byBlock(BOPBlocks.HELLBARK_FENCE_GATE.get()), "hellbark_fence_gate")
              .stairs(byBlock(BOPBlocks.HELLBARK_STAIRS.get()), "hellbark_stairs")
              .plate(byBlock(BOPBlocks.HELLBARK_PRESSURE_PLATE.get()), "oak_pressure_plate")
              .button(byBlock(BOPBlocks.HELLBARK_PRESSURE_PLATE.get()), "oak_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("botania", "livingwood")
              .planks(Item.byBlock(BotaniaBlocks.livingwoodPlanks), "livingwood_planks")
              .log(Item.byBlock(BotaniaBlocks.livingwoodLog)).removeCharcoalRecipe()
              .strippedLog(Item.byBlock(BotaniaBlocks.livingwoodLogStripped))
              .wood(Item.byBlock(BotaniaBlocks.livingwood))
              .strippedWood(Item.byBlock(BotaniaBlocks.livingwoodStripped))
              .slab(Item.byBlock(BotaniaBlocks.livingwoodSlab), "livingwood_slab")
              .fence(Item.byBlock(BotaniaBlocks.livingwoodFence), "livingwood_fence")
              .fenceGate(Item.byBlock(BotaniaBlocks.livingwoodFenceGate), "livingwood_fence_gate")
              .stairs(Item.byBlock(BotaniaBlocks.livingwoodStairs), "livingwood_stairs")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("botania", "dreamwood")
              .planks(Item.byBlock(BotaniaBlocks.dreamwoodPlanks), "dreamwood_planks")
              .log(Item.byBlock(BotaniaBlocks.dreamwoodLog)).removeCharcoalRecipe()
              .strippedLog(Item.byBlock(BotaniaBlocks.dreamwoodLogStripped))
              .wood(Item.byBlock(BotaniaBlocks.dreamwood))
              .strippedWood(Item.byBlock(BotaniaBlocks.dreamwoodStripped))
              .slab(Item.byBlock(BotaniaBlocks.dreamwoodSlab), "dreamwood_slab")
              .fence(Item.byBlock(BotaniaBlocks.dreamwoodFence), "dreamwood_fence")
              .fenceGate(Item.byBlock(BotaniaBlocks.dreamwoodFenceGate), "dreamwood_fence_gate")
              .stairs(Item.byBlock(BotaniaBlocks.dreamwoodStairs), "dreamwood_stairs")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("ars_nouveau", "archwood")
              .planks(BlockRegistry.ARCHWOOD_PLANK.asItem(), "archwood_planks")
              .logTag(TagUtil.createItemTag("logs/archwood")).removeCharcoalRecipe()
              .door(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_DOOR.asItem())), "archwood_door")
              .trapdoor(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_TRAPDOOR.asItem())), "archwood_trapdoor")
              .slab(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_SLABS.asItem())), "archwood_slab")
              .fence(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_FENCE.asItem())), "archwood_fence")
              .fenceGate(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_FENCE_GATE.asItem())), "archwood_fence_gate")
              .stairs(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_STAIRS.asItem())), "archwood_stairs")
              .plate(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_PPlate.asItem())), "archwood_pressure_plate")
              .button(byBlock(Block.byItem(BlockRegistry.ARCHWOOD_BUTTON.asItem())), "archwood_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "divine")
              .planks(byBlock(divinerpg.registries.BlockRegistry.divinePlanks.get()), "divine_planks")
              .logTag(TagUtil.createItemTag("wood/divine")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.divineDoor.get()), "divine_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.divineTrapdoor.get()), "divine_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.divineSlab.get()), "divine_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.divineFence.get()), "divine_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.divineFenceGate.get()), "divine_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.divineStairs.get()), "divine_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.divinePressurePlate.get()), "divine_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.divineButton.get()), "divine_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "shiverspine")
              .planks(byBlock(divinerpg.registries.BlockRegistry.shiverspinePlanks.get()), "shiverspine_planks")
              .logTag(TagUtil.createItemTag("wood/shiverspine")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.shiverspineDoor.get()), "shiverspine_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.shiverspineTrapdoor.get()), "shiverspine_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.shiverspineSlab.get()), "shiverspine_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.shiverspineFence.get()), "shiverspine_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.shiverspineFenceGate.get()), "shiverspine_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.shiverspineStairs.get()), "shiverspine_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.shiverspinePressurePlate.get()), "shiverspine_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.shiverspineButton.get()), "shiverspine_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "auroraoak")
              .planks(byBlock(divinerpg.registries.BlockRegistry.auroraoakPlanks.get()), "auroraoak_planks")
              .logTag(TagUtil.createItemTag("wood/auroraoak")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.auroraoakDoor.get()), "auroraoak_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.auroraoakTrapdoor.get()), "auroraoak_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.auroraoakSlab.get()), "auroraoak_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.auroraoakFence.get()), "auroraoak_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.auroraoakFenceGate.get()), "auroraoak_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.auroraoakStairs.get()), "auroraoak_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.auroraoakPressurePlate.get()), "auroraoak_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.auroraoakButton.get()), "auroraoak_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "cozybark")
              .planks(byBlock(divinerpg.registries.BlockRegistry.cozybarkPlanks.get()), "cozybark_planks")
              .logTag(TagUtil.createItemTag("wood/cozybark")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.cozybarkDoor.get()), "cozybark_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.cozybarkTrapdoor.get()), "cozybark_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.cozybarkSlab.get()), "cozybark_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.cozybarkFence.get()), "cozybark_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.cozybarkFenceGate.get()), "cozybark_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.cozybarkStairs.get()), "cozybark_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.cozybarkPressurePlate.get()), "cozybark_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.cozybarkButton.get()), "cozybark_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "streamleaf")
              .planks(byBlock(divinerpg.registries.BlockRegistry.streamleafPlanks.get()), "streamleaf_planks")
              .logTag(TagUtil.createItemTag("wood/streamleaf")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.streamleafDoor.get()), "streamleaf_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.streamleafTrapdoor.get()), "streamleaf_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.streamleafSlab.get()), "streamleaf_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.streamleafFence.get()), "streamleaf_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.streamleafFenceGate.get()), "streamleaf_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.streamleafStairs.get()), "streamleaf_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.streamleafPressurePlate.get()), "streamleaf_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.streamleafButton.get()), "streamleaf_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "eucalyptus")
              .planks(byBlock(divinerpg.registries.BlockRegistry.eucalyptusPlanks.get()), "eucalyptus_planks")
              .logTag(TagUtil.createItemTag("wood/eucalyptus")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.eucalyptusDoor.get()), "eucalyptus_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.eucalyptusTrapdoor.get()), "eucalyptus_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.eucalyptusSlab.get()), "eucalyptus_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.eucalyptusFence.get()), "eucalyptus_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.eucalyptusFenceGate.get()), "eucalyptus_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.eucalyptusStairs.get()), "eucalyptus_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.eucalyptusPressurePlate.get()), "eucalyptus_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.eucalyptusButton.get()), "eucalyptus_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "eden")
              .planks(byBlock(divinerpg.registries.BlockRegistry.edenPlanks.get()), "eden_planks")
              .logTag(TagUtil.createItemTag("wood/eden")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.edenDoor.get()), "eden_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.edenTrapdoor.get()), "eden_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.edenSlab.get()), "eden_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.edenFence.get()), "eden_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.edenFenceGate.get()), "eden_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.edenStairs.get()), "eden_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.edenPressurePlate.get()), "eden_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.edenButton.get()), "eden_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "wildwood")
              .planks(byBlock(divinerpg.registries.BlockRegistry.wildwoodPlanks.get()), "wildwood_planks")
              .logTag(TagUtil.createItemTag("wood/wildwood")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.wildwoodDoor.get()), "wildwood_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.wildwoodTrapdoor.get()), "wildwood_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.wildwoodSlab.get()), "wildwood_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.wildwoodFence.get()), "wildwood_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.wildwoodFenceGate.get()), "wildwood_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.wildwoodStairs.get()), "wildwood_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.wildwoodPressurePlate.get()), "wildwood_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.wildwoodButton.get()), "wildwood_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "apalachia")
              .planks(byBlock(divinerpg.registries.BlockRegistry.apalachiaPlanks.get()), "apalachia_planks")
              .logTag(TagUtil.createItemTag("wood/apalachia")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.apalachiaDoor.get()), "apalachia_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.apalachiaTrapdoor.get()), "apalachia_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.apalachiaSlab.get()), "apalachia_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.apalachiaFence.get()), "apalachia_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.apalachiaFenceGate.get()), "apalachia_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.apalachiaStairs.get()), "apalachia_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.apalachiaPressurePlate.get()), "apalachia_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.apalachiaButton.get()), "apalachia_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "skythern")
              .planks(byBlock(divinerpg.registries.BlockRegistry.skythernPlanks.get()), "skythern_planks")
              .logTag(TagUtil.createItemTag("wood/skythern")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.skythernDoor.get()), "skythern_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.skythernTrapdoor.get()), "skythern_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.skythernSlab.get()), "skythern_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.skythernFence.get()), "skythern_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.skythernFenceGate.get()), "skythern_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.skythernStairs.get()), "skythern_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.skythernPressurePlate.get()), "skythern_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.skythernButton.get()), "skythern_button")
              .registerAllUnificationInfo()
              .build(),
          new WoodTypeEntryDop.Builder("divinerpg", "mortum")
              .planks(byBlock(divinerpg.registries.BlockRegistry.mortumPlanks.get()), "mortum_planks")
              .logTag(TagUtil.createItemTag("wood/mortum")).removeCharcoalRecipe()
              .door(byBlock(divinerpg.registries.BlockRegistry.mortumDoor.get()), "mortum_door")
              .trapdoor(byBlock(divinerpg.registries.BlockRegistry.mortumTrapdoor.get()), "mortum_trapdoor")
              .slab(byBlock(divinerpg.registries.BlockRegistry.mortumSlab.get()), "mortum_slab")
              .fence(byBlock(divinerpg.registries.BlockRegistry.mortumFence.get()), "mortum_fence")
              .fenceGate(byBlock(divinerpg.registries.BlockRegistry.mortumFenceGate.get()), "mortum_fence_gate")
              .stairs(byBlock(divinerpg.registries.BlockRegistry.mortumStairs.get()), "mortum_stairs")
              .plate(byBlock(divinerpg.registries.BlockRegistry.mortumPressurePlate.get()), "mortum_pressure_plate")
              .button(byBlock(divinerpg.registries.BlockRegistry.mortumButton.get()), "mortum_button")
              .registerAllUnificationInfo()
              .build()
      );


    }
    return DEFAULT_ENTRIES;
  }

  public static void registerUnificationInfo() {
    for (WoodTypeEntryDop entry : getDefaultEntries()) {
      registerWoodUnificationInfo(entry);
    }
  }

  /**
   * Standardized processing for wood types
   */
  private static void registerWoodRecipes(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "stick_saw", new ItemStack(Items.STICK, 4), "s", "P", "P",
        'P', ItemTags.PLANKS);
    VanillaRecipeHelper.addShapedRecipe(provider, "stick_normal", new ItemStack(Items.STICK, 2), "P", "P", 'P',
        ItemTags.PLANKS);

    for (WoodTypeEntryDop entry : getDefaultEntries()) {
      registerWoodTypeRecipe(provider, entry);
    }
  }

  /**
   * Adds all standard unification info and ore dictionary for a wood type
   *
   * @param entry the entry to register for
   */
  public static void registerWoodUnificationInfo(@NotNull WoodTypeEntryDop entry) {
    for (var log_ : entry.getLogs()) {
      if (log_ != null && entry.addLogOreDict) {
        ChemicalHelper.registerUnificationItems(TagPrefix.log, entry.material, log_);
      }
    }

    if (entry.addPlanksOreDict) {
      ChemicalHelper.registerUnificationItems(planks, entry.material, entry.planks);
    }
    if (entry.addPlanksUnificationInfo) {
      ChemicalHelper.registerMaterialInfo(entry.planks,
          new ItemMaterialInfo(new MaterialStack(entry.material, M)));
    }

    if (entry.door != null) {
      if (entry.addDoorsOreDict) {
        ChemicalHelper.registerUnificationItems(door, entry.material, entry.door);
      }
      if (entry.addDoorsUnificationInfo) {
        ChemicalHelper.registerMaterialInfo(entry.door, ConfigHolder.INSTANCE.recipes.hardWoodRecipes ?
            new ItemMaterialInfo(new MaterialStack(entry.material, M * 2),
                new MaterialStack(GTMaterials.Iron, M / 9)) : // screw
            new ItemMaterialInfo(new MaterialStack(entry.material, M * 2)));
      }
    }

    if (entry.slab != null) {
      if (entry.addSlabsOreDict) {
        ChemicalHelper.registerUnificationItems(slab, entry.material, entry.slab);
      }
      if (entry.addSlabsUnificationInfo) {
        ChemicalHelper.registerMaterialInfo(entry.slab,
            new ItemMaterialInfo(new MaterialStack(entry.material, M / 2)));
      }
    }

    if (entry.fence != null) {
      if (entry.addFencesOreDict) {
        ChemicalHelper.registerUnificationItems(fence, entry.material, entry.fence);
      }
      if (entry.addFencesUnificationInfo) {
        ChemicalHelper.registerMaterialInfo(entry.fence,
            new ItemMaterialInfo(new MaterialStack(entry.material, M)));
      }
    }

    if (entry.fenceGate != null) {
      if (entry.addFenceGatesOreDict) {
        ChemicalHelper.registerUnificationItems(fenceGate, entry.material, entry.fenceGate);
      }
      if (entry.addFenceGatesUnificationInfo) {
        ChemicalHelper.registerMaterialInfo(entry.fenceGate,
            new ItemMaterialInfo(new MaterialStack(entry.material, M * 3)));
      }
    }

    if (entry.stairs != null) {
      if (entry.addStairsOreDict) {
        ChemicalHelper.registerUnificationItems(stairs, entry.material, entry.stairs);
      }
      if (entry.addStairsUnificationInfo) {
        ChemicalHelper.registerMaterialInfo(entry.stairs,
            new ItemMaterialInfo(new MaterialStack(entry.material, (3 * M) / 2)));
      }
    }

    if (entry.boat != null && entry.addBoatsUnificationInfo) {
      ChemicalHelper.registerMaterialInfo(entry.boat,
          new ItemMaterialInfo(new MaterialStack(entry.material, M * 5)));
    }

    /*
     * TODO should this really be included?
     * if (entry.chestBoat != null && entry.addChestBoatsUnificationInfo) {
     * ChemicalHelper.registerMaterialInfo(entry.chestBoat,
     * new ItemMaterialInfo(new MaterialStack(entry.material, M * 13)));
     * }
     */
  }

  /**
   * Adds all standard recipes for a wood type
   *
   * @param entry the entry to register for
   */
  public static void registerWoodTypeRecipe(Consumer<FinishedRecipe> provider, @NotNull WoodTypeEntryDop entry) {
    final String name = entry.woodName;
    TagKey<Item> logTag = entry.logTag;
    boolean hasPlanksRecipe = entry.planksRecipeName != null;

    // noinspection ConstantValue can be null if someone does an oopsie and doesn't set it.
    if (entry.planks == null) {
      throw new IllegalStateException("Could not find planks form of WoodTypeEntryDop '" + name + "'.");
    }

    if (entry.generateLogToPlankRecipe) {
      VanillaRecipeHelper.addShapelessRecipe(provider,
          hasPlanksRecipe ? entry.planksRecipeName : name + "_planks",
          new ItemStack(entry.planks), logTag);

      // log -> plank saw crafting
      VanillaRecipeHelper.addShapedRecipe(provider, name + "_planks_saw",
          new ItemStack(entry.planks, 4),
          "s", "L", 'L', logTag);

      // log -> plank cutting
      CUTTER_RECIPES.recipeBuilder(name + "_planks")
          .inputItems(logTag)
          .outputItems(new ItemStack(entry.planks, 5))
          .outputItems(dust, Wood, 3)
          .duration(200)
          .EUt(VA[ULV])
          .save(provider);
    }

    //trapdoor
    if (entry.trapdoor != null) {
      if (entry.slab != null) {
        VanillaRecipeHelper.addShapedRecipe(provider, name + "_trapdoor", new ItemStack(entry.trapdoor),
            "SRS", "RFR", "SRS",
            'S', entry.slab,
            'R', entry.getStick(),
            'F', Items.FLINT);

        VanillaRecipeHelper.addShapedRecipe(provider, name + "_trapdoor_iron", new ItemStack(entry.trapdoor, 2),
            "SRS", "RFR", "SRS",
            'S', entry.slab,
            'R', entry.getStick(),
            'F', new UnificationEntry(screw, Iron));

        VanillaRecipeHelper.addShapedRecipe(provider, name + "_trapdoor_steel", new ItemStack(entry.trapdoor, 3),
            "SRS", "RFR", "SRS",
            'S', entry.slab,
            'R', entry.getStick(),
            'F', new UnificationEntry(screw, Steel));

        ASSEMBLER_RECIPES.recipeBuilder(name + "_trapdoor_iron")
            .inputItems(new ItemStack(entry.slab, 4))
            .inputItems(new UnificationEntry(rod, Wood), 4)
            .inputFluids(Iron.getFluid(16))
            .outputItems(new ItemStack(entry.trapdoor, 4))
            .duration(600).EUt(4).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder(name + "_trapdoor_steel")
            .inputItems(new ItemStack(entry.slab, 4))
            .inputItems(new UnificationEntry(rod, Wood), 4)
            .inputFluids(Steel.getFluid(16))
            .outputItems(new ItemStack(entry.trapdoor, 6))
            .duration(600).EUt(4).save(provider);
      }
    }

    // door
    if (entry.door != null) {
      String recipeName = name + "_door";
      if (entry.trapdoor != null) {
        VanillaRecipeHelper.addShapedRecipe(provider, recipeName, new ItemStack(entry.door),
            "PTd", "PRS", "PPs",
            'P', entry.planks,
            'T', entry.trapdoor,
            'R', new UnificationEntry(ring, Iron),
            'S', new UnificationEntry(screw, Iron));

        // plank -> door assembling
        ASSEMBLER_RECIPES.recipeBuilder(name + "_door")
            .inputItems(entry.trapdoor)
            .inputItems(new ItemStack(entry.planks, 4))
            .inputFluids(Iron.getFluid(GTValues.L / 9))
            .outputItems(entry.door)
            .duration(400).EUt(4).save(provider);
      } else {
        VanillaRecipeHelper.addShapedRecipe(provider, recipeName, new ItemStack(entry.door),
            "PTd", "PRS", "PPs",
            'P', entry.planks,
            'T', ItemTags.WOODEN_TRAPDOORS,
            'R', new UnificationEntry(ring, Iron),
            'S', new UnificationEntry(screw, Iron));

        // plank -> door assembling
        ASSEMBLER_RECIPES.recipeBuilder(name + "_door")
            .inputItems(ItemTags.WOODEN_TRAPDOORS)
            .inputItems(new ItemStack(entry.planks, 4))
            .inputFluids(Iron.getFluid(GTValues.L / 9))
            .outputItems(entry.door)
            .duration(400).EUt(4).save(provider);
      }
    }

    // stairs
    if (entry.stairs != null) {
      if (entry.addStairsCraftingRecipe) {
        VanillaRecipeHelper.addShapedRecipe(provider, name + "_stairs",
            new ItemStack(entry.stairs, 4),
            "P  ", "PP ", "PPP",
            'P', entry.planks);
      }

      // plank -> stairs assembling
      ASSEMBLER_RECIPES.recipeBuilder(name + "_stairs")
          .inputItems(new ItemStack(entry.planks, 6))
          .outputItems(new ItemStack(entry.stairs, 4))
          .circuitMeta(7)
          .EUt(1).duration(100).save(provider);
    }

    // slab
    if (entry.slab != null) {
//      if (entry.addSlabCraftingRecipe) {
//        VanillaRecipeHelper.addShapedRecipe(provider, name + "_slab", new ItemStack(entry.slab, 6),
//            "PPP", 'P', entry.planks);
//      }

      // plank -> slab crafting
      VanillaRecipeHelper.addShapedRecipe(provider, name + "_slab_saw", new ItemStack(entry.slab, 2),
          "sS", 'S', entry.planks);

      // plank -> slab cutting
      CUTTER_RECIPES.recipeBuilder(name + "_slab")
          .inputItems(entry.planks)
          .outputItems(new ItemStack(entry.slab, 2))
          .duration(200).EUt(VA[ULV])
          .save(provider);
    }

    // fence
    if (entry.fence != null) {
      VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence",
          new ItemStack(entry.fence),
          "PSP", "PSP", "PSP",
          'P', entry.planks,
          'S', entry.getStick());

      VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence_iron",
          new ItemStack(entry.fence, 2),
          "IdI", "PSP", "PSP",
          'P', entry.planks,
          'S', entry.getStick(),
          'I', new UnificationEntry(screw, Iron));

      VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence_steel",
          new ItemStack(entry.fence, 3),
          "TdT", "PSP", "PSP",
          'P', entry.planks,
          'S', entry.getStick(),
          "T", new UnificationEntry(screw, Steel));

      // plank -> fence assembling
      ASSEMBLER_RECIPES.recipeBuilder(name + "_fence")
          .inputItems(new ItemStack(entry.planks, 2))
          .outputItems(entry.fence)
          .circuitMeta(1)
          .duration(100).EUt(4)
          .save(provider);
    }

    // fence gate
    if (entry.fenceGate != null) {
      VanillaRecipeHelper.addShapedRecipe(provider,
          name + "_fence_gate",
          new ItemStack(entry.fenceGate),
          "F F", "SPS", "SPS",
          'P', entry.planks,
          'S', entry.getStick(),
          'F', Items.FLINT);

      VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence_gate_screws",
          new ItemStack(entry.fenceGate, 2),
          "IdI", "SPS", "SPS",
          'P', entry.planks,
          'S', entry.getStick(),
          'I', new UnificationEntry(screw, Iron));

      // plank -> fence gate assembling
      ASSEMBLER_RECIPES.recipeBuilder(name + "_fence_gate")
          .inputItems(new ItemStack(entry.planks, 2))
          .inputItems(Tags.Items.RODS_WOODEN, 2)
          .outputItems(entry.fenceGate)
          .circuitMeta(2)
          .duration(100).EUt(4).save(provider);
    }

    // boat
    if (entry.boat != null) {
      if (entry.slab != null) {

        VanillaRecipeHelper.addShapedRecipe(provider,   name + "_boat",
            new ItemStack(entry.boat),
            "PHP", "PkP", "SSS",
            'P', entry.planks,
            'S', entry.slab,
            'H', ItemTags.SHOVELS);
      }

      // plank -> boat assembling
      ASSEMBLER_RECIPES.recipeBuilder(name + "_boat")
          .inputItems(new ItemStack(entry.planks, 5))
          .outputItems(entry.boat)
          .circuitMeta(15)
          .duration(100).EUt(4).save(provider);

      // chest boat
      if (entry.chestBoat != null) {
        VanillaRecipeHelper.addShapedRecipe(provider,
            name + "_chest_boat",
            new ItemStack(entry.chestBoat),
            " B ", "SCS", " w ",
            'B', entry.boat,
            'S', new UnificationEntry(bolt, Wood),
            'C', Tags.Items.CHESTS_WOODEN);

        // plank -> boat assembling
        ASSEMBLER_RECIPES.recipeBuilder(name + "_chest_boat")
            .inputItems(new ItemStack(entry.boat))
            .inputItems(Tags.Items.CHESTS)
            .outputItems(entry.chestBoat)
            .circuitMeta(16)
            .duration(100).EUt(4).save(provider);
      }
    }

    if (entry.plate != null) {
      VanillaRecipeHelper.addShapedRecipe(provider, name + "_plate",
          new ItemStack(entry.plate, 2),
          "ShS", "PIP", "SdS",
          'S', new UnificationEntry(screw, Wood),
          'P', entry.planks,
          'I', new UnificationEntry(spring, Iron));

      // plank -> plate assembling
      ASSEMBLER_RECIPES.recipeBuilder(name + "_plate")
          .inputItems(new ItemStack(entry.planks, 2))
          .inputItems(new UnificationEntry(spring, Iron))
          .outputItems(entry.plate)
          .circuitMeta(5)
          .duration(100).EUt(7).save(provider);
    }

    if (entry.button != null) {
      if (entry.plate != null) {
        VanillaRecipeHelper.addShapedRecipe(provider, name + "_button",
            new ItemStack(entry.button, 2),
            "sB",
            'B', entry.plate);

        CUTTER_RECIPES.recipeBuilder(name + "_button")
            .inputItems(new ItemStack(entry.plate))
            .outputItems(new ItemStack(entry.button, 2))
            .duration(200).EUt(7).save(provider);
      }
    }
  }

  /**
   * Standard recipes for GT woods
   */
  private static void registerGTWoodRecipes(Consumer<FinishedRecipe> provider) {
//    VanillaRecipeHelper.addShapedRecipe(provider, "treated_wood_planks",
//        GTBlocks.TREATED_WOOD_PLANK.asStack(8),
//        "PPP", "PBP", "PPP",
//        'P', ItemTags.PLANKS,
//        'B', FluidUtil.getFilledBucket(FluidHelperImpl.toFluidStack(Creosote.getFluid(1000))));

    VanillaRecipeHelper.addShapedRecipe(provider, "treated_wood_stick",
        ChemicalHelper.get(rod, TreatedWood, 2),
        "L", "L",
        'L', GTBlocks.TREATED_WOOD_PLANK.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, "treated_wood_stick_saw",
        ChemicalHelper.get(rod, TreatedWood, 4),
        "s", "L", "L",
        'L', GTBlocks.TREATED_WOOD_PLANK.asItem());

    VanillaRecipeHelper.addShapelessRecipe(provider, "rubber_button", GTBlocks.RUBBER_BUTTON.asStack(),
        GTBlocks.RUBBER_PLANK.asStack());
    VanillaRecipeHelper.addShapelessRecipe(provider, "treated_wood_button", GTBlocks.TREATED_WOOD_BUTTON.asStack(),
        GTBlocks.TREATED_WOOD_PLANK.asStack());
    VanillaRecipeHelper.addShapedRecipe(provider, "rubber_pressure_plate", GTBlocks.RUBBER_PRESSURE_PLATE.asStack(),
        "aa", 'a', GTBlocks.RUBBER_PLANK.asStack());
    VanillaRecipeHelper.addShapedRecipe(provider, "treated_wood_plate",
        GTBlocks.TREATED_WOOD_PRESSURE_PLATE.asStack(), "aa", 'a', GTBlocks.TREATED_WOOD_PLANK.asStack());

    // add Recipes for rubber log
    VanillaRecipeHelper.addShapelessRecipe(provider, "rubber_planks",
        GTBlocks.RUBBER_PLANK.asStack(), GTBlocks.RUBBER_LOG.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, "rubber_planks_saw",
        GTBlocks.RUBBER_PLANK.asStack(4),
        "s", "L", 'L', GTBlocks.RUBBER_LOG.asItem());

    CUTTER_RECIPES.recipeBuilder("rubber_planks")
        .inputItems(GTBlocks.RUBBER_LOG.asItem())
        .outputItems(GTBlocks.RUBBER_PLANK.asStack(6))
        .outputItems(dust, Wood, 2)
        .duration(200)
        .EUt(VA[ULV])
        .save(provider);
  }

  public static void hardWoodRecipes(Consumer<ResourceLocation> registry) {
    registry.accept(new ResourceLocation("minecraft:stick"));

    for (WoodTypeEntryDop entry : getDefaultEntries()) {
      hardWoodTypeRecipes(registry, entry);
    }
  }

  private static void hardWoodTypeRecipes(Consumer<ResourceLocation> registry, @NotNull WoodTypeEntryDop entry) {
    if (entry.planksRecipeName != null) {
      registry.accept(new ResourceLocation(entry.modid, entry.planksRecipeName));
    }

    if (entry.removeCharcoalRecipe) {
      registry.accept(new ResourceLocation("charcoal"));
    }

    if (entry.trapdoor != null) {
      if (entry.trapdoorRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.trapdoorRecipeName));
      }
    }

    if (entry.door != null) {
      // hard plank -> door crafting
      if (entry.doorRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.doorRecipeName));
      }
    }
    if (entry.slab != null) {
      if (entry.slabRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.slabRecipeName));
      }
      if (entry.boat != null) {
        // hard plank -> boat crafting
        if (entry.boatRecipeName != null) {
          registry.accept(new ResourceLocation(entry.modid, entry.boatRecipeName));
        }
      }
    }
    if (entry.fence != null) {
      // hard plank -> fence crafting
      if (entry.fenceRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.fenceRecipeName));
      }
    }
    if (entry.fenceGate != null) {
      // hard plank -> fence gate crafting
      if (entry.fenceGateRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.fenceGateRecipeName));
      }
    }
    if (entry.plate !=null) {
      if (entry.plateRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.plateRecipeName));
        }
      }

    if (entry.button !=null) {
      if (entry.buttonRecipeName != null) {
        registry.accept(new ResourceLocation(entry.modid, entry.buttonRecipeName));
      }
    }
  }

  private static void registerPyrolyseOvenRecipes(Consumer<FinishedRecipe> provider) {
    // Logs ================================================

    // Charcoal Byproducts
    PYROLYSE_RECIPES.recipeBuilder("log_to_charcoal_byproducts").circuitMeta(4)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(CharcoalByproducts.getFluid(4000))
        .duration(320).EUt(96)
        .save(provider);

    // Wood Tar
    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_tar").circuitMeta(9)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodTar.getFluid(1500))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_tar_nitrogen").circuitMeta(10)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodTar.getFluid(1500))
        .duration(320).EUt(96)
        .save(provider);

    // Wood Gas
    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_gas").circuitMeta(5)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodGas.getFluid(1500))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_gas_nitrogen").circuitMeta(6)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodGas.getFluid(1500))
        .duration(320).EUt(96)
        .save(provider);

    // Wood Vinegar
    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_vinegar").circuitMeta(7)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodVinegar.getFluid(3000))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("log_to_wood_vinegar_nitrogen").circuitMeta(8)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(WoodVinegar.getFluid(3000))
        .duration(320).EUt(96)
        .save(provider);

    // Creosote
    PYROLYSE_RECIPES.recipeBuilder("log_to_creosote").circuitMeta(1)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(Creosote.getFluid(4000))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("log_to_creosote_nitrogen").circuitMeta(2)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(Creosote.getFluid(4000))
        .duration(320).EUt(96)
        .save(provider);

    // Heavy Oil
    PYROLYSE_RECIPES.recipeBuilder("log_to_heavy_oil").circuitMeta(3)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .outputItems(dust, Ash, 4)
        .outputFluids(OilHeavy.getFluid(200))
        .duration(320).EUt(192)
        .save(provider);

    // Creosote
    PYROLYSE_RECIPES.recipeBuilder("coal_to_coke_creosote").circuitMeta(1)
        .inputItems(gem, Coal, 16)
        .outputItems(gem, Coke, 16)
        .outputFluids(Creosote.getFluid(8000))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coal_to_coke_creosote_nitrogen").circuitMeta(2)
        .inputItems(gem, Coal, 16)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(gem, Coke, 16)
        .outputFluids(Creosote.getFluid(8000))
        .duration(320).EUt(96)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coal_block_to_coke_creosote").circuitMeta(1)
        .inputItems(block, Coal, 8)
        .outputItems(block, Coke, 8)
        .outputFluids(Creosote.getFluid(32000))
        .duration(2560).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coal_block_to_coke_creosote_nitrogen").circuitMeta(2)
        .inputItems(block, Coal, 8)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(block, Coke, 8)
        .outputFluids(Creosote.getFluid(32000))
        .duration(1280).EUt(96)
        .save(provider);

    // Biomass
    PYROLYSE_RECIPES.recipeBuilder("bio_chaff_to_fermented_biomass").EUt(10).duration(200)
        .inputItems(BIO_CHAFF)
        .circuitMeta(2)
        .inputFluids(Water.getFluid(1500))
        .outputFluids(FermentedBiomass.getFluid(1500))
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("bio_chaff_to_biomass").EUt(10).duration(900)
        .inputItems(BIO_CHAFF, 4)
        .circuitMeta(1)
        .inputFluids(Water.getFluid(4000))
        .outputFluids(Biomass.getFluid(5000))
        .save(provider);

    // Sugar to Charcoal
    PYROLYSE_RECIPES.recipeBuilder("sugar_to_charcoal").circuitMeta(1)
        .inputItems(dust, Sugar, 23)
        .outputItems(dust, Charcoal, 12)
        .outputFluids(Water.getFluid(1500))
        .duration(320).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("sugar_to_charcoal_nitrogen").circuitMeta(2)
        .inputItems(dust, Sugar, 23)
        .inputFluids(Nitrogen.getFluid(500))
        .outputItems(dust, Charcoal, 12)
        .outputFluids(Water.getFluid(1500))
        .duration(160).EUt(96)
        .save(provider);

    // COAL GAS ============================================

    // From Log
    PYROLYSE_RECIPES.recipeBuilder("log_to_coal_gas").circuitMeta(20)
        .inputItems(ItemTags.LOGS_THAT_BURN, 16)
        .inputFluids(Steam.getFluid(1000))
        .outputItems(Items.CHARCOAL, 20)
        .outputFluids(CoalGas.getFluid(2000))
        .duration(640).EUt(64)
        .save(provider);

    // From Coal
    PYROLYSE_RECIPES.recipeBuilder("coal_to_coal_gas").circuitMeta(22)
        .inputItems(gem, Coal, 16)
        .inputFluids(Steam.getFluid(1000))
        .outputItems(gem, Coke, 16)
        .outputFluids(CoalGas.getFluid(4000))
        .duration(320).EUt(96)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coal_block_to_coal_gas").circuitMeta(22)
        .inputItems(block, Coal, 8)
        .inputFluids(Steam.getFluid(4000))
        .outputItems(block, Coke, 8)
        .outputFluids(CoalGas.getFluid(16000))
        .duration(1280).EUt(96)
        .save(provider);

    // COAL TAR ============================================
    PYROLYSE_RECIPES.recipeBuilder("charcoal_to_coal_tar").circuitMeta(8)
        .inputItems(Items.CHARCOAL, 32)
        .chancedOutput(dust, Ash, 5000, 0)
        .outputFluids(CoalTar.getFluid(1000))
        .duration(640).EUt(64)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coal_to_coal_tar").circuitMeta(8)
        .inputItems(Items.COAL, 12)
        .chancedOutput(dust, DarkAsh, 5000, 0)
        .outputFluids(CoalTar.getFluid(3000))
        .duration(320).EUt(96)
        .save(provider);

    PYROLYSE_RECIPES.recipeBuilder("coke_to_coal_tar").circuitMeta(8)
        .inputItems(gem, Coke, 8)
        .chancedOutput(dust, Ash, 7500, 0)
        .outputFluids(CoalTar.getFluid(4000))
        .duration(320).EUt(96)
        .save(provider);
  }
}
