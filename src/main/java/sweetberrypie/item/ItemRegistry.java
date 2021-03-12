package sweetberrypie.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sweetberrypie.SweetBerryPie;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetBerryPie.MOD_ID);

    public static final RegistryObject<Item> sweetberrypie = ITEMS.register("sweetberrypie", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodRegistry.SWEETBERRYPIE)));

    public static final RegistryObject<Item> cookedsweetberries = ITEMS.register("cookedsweetberries", () -> new Item((new Item.Properties()).group(ItemGroup.FOOD).food(FoodRegistry.COOKEDSWEETBERRIES)));

    public static final RegistryObject<SweetBerryJamItem> sweetberryjam = ITEMS.register("sweetberryjam", () -> new SweetBerryJamItem((new Item.Properties()).group(ItemGroup.FOOD).containerItem(Items.GLASS_BOTTLE).food(FoodRegistry.SWEETBERRYJAM)));
}
