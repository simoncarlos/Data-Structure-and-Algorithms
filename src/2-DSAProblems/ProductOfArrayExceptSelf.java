public class ProductOfArrayExceptSelf {
    public static void main(String args[]){
        int[] params = {1,2,3,4};
        int[] answer = new int[params.length];
        int pre = 1;
        int pos = 1;
        for(int i=0; i<params.length; i++){
            answer[i] = pre;
            pre = pre * params[i];
        }
        for(int i=params.length-1; i>=0; i--){
            answer[i] = pos * answer[i];
            pos = pos * params[i];
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}