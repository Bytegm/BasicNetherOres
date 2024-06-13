package net.mcs3.basicnetherores.data.loottables;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ForgeLootTableGenerator extends LootTableProvider {

    public ForgeLootTableGenerator(PackOutput pOutput) {
        super(pOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(ForgeBlockLootTableGenerator::new, LootContextParamSets.BLOCK)));
    }}
