package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static net.minecraftforge.common.Tags.Blocks.*;


public class ForgeBlockTagGenerator extends BlockTagsProvider
{

    public static final TagKey<Block> ORES_ALUMINUM = tagForge("ores/aluminum");
    public static final TagKey<Block> ORES_ALUMINIUM = tagForge("ores/aluminium");
    public static final TagKey<Block> ORES_SILVER = tagForge("ores/silver");
    public static final TagKey<Block> ORES_LEAD = tagForge("ores/lead");
    public static final TagKey<Block> ORES_NICKEL = tagForge("ores/nickel");
    public static final TagKey<Block> ORES_COPPER = tagForge("ores/copper");
    public static final TagKey<Block> ORES_TIN = tagForge("ores/tin");
    public static final TagKey<Block> ORES_OSMIUM = tagForge("ores/osmium");
    public static final TagKey<Block> ORES_URANIUM = tagForge("ores/uranium");
    public static final TagKey<Block> ORES_ZINC = tagForge("ores/zinc");

    public static final TagKey<Block> ALUMINUM_BLOCK = tagForge("storage_blocks/aluminum");
    public static final TagKey<Block> ALUMINIUM_BLOCK = tagForge("storage_blocks/aluminium");
    public static final TagKey<Block> SILVER_BLOCK = tagForge("storage_blocks/silver");
    public static final TagKey<Block> LEAD_BLOCK = tagForge("storage_blocks/lead");
    public static final TagKey<Block> NICKEL_BLOCK = tagForge("storage_blocks/nickel");
    public static final TagKey<Block> TIN_BLOCK = tagForge("storage_blocks/tin");
    public static final TagKey<Block> OSMIUM_BLOCK = tagForge("storage_blocks/osmium");
    public static final TagKey<Block> URANIUM_BLOCK = tagForge("storage_blocks/uranium");
    public static final TagKey<Block> ZINC_BLOCK = tagForge("storage_blocks/zinc");

    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = tagForge("storage_blocks/raw_aluminum");
    public static final TagKey<Block> RAW_ALUMINIUM_BLOCK = tagForge("storage_blocks/raw_aluminium");
    public static final TagKey<Block> RAW_SILVER_BLOCK = tagForge("storage_blocks/raw_silver");
    public static final TagKey<Block> RAW_LEAD_BLOCK = tagForge("storage_blocks/raw_lead");
    public static final TagKey<Block> RAW_NICKEL_BLOCK = tagForge("storage_blocks/raw_nickel");
    public static final TagKey<Block> RAW_TIN_BLOCK = tagForge("storage_blocks/raw_tin");
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = tagForge("storage_blocks/raw_osmium");
    public static final TagKey<Block> RAW_URANIUM_BLOCK = tagForge("storage_blocks/raw_uranium");
    public static final TagKey<Block> RAW_ZINC_BLOCK = tagForge("storage_blocks/raw_zinc");

    public ForgeBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        // ***************************************************************************** //
        //  Forge Tags (Only Account for Forge Tags Here)
        // ***************************************************************************** //
        tag(ORES).add(
                BNOBlocks.NETHER_EMERALD_ORE,
                BNOBlocks.NETHER_DIAMOND_ORE,
                BNOBlocks.NETHER_REDSTONE_ORE,
                BNOBlocks.NETHER_LAPIS_ORE,
                BNOBlocks.NETHER_COAL_ORE,
                BNOBlocks.NETHER_SILVER_ORE,
                BNOBlocks.NETHER_IRON_ORE,
                BNOBlocks.NETHER_LEAD_ORE,
                BNOBlocks.NETHER_NICKEL_ORE,
                BNOBlocks.NETHER_COPPER_ORE,
                BNOBlocks.NETHER_ALUMINUM_ORE,
                BNOBlocks.NETHER_TIN_ORE,
                BNOBlocks.NETHER_OSMIUM_ORE,
                BNOBlocks.NETHER_URANIUM_ORE,
                BNOBlocks.NETHER_ZINC_ORE
        );

