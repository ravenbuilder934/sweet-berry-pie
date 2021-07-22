package sweetberrypie.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sweetberrypie.SweetBerryPie;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetBerryPie.MOD_ID);

    public static final RegistryObject<Item> sweetberrypie = ITEMS.register("sweetberrypie", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(FoodRegistry.SWEETBERRYPIE)));

    public static final RegistryObject<Item> cookedsweetberries = ITEMS.register("cookedsweetberries", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(FoodRegistry.COOKEDSWEETBERRIES)));

    public static final RegistryObject<SweetBerryJamItem> sweetberryjam = ITEMS.register("sweetberryjam", () -> new SweetBerryJamItem((new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).craftRemainder(Items.GLASS_BOTTLE).food(FoodRegistry.SWEETBERRYJAM)));
}
