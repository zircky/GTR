package com.zircky.gtceuadd.mixin.gt;

import com.zircky.gtceuadd.worldgen.GTOreVein;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.gregtechceu.gtceu.data.loader.GTOreLoader;

@Mixin(GTOreLoader.class)
public class GTOreMixin {
  @Inject(method = "apply*", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/common/data/GTOres;init()V", shift = At.Shift.AFTER), remap = false)
  private void postInit(CallbackInfo ci) {
    GTOreVein.OreRemove();
  }
}
