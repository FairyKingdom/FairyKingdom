package fairykingdom.item;

import java.util.Random;

import com.google.common.collect.Multimap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fairykingdom.helpers.MathHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class KingdomItemAdvancedSword extends FairyKingdomItem
{
    private float damage;
    private final Item.ToolMaterial toolMaterial;

    public KingdomItemAdvancedSword(String name, Item.ToolMaterial material)
    {
    	super(name);
        this.toolMaterial = material;
        this.maxStackSize = 1;
        //this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.damage = 4.0F + material.getDamageVsEntity();
        setTextureName("iron_sword");
    }

    @Override//Defines the breakspeed
    public float func_150893_a(ItemStack stack, Block block)
    {
        if (block == Blocks.web)
        {
            return 15.0F;
        }
        else
        {
            Material material = block.getMaterial();
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
        }
    }
    
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase wielder)
    {
    	if(MathHelper.getRandomChance(toolMaterial.getMaxUses()))
    		breakItemStack(stack, wielder, Items.stick, Item.getItemFromBlock(Blocks.stone));
    	return false;
    }
    
	public void breakItemStack(ItemStack itemstack, EntityLivingBase wielder, Item handle, Item blade){
		if (wielder instanceof EntityPlayer && !((EntityPlayer)wielder).capabilities.isCreativeMode){
			EntityPlayer player = (EntityPlayer)wielder;
			player.renderBrokenItemStack(itemstack);
			player.dropItem(blade, 1);
			player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(handle));
		}
	}
	

    /*@Override
    public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_)
    {
        if ((double)p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            //p_150894_1_.damageItem(2, p_150894_7_);
        }

        return true;
    }*/

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.block;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }

    @Override
    public boolean func_150897_b(Block block)
    {
        return block == Blocks.web;
    }

    @Override
    public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }

    public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }

    @Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.damage, 0));
        return multimap;
    }
}