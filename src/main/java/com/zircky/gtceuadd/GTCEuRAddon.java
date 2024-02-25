package com.zircky.gtceuadd;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.KJSRecipeKeyEvent;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.zircky.gtceuadd.api.recipe.CompAssLineCondition;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import com.zircky.gtceuadd.common.data.GTRCasingBlocks;
import com.zircky.gtceuadd.common.data.GTRRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

@GTAddon
public class GTCEuRAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return GTRRegistries.REGISTRATE;
    }

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
    public void registerSounds() {
        IGTAddon.super.registerSounds();
    }

    @Override
    public void registerCovers() {
        IGTAddon.super.registerCovers();
    }

    @Override
    public void registerRecipeCapabilities() {
        IGTAddon.super.registerRecipeCapabilities();
    }

    @Override
    public void registerRecipeConditions() {
//        IGTAddon.super.registerRecipeConditions();
      GTRegistries.RECIPE_CONDITIONS.register(CompAssLineCondition.INSTANCE.getType(), CompAssLineCondition.class);
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
        GTRRecipes.init(provider);;
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> consumer) {
        IGTAddon.super.removeRecipes(consumer);
        GTRRecipes.recipeRemoval(consumer);
    }

    @Override
    public void registerOreVeins() {
        IGTAddon.super.registerOreVeins();
    }

    @Override
    public void registerFluidVeins() {
        IGTAddon.super.registerFluidVeins();
    }

    @Override
    public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
//        IGTAddon.super.collectMaterialCasings(event);
        GTRCasingBlocks.init();
    }

    @Override
    public void registerRecipeKeys(KJSRecipeKeyEvent event) {
        IGTAddon.super.registerRecipeKeys(event);
    }

    @Override
    public boolean requiresHighTier() {
        return true;
    }
}
