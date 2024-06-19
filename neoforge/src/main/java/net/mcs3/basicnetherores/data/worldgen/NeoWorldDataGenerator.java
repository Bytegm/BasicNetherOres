package net.mcs3.basicnetherores.data.worldgen;

import net.mcs3.basicnetherores.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class NeoWorldDataGenerator extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, NeoBiomeModifierGenerator::bootstrap);

    public NeoWorldDataGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
