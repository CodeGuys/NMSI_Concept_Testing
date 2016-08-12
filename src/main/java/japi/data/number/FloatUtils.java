package japi.data.number;

import japi.StringUtils;

public class FloatUtils {
  public static int chop(float f) {
    String k = "" + f;
    int index = k.indexOf('.');
    String[] letters = StringUtils.getLetters(k);
    String g = "";
    for (int i = 0; i < letters.length; i++) {
      if (letters[i] == ".") break;
      g += letters[i];
    }
    return Integer.parseInt(g);
  }
}
