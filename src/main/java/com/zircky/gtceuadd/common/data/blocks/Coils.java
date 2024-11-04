package com.zircky.gtceuadd.common.data.blocks;

import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.item.RendererBlockItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import static com.gregtechceu.gtceu.common.data.GTBlocks.compassNodeExist;
import static com.zircky.gtceuadd.common.data.GTRCasingBlocks.COIL_INFINITY;

public class Coils {
  public static void register() {
    COIL_INFINITY = createCoilBlock(GTRCoilBlock.GTCoilType.INFINITY);
  }


  public static BlockEntry<GTRCoilBlock> createCoilBlock(ICoilType icoilType) {
    return GTRRegistries.REGISTRATE
        .block("%s_coil_block".formatted(icoilType.getName()), p -> new GTRCoilBlock(p, icoilType))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .addLayer(() -> RenderType::cutoutMipped)
        .blockstate(NonNullBiConsumer.noop())
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(RendererBlockItem::new)
        .model(NonNullBiConsumer.noop())
        .onRegister(compassNodeExist(GTCompassSections.BLOCKS, "coil_block"))
        .build()
        .register();
  }
}
