
public class TestBW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "abaaba";
			BurrowsWheeler test = new BurrowsWheeler();
			test.setSequence(sequence);
			char[] test_array = new char[(test.getSequence().length())+1];
			test_array = test.appendDollarToString();
			for(int i=0; i < test_array.length;i++) {
				System.out.println(test_array[i]);
			}
			String single_rot = test.createSingleRotation(test_array);
			System.out.print("Printing single rotation \n");
			System.out.println(single_rot);
			String[] complete_rotated_strings = new String[test.getSequence().length()+1];
			complete_rotated_strings = test.createCompletetRotationString();
			for(int i=0; i < complete_rotated_strings.length;i++) {
				System.out.println(complete_rotated_strings[i]);
			}
			System.out.println(complete_rotated_strings.length);

			String burrows_wheeler_string = test.returnBurrowsWheelerString();
			System.out.println(burrows_wheeler_string);
	}

}
