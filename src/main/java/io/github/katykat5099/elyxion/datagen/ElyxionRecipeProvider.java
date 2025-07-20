package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import io.github.katykat5099.elyxion.item.ElyxionItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ElyxionRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ORE_SMELTABLE_COAL = List.of(ElyxionBlocks.HARDSTONE_COAL_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_IRON = List.of(ElyxionBlocks.HARDSTONE_IRON_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_COPPER = List.of(ElyxionBlocks.HARDSTONE_COPPER_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_GOLD = List.of(ElyxionBlocks.HARDSTONE_GOLD_ORE.get(), ElyxionBlocks.OBDURITE_GOLD_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_DIAMOND = List.of(ElyxionBlocks.OBDURITE_DIAMOND_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_REDSTONE = List.of(ElyxionBlocks.OBDURITE_REDSTONE_ORE.get());
    private static final List<ItemLike> ORE_SMELTABLE_LAPIS = List.of(ElyxionBlocks.OBDURITE_LAPIS_ORE.get());

    public ElyxionRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        // Coal
        oreSmelting(writer, ORE_SMELTABLE_COAL, RecipeCategory.MISC, Items.COAL, 0.1F, 200, "coal");
        oreBlasting(writer, ORE_SMELTABLE_COAL, RecipeCategory.MISC, Items.COAL, 0.1F, 100, "coal");

        // Iron
        oreSmelting(writer, ORE_SMELTABLE_IRON, RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200, "iron_ingot");
        oreBlasting(writer, ORE_SMELTABLE_IRON, RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 100, "iron_ingot");

        // Copper
        oreSmelting(writer, ORE_SMELTABLE_COPPER, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200, "copper_ingot");
        oreBlasting(writer, ORE_SMELTABLE_COPPER, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 100, "copper_ingot");

        // Gold
        oreSmelting(writer, ORE_SMELTABLE_GOLD, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0F, 200, "gold_ingot");
        oreBlasting(writer, ORE_SMELTABLE_GOLD, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0F, 100, "gold_ingot");

        // Diamond
        oreSmelting(writer, ORE_SMELTABLE_DIAMOND, RecipeCategory.MISC, Items.DIAMOND, 1.0F, 200, "diamond");
        oreBlasting(writer, ORE_SMELTABLE_GOLD, RecipeCategory.MISC, Items.DIAMOND, 1.0F, 100, "diamond");

        // Redstone
        oreSmelting(writer, ORE_SMELTABLE_REDSTONE, RecipeCategory.MISC, Items.REDSTONE, 0.7F, 200, "redstone");
        oreBlasting(writer, ORE_SMELTABLE_REDSTONE, RecipeCategory.MISC, Items.REDSTONE, 0.7F, 100, "redstone");

        // Lapis
        oreSmelting(writer, ORE_SMELTABLE_LAPIS, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2F, 200, "lapis");
        oreBlasting(writer, ORE_SMELTABLE_LAPIS, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2F, 100, "lapis");

        // Stones
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ElyxionBlocks.HARDCOBBLESTONE.get()), RecipeCategory.BUILDING_BLOCKS, ElyxionBlocks.HARDSTONE.get().asItem(), 0.1F, 200).unlockedBy("has_hardcobblestone", has(ElyxionBlocks.HARDCOBBLESTONE.get())).save(writer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ElyxionBlocks.FRACTURED_OBDURITE.get()), RecipeCategory.BUILDING_BLOCKS, ElyxionBlocks.OBDURITE.get().asItem(), 0.1F, 200).unlockedBy("has_fractured_obdurite", has(ElyxionBlocks.FRACTURED_OBDURITE.get())).save(writer);

        // Tools
        /*ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.DIAMOND_AXE).define('#', Items.STICK).define('X', Items.DIAMOND)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(writer);*/
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ElyxionItems.COPPER_PICKAXE.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(writer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_,
                    p_251871_, p_251316_, p_251817_)
                    .group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(p_250791_, Elyxion.MODID + ":" + getItemName(p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
}
