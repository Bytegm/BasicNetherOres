package net.mcs3.basicnetherores.data;

import net.mcs3.basicnetherores.data.worldgen.NeoWorldDataGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator gen = evt.getGenerator();
        PackOutput output = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = evt.getLookupProvider();

        gen.addProvider(true, new NeoWorldDataGenerator(output, provider));
    }
}
