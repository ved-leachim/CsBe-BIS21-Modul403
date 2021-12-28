package ch.ivenguard.tutorialmod.core.init;

import ch.ivenguard.tutorialmod.Tutorialmod;
import ch.ivenguard.tutorialmod.core.itemgroup.TutorialModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);

    public  static final RegistryObject<Item>   TEST_ITEM = ITEMS.register("test_item",
            ()-> new Item(new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));
}
