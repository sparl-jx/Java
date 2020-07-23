/* import java.util.Scanner;

public class TestDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                stringBuilder.append(c);
            }else{
                stringBuilder.append(" ");
            }
        }

        String str = stringBuilder.toString().trim();
        String[] split = str.split("[ ]+");

        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i=0; i<split.length; i++) {
            split[i] = split[i].trim();
            stringBuilder1.append(split[split.length-1-i]);
            if(i!=split.length-1){
                stringBuilder1.append(" ");
            }
        }
        System.out.println(stringBuilder1.toString());
    }
}
*/

//单调栈结构
import java.util.*;

public class TestDemo {
    public static int[][] Near(int[] arr) {
        ArrayDeque<List<Integer>> stack = new ArrayDeque<>();
        int[][] res = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek().get(0)]) {
                List<Integer> topList = stack.pop();

                int leftLessIdx = stack.isEmpty() ? -1 : stack.peek().get(stack.peek().size() - 1);
                for (Integer n : topList) {
                    res[n][0] = leftLessIdx;
                    res[n][1] = i;
                }
            }
            if (!stack.isEmpty() && arr[i] == arr[stack.peek().get(0)]) {
                stack.peek().add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                stack.push(list);
            }
        }
        while (!stack.isEmpty()) {
            List<Integer> topList = stack.pop();
            int leftLessIdx = stack.isEmpty() ? -1 : stack.peek().get(stack.peek().size() - 1);
            for (Integer n : topList) {
                res[n][0] = leftLessIdx;
                res[n][1] = -1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] res = Near(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
 }
