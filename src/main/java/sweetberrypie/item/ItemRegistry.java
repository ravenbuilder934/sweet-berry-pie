package sweetberrypie.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import sweetberrypie.SweetBerryPie;

public class ItemRegistry
{
    public static Item sweetberrypie;
    public static Item sweetberryjam;
    public static Item cookedsweetberries;

    public static void registerAll(RegistryEvent.Register<Item> event)
    {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
            return;
        sweetberrypie = register("sweetberrypie", new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodBuilderRegistry.SWEETBERRYPIE)));
        sweetberryjam = register("sweetberryjam", new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodBuilderRegistry.SWEETBERRYJAM)));
        cookedsweetberries = register("cookedsweetberries", new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodBuilderRegistry.COOKEDSWEETBERRIES)));
    }

    private static <T extends Item> T register(String name, T item)
    {
        ResourceLocation id = SweetBerryPie.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
