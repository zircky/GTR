package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.DIAMOND;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.zircky.gtceuadd.api.data.material.GTRMaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.Builder;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.REF;

@SuppressWarnings("unused")
public class GTRBotaniaMaterial {


  public static final void register() {
    ManaSteel = Builder("mana_steel")
        .ingot().dust().fluid()
        .color(0xabe2fd).iconSet(METALLIC)
        .appendFlags(REF)
        .toolStats(ToolProperty.Builder.of(8.0f, 4, 5120, 4).enchantability(14).addTypes(GTToolType.MORTAR).build())
        .blastTemp(1500, GasTier.LOW, GTValues.VA[GTValues.MV])
        .register()
        .setFormula("Ms", true);

    Terrasteel = Builder("terra_steel")
        .ingot().dust().fluid()
        .color(0x5ec53c).iconSet(METALLIC)
        .appendFlags(REF)
        .register()
        .setFormula("Tr");

    ElvenElementium = Builder("elementium")
        .ingot().dust().fluid()
        .color(0xdf3bd2).iconSet(METALLIC)
        .appendFlags(REF)
        .register().setFormula("Ef");

    Livingrock = Builder("livingrock")
        .dust().iconSet(LIVINGROCK)
        .flags(GENERATE_PLATE, GENERATE_GEAR, GENERATE_SMALL_GEAR)
        .register().setFormula("Lv");

    GaiaSpirit = Builder("gaia_spirit")
        .ingot().dust().fluid()
        .color(0xfffff).iconSet(METALLIC)
        .appendFlags(REF)
        .register().setFormula("Gs", true);

    Livingwood = Builder("livingwood")
        .dust().iconSet(LIVINGWOOD)
        .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_LONG_ROD)
        .register().setFormula("Lw");

    Dreamwood = Builder("dreamwood")
        .iconSet(DREAMWOOD)
        .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_LONG_ROD)
        .register().setFormula("Dw");

    ManaDiamond = Builder("mana_diamond")
        .gem().dust()
        .color(0x3cefe3).iconSet(DIAMOND)
        .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_LENS)
        .register();

    BotaniaDragonstone = Builder("botania_dragonstone")
        .gem().dust()
        .color(0xf341f1).iconSet(DIAMOND)
        .flags(GENERATE_PLATE, GENERATE_LENS, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
        .register()
        .setFormula("Dg");
  }
}
