import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Day6{
	public static int[] alphabetStats(String s) {
		int[] result = new int[26];
	for(int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == 'a') {
			result[0]++;
		}
		if(s.charAt(i) == 'b') {
			result[1]++;
		}
		if(s.charAt(i) == 'c') {
			result[2]++;
		}
		if(s.charAt(i) == 'd') {
			result[3]++;
		}
		if(s.charAt(i) == 'e') {
			result[4]++;
		}
		if(s.charAt(i) == 'f') {
			result[5]++;
		}
		if(s.charAt(i) == 'g') {
			result[6]++;
		}
		if(s.charAt(i) == 'h') {
			result[7]++;
		}
		if(s.charAt(i) == 'i') {
			result[8]++;
		}
		if(s.charAt(i) == 'j') {
			result[9]++;
		}
		if(s.charAt(i) == 'k') {
			result[10]++;
		}
		if(s.charAt(i) == 'l') {
			result[11]++;
		}
		if(s.charAt(i) == 'm') {
			result[12]++;
		}
		if(s.charAt(i) == 'n') {
			result[13]++;
		}
		if(s.charAt(i) == 'o') {
			result[14]++;
		}
		if(s.charAt(i) == 'p') {
			result[15]++;
		}
		if(s.charAt(i) == 'q') {
			result[16]++;
		}
		if(s.charAt(i) == 'r') {
			result[17]++;
		}
		if(s.charAt(i) == 's') {
			result[18]++;
		}
		if(s.charAt(i) == 't') {
			result[19]++;
		}
		if(s.charAt(i) == 'u') {
			result[20]++;
		}
		if(s.charAt(i) == 'v') {
			result[21]++;
		}
		if(s.charAt(i) == 'w') {
			result[22]++;
		}
		if(s.charAt(i) == 'x') {
			result[23]++;
		}
		if(s.charAt(i) == 'y') {
			result[24]++;
		}
		if(s.charAt(i) == 'z') {
			result[25]++;
		}
	}
	return result;
	}
	
	public static int maxGet(int[] stats) {
		int max = 0;
		int index = 0;
		for(int i = 0; i < stats.length; i++) {
			if (stats[i] > max) {
				max = stats[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int minGet(int[] stats) {
		int min = 100000;
		int index = 0;
		for(int i = 0; i < stats.length; i++) {
			if (stats[i] < min) {
				min = stats[i];
				index = i;
			}
		}
		return index;
	}
	
	public static String message(String filename) {
	try{
		ArrayList<String> inputs = new ArrayList<String>(); 
		String temp = "";
		String result = "";
		File file = new File(filename);
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			inputs.add(input.nextLine());
			}
		for(int i = 0; i < 8; i++) {
			int j = 0;
			while(j < inputs.size()) {
				temp+=inputs.get(j).charAt(i);
				j++;
			}
			result+=maxGet(alphabetStats(temp)) + "-";
			temp = "";
		}
		return result;
		}catch (FileNotFoundException e){
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(message("input3.txt"));
	}
}