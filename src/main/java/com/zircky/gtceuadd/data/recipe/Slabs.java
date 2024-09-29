package com.zircky.gtceuadd.data.recipe;

import appeng.core.definitions.AEBlocks;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import divinerpg.registries.BlockRegistry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import vazkii.botania.common.block.BotaniaBlocks;

import java.util.function.Consumer;

public class Slabs {
  public static void init(Consumer<FinishedRecipe> provider) {
    slabs(provider);
  }

  public static void slabs(Consumer<FinishedRecipe> provider) {
    recipeSlabs(provider, "ae2/shaped/slabs/chiseled_quartz_block", new ItemStack(AEBlocks.CHISELED_QUARTZ_SLAB), new ItemStack(AEBlocks.CHISELED_QUARTZ_BLOCK));
    recipeSlabs(provider, "ae2/shaped/slabs/cut_quartz_block", new ItemStack(AEBlocks.CUT_QUARTZ_SLAB), new ItemStack(AEBlocks.CUT_QUARTZ_BLOCK));
    recipeSlabs(provider, "ae2/shaped/slabs/fluix_block", new ItemStack(AEBlocks.FLUIX_SLAB), new ItemStack(AEBlocks.FLUIX_BLOCK));
    recipeSlabs(provider, "ae2/shaped/slabs/quartz_block", new ItemStack(AEBlocks.QUARTZ_SLAB), new UnificationEntry(TagPrefix.block, GTMaterials.CertusQuartz));
    recipeSlabs(provider, "ae2/shaped/slabs/quartz_bricks", new ItemStack(AEBlocks.QUARTZ_BRICK_SLAB), new ItemStack(AEBlocks.QUARTZ_BRICKS));
    recipeSlabs(provider, "ae2/shaped/slabs/quartz_pillar", new ItemStack(AEBlocks.QUARTZ_PILLAR_SLAB), new ItemStack(AEBlocks.QUARTZ_PILLAR));
    recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_block", new ItemStack(AEBlocks.SKY_STONE_SLAB), new ItemStack(AEBlocks.SKY_STONE_BLOCK));
    recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_brick", new ItemStack(AEBlocks.SKY_STONE_BRICK_SLAB), new ItemStack(AEBlocks.SKY_STONE_BRICK));
    recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_small_brick", new ItemStack(AEBlocks.SKY_STONE_SMALL_BRICK_SLAB), new ItemStack(AEBlocks.SKY_STONE_SMALL_BRICK));
    recipeSlabs(provider, "ae2/shaped/slabs/smooth_quartz_block", new ItemStack(AEBlocks.SMOOTH_QUARTZ_SLAB), new ItemStack(AEBlocks.SMOOTH_QUARTZ_BLOCK));
    recipeSlabs(provider, "ae2/shaped/slabs/smooth_sky_stone_block", new ItemStack(AEBlocks.SMOOTH_SKY_STONE_SLAB), new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK));

