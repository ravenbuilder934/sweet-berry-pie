package sweetberrypie.item;

import net.minecraft.item.Food;

public class FoodRegistry
{
    public static final Food SWEETBERRYPIE = (new Food.Builder()).nutrition(8).saturationMod(4.0F).build();
    public static final Food SWEETBERRYJAM = (new Food.Builder()).nutrition(6).saturationMod(3.0F).build();
    public static final Food COOKEDSWEETBERRIES = (new Food.Builder()).nutrition(4).saturationMod(2.0F).build();
}