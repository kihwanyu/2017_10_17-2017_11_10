package silsub;

public class CharacterProcess {
	public int countAlpha(String s){
		
		char[] ch = s.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < ch.length; i++){
			if(ch[i]>96&&ch[i]<123){
				count++;
			}
			if(ch[i]>64&&ch[i]<91){
				count++;
			}
		}
		return count;
	}
	public void checkAge(int age){
		
	}
}
