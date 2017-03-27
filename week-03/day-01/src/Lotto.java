import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by user on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        line.substring(line.lastIndexOf("Ft") + 3);
      }

      ArrayList<String> otos = new ArrayList<>();

      for (int i = 0; i < lines.size(); i++) {
        String Otos = lines.get(i).substring(lines.get(i).lastIndexOf("Ft") + 3);
        otos.add(Otos);
      }

      ArrayList<String> otosNums = new ArrayList<>();

      for (int i = 0; i < otos.size(); i++) {
        String[] nums = otos.get(i).split(";");
        for (int j = 0; j < 5; j++){
          otosNums.add(nums[j]);
        }
      }

      HashMap<String, Integer> occurence = new HashMap<>();

      for (int i = 0; i < otosNums.size(); i++){
        if (occurence.containsKey(otosNums.get(i))) {
          occurence.put(otosNums.get(i), occurence.get(otosNums.get(i)) + 1);
        } else {
          occurence.put(otosNums.get(i),1);
        }
      }

      /*List<Integer> occurences = new ArrayList<>();*/

      String maxKey2 = "";
      Integer maxValue2 = 0;
      for (String key : occurence.keySet()) {
        if(occurence.get(key) > maxValue2) {
          maxValue2 = occurence.get(key);
          maxKey2 = key;
        }
      }
      System.out.println(maxValue2);
      System.out.println(maxKey2);
      occurence.remove(maxKey2);


    }

    catch (Exception e) {
      System.out.println("Error happened: " + e.getClass());
    }

  }

 /* public static HashMap maxValues(HashMap occurenceFinal){
    System.out.println(occurenceFinal);
    Object maxKey = "";
    Object maxValue = 0;
    for (Object key : occurenceFinal.keySet()) {
      if(occurenceFinal.get(key) > maxValue) {
        maxValue = occurenceFinal.get(key);
        maxKey = key;
      }
    }
    System.out.println(maxValue);
    System.out.println(maxKey);
    occurenceFinal.remove(maxKey);
    return occurenceFinal;
  }*/


}