        tag(STORAGE_BLOCKS).add(
                BNOBlocks.RAW_SILVER_BLOCK,
                BNOBlocks.SILVER_BLOCK,
                BNOBlocks.RAW_LEAD_BLOCK,
                BNOBlocks.LEAD_BLOCK,
                BNOBlocks.RAW_NICKEL_BLOCK,
                BNOBlocks.NICKEL_BLOCK,
                BNOBlocks.RAW_URANIUM_BLOCK,
                BNOBlocks.URANIUM_BLOCK,
                BNOBlocks.RAW_ZINC_BLOCK,
                BNOBlocks.ZINC_BLOCK,
                BNOBlocks.RAW_ALUMINUM_BLOCK,
                BNOBlocks.ALUMINUM_BLOCK,
                BNOBlocks.RAW_TIN_BLOCK,
                BNOBlocks.TIN_BLOCK,
                BNOBlocks.RAW_OSMIUM_BLOCK,
                BNOBlocks.OSMIUM_BLOCK
        );

        tag(ORES_COAL).add(BNOBlocks.NETHER_COAL_ORE, BNOBlocks.BASALT_COAL_ORE, BNOBlocks.SOUL_COAL_ORE);
        tag(ORES_DIAMOND).add(BNOBlocks.NETHER_DIAMOND_ORE, BNOBlocks.BASALT_DIAMOND_ORE, BNOBlocks.SOUL_DIAMOND_ORE);
        tag(ORES_EMERALD).add(BNOBlocks.NETHER_EMERALD_ORE, BNOBlocks.BASALT_EMERALD_ORE, BNOBlocks.SOUL_EMERALD_ORE);
        tag(ORES_IRON).add(BNOBlocks.NETHER_IRON_ORE, BNOBlocks.BASALT_IRON_ORE, BNOBlocks.SOUL_IRON_ORE);
        tag(ORES_LAPIS).add(BNOBlocks.NETHER_LAPIS_ORE, BNOBlocks.BASALT_LAPIS_ORE, BNOBlocks.SOUL_LAPIS_ORE);
        tag(ORES_REDSTONE).add(BNOBlocks.NETHER_REDSTONE_ORE, BNOBlocks.BASALT_REDSTONE_ORE, BNOBlocks.SOUL_REDSTONE_ORE);

        tag(ORES_ALUMINUM).add(BNOBlocks.NETHER_ALUMINUM_ORE, BNOBlocks.BASALT_ALUMINUM_ORE, BNOBlocks.SOUL_ALUMINUM_ORE);
        tag(ORES_ALUMINIUM).add(BNOBlocks.NETHER_ALUMINUM_ORE, BNOBlocks.BASALT_ALUMINUM_ORE, BNOBlocks.SOUL_ALUMINUM_ORE);
        tag(ORES_SILVER).add(BNOBlocks.NETHER_SILVER_ORE, BNOBlocks.BASALT_SILVER_ORE, BNOBlocks.SOUL_SILVER_ORE);
        tag(ORES_LEAD).add(BNOBlocks.NETHER_LEAD_ORE, BNOBlocks.BASALT_LEAD_ORE, BNOBlocks.SOUL_LEAD_ORE);
        tag(ORES_NICKEL).add(BNOBlocks.NETHER_NICKEL_ORE, BNOBlocks.BASALT_NICKEL_ORE, BNOBlocks.SOUL_NICKEL_ORE);
        tag(ORES_COPPER).add(BNOBlocks.NETHER_COPPER_ORE, BNOBlocks.BASALT_COPPER_ORE, BNOBlocks.SOUL_COPPER_ORE);
        tag(ORES_TIN).add(BNOBlocks.NETHER_TIN_ORE, BNOBlocks.BASALT_TIN_ORE, BNOBlocks.SOUL_TIN_ORE);
        tag(ORES_OSMIUM).add(BNOBlocks.NETHER_OSMIUM_ORE, BNOBlocks.BASALT_OSMIUM_ORE, BNOBlocks.SOUL_OSMIUM_ORE);
        tag(ORES_URANIUM).add(BNOBlocks.NETHER_URANIUM_ORE, BNOBlocks.BASALT_URANIUM_ORE, BNOBlocks.SOUL_URANIUM_ORE);
        tag(ORES_ZINC).add(BNOBlocks.NETHER_ZINC_ORE, BNOBlocks.BASALT_ZINC_ORE, BNOBlocks.SOUL_ZINC_ORE);

        tag(ALUMINUM_BLOCK).add(BNOBlocks.ALUMINUM_BLOCK);
        tag(ALUMINIUM_BLOCK).add(BNOBlocks.ALUMINUM_BLOCK);
        tag(SILVER_BLOCK).add(BNOBlocks.SILVER_BLOCK);
        tag(LEAD_BLOCK).add(BNOBlocks.LEAD_BLOCK);
        tag(NICKEL_BLOCK).add(BNOBlocks.NICKEL_BLOCK);
        tag(TIN_BLOCK).add(BNOBlocks.TIN_BLOCK);
        tag(OSMIUM_BLOCK).add(BNOBlocks.OSMIUM_BLOCK);
        tag(URANIUM_BLOCK).add(BNOBlocks.URANIUM_BLOCK);
        tag(ZINC_BLOCK).add(BNOBlocks.ZINC_BLOCK);

