package com.arovi.craftable_nugget_of_experience.items;

import com.arovi.craftable_nugget_of_experience.CraftableNuggetOfExperience;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CraftableNuggetOfExperience.MOD_ID);

    public static final Supplier<Item> INACTIVE_NUGGET =
            ITEMS.register("inactive_nugget_of_experience",
                    () -> new Item(new Item.Properties()));
}
