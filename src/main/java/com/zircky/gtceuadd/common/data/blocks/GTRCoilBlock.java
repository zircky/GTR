package com.zircky.gtceuadd.common.data.blocks;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class GTRCoilBlock extends CoilBlock {
  public GTRCoilBlock(Properties properties, ICoilType coilType) {
    super(properties, coilType);
  }

  @Getter
  public enum GTCoilType implements StringRepresentable, ICoilType {
    INFINITY("infinity", 15800, 16, 16, GTRMaterials.Infinity, GTCEuAdd.id("block/casings/coils/machine_coil_infinity"));

    @NotNull
    private final String name;
    private final int coilTemperature;
    private final int level;
    private final int energyDiscount;
    @NotNull
    private final Material material;
    @NotNull
    private final ResourceLocation texture;

    GTCoilType(String name, int coilTemperature, int level, int energyDiscount, Material material, ResourceLocation texture) {
      this.name = name;
      this.coilTemperature = coilTemperature;
      this.level = level;
      this.energyDiscount = energyDiscount;
      this.material = material;
      this.texture = texture;
    }

    public int getTier() {
      return this.ordinal();
    }

    @NotNull
    @Override
    public String toString() {
      return getName();
    }

    @Override
    @NotNull
    public String getSerializedName() {
      return name;
    }
  }
}