        tag(RAW_ALUMINUM_BLOCK).add(BNOBlocks.RAW_ALUMINUM_BLOCK);
        tag(RAW_ALUMINIUM_BLOCK).add(BNOBlocks.RAW_ALUMINUM_BLOCK);
        tag(RAW_SILVER_BLOCK).add(BNOBlocks.RAW_SILVER_BLOCK);
        tag(RAW_LEAD_BLOCK).add(BNOBlocks.RAW_LEAD_BLOCK);
        tag(RAW_NICKEL_BLOCK).add(BNOBlocks.RAW_NICKEL_BLOCK);
        tag(RAW_TIN_BLOCK).add(BNOBlocks.RAW_TIN_BLOCK);
        tag(RAW_OSMIUM_BLOCK).add(BNOBlocks.RAW_OSMIUM_BLOCK);
        tag(RAW_URANIUM_BLOCK).add(BNOBlocks.RAW_URANIUM_BLOCK);
        tag(RAW_ZINC_BLOCK).add(BNOBlocks.RAW_ZINC_BLOCK);

        tag(ORES_IN_GROUND_NETHERRACK).add(
                BNOBlocks.NETHER_EMERALD_ORE,
                BNOBlocks.NETHER_DIAMOND_ORE,
                BNOBlocks.NETHER_REDSTONE_ORE,
                BNOBlocks.NETHER_LAPIS_ORE,
                BNOBlocks.NETHER_COAL_ORE,
                BNOBlocks.NETHER_SILVER_ORE,
                BNOBlocks.NETHER_IRON_ORE,
                BNOBlocks.NETHER_LEAD_ORE,
                BNOBlocks.NETHER_NICKEL_ORE,
                BNOBlocks.NETHER_COPPER_ORE,
                BNOBlocks.NETHER_ALUMINUM_ORE,
                BNOBlocks.NETHER_TIN_ORE,
                BNOBlocks.NETHER_OSMIUM_ORE,
                BNOBlocks.NETHER_URANIUM_ORE,
                BNOBlocks.NETHER_ZINC_ORE,

                BNOBlocks.BASALT_EMERALD_ORE,
                BNOBlocks.BASALT_DIAMOND_ORE,
                BNOBlocks.BASALT_REDSTONE_ORE,
                BNOBlocks.BASALT_LAPIS_ORE,
                BNOBlocks.BASALT_COAL_ORE,
                BNOBlocks.BASALT_SILVER_ORE,
                BNOBlocks.BASALT_IRON_ORE,
                BNOBlocks.BASALT_LEAD_ORE,
                BNOBlocks.BASALT_NICKEL_ORE,
                BNOBlocks.BASALT_COPPER_ORE,
                BNOBlocks.BASALT_ALUMINUM_ORE,
                BNOBlocks.BASALT_TIN_ORE,
                BNOBlocks.BASALT_OSMIUM_ORE,
                BNOBlocks.BASALT_URANIUM_ORE,
                BNOBlocks.BASALT_ZINC_ORE,

                BNOBlocks.SOUL_EMERALD_ORE,
                BNOBlocks.SOUL_DIAMOND_ORE,
                BNOBlocks.SOUL_REDSTONE_ORE,
                BNOBlocks.SOUL_LAPIS_ORE,
                BNOBlocks.SOUL_COAL_ORE,
                BNOBlocks.SOUL_SILVER_ORE,
                BNOBlocks.SOUL_IRON_ORE,
                BNOBlocks.SOUL_LEAD_ORE,
                BNOBlocks.SOUL_NICKEL_ORE,
                BNOBlocks.SOUL_COPPER_ORE,
                BNOBlocks.SOUL_ALUMINUM_ORE,
                BNOBlocks.SOUL_TIN_ORE,
                BNOBlocks.SOUL_OSMIUM_ORE,
                BNOBlocks.SOUL_URANIUM_ORE,
                BNOBlocks.SOUL_ZINC_ORE
        );

    }

    private static TagKey<Block> tagForge(String name)
    {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("forge", name));
    }


}
