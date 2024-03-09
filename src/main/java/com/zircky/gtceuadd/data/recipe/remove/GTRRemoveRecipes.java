package com.zircky.gtceuadd.data.recipe.remove;


//import com.gregtechceu.gtceu.common.data.GTItems;
//import com.gregtechceu.gtceu.data.recipe.misc.ComponentRecipes;
import com.gregtechceu.gtceu.GTCEu;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTRRemoveRecipes {
  public static void init(Consumer<ResourceLocation> consumer) {
    customeRemoveRecipes(consumer);
  }

  public static void customeRemoveRecipes(Consumer<ResourceLocation> consumer) {
    consumer.accept(GTCEu.id("electric_motor_mv"));
    consumer.accept(GTCEu.id("electric_motor_hv"));
    consumer.accept(GTCEu.id("electric_motor_ev"));
    consumer.accept(GTCEu.id("electric_motor_iv"));
    consumer.accept(GTCEu.id("electric_motor_luv"));
    consumer.accept(GTCEu.id("electric_motor_zpm"));
    consumer.accept(GTCEu.id("electric_motor_uv"));
  }

}
