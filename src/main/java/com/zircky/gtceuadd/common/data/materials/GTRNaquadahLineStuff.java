package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import java.util.Locale;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
public class GTRNaquadahLineStuff {
  public static final void register() {
    Ether = Builder("ether")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0xE4BF33)
        .buildAndRegister()
        .setFormula("CH3CH2OCH2CH3" , true);

    AntimonyTrichlorideSolution = Builder("antimony_trichloride_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x53B917)
        .buildAndRegister()
        .setFormula("SbCl3" , true);

    AntimonyPentachloride = Builder("antimony_pentachloride")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x3C8A0D)
        .buildAndRegister()
        .setFormula("SbCl5" , true);

    AntimonyPentachlorideSolution = Builder("antimony_pentachloride_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x3C8A0D)
        .buildAndRegister()
        .setFormula("SbCl5" , true);

    AntimonyPentafluoride = Builder("antimony_pentafluoride")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x11D0C6)
        .buildAndRegister()
        .setFormula("SbF5" , true);

    AntimonyPentafluorideSolution = Builder("antimony_pentafluoride_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x11D0C6)
        .buildAndRegister()
        .setFormula("SbF5" , true);

    LowQualityNaquadahEmulsion = Builder("low_quality_naquadah_emulsion")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x042422)
        .buildAndRegister()
        .setFormula("??NqGaAd??" , true);

    LowQualityNaquadahSolution = Builder("low_quality_naquadah_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x383030)
        .buildAndRegister()
        .setFormula("~??NqAd??~" , true);

    NaquadahOxideMixture = Builder("naquadah_oxide_mixture")
        .dust(1).iconSet(METALLIC)
        .color(0x042422)
        .buildAndRegister()
        .setFormula("??NqTiGaAd??" , true);

    GalliumHydroxide = Builder("gallium_hydroxide")
        .dust(1).iconSet(ROUGH)
        .color(0x767676)
        .buildAndRegister()
        .setFormula("Ga(OH)3" , true);

    Ethyl1Hexanol = Builder("ethyl_1_hexanol")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder()).iconSet(ROUGH)
        .color(0x6AC418)
        .components(Carbon, 8, Hydrogen, 18, Oxygen, 1)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("C8H18O" , true);

    P507 = Builder("p_507")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder()).iconSet(ROUGH)
        .color(0x64C70A)
        .components(Carbon, 16, Phosphorus, 1, Hydrogen, 35, Oxygen, 3)
        .flags(DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("(C8H17)PO3H" , true);

    NaquadahAdamantiumSolution = Builder("naquadah_adamantium_solution")
        .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
        .color(0x06070A)
        .buildAndRegister()
        .setFormula("~NqAd~", true);
  }
}
