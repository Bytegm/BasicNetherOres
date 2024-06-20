package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class FabricItemTagGenerator extends ItemTagsProvider {

    public static final TagKey<Item> ORES = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores"));
    public static final TagKey<Item> STORAGE_BLOCKS = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks"));

    public static final TagKey<Item> ORES_EMERALD = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/emerald"));
    public static final TagKey<Item> ORES_DIAMOND = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/diamond"));
    public static final TagKey<Item> ORES_REDSTONE = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/redstone"));
    public static final TagKey<Item> ORES_LAPIS = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/lapis"));
    public static final TagKey<Item> ORES_COAL = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/coal"));
    public static final TagKey<Item> ORES_IRON = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/iron"));
    public static final TagKey<Item> ORES_ALUMINUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum"));
    public static final TagKey<Item> ORES_ALUMINIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminium"));
    public static final TagKey<Item> ORES_SILVER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/silver"));
    public static final TagKey<Item> ORES_LEAD = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/lead"));
    public static final TagKey<Item> ORES_NICKEL = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel"));
    public static final TagKey<Item> ORES_COPPER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/copper"));
    public static final TagKey<Item> ORES_TIN = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/tin"));
    public static final TagKey<Item> ORES_OSMIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium"));
    public static final TagKey<Item> ORES_URANIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/uranium"));
    public static final TagKey<Item> ORES_ZINC = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ores/zinc"));

    public static final TagKey<Item> ALUMINUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aluminum"));
    public static final TagKey<Item> ALUMINIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aluminium"));
    public static final TagKey<Item> SILVER_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/silver"));
    public static final TagKey<Item> LEAD_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/lead"));
    public static final TagKey<Item> NICKEL_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/nickel"));
    public static final TagKey<Item> TIN_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tin"));
    public static final TagKey<Item> OSMIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/osmium"));
    public static final TagKey<Item> URANIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/uranium"));
    public static final TagKey<Item> ZINC_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/zinc"));

    public static final TagKey<Item> RAW_ALUMINUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_aluminum"));
    public static final TagKey<Item> RAW_ALUMINIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_aluminium"));
    public static final TagKey<Item> RAW_SILVER_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_silver"));
    public static final TagKey<Item> RAW_LEAD_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_lead"));
    public static final TagKey<Item> RAW_NICKEL_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_nickel"));
    public static final TagKey<Item> RAW_TIN_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_tin"));
    public static final TagKey<Item> RAW_OSMIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_osmium"));
    public static final TagKey<Item> RAW_URANIUM_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_uranium"));
    public static final TagKey<Item> RAW_ZINC_BLOCK = itemTag(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_zinc"));

    public static final TagKey<Item> INGOTS = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots"));

    public static final TagKey<Item> INGOT_ALUMINUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/aluminium"));
    public static final TagKey<Item> INGOT_ALUMINIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/aluminium"));
    public static final TagKey<Item> INGOT_SILVER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/silver"));
    public static final TagKey<Item> INGOT_LEAD = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/lead"));
    public static final TagKey<Item> INGOT_NICKEL = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/nickel"));
    public static final TagKey<Item> INGOT_TIN = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/tin"));
    public static final TagKey<Item> INGOT_OSMIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/osmium"));
    public static final TagKey<Item> INGOT_URANIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/uranium"));
    public static final TagKey<Item> INGOT_ZINC = itemTag(ResourceLocation.fromNamespaceAndPath("c", "ingots/zinc"));

    public static final TagKey<Item> NUGGETS = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets"));

    public static final TagKey<Item> NUGGET_ALUMINUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/aluminum"));
    public static final TagKey<Item> NUGGET_ALUMINIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/aluminium"));
    public static final TagKey<Item> NUGGET_SILVER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/silver"));
    public static final TagKey<Item> NUGGET_LEAD = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/lead"));
    public static final TagKey<Item> NUGGET_NICKEL = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/nickel"));
    public static final TagKey<Item> NUGGET_COPPER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/copper"));
    public static final TagKey<Item> NUGGET_TIN = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/tin"));
    public static final TagKey<Item> NUGGET_OSMIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/osmium"));
    public static final TagKey<Item> NUGGET_ZINC = itemTag(ResourceLocation.fromNamespaceAndPath("c", "nuggets/zinc"));

    public static final TagKey<Item> RAW_MATERIALS = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials"));

    public static final TagKey<Item> RAW_ALUMINUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/aluminum"));
    public static final TagKey<Item> RAW_ALUMINIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/aluminium"));
    public static final TagKey<Item> RAW_SILVER = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/silver"));
    public static final TagKey<Item> RAW_LEAD = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/lead"));
    public static final TagKey<Item> RAW_NICKEL = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/nickel"));
    public static final TagKey<Item> RAW_TIN = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/tin"));
    public static final TagKey<Item> RAW_OSMIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/osmium"));
    public static final TagKey<Item> RAW_URANIUM = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/uranium"));
    public static final TagKey<Item> RAW_ZINC = itemTag(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/zinc"));

    public FabricItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider) {
        super(packOutput, lookupProvider, blockTagProvider);
    }

    private static TagKey<Item> itemTag(ResourceLocation location) {
        return TagKey.create(Registries.ITEM, location);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        copy(BlockTags.EMERALD_ORES, ItemTags.EMERALD_ORES);
        copy(BlockTags.DIAMOND_ORES, ItemTags.DIAMOND_ORES);
        copy(BlockTags.REDSTONE_ORES, ItemTags.REDSTONE_ORES);
        copy(BlockTags.LAPIS_ORES, ItemTags.LAPIS_ORES);
        copy(BlockTags.COAL_ORES, ItemTags.COAL_ORES);
        copy(BlockTags.IRON_ORES, ItemTags.IRON_ORES);
        copy(BlockTags.COPPER_ORES, ItemTags.COPPER_ORES);

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //
        copy(FabricBlockTagGenerator.ORES, ORES);
        copy(FabricBlockTagGenerator.STORAGE_BLOCKS, STORAGE_BLOCKS);

        copy(FabricBlockTagGenerator.ORES_EMERALD, ORES_EMERALD);
        copy(FabricBlockTagGenerator.ORES_DIAMOND, ORES_DIAMOND);
        copy(FabricBlockTagGenerator.ORES_REDSTONE, ORES_REDSTONE);
        copy(FabricBlockTagGenerator.ORES_LAPIS, ORES_LAPIS);
        copy(FabricBlockTagGenerator.ORES_COAL, ORES_COAL);
        copy(FabricBlockTagGenerator.ORES_IRON, ORES_IRON);
        copy(FabricBlockTagGenerator.ORES_ALUMINUM, ORES_ALUMINUM);
        copy(FabricBlockTagGenerator.ORES_ALUMINIUM, ORES_ALUMINIUM);
        copy(FabricBlockTagGenerator.ORES_SILVER, ORES_SILVER);
        copy(FabricBlockTagGenerator.ORES_LEAD, ORES_LEAD);
        copy(FabricBlockTagGenerator.ORES_NICKEL, ORES_NICKEL);
        copy(FabricBlockTagGenerator.ORES_COPPER, ORES_COPPER);
        copy(FabricBlockTagGenerator.ORES_TIN, ORES_TIN);
        copy(FabricBlockTagGenerator.ORES_OSMIUM, ORES_OSMIUM);
        copy(FabricBlockTagGenerator.ORES_URANIUM, ORES_URANIUM);
        copy(FabricBlockTagGenerator.ORES_ZINC, ORES_ZINC);

        copy(FabricBlockTagGenerator.ALUMINUM_BLOCK, ALUMINUM_BLOCK);
        copy(FabricBlockTagGenerator.ALUMINIUM_BLOCK, ALUMINIUM_BLOCK);
        copy(FabricBlockTagGenerator.SILVER_BLOCK, SILVER_BLOCK);
        copy(FabricBlockTagGenerator.LEAD_BLOCK, LEAD_BLOCK);
        copy(FabricBlockTagGenerator.NICKEL_BLOCK, NICKEL_BLOCK);
        copy(FabricBlockTagGenerator.TIN_BLOCK, TIN_BLOCK);
        copy(FabricBlockTagGenerator.OSMIUM_BLOCK, OSMIUM_BLOCK);
        copy(FabricBlockTagGenerator.URANIUM_BLOCK, URANIUM_BLOCK);
        copy(FabricBlockTagGenerator.ZINC_BLOCK, ZINC_BLOCK);

        copy(FabricBlockTagGenerator.RAW_ALUMINUM_BLOCK, RAW_ALUMINUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_ALUMINIUM_BLOCK, RAW_ALUMINIUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_SILVER_BLOCK, RAW_SILVER_BLOCK);
        copy(FabricBlockTagGenerator.RAW_LEAD_BLOCK, RAW_LEAD_BLOCK);
        copy(FabricBlockTagGenerator.RAW_NICKEL_BLOCK, RAW_NICKEL_BLOCK);
        copy(FabricBlockTagGenerator.RAW_TIN_BLOCK, RAW_TIN_BLOCK);
        copy(FabricBlockTagGenerator.RAW_OSMIUM_BLOCK, RAW_OSMIUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_URANIUM_BLOCK, RAW_URANIUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_ZINC_BLOCK, RAW_ZINC_BLOCK);

        tag(INGOTS).add(
                BNOItems.ALUMINUM_INGOT,
                BNOItems.SILVER_INGOT,
                BNOItems.LEAD_INGOT,
                BNOItems.NICKEL_INGOT,
                BNOItems.TIN_INGOT,
                BNOItems.OSMIUM_INGOT,
                BNOItems.URANIUM_INGOT,
                BNOItems.ZINC_INGOT
        );

        tag(INGOT_ALUMINUM).add(BNOItems.ALUMINUM_INGOT);
        tag(INGOT_ALUMINIUM).add(BNOItems.ALUMINUM_INGOT);
        tag(INGOT_SILVER).add(BNOItems.SILVER_INGOT);
        tag(INGOT_LEAD).add(BNOItems.LEAD_INGOT);
        tag(INGOT_NICKEL).add(BNOItems.NICKEL_INGOT);
        tag(INGOT_TIN).add(BNOItems.TIN_INGOT);
        tag(INGOT_OSMIUM).add(BNOItems.OSMIUM_INGOT);
        tag(INGOT_URANIUM).add(BNOItems.URANIUM_INGOT);
        tag(INGOT_ZINC).add(BNOItems.ZINC_INGOT);

        tag(NUGGETS).add(
                BNOItems.ALUMINUM_NUGGET,
                BNOItems.SILVER_NUGGET,
                BNOItems.LEAD_NUGGET,
                BNOItems.NICKEL_NUGGET,
                BNOItems.TIN_NUGGET,
                BNOItems.OSMIUM_NUGGET,
                BNOItems.ZINC_NUGGET
        );

        tag(NUGGET_ALUMINUM).add(BNOItems.ALUMINUM_NUGGET);
        tag(NUGGET_ALUMINIUM).add(BNOItems.ALUMINUM_NUGGET);
        tag(NUGGET_SILVER).add(BNOItems.SILVER_NUGGET);
        tag(NUGGET_LEAD).add(BNOItems.LEAD_NUGGET);
        tag(NUGGET_NICKEL).add(BNOItems.NICKEL_NUGGET);
        tag(NUGGET_COPPER).add(BNOItems.COPPER_NUGGET);
        tag(NUGGET_TIN).add(BNOItems.TIN_NUGGET);
        tag(NUGGET_OSMIUM).add(BNOItems.OSMIUM_NUGGET);
        tag(NUGGET_ZINC).add(BNOItems.ZINC_NUGGET);

        tag(RAW_MATERIALS).add(
                BNOItems.RAW_ALUMINUM,
                BNOItems.RAW_SILVER,
                BNOItems.RAW_LEAD,
                BNOItems.RAW_NICKEL,
                BNOItems.RAW_TIN,
                BNOItems.RAW_OSMIUM,
                BNOItems.RAW_URANIUM,
                BNOItems.RAW_ZINC
        );

        tag(RAW_ALUMINUM).add(BNOItems.RAW_ALUMINUM);
        tag(RAW_ALUMINIUM).add(BNOItems.RAW_ALUMINUM);
        tag(RAW_SILVER).add(BNOItems.RAW_SILVER);
        tag(RAW_LEAD).add(BNOItems.RAW_LEAD);
        tag(RAW_NICKEL).add(BNOItems.RAW_NICKEL);
        tag(RAW_TIN).add(BNOItems.RAW_TIN);
        tag(RAW_OSMIUM).add(BNOItems.RAW_OSMIUM);
        tag(RAW_URANIUM).add(BNOItems.RAW_URANIUM);
        tag(RAW_ZINC).add(BNOItems.RAW_ZINC);
    }
}
