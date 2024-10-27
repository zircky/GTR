package com.zircky.gtceuadd.data.recipe.remove;

import com.zircky.gtceuadd.data.recipe.remove.mods.*;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ModsRemoves {
  public static void modsRemoves(Consumer<ResourceLocation> consumer) {
    DivineRPGRemove.divineRPGRemove(consumer);
    GTRRemoveRecipes.init(consumer);
    ArsNouveauRemoves.init(consumer);
    AppliedEnergistics2Remove.init(consumer);
    BotaniaRemoves.botaniaRemove(consumer);
    AllTheCompressedRemoves.allTheCompressed(consumer);
  }
}
