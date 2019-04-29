package codility;

public class Solution {
    int menor = 1;
	
	public int solution(int[] A) {
		for(int valorA : A){
            for(int valorB : A){
                while(menor==valorA || menor==valorB){
                    menor++;
                }
            }
        }
		return menor;
    }
}