package net.mcs3.basicnetherores.data;

import net.mcs3.basicnetherores.data.loottables.NeoBlockLootTableGenerator;
import net.mcs3.basicnetherores.data.loottables.NeoLootTableGenerator;
import net.mcs3.basicnetherores.data.model.NeoBlockStateGenerator;
import net.mcs3.basicnetherores.data.model.NeoItemModelGenerator;
import net.mcs3.basicnetherores.worldgen.NeoWorldDataGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;


import java.util.Collections;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator gen = evt.getGenerator();
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper helper = evt.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = evt.getLookupProvider();
//
//        gen.addProvider(event.includeServer(), new ModelProv(output, helper));
//        gen.addProvider(event.includeServer(), new DataPackProv(output, provider));
//        gen.addProvider(evt.includeServer(), output -> new NeoLootTableGenerator(output, Collections.emptySet(), ));

//        BlockTagProv blockTags = gen.addProvider(event.includeServer(), new BlockTagProv(output, provider, helper));
//        gen.addProvider(event.includeServer(), new ItemTagProv(output, provider, blockTags.contentsGetter(), helper));

        gen.addProvider(true, new NeoWorldDataGenerator(output, provider));

        if(evt.includeClient()) {
            evt.getGenerator().addProvider(true, new NeoBlockStateGenerator(evt.getGenerator().getPackOutput(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(true, new NeoItemModelGenerator(evt.getGenerator().getPackOutput(), evt.getExistingFileHelper()));
        }

    }
}
