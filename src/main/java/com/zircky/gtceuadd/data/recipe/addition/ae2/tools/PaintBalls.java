package com.zircky.gtceuadd.data.recipe.addition.ae2.tools;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.hooks.AEToolItem;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.lowdragmc.lowdraglib.side.fluid.FluidStack;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static appeng.api.util.AEColor.*;
import static appeng.api.util.AEColor.YELLOW;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CHEMICAL_BATH_RECIPES;

public class PaintBalls {
  public static void init(Consumer<FinishedRecipe> provider) {
    paint(provider);
  }

  public static void paint(Consumer<FinishedRecipe> provider) {
    chemicalBath("ae2/tools/paintballs_black", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(BLACK),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_blue", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(BLUE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_brown", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(BROWN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_cyan", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(CYAN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_gray", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(GRAY),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_green", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(GREEN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_light_blue", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(LIGHT_BLUE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_light_gray", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(LIGHT_GRAY),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lime", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(LIME),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_magenta", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(MAGENTA),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_orange", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(ORANGE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_purple", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(PURPLE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_pink", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(PINK),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_red", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(RED),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_white", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(WHITE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_yellow", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEItems.COLORED_PAINT_BALL.item(YELLOW),4), 1200, GTValues.VA[GTValues.EV], provider);

    chemicalBath("ae2/tools/paintballs_lumen_black", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(1152), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(BLACK),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_blue", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(BLUE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_brown", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(BROWN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_cyan", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(CYAN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_gray", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(GRAY),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_green", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(GREEN),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_light_blue", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(LIGHT_BLUE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_light_gray", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(LIGHT_GRAY),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_lime", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(LIME),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_magenta", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(MAGENTA),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_orange", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(ORANGE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_pink", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(PINK),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_purple", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(PURPLE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_red", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(RED),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_white", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(WHITE),4), 1200, GTValues.VA[GTValues.EV], provider);
    chemicalBath("ae2/tools/paintballs_lumen_yellow", new ItemStack(AEItems.MATTER_BALL, 4), GTMaterials.Glowstone.getFluid(144), new ItemStack(AEItems.COLORED_LUMEN_PAINT_BALL.item(YELLOW),4), 1200, GTValues.VA[GTValues.EV], provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/certus_quartz_wrench", AEItems.CERTUS_QUARTZ_WRENCH.stack(),
        "CwC", "CCC", " C ",
        'C', new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz));
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/nether_quartz_wrench", AEItems.NETHER_QUARTZ_WRENCH.stack(),
        "QwQ", "QQQ", " Q ",
      'Q', new ItemStack(Items.QUARTZ));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/certus_quartz_cutting_knife", AEItems.CERTUS_QUARTZ_KNIFE.stack(),
        "hTS", "CST", "PCf",
        'C', new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz),
        'P', new UnificationEntry(TagPrefix.plate, GTMaterials.CertusQuartz),
        'T', new UnificationEntry(TagPrefix.screw, GTMaterials.CertusQuartz),
        'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/nether_quartz_cutting_knife", AEItems.NETHER_QUARTZ_KNIFE.stack(),
        "hTS",
                "QST",
                "PQf",
        'Q', new UnificationEntry(TagPrefix.gem, GTMaterials.NetherQuartz),
        'P', new UnificationEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'T', new UnificationEntry(TagPrefix.screw, GTMaterials.NetherQuartz),
        'S', new UnificationEntry(TagPrefix.rod, GTMaterials.Wood));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/misctools_entropy_manipulator", AEItems.ENTROPY_MANIPULATOR.stack(),
        "FP ", "EC ", "  T",
        'F', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'P', new ItemStack(AEItems.LOGIC_PROCESSOR),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR),
        'C', new ItemStack(AEBlocks.ENERGY_CELL),
        'T', new UnificationEntry(TagPrefix.rod, GTMaterials.TitaniumTungstenCarbide));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/network_color_applicator", AEItems.COLOR_APPLICATOR.stack(),
        "WFW", "CEC", " R ",
        'W', new UnificationEntry(TagPrefix.wireGtSingle, GTMaterials.BlueAlloy),
        'F', new ItemStack(AEItems.FORMATION_CORE),
        'C', new ItemStack(AEItems.CELL_COMPONENT_4K),
        'E', new ItemStack(AEBlocks.ENERGY_CELL),
        'R', new UnificationEntry(TagPrefix.rod, GTMaterials.Steel));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/tools/network_memory_card", AEItems.MEMORY_CARD.stack(),
        "LCT", "GRG",
        'L', new ItemStack(AEItems.LOGIC_PROCESSOR),
        'C', CustomTags.EV_CIRCUITS,
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide),
        'G', new UnificationEntry(TagPrefix.plate, GTMaterials.Glowstone),
        'R', new UnificationEntry(TagPrefix.plate, GTMaterials.Redstone));
  }

  private static void chemicalBath(String id, ItemStack inputItem, FluidStack inputFluid, ItemStack outputItem, int duration, long EUt, Consumer<FinishedRecipe> provider) {
    CHEMICAL_BATH_RECIPES.recipeBuilder(id)
        .inputItems(inputItem)
        .inputFluids(inputFluid)
        .outputItems(outputItem)
        .duration(duration).EUt(EUt).save(provider);
  }
}
