package sweetberrypie.item;

import net.minecraft.item.Food;

public class FoodBuilderRegistry {
    public static final Food SWEETBERRYPIE = (new Food.Builder()).hunger(8).saturation(4.8F).build();
}