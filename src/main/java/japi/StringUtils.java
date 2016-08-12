package japi;

public class StringUtils {
  public static String[] getLetters(String line) {
    return line.split("");
  }
  public static String compileSentence(String[] strings) {
    String r = strings[0] + " ";
    for (int i = 1; i < strings.length; i++) {    // YES, I used "1" intentionally. Think about it...  ~~John
      r += " " + strings[i];
    }
    return r;
  }
  public static String getWords(String line) {
    return line.split(" ");
  }
}
