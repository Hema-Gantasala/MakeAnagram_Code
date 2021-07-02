import java.util.*;

class MakeAnagram
    {
	public static int makeAnagram(String a, String b) {
		int count = 0;
		char[] aa = a.toUpperCase().toCharArray();
                char[] bb = b.toUpperCase().toCharArray();
		String s = "";
		for(char a1: aa)
		{
			for(char b1 : bb)
			{
				if(a1 == b1)
				{
					if(s.indexOf(a1)==-1)
					{
						count++;
						s= s + a1;
					   
					}
				}
			}
		}
		System.out.println("the anagram is:"+s);
		return (a.length() - count) + (b.length() - count);
             }

               public static void main(String[] args)
                {
    	          Scanner sc=new Scanner(System.in);
                  String a = sc.nextLine();

                  String b = sc.nextLine();

                  int res = makeAnagram(a, b);
                  System.out.println(res);

                 }
      }
