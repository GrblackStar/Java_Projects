package upr_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {

	public static void main(String[] args){
		//FileWriter helpWriter;
		//BufferedWriter writer = new BufferedWriter(new FileWriter("numbers2.txt"));
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("numbers2.txt"))){
			for(int i=0; i<10;i++) {
				writer.write(i+"");
				writer.newLine();
			}
			writer.flush();
		} catch (IOException e) {
			System.out.println("IO exception:"+e.getMessage());
		}
		

	}

}
