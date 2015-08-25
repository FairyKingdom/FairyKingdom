package fairykingdom.helpers;

public class TextHelper {
	public static String genitiveApostrophe(String owner){
		return owner.endsWith("s")?"'":"'s";		
	}
	
	public static String stringWithGenitiveApostrophe(String owner){
		return owner + genitiveApostrophe(owner);
	}
}