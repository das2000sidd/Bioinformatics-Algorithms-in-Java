import java.lang.*;
import java.util.stream.IntStream;
import java.util.Arrays;
public class BurrowsWheeler {
	private String sequence;
	public BurrowsWheeler() {
		this.setSequence(sequence);
	}
	public char[] appendDollarToString() {
		String new_string = this.getSequence()+"$";
		
		char[] char_array = new char[new_string.length()];
		for(int i=0; i <new_string.length();i++) {
			char_array[i] = new Character(new_string.charAt(i));
		}
		return char_array;
	}
	public String createSingleRotation(char[] any_char_list) {
		
		
		char[] rotated_array = new char[any_char_list.length];
		
		for(int i=0; i < any_char_list.length;i++) {
			if(i==any_char_list.length-1) {
				rotated_array[0] = any_char_list[any_char_list.length-1];
			} else {
				rotated_array[i+1] = any_char_list[i];
			}
		}
		
		return new String(rotated_array);
	}
	
	public String[] createCompletetRotationString() {
		char[] char_array = new char[this.getSequence().length()];
		char_array = this.appendDollarToString();
		String[] bwt_strings = new String[char_array.length];
		for(int i=0; i < char_array.length;i++) {
			String rotated = this.createSingleRotation(char_array);
			bwt_strings[i] = rotated;
			 
			
			char_array =rotated.toCharArray();

		}
		String[] bwt_strings_sorted = new String[bwt_strings.length];
		Arrays.sort(bwt_strings);
		
		return bwt_strings;
	}
	
	public String returnBurrowsWheelerString() {
		String[] bwt_matrix = new String[this.sequence.length()+1];
		bwt_matrix = this.createCompletetRotationString();
		String burrows_wheeler_transform = "";
		
		for(int i = 0; i < bwt_matrix.length;i++) {
			String bwt_matrix_string=bwt_matrix[i];
			
			String last_char=Character.toString(bwt_matrix_string.charAt(bwt_matrix_string.length()-1));
			
			burrows_wheeler_transform+=last_char;
		}
		return burrows_wheeler_transform;
	}
	
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
}
