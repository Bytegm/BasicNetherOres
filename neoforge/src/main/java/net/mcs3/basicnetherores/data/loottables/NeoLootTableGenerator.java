package net.mcs3.basicnetherores.data.loottables;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class NeoLootTableGenerator extends LootTableProvider {

    public NeoLootTableGenerator(PackOutput pOutput) {
        super(pOutput, Set.of(), List.of(new SubProviderEntry(NeoBlockLootTableGenerator::new, LootContextParamSets.BLOCK)));
    }}
