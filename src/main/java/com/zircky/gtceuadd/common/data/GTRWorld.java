package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGeneratorUtils;
import com.zircky.gtceuadd.data.recipe.CustemTags;
import divinerpg.registries.BlockRegistry;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class GTRWorld {
  protected static final ResourceLocation TWILIGHT_FOREST = new ResourceLocation("twilightforest", "twilight_forest");
  protected static final ResourceLocation EDEN = new ResourceLocation("divinerpg", "eden");
  protected static final ResourceLocation WILDWOOD = new ResourceLocation("divinerpg", "wildwood");
  protected static final ResourceLocation APALACHIA = new ResourceLocation("divinerpg", "apalachia");
  protected static final ResourceLocation SKYTHERN = new ResourceLocation("divinerpg", "skythern");
  protected static final ResourceLocation MORTUM = new ResourceLocation("divinerpg", "mortum");
  protected static final ResourceLocation ICEIKA = new ResourceLocation("divinerpg", "iceika");
  protected static final ResourceLocation ARCANA = new ResourceLocation("divinerpg", "arcana");
//  protected static final ResourceLocation VETHEA = new ResourceLocation("divinerpg", "vethea");


  public enum GTRWorldGenLayers implements IWorldGenLayer, StringRepresentable {
    TF("tf", new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), Set.of(TWILIGHT_FOREST)),
    DRPG("drpg", new TagMatchTest(CustemTags.DIVINE_RPG), Set.of(EDEN, WILDWOOD, APALACHIA, SKYTHERN, MORTUM, ICEIKA, ARCANA));


    private final String name;
    @Getter
    private final Set<ResourceLocation> levels;
    @Getter
    private final RuleTest target;

    GTRWorldGenLayers(String name, RuleTest target, Set<ResourceLocation> levels) {
      this.name = name;
      this.target = target;
      this.levels = levels;
      WorldGeneratorUtils.WORLD_GEN_LAYERS.put(name, this);
    }

    public static void init() {

    }

    @Override
    public boolean isApplicableForLevel(ResourceLocation level) {
      return levels.contains(level);
    }

    @Override
    @NotNull
    public String getSerializedName() {
      return name;
    }
  }

}
