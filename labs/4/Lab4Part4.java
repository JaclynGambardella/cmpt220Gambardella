public class Lab4Part4 {
	public static void main(String[] args) {

		String string = "How many occurances of each character are in this string?";
		int[] a = new int [26];
		int[] b = new int [26];

		for (int i = 0; i < 26; i ++) {
			a [i] = 0;
		}

		for (int i = 0; i < 26; i ++) {
			b [i] = 0;
		}

		for (int i = 0; i< string.length(); i ++) {
		if (string.charAt (i)- 65 >= 0 && string.charAt(i) - 65 < 26) {

		a[string.charAt(i)-65]++;

        }

        if(string.charAt(i)-97>=0&&string.charAt(i)-97<26) {

        b[string.charAt(i)-97]++;

        }
    }

		for(int i=0;i<26;i++) {
			if(b[i]!=0)
				System.out.printf("The number of occurances of %c is %d\n",i+97,b[i]);
			if(a[i]!=0)
				System.out.printf("The number of occurances of %c is %d\n",i+65,a[i]);

    }

}
}