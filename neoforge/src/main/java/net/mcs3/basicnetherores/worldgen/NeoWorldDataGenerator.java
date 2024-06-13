package net.mcs3.basicnetherores.worldgen;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOConfiguredFeatures;
import net.mcs3.basicnetherores.init.BNOPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class NeoWorldDataGenerator extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, BNOConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, BNOPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, NeoBiomeModifierGenerator::bootstrap);

    public NeoWorldDataGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
