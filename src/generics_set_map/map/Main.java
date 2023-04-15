package generics_set_map.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map <String, Integer> votes = new HashMap<>();
			
			String infos = br.readLine();
			while(infos != null) {
				String [] fields = infos.split(",");
				
				if(votes.containsKey(fields[0])) {
					votes.put(fields[0], votes.get(fields[0]) + Integer.valueOf(fields[1]));
				} else {
					votes.put(fields[0], Integer.valueOf(fields[1]));
				}
				
				infos = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
