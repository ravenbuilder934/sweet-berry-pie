package sweetberrypie.item;

import net.minecraft.world.food.FoodProperties;

public class FoodRegistry
{
    public static final FoodProperties SWEETBERRYPIE = (new FoodProperties.Builder()).nutrition(8).saturationMod(4.0F).build();
    public static final FoodProperties SWEETBERRYJAM = (new FoodProperties.Builder()).nutrition(6).saturationMod(3.0F).build();
    public static final FoodProperties COOKEDSWEETBERRIES = (new FoodProperties.Builder()).nutrition(4).saturationMod(2.0F).build();
}