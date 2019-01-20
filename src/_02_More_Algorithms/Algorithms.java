package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				total++;
			}
		}
		return total;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double largest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > largest) {
				largest = peeps.get(i);
			}
		}
		return largest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int i = 0; i < results.size(); i++) {
			int minIndex = i;
			for (int j = i; j < results.size(); j++) {
				if (results.get(j) < results.get(minIndex)) {
					minIndex = j;
				}
			}
			double a = results.get(i);
			double b = results.get(minIndex);
			Collections.replaceAll(results, a, -1.0);
			Collections.replaceAll(results, b, a);
			Collections.replaceAll(results, -1.0, b);

		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub

		for (int i = 0; i < unsortedSequences.size(); i++) {
			int minIndex = i;
			for (int j = i; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(j).length() < unsortedSequences.get(minIndex).length()) {
					minIndex = j;
				}
			}
			String a = unsortedSequences.get(i);
			String b = unsortedSequences.get(minIndex);
			Collections.replaceAll(unsortedSequences, a, "");
			Collections.replaceAll(unsortedSequences, b, a);
			Collections.replaceAll(unsortedSequences, "", b);
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < words.size(); i++) {
			int minIndex = i;
			for (int j = i; j < words.size(); j++) {
				if (words.get(j).compareTo(words.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			String a = words.get(i);
			String b = words.get(minIndex);
			Collections.replaceAll(words, a, "");
			Collections.replaceAll(words, b, a);
			Collections.replaceAll(words, "", b);
		}
		
		return words;
	}



}
