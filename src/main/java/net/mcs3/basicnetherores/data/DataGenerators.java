package net.mcs3.basicnetherores.data;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.mcs3.basicnetherores.data.loottables.BlockLootTableGenerator;
import net.mcs3.basicnetherores.data.models.BlockStateGenerator;
import net.mcs3.basicnetherores.data.models.ItemModelGenerator;
import net.mcs3.basicnetherores.data.recipes.CraftingRecipes;
import net.mcs3.basicnetherores.data.tags.BlockTagGenerator;
import net.mcs3.basicnetherores.data.tags.ItemTagGenerator;
import net.mcs3.basicnetherores.data.worldgen.WorldDataGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BasicNetherOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator generator = evt.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = evt.getLookupProvider();
        if (evt.includeServer()) {
            BlockTagsProvider blocktags = new BlockTagGenerator(packOutput, lookupProvider, evt.getExistingFileHelper());
            generator.addProvider(true, blocktags);

            generator.addProvider(true, BlockLootTableGenerator.create(packOutput, lookupProvider));

            generator.addProvider(true, new CraftingRecipes(packOutput, lookupProvider));
            generator.addProvider(true, new ItemTagGenerator(packOutput, lookupProvider, blocktags.contentsGetter(), evt.getExistingFileHelper()));

            generator.addProvider(true, new WorldDataGenerator(packOutput, lookupProvider));
        }

        if(evt.includeClient()) {
            evt.getGenerator().addProvider(true, new BlockStateGenerator(evt.getGenerator().getPackOutput(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(true, new ItemModelGenerator(evt.getGenerator().getPackOutput(), evt.getExistingFileHelper()));
        }
    }
}
