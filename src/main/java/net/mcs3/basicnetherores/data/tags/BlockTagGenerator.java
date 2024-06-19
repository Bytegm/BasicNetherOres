package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.BasicNetherOres;
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


public class BlockTagGenerator extends BlockTagsProvider
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

    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BasicNetherOres.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // ***************************************************************************** //
        //  Vanilla Tags (Only Account for Vanilla Tags Here)
        // ***************************************************************************** //

        tag(BlockTags.EMERALD_ORES).add(BNOBlocks.NETHER_EMERALD_ORE.get());
        tag(BlockTags.DIAMOND_ORES).add(BNOBlocks.NETHER_DIAMOND_ORE.get());
        tag(BlockTags.REDSTONE_ORES).add(BNOBlocks.NETHER_REDSTONE_ORE.get());
        tag(BlockTags.LAPIS_ORES).add(BNOBlocks.NETHER_LAPIS_ORE.get());
        tag(BlockTags.COAL_ORES).add(BNOBlocks.NETHER_COAL_ORE.get());
        tag(BlockTags.IRON_ORES).add(BNOBlocks.NETHER_IRON_ORE.get());
        tag(BlockTags.COPPER_ORES).add(BNOBlocks.NETHER_COPPER_ORE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BNOBlocks.NETHER_DIAMOND_ORE.get(),
                BNOBlocks.NETHER_EMERALD_ORE.get(),
                BNOBlocks.NETHER_REDSTONE_ORE.get(),
                BNOBlocks.NETHER_COAL_ORE.get(),
                BNOBlocks.NETHER_IRON_ORE.get(),
                BNOBlocks.NETHER_LAPIS_ORE.get(),
                BNOBlocks.NETHER_COPPER_ORE.get(),
                BNOBlocks.NETHER_SILVER_ORE.get(),
                BNOBlocks.RAW_SILVER_BLOCK.get(),
                BNOBlocks.SILVER_BLOCK.get(),
                BNOBlocks.NETHER_LEAD_ORE.get(),
                BNOBlocks.RAW_LEAD_BLOCK.get(),
                BNOBlocks.LEAD_BLOCK.get(),
                BNOBlocks.LEAD_BLOCK.get(),
                BNOBlocks.NETHER_NICKEL_ORE.get(),
                BNOBlocks.RAW_NICKEL_BLOCK.get(),
                BNOBlocks.NICKEL_BLOCK.get(),
                BNOBlocks.NETHER_URANIUM_ORE.get(),
                BNOBlocks.RAW_URANIUM_BLOCK.get(),
                BNOBlocks.URANIUM_BLOCK.get(),
                BNOBlocks.NETHER_ZINC_ORE.get(),
                BNOBlocks.RAW_ZINC_BLOCK.get(),
                BNOBlocks.ZINC_BLOCK.get(),
                BNOBlocks.NETHER_ALUMINUM_ORE.get(),
                BNOBlocks.RAW_ALUMINUM_BLOCK.get(),
                BNOBlocks.ALUMINUM_BLOCK.get(),
                BNOBlocks.NETHER_TIN_ORE.get(),
                BNOBlocks.RAW_TIN_BLOCK.get(),
                BNOBlocks.TIN_BLOCK.get(),
                BNOBlocks.NETHER_OSMIUM_ORE.get(),
                BNOBlocks.RAW_OSMIUM_BLOCK.get(),
                BNOBlocks.OSMIUM_BLOCK.get()
        );

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BNOBlocks.NETHER_DIAMOND_ORE.get(),
                BNOBlocks.NETHER_EMERALD_ORE.get(),
                BNOBlocks.NETHER_REDSTONE_ORE.get(),
                BNOBlocks.NETHER_SILVER_ORE.get(),
                BNOBlocks.RAW_SILVER_BLOCK.get(),
                BNOBlocks.SILVER_BLOCK.get(),
                BNOBlocks.NETHER_LEAD_ORE.get(),
                BNOBlocks.RAW_LEAD_BLOCK.get(),
                BNOBlocks.LEAD_BLOCK.get(),
                BNOBlocks.NETHER_NICKEL_ORE.get(),
                BNOBlocks.RAW_NICKEL_BLOCK.get(),
                BNOBlocks.NICKEL_BLOCK.get(),
                BNOBlocks.NETHER_URANIUM_ORE.get(),
                BNOBlocks.RAW_URANIUM_BLOCK.get(),
                BNOBlocks.URANIUM_BLOCK.get(),
                BNOBlocks.NETHER_ZINC_ORE.get(),
                BNOBlocks.RAW_ZINC_BLOCK.get(),
                BNOBlocks.ZINC_BLOCK.get()
        );

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                BNOBlocks.NETHER_IRON_ORE.get(),
                BNOBlocks.NETHER_LAPIS_ORE.get(),
                BNOBlocks.NETHER_COPPER_ORE.get(),
                BNOBlocks.NETHER_ALUMINUM_ORE.get(),
                BNOBlocks.RAW_ALUMINUM_BLOCK.get(),
                BNOBlocks.ALUMINUM_BLOCK.get(),
                BNOBlocks.NETHER_TIN_ORE.get(),
                BNOBlocks.RAW_TIN_BLOCK.get(),
                BNOBlocks.TIN_BLOCK.get(),
                BNOBlocks.NETHER_OSMIUM_ORE.get(),
                BNOBlocks.RAW_OSMIUM_BLOCK.get(),
                BNOBlocks.OSMIUM_BLOCK.get()
        );

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                BNOBlocks.NETHER_IRON_ORE.get(),
                BNOBlocks.NETHER_LAPIS_ORE.get(),
                BNOBlocks.NETHER_COPPER_ORE.get(),
                BNOBlocks.NETHER_ALUMINUM_ORE.get(),
                BNOBlocks.RAW_ALUMINUM_BLOCK.get(),
                BNOBlocks.ALUMINUM_BLOCK.get(),
                BNOBlocks.NETHER_TIN_ORE.get(),
                BNOBlocks.RAW_TIN_BLOCK.get(),
                BNOBlocks.TIN_BLOCK.get(),
                BNOBlocks.NETHER_OSMIUM_ORE.get(),
                BNOBlocks.RAW_OSMIUM_BLOCK.get(),
                BNOBlocks.OSMIUM_BLOCK.get()
        );

        // ***************************************************************************** //
        //  Forge Tags (Only Account for Forge Tags Here)
        // ***************************************************************************** //
        tag(ORES).add(
                BNOBlocks.NETHER_EMERALD_ORE.get(),
                BNOBlocks.NETHER_DIAMOND_ORE.get(),
                BNOBlocks.NETHER_REDSTONE_ORE.get(),
                BNOBlocks.NETHER_LAPIS_ORE.get(),
                BNOBlocks.NETHER_COAL_ORE.get(),
                BNOBlocks.NETHER_SILVER_ORE.get(),
                BNOBlocks.NETHER_IRON_ORE.get(),
                BNOBlocks.NETHER_LEAD_ORE.get(),
                BNOBlocks.NETHER_NICKEL_ORE.get(),
                BNOBlocks.NETHER_COPPER_ORE.get(),
                BNOBlocks.NETHER_ALUMINUM_ORE.get(),
                BNOBlocks.NETHER_TIN_ORE.get(),
                BNOBlocks.NETHER_OSMIUM_ORE.get(),
                BNOBlocks.NETHER_URANIUM_ORE.get(),
                BNOBlocks.NETHER_ZINC_ORE.get()
        );

        tag(STORAGE_BLOCKS).add(
                BNOBlocks.RAW_SILVER_BLOCK.get(),
                BNOBlocks.SILVER_BLOCK.get(),
                BNOBlocks.RAW_LEAD_BLOCK.get(),
                BNOBlocks.LEAD_BLOCK.get(),
                BNOBlocks.RAW_NICKEL_BLOCK.get(),
                BNOBlocks.NICKEL_BLOCK.get(),
                BNOBlocks.RAW_URANIUM_BLOCK.get(),
                BNOBlocks.URANIUM_BLOCK.get(),
                BNOBlocks.RAW_ZINC_BLOCK.get(),
                BNOBlocks.ZINC_BLOCK.get(),
                BNOBlocks.RAW_ALUMINUM_BLOCK.get(),
                BNOBlocks.ALUMINUM_BLOCK.get(),
                BNOBlocks.RAW_TIN_BLOCK.get(),
                BNOBlocks.TIN_BLOCK.get(),
                BNOBlocks.RAW_OSMIUM_BLOCK.get(),
                BNOBlocks.OSMIUM_BLOCK.get()
        );

        tag(ORES_COAL).add(BNOBlocks.NETHER_COAL_ORE.get());
        tag(ORES_DIAMOND).add(BNOBlocks.NETHER_DIAMOND_ORE.get());
        tag(ORES_EMERALD).add(BNOBlocks.NETHER_EMERALD_ORE.get());
        tag(ORES_IRON).add(BNOBlocks.NETHER_IRON_ORE.get());
        tag(ORES_LAPIS).add(BNOBlocks.NETHER_LAPIS_ORE.get());
        tag(ORES_REDSTONE).add(BNOBlocks.NETHER_REDSTONE_ORE.get());

        tag(ORES_ALUMINUM).add(BNOBlocks.NETHER_ALUMINUM_ORE.get());
        tag(ORES_ALUMINIUM).add(BNOBlocks.NETHER_ALUMINUM_ORE.get());
        tag(ORES_SILVER).add(BNOBlocks.NETHER_SILVER_ORE.get());
        tag(ORES_LEAD).add(BNOBlocks.NETHER_LEAD_ORE.get());
        tag(ORES_NICKEL).add(BNOBlocks.NETHER_NICKEL_ORE.get());
        tag(ORES_COPPER).add(BNOBlocks.NETHER_COPPER_ORE.get());
        tag(ORES_TIN).add(BNOBlocks.NETHER_TIN_ORE.get());
        tag(ORES_OSMIUM).add(BNOBlocks.NETHER_OSMIUM_ORE.get());
        tag(ORES_URANIUM).add(BNOBlocks.NETHER_URANIUM_ORE.get());
        tag(ORES_ZINC).add(BNOBlocks.NETHER_ZINC_ORE.get());

        tag(ALUMINUM_BLOCK).add(BNOBlocks.ALUMINUM_BLOCK.get());
        tag(ALUMINIUM_BLOCK).add(BNOBlocks.ALUMINUM_BLOCK.get());
        tag(SILVER_BLOCK).add(BNOBlocks.SILVER_BLOCK.get());
        tag(LEAD_BLOCK).add(BNOBlocks.LEAD_BLOCK.get());
        tag(NICKEL_BLOCK).add(BNOBlocks.NICKEL_BLOCK.get());
        tag(TIN_BLOCK).add(BNOBlocks.TIN_BLOCK.get());
        tag(OSMIUM_BLOCK).add(BNOBlocks.OSMIUM_BLOCK.get());
        tag(URANIUM_BLOCK).add(BNOBlocks.URANIUM_BLOCK.get());
        tag(ZINC_BLOCK).add(BNOBlocks.ZINC_BLOCK.get());

        tag(RAW_ALUMINUM_BLOCK).add(BNOBlocks.RAW_ALUMINUM_BLOCK.get());
        tag(RAW_ALUMINIUM_BLOCK).add(BNOBlocks.RAW_ALUMINUM_BLOCK.get());
        tag(RAW_SILVER_BLOCK).add(BNOBlocks.RAW_SILVER_BLOCK.get());
        tag(RAW_LEAD_BLOCK).add(BNOBlocks.RAW_LEAD_BLOCK.get());
        tag(RAW_NICKEL_BLOCK).add(BNOBlocks.RAW_NICKEL_BLOCK.get());
        tag(RAW_TIN_BLOCK).add(BNOBlocks.RAW_TIN_BLOCK.get());
        tag(RAW_OSMIUM_BLOCK).add(BNOBlocks.RAW_OSMIUM_BLOCK.get());
        tag(RAW_URANIUM_BLOCK).add(BNOBlocks.RAW_URANIUM_BLOCK.get());
        tag(RAW_ZINC_BLOCK).add(BNOBlocks.RAW_ZINC_BLOCK.get());

        tag(ORES_IN_GROUND_NETHERRACK).add(
                BNOBlocks.NETHER_EMERALD_ORE.get(),
                BNOBlocks.NETHER_DIAMOND_ORE.get(),
                BNOBlocks.NETHER_REDSTONE_ORE.get(),
                BNOBlocks.NETHER_LAPIS_ORE.get(),
                BNOBlocks.NETHER_COAL_ORE.get(),
                BNOBlocks.NETHER_SILVER_ORE.get(),
                BNOBlocks.NETHER_IRON_ORE.get(),
                BNOBlocks.NETHER_LEAD_ORE.get(),
                BNOBlocks.NETHER_NICKEL_ORE.get(),
                BNOBlocks.NETHER_COPPER_ORE.get(),
                BNOBlocks.NETHER_ALUMINUM_ORE.get(),
                BNOBlocks.NETHER_TIN_ORE.get(),
                BNOBlocks.NETHER_OSMIUM_ORE.get(),
                BNOBlocks.NETHER_URANIUM_ORE.get(),
                BNOBlocks.NETHER_ZINC_ORE.get()
        );

    }

    private static TagKey<Block> tagForge(String name)
    {
        return BlockTags.create(new ResourceLocation("forge", name));
    }


}
