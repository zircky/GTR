package com.zircky.gtceuadd.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import net.minecraft.client.resources.model.Material;

import java.util.Set;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of(
//            GTRMaterials.CuBe,
//            GTRMaterials.ScAl,
//            GTRMaterials.BAM,
//            GTRMaterials.YAG,
//            GTRMaterials.Nimonic,
//            GTRMaterials.Hastelloy,
//            GTRMaterials.CuNiFe,
//            GTRMaterials.SiliconNitride,
//            GTRMaterials.SiliconCarbide,
//            GTRMaterials.TitaniumNitride,
//            GTRMaterials.Hydronalium,
//            GTRMaterials.Vanasteel,
//            GTRMaterials.Mischmetal,
//            GTRMaterials.GreenGold,
//            GTRMaterials.WhiteGold,
//            GTRMaterials.Shibuichi,
//            GTRMaterials.Tombak,
//            GTRMaterials.Pewter,
//            GTRMaterials.CortenSteel,
//            GTRMaterials.Shakudo,
//            GTRMaterials.PurpleGold,
//            GTRMaterials.RawSalt
    );

    public static void init(RegistrateLangProvider provider) {
//        for (Material material : MATERIALS) {
//            provider.add(material.getUnlocalizedName(), );
//        }

        provider.add(GTRMaterials.CuBe.getUnlocalizedName(), "CuBe");
        provider.add(GTRMaterials.ScAl.getUnlocalizedName(), "ScAl");
        provider.add(GTRMaterials.BAM.getUnlocalizedName(), "BAM");
        provider.add(GTRMaterials.YAG.getUnlocalizedName(), "YAG");
        provider.add(GTRMaterials.Nimonic.getUnlocalizedName(), "Nimonic");
        provider.add(GTRMaterials.Hastelloy.getUnlocalizedName(), "Hastelloy");
        provider.add(GTRMaterials.CuNiFe.getUnlocalizedName(), "CuNiFe");
        provider.add(GTRMaterials.SiliconNitride.getUnlocalizedName(), "Silicon Nitride");
        provider.add(GTRMaterials.SiliconCarbide.getUnlocalizedName(), "Silicon Carbide");
        provider.add(GTRMaterials.TitaniumNitride.getUnlocalizedName(), "Titanium Nitride");
        provider.add(GTRMaterials.Hydronalium.getUnlocalizedName(), "Hydronalium");
        provider.add(GTRMaterials.Vanasteel.getUnlocalizedName(), "Vanasteel");
        provider.add(GTRMaterials.Mischmetal.getUnlocalizedName(), "Mischmetal");
        provider.add(GTRMaterials.GreenGold.getUnlocalizedName(), "Green Gold");
        provider.add(GTRMaterials.WhiteGold.getUnlocalizedName(), "White Gold");
        provider.add(GTRMaterials.Shibuichi.getUnlocalizedName(), "Shibuichi");
        provider.add(GTRMaterials.Tombak.getUnlocalizedName(), "Tombak");
        provider.add(GTRMaterials.Pewter.getUnlocalizedName(), "Pewter");
        provider.add(GTRMaterials.CortenSteel.getUnlocalizedName(), "Corten Steel");
        provider.add(GTRMaterials.Shakudo.getUnlocalizedName(), "Shakudo");
        provider.add(GTRMaterials.PurpleGold.getUnlocalizedName(), "Purple Gold");
        provider.add(GTRMaterials.RawSalt.getUnlocalizedName(), "Raw Salt");
    }

}
