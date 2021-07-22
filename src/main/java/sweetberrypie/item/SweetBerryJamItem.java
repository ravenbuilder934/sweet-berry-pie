package sweetberrypie.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class SweetBerryJamItem extends Item
{
    public SweetBerryJamItem(Item.Properties builder)
    {
        super(builder);
    }

    /**
     * Return a glass bottle when finished eating. From the vanilla honey bottle code
     */
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity)
    {
        super.finishUsingItem(stack, level, livingEntity);

        if (stack.isEmpty())
        {
            return new ItemStack(Items.GLASS_BOTTLE);
        }
        else
        {
            if (livingEntity instanceof Player && !((Player) livingEntity).getAbilities().instabuild)
            {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                Player player = (Player) livingEntity;
                if (!player.getInventory().add(itemstack))
                {
                    player.drop(itemstack, false);
                }
            }
            return stack;
        }
    }
}
