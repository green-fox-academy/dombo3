import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotto {

  public static void main(String[] args) {
    List<String> lines = readFileLines();
    ArrayList<String> otos = getLinesOfNum(lines);
    ArrayList<String> otosNums = getNums(otos);
    HashMap<String, Integer> occurence = getOccurence(otosNums);
    printMax(occurence);
  }

  public static List<String> readFileLines(){
    List<String> lines;
    try {
      Path filePath = Paths.get("assets/otos.csv");
      lines = Files.readAllLines(filePath);
      for (String line : lines) {
        line.substring(line.lastIndexOf("Ft") + 3);
      }
    } catch (Exception e) {
      System.out.println("Error happened: " + e.getClass());
      lines = new ArrayList<>();
    }
    return lines;
  }

  public static ArrayList<String> getLinesOfNum(List<String> lines) {
    ArrayList<String> otos = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      String Otos = lines.get(i).substring(lines.get(i).lastIndexOf("Ft") + 3);
      otos.add(Otos);
    }
    return otos;
  }

  public static ArrayList<String> getNums(ArrayList<String> otos){
    ArrayList<String> otosNums = new ArrayList<>();
    for (int i = 0; i < otos.size(); i++) {
      String[] nums = otos.get(i).split(";");
      for (int j = 0; j < 5; j++){
        otosNums.add(nums[j]);
      }
    }
    return otosNums;
  }

  public static HashMap<String, Integer> getOccurence(ArrayList<String> otosNums) {
    HashMap<String, Integer> occurence = new HashMap<>();
    for (int i = 0; i < otosNums.size(); i++){
      if (occurence.containsKey(otosNums.get(i))) {
        occurence.put(otosNums.get(i), occurence.get(otosNums.get(i)) + 1);
      } else {
        occurence.put(otosNums.get(i),1);
      }
    }
    return occurence;
  }

  public static void printMax(HashMap<String, Integer> occurence) {
    for (int i = 1; i < 6; i++) {
      String maxKey = "";
      Integer maxValue = 0;
      for (String key : occurence.keySet()) {
        if (occurence.get(key) > maxValue) {
          maxValue = occurence.get(key);
          maxKey = key;
        }
      }
      System.out.println("Lotto Number (key): " + maxKey);
      System.out.println("Occurence (value): " + maxValue);
      occurence.remove(maxKey);
    }
  }

}


