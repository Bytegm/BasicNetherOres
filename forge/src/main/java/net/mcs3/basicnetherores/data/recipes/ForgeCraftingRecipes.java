package net.mcs3.basicnetherores.data.recipes;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class ForgeCraftingRecipes extends RecipeProvider {

    public ForgeCraftingRecipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        shapedMetalBlocks(recipeOutput, BNOBlocks.ALUMINUM_BLOCK, BNOItems.ALUMINUM_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.LEAD_BLOCK, BNOItems.LEAD_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.NICKEL_BLOCK, BNOItems.NICKEL_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.SILVER_BLOCK, BNOItems.SILVER_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.TIN_BLOCK, BNOItems.TIN_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.OSMIUM_BLOCK, BNOItems.OSMIUM_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.URANIUM_BLOCK, BNOItems.URANIUM_INGOT);
        shapedMetalBlocks(recipeOutput, BNOBlocks.ZINC_BLOCK, BNOItems.ZINC_INGOT);

        shapedIngot(recipeOutput, BNOItems.ALUMINUM_INGOT, BNOItems.ALUMINUM_NUGGET);
        shapedIngot(recipeOutput, Items.COPPER_INGOT, BNOItems.COPPER_NUGGET);
        shapedIngot(recipeOutput, BNOItems.LEAD_INGOT, BNOItems.LEAD_NUGGET);
        shapedIngot(recipeOutput, BNOItems.NICKEL_INGOT, BNOItems.NICKEL_NUGGET);
        shapedIngot(recipeOutput, BNOItems.SILVER_INGOT, BNOItems.SILVER_NUGGET);
        shapedIngot(recipeOutput, BNOItems.TIN_INGOT, BNOItems.TIN_NUGGET);
        shapedIngot(recipeOutput, BNOItems.OSMIUM_INGOT, BNOItems.OSMIUM_NUGGET);
        shapedIngot(recipeOutput, BNOItems.ZINC_INGOT, BNOItems.ZINC_NUGGET);

        shapelessIngots(recipeOutput, BNOItems.ALUMINUM_INGOT, BNOBlocks.ALUMINUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.LEAD_INGOT, BNOBlocks.LEAD_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.NICKEL_INGOT, BNOBlocks.NICKEL_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.SILVER_INGOT, BNOBlocks.SILVER_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.TIN_INGOT, BNOBlocks.TIN_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.OSMIUM_INGOT, BNOBlocks.OSMIUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.URANIUM_INGOT, BNOBlocks.URANIUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.ZINC_INGOT, BNOBlocks.ZINC_BLOCK);

        shapelessNuggetsIngots(recipeOutput, BNOItems.ALUMINUM_NUGGET, BNOItems.ALUMINUM_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.COPPER_NUGGET, Items.COPPER_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.LEAD_NUGGET, BNOItems.LEAD_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.NICKEL_NUGGET, BNOItems.NICKEL_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.SILVER_NUGGET, BNOItems.SILVER_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.TIN_NUGGET, BNOItems.TIN_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.OSMIUM_NUGGET, BNOItems.OSMIUM_INGOT);
        shapelessNuggetsIngots(recipeOutput, BNOItems.ZINC_NUGGET, BNOItems.ZINC_INGOT);

        smeltingOres(recipeOutput, Items.EMERALD, BNOBlocks.NETHER_EMERALD_ORE.asItem());
        smeltingOres(recipeOutput, Items.DIAMOND, BNOBlocks.NETHER_DIAMOND_ORE.asItem());
        smeltingOres(recipeOutput, Items.REDSTONE, BNOBlocks.NETHER_REDSTONE_ORE.asItem());
        smeltingOres(recipeOutput, Items.LAPIS_LAZULI, BNOBlocks.NETHER_LAPIS_ORE.asItem());
        smeltingOres(recipeOutput, Items.COAL, BNOBlocks.NETHER_COAL_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.SILVER_INGOT, BNOBlocks.NETHER_SILVER_ORE.asItem());
        smeltingOres(recipeOutput, Items.IRON_INGOT, BNOBlocks.NETHER_IRON_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.LEAD_INGOT, BNOBlocks.NETHER_LEAD_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.NICKEL_INGOT, BNOBlocks.NETHER_NICKEL_ORE.asItem());
        smeltingOres(recipeOutput, Items.COPPER_INGOT, BNOBlocks.NETHER_COPPER_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.ALUMINUM_INGOT, BNOBlocks.NETHER_ALUMINUM_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.TIN_INGOT, BNOBlocks.NETHER_TIN_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.OSMIUM_INGOT, BNOBlocks.NETHER_OSMIUM_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.URANIUM_INGOT, BNOBlocks.NETHER_URANIUM_ORE.asItem());
        smeltingOres(recipeOutput, BNOItems.ZINC_INGOT, BNOBlocks.NETHER_ZINC_ORE.asItem());

        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_ALUMINUM_BLOCK, BNOItems.RAW_ALUMINUM);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_LEAD_BLOCK, BNOItems.RAW_LEAD);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_NICKEL_BLOCK, BNOItems.RAW_NICKEL);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_SILVER_BLOCK, BNOItems.RAW_SILVER);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_TIN_BLOCK, BNOItems.RAW_TIN);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_OSMIUM_BLOCK, BNOItems.RAW_OSMIUM);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_URANIUM_BLOCK, BNOItems.RAW_URANIUM);
        shapedMetalBlocks(recipeOutput, BNOBlocks.RAW_ZINC_BLOCK, BNOItems.RAW_ZINC);

        shapelessIngots(recipeOutput, BNOItems.RAW_ALUMINUM, BNOBlocks.RAW_ALUMINUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_LEAD, BNOBlocks.RAW_LEAD_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_NICKEL, BNOBlocks.RAW_NICKEL_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_SILVER, BNOBlocks.RAW_SILVER_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_TIN, BNOBlocks.RAW_TIN_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_OSMIUM, BNOBlocks.RAW_OSMIUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_URANIUM, BNOBlocks.RAW_URANIUM_BLOCK);
        shapelessIngots(recipeOutput, BNOItems.RAW_ZINC, BNOBlocks.RAW_ZINC_BLOCK);

        smeltingRawOre(recipeOutput, BNOItems.SILVER_INGOT, BNOItems.RAW_SILVER);
        smeltingRawOre(recipeOutput, BNOItems.LEAD_INGOT, BNOItems.RAW_LEAD);
        smeltingRawOre(recipeOutput, BNOItems.NICKEL_INGOT, BNOItems.RAW_NICKEL);
        smeltingRawOre(recipeOutput, BNOItems.ALUMINUM_INGOT, BNOItems.RAW_ALUMINUM);
        smeltingRawOre(recipeOutput, BNOItems.TIN_INGOT, BNOItems.RAW_TIN);
        smeltingRawOre(recipeOutput, BNOItems.OSMIUM_INGOT, BNOItems.RAW_OSMIUM);
        smeltingRawOre(recipeOutput, BNOItems.URANIUM_INGOT, BNOItems.RAW_URANIUM);
        smeltingRawOre(recipeOutput, BNOItems.ZINC_INGOT, BNOItems.RAW_ZINC);

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
                .save(consumer, new ResourceLocation(Constants.MOD_ID, blockName + "_from_" + inputItem.asItem().toString()));
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
                .save(consumer, new ResourceLocation(Constants.MOD_ID, ingotName + "_from_" + inputItem.asItem().toString()));
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
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting"));
    }

    private static void smeltingRawOre(RecipeOutput consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting_raw"));
    }

}
