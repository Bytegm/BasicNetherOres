package net.mcs3.basicnetherores.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.data.loottables.LootTableGenerator;
import net.mcs3.basicnetherores.data.models.BlockStateGenerator;
import net.mcs3.basicnetherores.data.recipes.CraftingRecipeBuilder;
import net.mcs3.basicnetherores.data.tags.FabricBlockTagGenerator;
import net.mcs3.basicnetherores.data.tags.FabricItemTagGenerator;
import net.mcs3.basicnetherores.data.worldgen.FabricWorldDataGenerator;
import net.mcs3.basicnetherores.init.BNOConfiguredFeatures;
import net.mcs3.basicnetherores.init.BNOPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;


public class FabricDataGenerators implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {

        if (System.getProperty("bno.common_datagen") != null) {
            configureCommonDatagen(generator.createPack());
        } else {
            configureFabricDatagen(generator.createPack());
        }
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, BNOConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, BNOPlacedFeatures::bootstrap);

        DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
    }

    private static void configureFabricDatagen(FabricDataGenerator.Pack pack) {
        Constants.LOG.info("Fabric Data Gen");
    }

    private static void configureCommonDatagen(FabricDataGenerator.Pack pack) {

        Constants.LOG.info("Common Data Gen");
        FabricBlockTagGenerator blockTagProvider = pack.addProvider(FabricBlockTagGenerator::new);
        pack.addProvider((output, registriesFuture) -> new FabricItemTagGenerator(output, registriesFuture, blockTagProvider.contentsGetter()));

        pack.addProvider(BlockStateGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(CraftingRecipeBuilder::new);

        pack.addProvider(FabricWorldDataGenerator::new);
    }


}
