package net.mcs3.basicnetherores.data.loottables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(dataOutput, provider);
    }

    @Override
    public void generate() {

        Stream.of(
                BNOBlocks.ALUMINUM_BLOCK,
                BNOBlocks.LEAD_BLOCK,
                BNOBlocks.NICKEL_BLOCK,
                BNOBlocks.OSMIUM_BLOCK,
                BNOBlocks.SILVER_BLOCK,
                BNOBlocks.TIN_BLOCK,
                BNOBlocks.URANIUM_BLOCK,
                BNOBlocks.ZINC_BLOCK,

                BNOBlocks.RAW_ALUMINUM_BLOCK,
                BNOBlocks.RAW_LEAD_BLOCK,
                BNOBlocks.RAW_NICKEL_BLOCK,
                BNOBlocks.RAW_OSMIUM_BLOCK,
                BNOBlocks.RAW_SILVER_BLOCK,
                BNOBlocks.RAW_TIN_BLOCK,
                BNOBlocks.RAW_URANIUM_BLOCK,
                BNOBlocks.RAW_ZINC_BLOCK

        ).forEach(this::dropSelf);

        add(BNOBlocks.NETHER_EMERALD_ORE, (block -> createOreDrop(block, Items.EMERALD)));
        add(BNOBlocks.NETHER_DIAMOND_ORE, (block -> createOreDrop(block, Items.DIAMOND)));
        add(BNOBlocks.NETHER_REDSTONE_ORE, (this::createRedstoneOreDrops));
        add(BNOBlocks.NETHER_LAPIS_ORE, (this::createLapisOreDrops));
        add(BNOBlocks.NETHER_COAL_ORE, (block -> createOreDrop(block, Items.COAL)));
        add(BNOBlocks.NETHER_SILVER_ORE, (block -> createOreDrop(block, BNOItems.RAW_SILVER)));
        add(BNOBlocks.NETHER_IRON_ORE, (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BNOBlocks.NETHER_LEAD_ORE, (block -> createOreDrop(block, BNOItems.RAW_LEAD)));
        add(BNOBlocks.NETHER_NICKEL_ORE, (block -> createOreDrop(block, BNOItems.RAW_NICKEL)));
        add(BNOBlocks.NETHER_COPPER_ORE, (this::createCopperOreDrops));
        add(BNOBlocks.NETHER_ALUMINUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_ALUMINUM)));
        add(BNOBlocks.NETHER_TIN_ORE, (block -> createOreDrop(block, BNOItems.RAW_TIN)));
        add(BNOBlocks.NETHER_OSMIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_OSMIUM)));
        add(BNOBlocks.NETHER_URANIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_URANIUM)));
        add(BNOBlocks.NETHER_ZINC_ORE, (block -> createOreDrop(block, BNOItems.RAW_ZINC)));

        add(BNOBlocks.BASALT_EMERALD_ORE, (block -> createOreDrop(block, Items.EMERALD)));
        add(BNOBlocks.BASALT_DIAMOND_ORE, (block -> createOreDrop(block, Items.DIAMOND)));
        add(BNOBlocks.BASALT_REDSTONE_ORE, (this::createRedstoneOreDrops));
        add(BNOBlocks.BASALT_LAPIS_ORE, (this::createLapisOreDrops));
        add(BNOBlocks.BASALT_COAL_ORE, (block -> createOreDrop(block, Items.COAL)));
        add(BNOBlocks.BASALT_SILVER_ORE, (block -> createOreDrop(block, BNOItems.RAW_SILVER)));
        add(BNOBlocks.BASALT_IRON_ORE, (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BNOBlocks.BASALT_LEAD_ORE, (block -> createOreDrop(block, BNOItems.RAW_LEAD)));
        add(BNOBlocks.BASALT_NICKEL_ORE, (block -> createOreDrop(block, BNOItems.RAW_NICKEL)));
        add(BNOBlocks.BASALT_COPPER_ORE, (this::createCopperOreDrops));
        add(BNOBlocks.BASALT_ALUMINUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_ALUMINUM)));
        add(BNOBlocks.BASALT_TIN_ORE, (block -> createOreDrop(block, BNOItems.RAW_TIN)));
        add(BNOBlocks.BASALT_OSMIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_OSMIUM)));
        add(BNOBlocks.BASALT_URANIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_URANIUM)));
        add(BNOBlocks.BASALT_ZINC_ORE, (block -> createOreDrop(block, BNOItems.RAW_ZINC)));

        add(BNOBlocks.SOUL_EMERALD_ORE, (block -> createOreDrop(block, Items.EMERALD)));
        add(BNOBlocks.SOUL_DIAMOND_ORE, (block -> createOreDrop(block, Items.DIAMOND)));
        add(BNOBlocks.SOUL_REDSTONE_ORE, (this::createRedstoneOreDrops));
        add(BNOBlocks.SOUL_LAPIS_ORE, (this::createLapisOreDrops));
        add(BNOBlocks.SOUL_COAL_ORE, (block -> createOreDrop(block, Items.COAL)));
        add(BNOBlocks.SOUL_SILVER_ORE, (block -> createOreDrop(block, BNOItems.RAW_SILVER)));
        add(BNOBlocks.SOUL_IRON_ORE, (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BNOBlocks.SOUL_LEAD_ORE, (block -> createOreDrop(block, BNOItems.RAW_LEAD)));
        add(BNOBlocks.SOUL_NICKEL_ORE, (block -> createOreDrop(block, BNOItems.RAW_NICKEL)));
        add(BNOBlocks.SOUL_COPPER_ORE, (this::createCopperOreDrops));
        add(BNOBlocks.SOUL_ALUMINUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_ALUMINUM)));
        add(BNOBlocks.SOUL_TIN_ORE, (block -> createOreDrop(block, BNOItems.RAW_TIN)));
        add(BNOBlocks.SOUL_OSMIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_OSMIUM)));
        add(BNOBlocks.SOUL_URANIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_URANIUM)));
        add(BNOBlocks.SOUL_ZINC_ORE, (block -> createOreDrop(block, BNOItems.RAW_ZINC)));
    }
}
