package sweetberrypie.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import sweetberrypie.SweetBerryPie;

public class SweetBerryPieItem {

    public static Item sweetberrypie;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
            return;
        sweetberrypie = register(new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodBuilderRegistry.SWEETBERRYPIE)));
    }

    private static <T extends Item> T register(T item) {
        ResourceLocation id = SweetBerryPie.getId("sweetberrypie");
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }




}
