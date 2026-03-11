import java.io.*;
import java.util.*;
public class Anagrams{
  private static HashMap<String , ArrayList<String>>anagramMap = new HashMap<>();
  private static int totalWords = 0;
  private static int uniqueWords= 0;
  private static int anagramGroups =0;
  public static void main(String[]args) {
    Sysytem.out.println("====ANAGRAM FINDER FOR joyce1922_ulysses.txt ====");
    Sysytem.out.println("Starting at : " + new Date());
    Sysytem.out.println("-----------------------------------------")
      if (!processFile(" joyce1922_ulysses.txt")) {
            System.out.println("ERROR: Could not process file. Exiting.");
            return;
        }
    printStatistics();
        generateLatexFile("theAnagrams.tex");
        System.out.println("\nDone! Output written to theAnagrams.tex");
    }
  


  
