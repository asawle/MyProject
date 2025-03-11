package demo;

public class VowelsAndConstain {

	public static void main(String[] args) {
		String s = "sakshi ajit sawle";

		char[] arr = s.toCharArray();
		
		int vov=0;
		int con=0;
		for(Character c:arr) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c)!=-1) {
					vov++;
				}
				else {
					con++;
				}
			}
		}
		System.out.println("vow "+vov+" con "+con);

	}

}
