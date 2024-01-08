package com.zircky.gtceuadd;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.KJSRecipeKeyEvent;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

@GTAddon
public class GTCEuRAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GTCEuAdd.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        IGTAddon.super.registerTagPrefixes();
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
    }

    @Override
    public void registerMaterials() {
        GTRMaterials.register();
    }

    @Override
    public void registerSounds() {
        IGTAddon.super.registerSounds();
    }

    @Override
    public void registerCovers() {
        IGTAddon.super.registerCovers();
    }

    @Override
    public void registerWorldgenLayers() {
        IGTAddon.super.registerWorldgenLayers();
    }

    @Override
    public void registerVeinGenerators() {
        IGTAddon.super.registerVeinGenerators();
    }

    @Override
    public void registerIndicatorGenerators() {
        IGTAddon.super.registerIndicatorGenerators();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.addRecipes(provider);
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> consumer) {
        IGTAddon.super.removeRecipes(consumer);
    }

    @Override
    public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
        IGTAddon.super.collectMaterialCasings(event);
    }

    @Override
    public void registerRecipeKeys(KJSRecipeKeyEvent event) {
        IGTAddon.super.registerRecipeKeys(event);
    }

    @Override
    public boolean requiresHighTier() {
        return IGTAddon.super.requiresHighTier();
    }
}
