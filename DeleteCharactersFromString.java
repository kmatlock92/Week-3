package week3;


import acm.program.ConsoleProgram;


public class DeleteCharactersFromString extends ConsoleProgram
{
  public static void removeAllOccurences(String s, char c)
  {

    int j, count = 0, n = s.length();
    char[] t = s.toCharArray();

    for (int i = j = 0; i < n; i++)
    {
      if (t[i] != c)
      {
        t[j++] = t[i];
      }
      else
      {
        count++;
      }
    }
    while (count > 0)
    {

      t[j++] = '\0';
      count--;
    }
    System.out.println(t);

  }

  public static void main(String[] args)
  {
    String s = "This is Summer";
    removeAllOccurences(s, 'e');

    String k = "This is a test";
    removeAllOccurences(k, 'e');

    String l = "-------0---------";
    removeAllOccurences(l, '-');

  }
}
