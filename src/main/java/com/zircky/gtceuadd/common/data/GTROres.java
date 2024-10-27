package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.data.worldgen.GTLayerPattern;
import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGenLayers;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTOres;
import com.zircky.gtceuadd.GTCEuAdd;
import divinerpg.registries.BlockRegistry;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTOres.OVERWORLD_RULES;
import static com.zircky.gtceuadd.common.data.GTRWorld.*;
import static com.zircky.gtceuadd.common.data.GTRWorld.GTRWorldGenLayers.DRPG;

public class GTROres {

  public static final GTOreDefinition BAUXITE_VEIN = create("bauxite_vein", vein -> vein
      .clusterSize(36)
      .weight(80)
      .layer(DRPG)
      .density(0.3f)
      .dimensions(SKYTHERN)
      .heightRangeUniform(10, 25)
      .discardChanceOnAirExposure(0)
      .layeredVeinGenerator(generator -> generator
          .buildLayerPattern(pattern -> pattern
              .layer(l -> l.weight(2).state(() -> BlockRegistry.twilightStone.get().defaultBlockState()).size(1, 6))
              .layer(l -> l.weight(2).mat(GTMaterials.Bauxite).size(1, 4))
              .layer(l -> l.weight(1).mat(GTMaterials.Ilmenite).size(1, 2))
              .layer(l -> l.weight(1).mat(GTMaterials.Aluminium).size(1, 1))
          )), true);

  public static final GTOreDefinition MICA_VEIN = create("mica_vein", vein -> vein
      .clusterSize(UniformInt.of(32, 40))
      .density(0.25F)
      .weight(20)
      .layer(WorldGenLayers.DEEPSLATE)
      .heightRangeUniform(-40, -10)
      .biomes(BiomeTags.IS_OVERWORLD)
      .layeredVeinGenerator(generator -> generator
          .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
              .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
              .layer(l -> l.weight(3).mat(Kyanite).size(2, 4))
              .layer(l -> l.weight(2).mat(Mica).size(1, 1))
              .layer(l -> l.weight(1).mat(Pollucite).size(1, 1))
              .build()))
      .surfaceIndicatorGenerator(indicator -> indicator.surfaceRock(Mica).radius(3)), true);


  public static GTOreDefinition create(String name, Consumer<GTOreDefinition> config, boolean alwaysCreate) {
    if (alwaysCreate) {
      return GTOres.create(GTCEuAdd.id(name), config);
    }else return GTOres.blankOreDefinition();
  }
  public static void init() {
  }
}
