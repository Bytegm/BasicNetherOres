package net.mcs3.basicnetherores.data.recipes;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.util.helper.ResourceLocationHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.itemName;

public class CraftingRecipeBuilder extends FabricRecipeProvider {
    public CraftingRecipeBuilder(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {

        shapedMetalBlocks(exporter, BNOBlocks.ALUMINUM_BLOCK, BNOItems.ALUMINUM_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.LEAD_BLOCK, BNOItems.LEAD_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.NICKEL_BLOCK, BNOItems.NICKEL_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.SILVER_BLOCK, BNOItems.SILVER_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.TIN_BLOCK, BNOItems.TIN_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.OSMIUM_BLOCK, BNOItems.OSMIUM_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.URANIUM_BLOCK, BNOItems.URANIUM_INGOT);
        shapedMetalBlocks(exporter, BNOBlocks.ZINC_BLOCK, BNOItems.ZINC_INGOT);

        shapedIngot(exporter, BNOItems.ALUMINUM_INGOT, BNOItems.ALUMINUM_NUGGET);
        shapedIngot(exporter, Items.COPPER_INGOT, BNOItems.COPPER_NUGGET);
        shapedIngot(exporter, BNOItems.LEAD_INGOT, BNOItems.LEAD_NUGGET);
        shapedIngot(exporter, BNOItems.NICKEL_INGOT, BNOItems.NICKEL_NUGGET);
        shapedIngot(exporter, BNOItems.SILVER_INGOT, BNOItems.SILVER_NUGGET);
        shapedIngot(exporter, BNOItems.TIN_INGOT, BNOItems.TIN_NUGGET);
        shapedIngot(exporter, BNOItems.OSMIUM_INGOT, BNOItems.OSMIUM_NUGGET);
        shapedIngot(exporter, BNOItems.ZINC_INGOT, BNOItems.ZINC_NUGGET);

        shapelessIngots(exporter, BNOItems.ALUMINUM_INGOT, BNOBlocks.ALUMINUM_BLOCK);
        shapelessIngots(exporter, BNOItems.LEAD_INGOT, BNOBlocks.LEAD_BLOCK);
        shapelessIngots(exporter, BNOItems.NICKEL_INGOT, BNOBlocks.NICKEL_BLOCK);
        shapelessIngots(exporter, BNOItems.SILVER_INGOT, BNOBlocks.SILVER_BLOCK);
        shapelessIngots(exporter, BNOItems.TIN_INGOT, BNOBlocks.TIN_BLOCK);
        shapelessIngots(exporter, BNOItems.OSMIUM_INGOT, BNOBlocks.OSMIUM_BLOCK);
        shapelessIngots(exporter, BNOItems.URANIUM_INGOT, BNOBlocks.URANIUM_BLOCK);
        shapelessIngots(exporter, BNOItems.ZINC_INGOT, BNOBlocks.ZINC_BLOCK);

        shapelessNuggetsIngots(exporter, BNOItems.ALUMINUM_NUGGET, BNOItems.ALUMINUM_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.COPPER_NUGGET, Items.COPPER_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.LEAD_NUGGET, BNOItems.LEAD_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.NICKEL_NUGGET, BNOItems.NICKEL_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.SILVER_NUGGET, BNOItems.SILVER_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.TIN_NUGGET, BNOItems.TIN_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.OSMIUM_NUGGET, BNOItems.OSMIUM_INGOT);
        shapelessNuggetsIngots(exporter, BNOItems.ZINC_NUGGET, BNOItems.ZINC_INGOT);

        smeltingOres(exporter, Items.EMERALD, BNOBlocks.NETHER_EMERALD_ORE.asItem());
        smeltingOres(exporter, Items.DIAMOND, BNOBlocks.NETHER_DIAMOND_ORE.asItem());
        smeltingOres(exporter, Items.REDSTONE, BNOBlocks.NETHER_REDSTONE_ORE.asItem());
        smeltingOres(exporter, Items.LAPIS_LAZULI, BNOBlocks.NETHER_LAPIS_ORE.asItem());
        smeltingOres(exporter, Items.COAL, BNOBlocks.NETHER_COAL_ORE.asItem());
        smeltingOres(exporter, BNOItems.SILVER_INGOT, BNOBlocks.NETHER_SILVER_ORE.asItem());
        smeltingOres(exporter, Items.IRON_INGOT, BNOBlocks.NETHER_IRON_ORE.asItem());
        smeltingOres(exporter, BNOItems.LEAD_INGOT, BNOBlocks.NETHER_LEAD_ORE.asItem());
        smeltingOres(exporter, BNOItems.NICKEL_INGOT, BNOBlocks.NETHER_NICKEL_ORE.asItem());
        smeltingOres(exporter, Items.COPPER_INGOT, BNOBlocks.NETHER_COPPER_ORE.asItem());
        smeltingOres(exporter, BNOItems.ALUMINUM_INGOT, BNOBlocks.NETHER_ALUMINUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.TIN_INGOT, BNOBlocks.NETHER_TIN_ORE.asItem());
        smeltingOres(exporter, BNOItems.OSMIUM_INGOT, BNOBlocks.NETHER_OSMIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.URANIUM_INGOT, BNOBlocks.NETHER_URANIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.ZINC_INGOT, BNOBlocks.NETHER_ZINC_ORE.asItem());

        smeltingOres(exporter, Items.EMERALD, BNOBlocks.BASALT_EMERALD_ORE.asItem());
        smeltingOres(exporter, Items.DIAMOND, BNOBlocks.BASALT_DIAMOND_ORE.asItem());
        smeltingOres(exporter, Items.REDSTONE, BNOBlocks.BASALT_REDSTONE_ORE.asItem());
        smeltingOres(exporter, Items.LAPIS_LAZULI, BNOBlocks.BASALT_LAPIS_ORE.asItem());
        smeltingOres(exporter, Items.COAL, BNOBlocks.BASALT_COAL_ORE.asItem());
        smeltingOres(exporter, BNOItems.SILVER_INGOT, BNOBlocks.BASALT_SILVER_ORE.asItem());
        smeltingOres(exporter, Items.IRON_INGOT, BNOBlocks.BASALT_IRON_ORE.asItem());
        smeltingOres(exporter, BNOItems.LEAD_INGOT, BNOBlocks.BASALT_LEAD_ORE.asItem());
        smeltingOres(exporter, BNOItems.NICKEL_INGOT, BNOBlocks.BASALT_NICKEL_ORE.asItem());
        smeltingOres(exporter, Items.COPPER_INGOT, BNOBlocks.BASALT_COPPER_ORE.asItem());
        smeltingOres(exporter, BNOItems.ALUMINUM_INGOT, BNOBlocks.BASALT_ALUMINUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.TIN_INGOT, BNOBlocks.BASALT_TIN_ORE.asItem());
        smeltingOres(exporter, BNOItems.OSMIUM_INGOT, BNOBlocks.BASALT_OSMIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.URANIUM_INGOT, BNOBlocks.BASALT_URANIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.ZINC_INGOT, BNOBlocks.BASALT_ZINC_ORE.asItem());

        smeltingOres(exporter, Items.EMERALD, BNOBlocks.SOUL_EMERALD_ORE.asItem());
        smeltingOres(exporter, Items.DIAMOND, BNOBlocks.SOUL_DIAMOND_ORE.asItem());
        smeltingOres(exporter, Items.REDSTONE, BNOBlocks.SOUL_REDSTONE_ORE.asItem());
        smeltingOres(exporter, Items.LAPIS_LAZULI, BNOBlocks.SOUL_LAPIS_ORE.asItem());
        smeltingOres(exporter, Items.COAL, BNOBlocks.SOUL_COAL_ORE.asItem());
        smeltingOres(exporter, BNOItems.SILVER_INGOT, BNOBlocks.SOUL_SILVER_ORE.asItem());
        smeltingOres(exporter, Items.IRON_INGOT, BNOBlocks.SOUL_IRON_ORE.asItem());
        smeltingOres(exporter, BNOItems.LEAD_INGOT, BNOBlocks.SOUL_LEAD_ORE.asItem());
        smeltingOres(exporter, BNOItems.NICKEL_INGOT, BNOBlocks.SOUL_NICKEL_ORE.asItem());
        smeltingOres(exporter, Items.COPPER_INGOT, BNOBlocks.SOUL_COPPER_ORE.asItem());
        smeltingOres(exporter, BNOItems.ALUMINUM_INGOT, BNOBlocks.SOUL_ALUMINUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.TIN_INGOT, BNOBlocks.SOUL_TIN_ORE.asItem());
        smeltingOres(exporter, BNOItems.OSMIUM_INGOT, BNOBlocks.SOUL_OSMIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.URANIUM_INGOT, BNOBlocks.SOUL_URANIUM_ORE.asItem());
        smeltingOres(exporter, BNOItems.ZINC_INGOT, BNOBlocks.SOUL_ZINC_ORE.asItem());

        shapedMetalBlocks(exporter, BNOBlocks.RAW_ALUMINUM_BLOCK, BNOItems.RAW_ALUMINUM);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_LEAD_BLOCK, BNOItems.RAW_LEAD);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_NICKEL_BLOCK, BNOItems.RAW_NICKEL);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_SILVER_BLOCK, BNOItems.RAW_SILVER);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_TIN_BLOCK, BNOItems.RAW_TIN);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_OSMIUM_BLOCK, BNOItems.RAW_OSMIUM);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_URANIUM_BLOCK, BNOItems.RAW_URANIUM);
        shapedMetalBlocks(exporter, BNOBlocks.RAW_ZINC_BLOCK, BNOItems.RAW_ZINC);

        shapelessIngots(exporter, BNOItems.RAW_ALUMINUM, BNOBlocks.RAW_ALUMINUM_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_LEAD, BNOBlocks.RAW_LEAD_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_NICKEL, BNOBlocks.RAW_NICKEL_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_SILVER, BNOBlocks.RAW_SILVER_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_TIN, BNOBlocks.RAW_TIN_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_OSMIUM, BNOBlocks.RAW_OSMIUM_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_URANIUM, BNOBlocks.RAW_URANIUM_BLOCK);
        shapelessIngots(exporter, BNOItems.RAW_ZINC, BNOBlocks.RAW_ZINC_BLOCK);

        smeltingRawOre(exporter, BNOItems.SILVER_INGOT, BNOItems.RAW_SILVER);
        smeltingRawOre(exporter, BNOItems.LEAD_INGOT, BNOItems.RAW_LEAD);
        smeltingRawOre(exporter, BNOItems.NICKEL_INGOT, BNOItems.RAW_NICKEL);
        smeltingRawOre(exporter, BNOItems.ALUMINUM_INGOT, BNOItems.RAW_ALUMINUM);
        smeltingRawOre(exporter, BNOItems.TIN_INGOT, BNOItems.RAW_TIN);
        smeltingRawOre(exporter, BNOItems.OSMIUM_INGOT, BNOItems.RAW_OSMIUM);
        smeltingRawOre(exporter, BNOItems.URANIUM_INGOT, BNOItems.RAW_URANIUM);
        smeltingRawOre(exporter, BNOItems.ZINC_INGOT, BNOItems.RAW_ZINC);

    }

    private static void shapedMetalBlocks(RecipeOutput consumer, Block craftedItem, Item inputItem)
    {
        String blockName = ResourceLocationHelper.itemName(craftedItem.asItem());
        String inputName = ResourceLocationHelper.itemName(inputItem.asItem());
//        String blockName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, blockName + "_from_" + inputName));
    }

    private static void shapedIngot(RecipeOutput consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = ResourceLocationHelper.itemName(craftedItem.asItem());
        String inputName = ResourceLocationHelper.itemName(inputItem.asItem());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, ingotName + "_from_" + inputName));
    }

    private static void shapelessIngots(RecipeOutput consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = ResourceLocationHelper.itemName(craftedItem.asItem());

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
                .unlockedBy("has_" + itemName(inputOre), has(inputOre.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, itemName(smeltedItem) + "_from_" + itemName(inputOre) + "_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + itemName(inputOre), has(inputOre.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, itemName(smeltedItem) + "_from_" + itemName(inputOre) + "_blasting"));
    }

    private static void smeltingRawOre(RecipeOutput consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, itemName(smeltedItem) + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, itemName(smeltedItem) + "_from_blasting_raw"));
    }
}
