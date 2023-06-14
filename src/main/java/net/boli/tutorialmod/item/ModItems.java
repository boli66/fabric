package net.boli.tutorialmod.item;

import net.boli.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;


public class ModItems {



    /*private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM,
                new Identifier(TutorialMod.MOD_ID, name),
                item);
    }*/
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for "+TutorialMod.MOD_ID);
    }
}
