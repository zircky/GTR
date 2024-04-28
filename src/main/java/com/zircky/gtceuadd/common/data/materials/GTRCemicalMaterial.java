package com.zircky.gtceuadd.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.SHINY;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;
import static com.zircky.gtceuadd.common.data.materials.GTRMaterialBase.SNDART_FLAGS;

@SuppressWarnings("unused")
public class GTRCemicalMaterial {
  public static final void register() {
    CuBe = IngotBuilder("cube", 0xAC4A09, 0xB7410E, SNDART_FLAGS, SHINY, "CuBe", 1000, GasTier.LOW, GTValues.VA[GTValues.MV]);
    ScAl = IngotBuilder("scal", 0xC9C9C9, 0xD0D0D0, SNDART_FLAGS, SHINY, "ScAl", 1300, GasTier.LOW, GTValues.VA[GTValues.MV]);
    BAM = IngotBuilder("bam", 0x737373, 0x696969, SNDART_FLAGS, SHINY, 1250, "");
    YAG = GemBuilder("yag", 0xE9B2FF, 0xE0B0FF, SHINY, "", GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD);
    Nimonic = IngotBuilder("nimonic", 0x7A7168, 0x7D746D, SNDART_FLAGS, SHINY, 1350, "");
    Hastelloy = IngotBuilder("hastelloy", 0x404040, 0x282828, SNDART_FLAGS, SHINY, 1350, "");
    CuNiFe = IngotBuilder("cunife", 0xD6B689, 0xD2B48C, SNDART_FLAGS, SHINY, 1356, "");
    SiliconNitride = GemBuilder("silicon_nitride", 0xAEAEAE, 0xA5A5A5, SHINY, "", GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD);
    SiliconCarbide = GemBuilder("silicon_carbide", 0x282828, 0x23282B, SHINY, "", GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD);
    TitaniumNitride = IngotBuilder("titanium_nitride", 0xFFAE00, 0xFFB300, SNDART_FLAGS, SHINY, 1100, "");
    Hydronalium = IngotBuilder("hydronalium", 0xACB0B3, 0x9DA1AA, SNDART_FLAGS, SHINY, 1100, "");
    Vanasteel = IngotBuilder("vanasteel", 0x999E7B, 0x8D917A, SNDART_FLAGS, SHINY, "", 2100, GasTier.MID, GTValues.VA[GTValues.EV], 2100);
    Mischmetal = IngotBuilder("mischmetal", 0x111111, 0x131313, SNDART_FLAGS, SHINY, "", 2700, GasTier.HIGH, GTValues.VA[GTValues.EV], 2100);
    GreenGold = IngotBuilder("green_gold", 0xA1AC63, 0x9E9764, SNDART_FLAGS, SHINY, "Au3Ag", 2700, GasTier.HIGH, GTValues.VA[GTValues.EV], 2100);
    WhiteGold = IngotBuilder("white_gold", 0x979797, 0x9C9C9C, SNDART_FLAGS, SHINY, "Au6PbNiZn", 2700, GasTier.HIGH, GTValues.VA[GTValues.EV], 2100);
    Shibuichi = IngotBuilder("shibuichi", 0x161616, 0x131313, SNDART_FLAGS, SHINY, "", 3254, GasTier.HIGH, GTValues.VA[GTValues.EV], 2100);
    Tombak = IngotBuilder("tombak", 0xB7671B, 0xD2691E, SNDART_FLAGS, SHINY, "", 3254, GasTier.HIGH, GTValues.VA[GTValues.EV], 2100);
    Pewter = IngotBuilder("pewter", 0xC8D1CA, 0xC7D0CC, SNDART_FLAGS, SHINY, "", 3541, GasTier.HIGH, GTValues.VA[GTValues.IV], 2800);
    CortenSteel = IngotBuilder("corten_steel", 0x7C370D, 0x8B4513, SNDART_FLAGS, SHINY, "", 3870, GasTier.HIGH, GTValues.VA[GTValues.IV], 2800);
    Shakudo = IngotBuilder("shakudo", 0x111024, 0x1A162A, SNDART_FLAGS, SHINY, "", 3870, GasTier.HIGH, GTValues.VA[GTValues.IV], 2800);
    PurpleGold = IngotBuilder("purple_gold", 0x844684, 0x8E4585, SNDART_FLAGS, SHINY, "AlAu3", 4512, GasTier.HIGH, GTValues.VA[GTValues.ZPM], 3600);
    RawSalt = DustBuilder("raw_salt", 0xC9C0BB, 0xC0BEB9, SHINY, "");
    CSolder = IngotBuilder("c_solder", 0x051F9E, 0x003399, SHINY, "Sn90.7Ag3.6Cu0.7Cr5", GENERATE_PLATE, GENERATE_DENSE);
    Syngas = FluidBuilder("syngas", 0x484848, 0x505050, FluidStorageKeys.GAS, new FluidBuilder().temperature(500), SHINY);
    AcrylicAcid = FluidBuilder("acrylic_acid", 0x919191, 0x909090, FluidStorageKeys.LIQUID, new FluidBuilder().attribute(FluidAttributes.ACID), METALLIC);
    Silicone = FluidBuilder("silicone", 0x98A6B3, 0x9DA1AA, METALLIC);
    SodiumCyanide = FluidBuilder("sodium_cyanide", 0xDCDCDC, 0xDCDCDC, METALLIC);

  }

}
