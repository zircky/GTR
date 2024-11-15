package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.block.SimpleCoilType;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.data.GTModels;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.common.data.GTBlocks.compassNodeExist;
import static com.gregtechceu.gtceu.common.registry.GTRegistration.REGISTRATE;
import static com.zircky.gtceuadd.GTCEuAdd.id;

@SuppressWarnings("unused")
public class GTRCasingBlocks {
  public static final BlockEntry<CoilBlock> INFINITY = createCoilBlock("infinity", 15800, 16, 16, 8, GTRMaterials.Infinity, GTCEu.id("block/casings/coils/machine_coil_infinity"));
  public static final BlockEntry<CoilBlock> INFINITY_DYNAMIC = createCoilBlock("infinity_dynamic", 25901, 32, 48, 9, GTRMaterials.DynamicInfinity, GTCEu.id("block/casings/coils/machine_coil_infinity"));

  public static final BlockEntry<Block> CompAssLine_Casing_LV = createCasingBlock("compassline_casing_lv", id("block/casings/solid/compassline_casing_lv"));
  public static final BlockEntry<Block> CompAssLine_Casing_MV = createCasingBlock("compassline_casing_mv", id("block/casings/solid/compassline_casing_mv"));
  public static final BlockEntry<Block> CompAssLine_Casing_HV = createCasingBlock("compassline_casing_hv", id("block/casings/solid/compassline_casing_hv"));
  public static final BlockEntry<Block> CompAssLine_Casing_EV = createCasingBlock("compassline_casing_ev", id("block/casings/solid/compassline_casing_ev"));
  public static final BlockEntry<Block> CompAssLine_Casing_IV = createCasingBlock("compassline_casing_iv", id("block/casings/solid/compassline_casing_iv"));
  public static final BlockEntry<Block> CompAssLine_Casing_LuV = createCasingBlock("compassline_casing_luv", id("block/casings/solid/compassline_casing_luv"));
  public static final BlockEntry<Block> CompAssLine_Casing_ZPM = createCasingBlock("compassline_casing_zpm", id("block/casings/solid/compassline_casing_zpm"));
  public static final BlockEntry<Block> CompAssLine_Casing_UV = createCasingBlock("compassline_casing_uv", id("block/casings/solid/compassline_casing_uv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UHV = createCasingBlock("compassline_casing_uhv", id("block/casings/solid/compassline_casing_uhv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UEV = createCasingBlock("compassline_casing_uev", id("block/casings/solid/compassline_casing_uev"));
  public static final BlockEntry<Block> CompAssLine_Casing_UIV = createCasingBlock("compassline_casing_uiv", id("block/casings/solid/compassline_casing_uiv"));
  public static final BlockEntry<Block> CompAssLine_Casing_UXV = createCasingBlock("compassline_casing_uxv", id("block/casings/solid/compassline_casing_uxv"));
  public static final BlockEntry<Block> CompAssLine_Casing_OpV = createCasingBlock("compassline_casing_opv", id("block/casings/solid/compassline_casing_opv"));
  public static final BlockEntry<Block> CompAssLine_Casing_MAX = createCasingBlock("compassline_casing_max", id("block/casings/solid/compassline_casing_max"));
  public static final BlockEntry<Block> IridiumPlatedMachineCasing = createCasingBlock("iridium_plated_machine_casing", id("block/casings/solid/iridium_plated_machine_casing"));
  public static final BlockEntry<Block> RadiantNaquadahAlloyCasing = createCasingBlock("radiant_naquadah_alloy_casing", id("block/casings/solid/radiant_naquadah_alloy_casing"));
  public static final BlockEntry<Block> MiningBlackPlutoniumCasing = createCasingBlock("mining_black_plutonium_casing", id("block/casings/solid/mining_black_plutonium_casing"));
  public static final BlockEntry<Block> ContainmentFieldMachineCasing = createCasingBlock("containment_field_machine_casing", id("block/casings/solid/containment_field_machine_casing"));
  public static final BlockEntry<Block> MiningNeutroniumCasing = createCasingBlock("mining_neutronium_casing", id("block/casings/solid/mining_neutronium_casing"));

  public static final BlockEntry<Block> GLASS_HV = createGlassCasingBlock("glass_hv", id("block/casings/transparent/glass_hv"), () -> RenderType::cutoutMipped);


  public static void init() {
  }

  private static BlockEntry<Block> createCasingBlock(String name, ResourceLocation texture) {
    return createCasingBlock(name, Block::new, texture, () -> Blocks.IRON_BLOCK, () -> RenderType::cutoutMipped);
  }

  private static BlockEntry<Block> createCasingBlock(String name, Function<BlockBehaviour.Properties, ? extends Block> blockSupplier, ResourceLocation texture, NonNullSupplier<? extends Block> properties, Supplier<Supplier<RenderType>> type) {
    return GTRRegistries.REGISTRATE.block(name, p -> (Block) blockSupplier.apply(p))
        .initialProperties(properties)
        .addLayer(type)
        .blockstate(GTRModels.cubeAllModel(name, texture))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  private static BlockEntry<CoilBlock> createCoilBlock(String name, int coilTemperature, int levels, int energyDiscount, int tier, Material material, ResourceLocation texture) {
    SimpleCoilType coilType = new SimpleCoilType(
        name, coilTemperature, levels, energyDiscount, tier,
        () -> material, texture);
    BlockEntry<CoilBlock> coilBlock = REGISTRATE
        .block("%s_coil_block".formatted(coilType.getName()), p -> new CoilBlock(p, coilType))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(() -> RenderType::cutoutMipped)
        .blockstate(GTModels.createCoilModel("%s_coil_block".formatted(coilType.getName()), coilType))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .onRegister(compassNodeExist(GTCompassSections.BLOCKS, "coil_block"))
        .build()
        .register();
    GTCEuAPI.HEATING_COILS.put(coilType, coilBlock);
    return coilBlock;
  }


  private static BlockEntry<Block> createGlassCasingBlock(String name, ResourceLocation texture,
                                                          Supplier<Supplier<RenderType>> type) {
    return createCasingBlock(name, GlassBlock::new, texture, () -> Blocks.GLASS, type);
  }
}



