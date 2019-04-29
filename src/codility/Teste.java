package codility;

public class Teste {

	public static void main(String[] args) {

        int[] A = {-10, 1, 3, 5, 4, 6, 8, 1, 2, 8, 5, 7, 12};

        Solution solution = new Solution();
                
        System.out.println("Menor valor não contido no array é: " + solution.solution(A));
	}
}