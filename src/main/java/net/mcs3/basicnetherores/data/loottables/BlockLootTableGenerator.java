package net.mcs3.basicnetherores.data.loottables;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class BlockLootTableGenerator extends BlockLootSubProvider {

    public static LootTableProvider create (PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(BlockLootTableGenerator::new, LootContextParamSets.BLOCK)), provider);
    }

    protected BlockLootTableGenerator() {super(Set.of(), FeatureFlags.REGISTRY.allFlags());}

    @Override
    protected void generate() {}

    @Override
    public void generate(HolderLookup.Provider provider, BiConsumer<ResourceKey<LootTable>, LootTable.Builder> builder) {

        Stream.of(
                BNOBlocks.ALUMINUM_BLOCK.get(),
                BNOBlocks.LEAD_BLOCK.get(),
                BNOBlocks.NICKEL_BLOCK.get(),
                BNOBlocks.OSMIUM_BLOCK.get(),
                BNOBlocks.SILVER_BLOCK.get(),
                BNOBlocks.TIN_BLOCK.get(),
                BNOBlocks.URANIUM_BLOCK.get(),
                BNOBlocks.ZINC_BLOCK.get(),

                BNOBlocks.RAW_ALUMINUM_BLOCK.get(),
                BNOBlocks.RAW_LEAD_BLOCK.get(),
                BNOBlocks.RAW_NICKEL_BLOCK.get(),
                BNOBlocks.RAW_OSMIUM_BLOCK.get(),
                BNOBlocks.RAW_SILVER_BLOCK.get(),
                BNOBlocks.RAW_TIN_BLOCK.get(),
                BNOBlocks.RAW_URANIUM_BLOCK.get(),
                BNOBlocks.RAW_ZINC_BLOCK.get()

        ).forEach(this::dropSelf);

        add(BNOBlocks.NETHER_EMERALD_ORE.get(), (block -> createOreDrop(block, Items.EMERALD)));
        add(BNOBlocks.NETHER_DIAMOND_ORE.get(), (block -> createOreDrop(block, Items.DIAMOND)));
        add(BNOBlocks.NETHER_REDSTONE_ORE.get(), (this::createRedstoneOreDrops));
        add(BNOBlocks.NETHER_LAPIS_ORE.get(), (this::createLapisOreDrops));
        add(BNOBlocks.NETHER_COAL_ORE.get(), (block -> createOreDrop(block, Items.COAL)));
        add(BNOBlocks.NETHER_SILVER_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_SILVER.get())));
        add(BNOBlocks.NETHER_IRON_ORE.get(), (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BNOBlocks.NETHER_LEAD_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_LEAD.get())));
        add(BNOBlocks.NETHER_NICKEL_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_NICKEL.get())));
        add(BNOBlocks.NETHER_COPPER_ORE.get(), (this::createCopperOreDrops));
        add(BNOBlocks.NETHER_ALUMINUM_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_ALUMINUM.get())));
        add(BNOBlocks.NETHER_TIN_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_TIN.get())));
        add(BNOBlocks.NETHER_OSMIUM_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_OSMIUM.get())));
        add(BNOBlocks.NETHER_URANIUM_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_URANIUM.get())));
        add(BNOBlocks.NETHER_ZINC_ORE.get(), (block -> createOreDrop(block, BNOItems.RAW_ZINC.get())));

        map.forEach(builder);
    }
}
