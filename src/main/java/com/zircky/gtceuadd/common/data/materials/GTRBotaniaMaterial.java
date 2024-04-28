package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.MORTAR;
import static com.zircky.gtceuadd.api.data.material.GTRMaterialIconSet.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.*;

@SuppressWarnings("unused")
public class GTRBotaniaMaterial {


  public static final void register() {
    ManaSteel = Builder("mana_steel")
        .ingot().dust().fluid()
        .color(0xabe2fd).iconSet(METALLIC)
        .appendFlags(REF)
        .toolStats(ToolProperty.Builder.of(8.0f, 4, 5120, 4).enchantability(14).addTypes(MORTAR).build())
        .blastTemp(1500, GasTier.LOW, GTValues.VA[GTValues.MV])
        .buildAndRegister()
        .setFormula("Ms", true);


//    ManaSteel = IngotBuilder("mana_steel", 0xabe2fd, 0x3D78DB, REF, SHINY, toolStats(8.0f, 4, 5120, 4, 14, MORTAR), 1500, GasTier.LOW, GTValues.VA[GTValues.MV]);
    Terrasteel = IngotBuilder("terra_steel", 0x5ec53c, 0x57A639, REF, SHINY, "Tr", 4500, GasTier.LOW, GTValues.VA[GTValues.EV]);
    ElvenElementium = IngotBuilder("elementium", 0xdf3bd2, 0xED3CCA, REF, METALLIC, "Ef");
    Livingrock = DustCusBuilder("livingrock", LIVINGROCK, "Lv", GENERATE_PLATE, GENERATE_GEAR, GENERATE_SMALL_GEAR);
    GaiaSpirit = IngotBuilder("gaia_spirit", 0xFFFFFF, 0xFFFFFF, REF, METALLIC, "Gs");
    Livingwood = DustCusBuilder("livingwood", LIVINGWOOD, "Lw", GENERATE_PLATE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_LONG_ROD);
    Dreamwood = DustCusBuilder("dreamwood", DREAMWOOD, "Dw", GENERATE_PLATE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_LONG_ROD);
    ManaDiamond = GemBuilder("mana_diamond", 0x3cefe3, 0x7FFFD4, RSTD_METAL, DIAMOND);
    BotaniaDragonstone = GemBuilder("botania_dragonstone", 0xf341f1, 0xF754E1, RSTD_METAL, DIAMOND, "Dg");
  }
}
