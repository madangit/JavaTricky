/*
 * Got this interview Question
 * Given a custom hashing function and the hash value  
 * Do a reverse hash to find the word for the Hash value in the if condition
 */
public class FunWithHashing {

	public static void main(String[] args) {
        String foo = "hello";
        long hash = FunWithHashing.hash(foo);
        System.out.println(String.format("hash value for %s is %s", foo, hash));
        if (hash == 67564526567411L){ //Find the word for the hash value
             System.out.println("correct");
        }
        else {
             System.out.println("incorrect");              
        }
    }
	
	//Custom hashing function
	public static long hash(String word) {
        long hashCode = 7;         
        for (int i = 0; i < word.length(); i++) {
             hashCode = hashCode * 42 + "acdehikmnoprstuv".indexOf(word.charAt(i));
        }
        return hashCode;
    }
	
	//Complete the reverse hash function to find the word for the Hash value
	public static String reverseHash(long hash){
		String toFind = null;
		
		for(int i=1;i<hash;i++){
			
		}
		
		return toFind;
		
	}
}
