package net.mcs3.basicnetherores.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static net.mcs3.basicnetherores.init.BNOPlacedFeatures.*;

public class NeoBiomeModifierGenerator {

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomeGetter = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderSet<Biome> netherBiomes = biomeGetter.getOrThrow(BiomeTags.IS_NETHER);

        registerOreModifier(context, placedFeatures, ORE_EMERALD_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_DIAMOND_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_REDSTONE_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_LAPIS_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_COAL_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_SILVER_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_IRON_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_LEAD_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_NICKEL_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_COPPER_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_ALUMINUM_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_TIN_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_OSMIUM_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_URANIUM_PLACED_FEATURE, netherBiomes);
        registerOreModifier(context, placedFeatures, ORE_ZINC_PLACED_FEATURE, netherBiomes);
    }

    private static void registerOreModifier(BootstapContext<BiomeModifier> context, HolderGetter<PlacedFeature> placedFeatures, ResourceKey<PlacedFeature> key, HolderSet<Biome> biomes) {
        BiomeModifiers.AddFeaturesBiomeModifier modifier = new BiomeModifiers.AddFeaturesBiomeModifier(biomes, HolderSet.direct(placedFeatures.getOrThrow(key)), GenerationStep.Decoration.UNDERGROUND_ORES);
        context.register(ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(key.location().toString())), modifier);
    }

}
