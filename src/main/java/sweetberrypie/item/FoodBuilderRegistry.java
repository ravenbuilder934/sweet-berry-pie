package sweetberrypie.item;

import net.minecraft.item.Food;

public class FoodBuilderRegistry
{
    public static final Food SWEETBERRYPIE = (new Food.Builder()).hunger(8).saturation(4.0F).build();
    public static final Food SWEETBERRYJAM = (new Food.Builder()).hunger(6).saturation(3.0F).build();
    public static final Food COOKEDSWEETBERRIES = (new Food.Builder()).hunger(4).saturation(2.0F).build();
}