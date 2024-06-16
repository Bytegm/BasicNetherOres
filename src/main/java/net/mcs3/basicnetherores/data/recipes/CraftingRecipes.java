package net.mcs3.basicnetherores.data.recipes;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class CraftingRecipes extends RecipeProvider {

    public CraftingRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(packOutput, provider);
    }

    private static String MOD_ID = BasicNetherOres.MODID;

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        shapedMetalBlocks(recipeOutput, BNOBlocks.ALUMINUM_BLOCK.get(), BNOItems.ALUMINUM_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.LEAD_BLOCK.get(), BNOItems.LEAD_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.NICKEL_BLOCK.get(), BNOItems.NICKEL_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.SILVER_BLOCK.get(), BNOItems.SILVER_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.TIN_BLOCK.get(), BNOItems.TIN_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.OSMIUM_BLOCK.get(), BNOItems.OSMIUM_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.URANIUM_BLOCK.get(), BNOItems.URANIUM_INGOT.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.ZINC_BLOCK.get(), BNOItems.ZINC_INGOT.get());

        shapedIngot(recipeOutput, BNOItems.ALUMINUM_INGOT.get(), BNOItems.ALUMINUM_NUGGET.get());
        shapedIngot(recipeOutput, Items.COPPER_INGOT, BNOItems.COPPER_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.LEAD_INGOT.get(), BNOItems.LEAD_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.NICKEL_INGOT.get(), BNOItems.NICKEL_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.SILVER_INGOT.get(), BNOItems.SILVER_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.TIN_INGOT.get(), BNOItems.TIN_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.OSMIUM_INGOT.get(), BNOItems.OSMIUM_NUGGET.get());
        shapedIngot(recipeOutput, BNOItems.ZINC_INGOT.get(), BNOItems.ZINC_NUGGET.get());

        shapelessIngots(recipeOutput, BNOItems.ALUMINUM_INGOT.get(), BNOBlocks.ALUMINUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.LEAD_INGOT.get(), BNOBlocks.LEAD_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.NICKEL_INGOT.get(), BNOBlocks.NICKEL_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.SILVER_INGOT.get(), BNOBlocks.SILVER_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.TIN_INGOT.get(), BNOBlocks.TIN_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.OSMIUM_INGOT.get(), BNOBlocks.OSMIUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.URANIUM_INGOT.get(), BNOBlocks.URANIUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.ZINC_INGOT.get(), BNOBlocks.ZINC_BLOCK.get());

        shapelessNuggetsIngots(recipeOutput, BNOItems.ALUMINUM_NUGGET.get(), BNOItems.ALUMINUM_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.LEAD_NUGGET.get(), BNOItems.LEAD_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.NICKEL_NUGGET.get(), BNOItems.NICKEL_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.SILVER_NUGGET.get(), BNOItems.SILVER_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.TIN_NUGGET.get(), BNOItems.TIN_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.OSMIUM_NUGGET.get(), BNOItems.OSMIUM_INGOT.get());
        shapelessNuggetsIngots(recipeOutput, BNOItems.ZINC_NUGGET.get(), BNOItems.ZINC_INGOT.get());

        smeltingOres(recipeOutput, Items.EMERALD, BNOBlocks.NETHER_EMERALD_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.DIAMOND, BNOBlocks.NETHER_DIAMOND_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.REDSTONE, BNOBlocks.NETHER_REDSTONE_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.LAPIS_LAZULI, BNOBlocks.NETHER_LAPIS_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.COAL, BNOBlocks.NETHER_COAL_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.SILVER_INGOT.get(), BNOBlocks.NETHER_SILVER_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.IRON_INGOT, BNOBlocks.NETHER_IRON_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.LEAD_INGOT.get(), BNOBlocks.NETHER_LEAD_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.NICKEL_INGOT.get(), BNOBlocks.NETHER_NICKEL_ORE.get().asItem());
        smeltingOres(recipeOutput, Items.COPPER_INGOT, BNOBlocks.NETHER_COPPER_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.ALUMINUM_INGOT.get(), BNOBlocks.NETHER_ALUMINUM_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.TIN_INGOT.get(), BNOBlocks.NETHER_TIN_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.OSMIUM_INGOT.get(), BNOBlocks.NETHER_OSMIUM_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.URANIUM_INGOT.get(), BNOBlocks.NETHER_URANIUM_ORE.get().asItem());
        smeltingOres(recipeOutput, BNOItems.ZINC_INGOT.get(), BNOBlocks.NETHER_ZINC_ORE.get().asItem());

        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_ALUMINUM_BLOCK.get(), BNOItems.RAW_ALUMINUM.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_LEAD_BLOCK.get(), BNOItems.RAW_LEAD.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_NICKEL_BLOCK.get(), BNOItems.RAW_NICKEL.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_SILVER_BLOCK.get(), BNOItems.RAW_SILVER.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_TIN_BLOCK.get(), BNOItems.RAW_TIN.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_OSMIUM_BLOCK.get(), BNOItems.RAW_OSMIUM.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_URANIUM_BLOCK.get(), BNOItems.RAW_URANIUM.get());
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_ZINC_BLOCK.get(), BNOItems.RAW_ZINC.get());

        shapelessIngots(recipeOutput, BNOItems.RAW_ALUMINUM.get(), BNOBlocks.RAW_ALUMINUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_LEAD.get(), BNOBlocks.RAW_LEAD_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_NICKEL.get(), BNOBlocks.RAW_NICKEL_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_SILVER.get(), BNOBlocks.RAW_SILVER_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_TIN.get(), BNOBlocks.RAW_TIN_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_OSMIUM.get(), BNOBlocks.RAW_OSMIUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_URANIUM.get(), BNOBlocks.RAW_URANIUM_BLOCK.get());
        shapelessIngots(recipeOutput, BNOItems.RAW_ZINC.get(), BNOBlocks.RAW_ZINC_BLOCK.get());

        smeltingRawOre(recipeOutput, BNOItems.SILVER_INGOT.get(), BNOItems.RAW_SILVER.get());
        smeltingRawOre(recipeOutput, BNOItems.LEAD_INGOT.get(), BNOItems.RAW_LEAD.get());
        smeltingRawOre(recipeOutput, BNOItems.NICKEL_INGOT.get(), BNOItems.RAW_NICKEL.get());
        smeltingRawOre(recipeOutput, BNOItems.ALUMINUM_INGOT.get(), BNOItems.RAW_ALUMINUM.get());
        smeltingRawOre(recipeOutput, BNOItems.TIN_INGOT.get(), BNOItems.RAW_TIN.get());
        smeltingRawOre(recipeOutput, BNOItems.OSMIUM_INGOT.get(), BNOItems.RAW_OSMIUM.get());
        smeltingRawOre(recipeOutput, BNOItems.URANIUM_INGOT.get(), BNOItems.RAW_URANIUM.get());
        smeltingRawOre(recipeOutput, BNOItems.ZINC_INGOT.get(), BNOItems.RAW_ZINC.get());

    }
    private static void shapedMetalBlocks(RecipeOutput consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, new ResourceLocation(MOD_ID, blockName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapedIngot(RecipeOutput consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, new ResourceLocation(MOD_ID, ingotName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapelessIngots(RecipeOutput consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputBlock)
                .unlockedBy(ingotName + "_from_block", has(inputBlock))
                .save(consumer);
    }

    private static void shapelessNuggetsIngots(RecipeOutput consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputItem)
                .unlockedBy(nuggetName + "_from_ingot", has(inputItem))
                .save(consumer);
    }

    private static void smeltingOres(RecipeOutput consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MOD_ID, smeltedItem.asItem().toString() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MOD_ID, smeltedItem.asItem().toString() + "_from_blasting"));
    }

    private static void smeltingRawOre(RecipeOutput consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MOD_ID, smeltedItem.asItem().toString() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MOD_ID, smeltedItem.asItem().toString() + "_from_blasting_raw"));
    }

}
