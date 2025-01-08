package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelFile;

public class GTRModels {
  public static NonNullBiConsumer<DataGenContext<Block, Block>, RegistrateBlockstateProvider> cubeAllModel(String name,
                                                                                                           ResourceLocation texture) {
    return (ctx, prov) -> {
      prov.simpleBlock(ctx.getEntry(), prov.models().cubeAll(name, texture));
    };
  }

  public static NonNullBiConsumer<DataGenContext<Block, CoilBlock>, RegistrateBlockstateProvider> createCoilModel(String name,
                                                                                                                  ICoilType coilType) {
    return (ctx, prov) -> {
      ActiveBlock block = ctx.getEntry();
      ModelFile inactive = prov.models().cubeAll(name, coilType.getTexture());
      ModelFile active = prov.models().withExistingParent(name + "_active", GTCEu.id("block/cube_2_layer/all"))
          .texture("bot_all", coilType.getTexture())
          .texture("top_all", coilType.getTexture().withSuffix("_bloom"));
      prov.getVariantBuilder(block)
          .partialState().with(ActiveBlock.ACTIVE, false).modelForState().modelFile(inactive).addModel()
          .partialState().with(ActiveBlock.ACTIVE, true).modelForState().modelFile(active).addModel();
    };
  }
}
