package com.arovi.craftable_nugget_of_experience;

import com.arovi.craftable_nugget_of_experience.items.ModItems;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.ModLoadingContext;
import net.minecraft.world.item.CreativeModeTabs;

@Mod(CraftableNuggetOfExperience.MOD_ID)
public class CraftableNuggetOfExperience {

    public static final String MOD_ID = "craftable_nugget_of_experience";

    public CraftableNuggetOfExperience() {

        // REGISTRO CORRECTO DEL DEFERRED REGISTER
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        ModItems.ITEMS.register(modEventBus);
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class ModCreativeTabEvents {

        @SubscribeEvent
        public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {

            if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
                event.accept(ModItems.INACTIVE_NUGGET.get());
            }
        }
    }
}
