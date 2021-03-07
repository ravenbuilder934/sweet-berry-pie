package sweetberrypie.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class SweetBerryJamItem extends Item
{
    public SweetBerryJamItem(Item.Properties builder)
    {
        super(builder);
    }

    /**
     * Return a glass bottle when finished eating. From the vanilla honey bottle code
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (stack.isEmpty())
        {
            return new ItemStack(Items.GLASS_BOTTLE);
        }
        else
            {
            if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
            {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerentity = (PlayerEntity)entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack))
                {
                    playerentity.dropItem(itemstack, false);
                }
            }

            return stack;
        }
    }
}
