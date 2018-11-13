
public class Translate {
	
	public static void main(String args)
	{
		String[] wordEnglish = {"robin","treat","trick","search","circle","whole","five", "pizza","cheese","spaghetti","monkey","horse","dog","cat","juice"};
		String[] wordFrench = {"robin", "friandise", "astuce", "recherche", "cercle", "entier", "cinq", "pizza", "fromage", "spaghetti","singe", "cheval", "chien", "chat", "jus"};
		
		for(int i = 0; i < wordEnglish.length; i ++)
		{
			System.out.printf("English %-15s French %-15s", wordEnglish[i], wordFrench[i]);
		}
	
	}

}
