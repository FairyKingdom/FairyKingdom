package fairykingdom.helpers;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class MathHelper {	
	public static boolean getRandomChance(int fraction){
		Random rand = new Random();
		int randomInt = rand.nextInt(fraction);
		System.out.println("Got " + randomInt + " of " + fraction + ".");
		return randomInt < 100;
	}
}