    recipeSlabs(provider, "botania/livingrock", new ItemStack(BotaniaBlocks.livingrockSlab), new ItemStack(BotaniaBlocks.livingrock));
    recipeSlabs(provider, "botania/polished_livingrock", new ItemStack(BotaniaBlocks.livingrockPolishedSlab), new ItemStack(BotaniaBlocks.livingrockPolished));
    recipeSlabs(provider, "botania/livingrock_bricks", new ItemStack(BotaniaBlocks.livingrockBrickSlab), new ItemStack(BotaniaBlocks.livingrockBrick));
    recipeSlabs(provider, "botania/mossy_livingrock_bricks", new ItemStack(BotaniaBlocks.livingrockBrickMossySlab), new ItemStack(BotaniaBlocks.livingrockBrickMossy));
    recipeSlabs(provider, "botania/stripped_livingwood", new ItemStack(BotaniaBlocks.livingwoodStrippedSlab, 2), new ItemStack(BotaniaBlocks.livingwoodStripped));
    recipeSlabs(provider, "botania/livingwood_planks", new ItemStack(BotaniaBlocks.livingwoodPlankSlab, 2), new ItemStack(BotaniaBlocks.livingwoodPlanks));
    recipeSlabs(provider, "botania/stripped_dreamwood", new ItemStack(BotaniaBlocks.dreamwoodStrippedSlab, 2), new ItemStack(BotaniaBlocks.dreamwoodStripped));
    recipeSlabs(provider, "botania/dreamwood_planks", new ItemStack(BotaniaBlocks.dreamwoodPlankSlab, 2), new ItemStack(BotaniaBlocks.dreamwoodPlanks));
    recipeSlabs(provider, "botania/corporea", new ItemStack(BotaniaBlocks.corporeaSlab), new ItemStack(BotaniaBlocks.corporeaBlock));
    recipeSlabs(provider, "botania/corporea_brick", new ItemStack(BotaniaBlocks.corporeaBrickSlab), new ItemStack(BotaniaBlocks.corporeaBrick));
    recipeSlabs(provider, "botania/shimmerrock", new ItemStack(BotaniaBlocks.shimmerrockSlab), new ItemStack(BotaniaBlocks.shimmerrock));
    recipeSlabs(provider, "botania/shimmerwood_planks", new ItemStack(BotaniaBlocks.shimmerwoodPlankSlab), new ItemStack(BotaniaBlocks.shimmerwoodPlanks));
    recipeSlabs(provider, "botania/dark_quartz", new ItemStack(BotaniaBlocks.darkQuartzSlab), new ItemStack(BotaniaBlocks.darkQuartz));
    recipeSlabs(provider, "botania/mana_quartz", new ItemStack(BotaniaBlocks.manaQuartzSlab), new ItemStack(BotaniaBlocks.manaQuartz));
    recipeSlabs(provider, "botania/blaze_quartz", new ItemStack(BotaniaBlocks.blazeQuartzSlab), new ItemStack(BotaniaBlocks.blazeQuartz));
    recipeSlabs(provider, "botania/lavender_quartz", new ItemStack(BotaniaBlocks.lavenderQuartzSlab), new ItemStack(BotaniaBlocks.lavenderQuartz));
    recipeSlabs(provider, "botania/red_quartz", new ItemStack(BotaniaBlocks.redQuartzSlab), new ItemStack(BotaniaBlocks.redQuartz));
    recipeSlabs(provider, "botania/elf_quartz", new ItemStack(BotaniaBlocks.elfQuartzSlab), new ItemStack(BotaniaBlocks.elfQuartz));
    recipeSlabs(provider, "botania/sunny_quartz", new ItemStack(BotaniaBlocks.sunnyQuartzSlab), new ItemStack(BotaniaBlocks.sunnyQuartz));
    recipeSlabs(provider, "botania/metamorphic_forest_stone", new ItemStack(BotaniaBlocks.biomeStoneForestSlab), new ItemStack(BotaniaBlocks.biomeStoneForest));
    recipeSlabs(provider, "botania/metamorphic_forest_bricks", new ItemStack(BotaniaBlocks.biomeBrickForestSlab), new ItemStack(BotaniaBlocks.biomeBrickForest));
    recipeSlabs(provider, "botania/metamorphic_forest_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneForestSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneForest));
    recipeSlabs(provider, "botania/metamorphic_plains_stone", new ItemStack(BotaniaBlocks.biomeStonePlainsSlab), new ItemStack(BotaniaBlocks.biomeStonePlains));
    recipeSlabs(provider, "botania/metamorphic_plains_bricks", new ItemStack(BotaniaBlocks.biomeBrickPlainsSlab), new ItemStack(BotaniaBlocks.biomeBrickPlains));
    recipeSlabs(provider, "botania/metamorphic_plains_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestonePlainsSlab), new ItemStack(BotaniaBlocks.biomeCobblestonePlains));
    recipeSlabs(provider, "botania/metamorphic_mountain_stone", new ItemStack(BotaniaBlocks.biomeStoneMountainSlab), new ItemStack(BotaniaBlocks.biomeStoneMountain));
    recipeSlabs(provider, "botania/metamorphic_mountain_bricks", new ItemStack(BotaniaBlocks.biomeBrickMountainSlab), new ItemStack(BotaniaBlocks.biomeBrickMountain));
    recipeSlabs(provider, "botania/metamorphic_mountain_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneMountainSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneMountain));
    recipeSlabs(provider, "botania/metamorphic_fungal_stone", new ItemStack(BotaniaBlocks.biomeStoneFungalSlab), new ItemStack(BotaniaBlocks.biomeStoneFungal));
    recipeSlabs(provider, "botania/metamorphic_fungal_bricks", new ItemStack(BotaniaBlocks.biomeBrickFungalSlab), new ItemStack(BotaniaBlocks.biomeBrickFungal));
    recipeSlabs(provider, "botania/metamorphic_fungal_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneFungalSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneFungal));
    recipeSlabs(provider, "botania/metamorphic_swamp_stone", new ItemStack(BotaniaBlocks.biomeStoneSwampSlab), new ItemStack(BotaniaBlocks.biomeStoneSwamp));
    recipeSlabs(provider, "botania/metamorphic_swamp_bricks", new ItemStack(BotaniaBlocks.biomeBrickSwampSlab), new ItemStack(BotaniaBlocks.biomeBrickSwamp));
    recipeSlabs(provider, "botania/metamorphic_swamp_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneSwampSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneSwamp));
    recipeSlabs(provider, "botania/metamorphic_desert_stone", new ItemStack(BotaniaBlocks.biomeStoneDesertSlab), new ItemStack(BotaniaBlocks.biomeStoneDesert));
    recipeSlabs(provider, "botania/metamorphic_desert_bricks", new ItemStack(BotaniaBlocks.biomeBrickDesertSlab), new ItemStack(BotaniaBlocks.biomeBrickDesert));
    recipeSlabs(provider, "botania/metamorphic_desert_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneDesertSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneDesert));
    recipeSlabs(provider, "botania/metamorphic_taiga_stone", new ItemStack(BotaniaBlocks.biomeStoneTaigaSlab), new ItemStack(BotaniaBlocks.biomeStoneTaiga));
    recipeSlabs(provider, "botania/metamorphic_taiga_bricks", new ItemStack(BotaniaBlocks.biomeBrickTaigaSlab), new ItemStack(BotaniaBlocks.biomeBrickTaiga));
    recipeSlabs(provider, "botania/metamorphic_taiga_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneTaigaSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneTaiga));
    recipeSlabs(provider, "botania/metamorphic_mesa_stone", new ItemStack(BotaniaBlocks.biomeStoneMesaSlab), new ItemStack(BotaniaBlocks.biomeStoneMesa));
    recipeSlabs(provider, "botania/metamorphic_mesa_bricks", new ItemStack(BotaniaBlocks.biomeBrickMesaSlab), new ItemStack(BotaniaBlocks.biomeBrickMesa));
    recipeSlabs(provider, "botania/metamorphic_mesa_cobblestone", new ItemStack(BotaniaBlocks.biomeCobblestoneMesaSlab), new ItemStack(BotaniaBlocks.biomeCobblestoneMesa));
    recipeSlabs(provider, "botania/white_pavement", new ItemStack(BotaniaBlocks.whitePavementSlab), new ItemStack(BotaniaBlocks.whitePavement));
    recipeSlabs(provider, "botania/black_pavement", new ItemStack(BotaniaBlocks.blackPavementSlab), new ItemStack(BotaniaBlocks.blackPavement));
    recipeSlabs(provider, "botania/blue_pavement", new ItemStack(BotaniaBlocks.bluePavementSlab), new ItemStack(BotaniaBlocks.bluePavement));
    recipeSlabs(provider, "botania/yellow_pavement", new ItemStack(BotaniaBlocks.yellowPavementSlab), new ItemStack(BotaniaBlocks.yellowPavement));
    recipeSlabs(provider, "botania/red_pavement", new ItemStack(BotaniaBlocks.redPavementSlab), new ItemStack(BotaniaBlocks.redPavement));
    recipeSlabs(provider, "botania/green_pavement", new ItemStack(BotaniaBlocks.greenPavementSlab), new ItemStack(BotaniaBlocks.greenPavement));

    recipeSlabs(provider, "divinerpg/shaped/frozen_slab", new ItemStack(BlockRegistry.frozenSlab.get()), new ItemStack(BlockRegistry.frozenStone.get()));
    recipeSlabs(provider, "divinerpg/shaped/cobbled_frozen_slab", new ItemStack(BlockRegistry.cobbledFrozenSlab.get()), new ItemStack(BlockRegistry.cobbledFrozenStone.get()));
    recipeSlabs(provider, "divinerpg/shaped/cobaltite_slab", new ItemStack(BlockRegistry.cobaltiteSlab.get()), new ItemStack(BlockRegistry.cobaltite.get()));
    recipeSlabs(provider, "divinerpg/shaped/coalstone_slab", new ItemStack(BlockRegistry.coalstoneSlab.get()), new ItemStack(BlockRegistry.coalstone.get()));
    recipeSlabs(provider, "divinerpg/shaped/asphalt_slab", new ItemStack(BlockRegistry.asphaltSlab.get()), new ItemStack(BlockRegistry.asphalt.get()));
    recipeSlabs(provider, "divinerpg/shaped/frozen_brick_slab", new ItemStack(BlockRegistry.frozenBrickSlab.get()), new ItemStack(BlockRegistry.frozenBricks.get()));
    recipeSlabs(provider, "divinerpg/shaped/coalstone_brick_slab", new ItemStack(BlockRegistry.coalstoneBrickSlab.get()), new ItemStack(BlockRegistry.coalstoneBricks.get()));
    recipeSlabs(provider, "divinerpg/shaped/polished_coalstone_slab", new ItemStack(BlockRegistry.polishedCoalstoneSlab.get()), new ItemStack(BlockRegistry.polishedCoalstone.get()));
    recipeSlabs(provider, "divinerpg/shaped/polished_cobaltite_slab", new ItemStack(BlockRegistry.polishedCobaltiteSlab.get()), new ItemStack(BlockRegistry.polishedCobaltite.get()));
    recipeSlabs(provider, "divinerpg/shaped/cut_oxdrite_slab", new ItemStack(BlockRegistry.cutOxdriteSlab.get()), new ItemStack(BlockRegistry.cutOxdrite.get()));
    recipeSlabs(provider, "divinerpg/shaped/ancient_brick_slab", new ItemStack(BlockRegistry.ancientBrickSlab.get()), new ItemStack(BlockRegistry.ancientBricks.get()));
    recipeSlabs(provider, "divinerpg/shaped/degraded_brick_slab", new ItemStack(BlockRegistry.degradedBrickSlab.get()), new ItemStack(BlockRegistry.degradedBricks.get()));

  }

  private static void recipeSlabs(Consumer<FinishedRecipe> provider, String regNamme, ItemStack output, ItemStack input) {
    VanillaRecipeHelper.addShapedRecipe(provider, regNamme + "_slabs_saw", output,
        "sS",
        'S', input);
  }
  private static void recipeSlabs(Consumer<FinishedRecipe> provider, String regNamme, ItemStack output, UnificationEntry input) {
    VanillaRecipeHelper.addShapedRecipe(provider, regNamme + "_slabs_saw", output,
        "sS",
        'S', input);
  }
}
