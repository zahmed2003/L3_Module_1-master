package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	
	
	public static int findBrokenEgg(List<String> eggs) {
		
		for(int i = 0; i <= eggs.size(); i++)
		{
			if(eggs.get(i).equals("cracked"))
			{
				return i;
			}
		}
		return 0;
		
	}
	
public static int countPearls(List<Boolean> oyesters) {
	
	 int numPearls = 0;
	
		for(int i = 0; i < oyesters.size(); i++)
		{
			if(oyesters.get(i) == true)
			{
				numPearls +=1;
			}
		}
		
		return numPearls;
	}

public static double findTallest(List<Double> peeps) {
	Double tallest = 0.0;
	
	for(int i = 0; i < peeps.size(); i++)
	{
		if(peeps.get(i) > tallest)
		{
			tallest = peeps.get(i);
		}
	}
	return tallest;
}

public static String findLongestWord(List<String> words) {
	
	 String longest = "";
	 
	 for(int i = 0; i < words.size(); i++)
	 {
		 if(words.get(i).length() > longest.length())
		 {
			 longest = words.get(i);
		 }
	 }
	 
	 
	 return longest;
}

public static boolean containsSOS(List<String> message) {
	 
	 for(int i = 0; i < message.size(); i++)
	 {
		 if(message.get(i).contains("... --- ..."))
		 {
			return true;
		 }
	 }
	 return false;
}

public static List<Double> sortScores(List<Double> results)
{
		results.sort(null);
		
	return results;
}

public static List<String> sortDNA(List<String> unsortedSequences) {
	
	unsortedSequences.sort(null);
		
	return unsortedSequences;
	
}

//public static List<String> sortWords(List<String> words) {
	// for(int i = 0; i < words.size(); i++)
	// {
	//	 
	// }
	
//}




}