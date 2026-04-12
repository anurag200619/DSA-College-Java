import java.util.Scanner;

// public class Main
//{
//    public static int add(int a, int b)
//    {
//        return a+b;
//    }
//
//
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = add(a,b);
//        System.out.println(sum);
//    }
//}

// ********************************************************************************************************


//public class Main {
//    public static int frequencycount(int n, int d)
//    {
//        int count = 0;
//
//        while(n > 0){
//            int rem = n % 10;
//            if (rem == d) {
//                count++;
//            }
//            n = n / 10;
//        }
//        return count;
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int d = sc.nextInt();
//        int count = frequencycount(n, d);
//        System.out.println(count);
//    }
//}

// ********************************************************************************************************

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// ********************************************************************************************************

//public class Main {
//    public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for (int i=1; i<n; i++) {
//            max = Math.max(max, arr[i]);
//            min = Math.min(min, arr[i]);
//        }
//        System.out.println();
//        System.out.println(max - min);
//    }
//}

// ****************************************************************************************************************

import java.util.*;

//class Main{
//    static int R = 4;
//    static int C = 4;
//
//    static void print(int arr[][], int i, int j, int m, int n)
//    {
//
//        if (i >= m || j >= n) {
//            return;
//        }
//
//        for (int p = i; p < n; p++) {
//            System.out.print(arr[i][p] + " ");
//        }
//
//        for (int p = i + 1; p < m; p++) {
//            System.out.print(arr[p][n - 1] + " ");
//        }
//
//        if ((m - 1) != i) {
//            for (int p = n - 2; p >= j; p--) {
//                System.out.print(arr[m - 1][p] + " ");
//            }
//        }
//
//        if ((n - 1) != j) {
//            for (int p = m - 2; p > i; p--) {
//                System.out.print(arr[p][j] + " ");
//            }
//        }
//        print(arr, i + 1, j + 1, m - 1, n - 1);
//    }
//
//
//    public static void main(String[] args)
//    {
//        int a[][] = { { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 },
//                { 13, 14, 15, 16 } };
//
//
//        print(a, 0, 0, R, C);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        String str1 = "Palondrom";
//        String rev = "";
//        for(int i= str1.length()-1;i>=0;i--){
//            rev = rev + str1.charAt(i);
//        }
//        System.out.println(rev);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        String str1 = "Silent";
//        String str2 = "listen";
//
//        char[] a = str1.toCharArray();
//        char[] b = str2.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        if(Arrays.equals(a,b))
//        {
//            System.out.println("Anagram");
//        }
//        else{
//            System.out.println("Not Anagram");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String str1 = "abcd";
//        int count = 0;
//        for (int i=0; i<str1.length(); i++){
//            for (int j=0; j< str1.length(); j++){
//                if(str1.charAt(i) == str1.charAt(j)){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        String str1 = "abcd";
//        char remove = 'b';
//        String result = "";
//        for (int i=0; i<str1.length(); i++){
//            if(str1.charAt(i)!= remove)
//            {
//                result += str1.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String str = "ab1856ds";
//        char max = '0';
//        for (int i=0; i<str.length(); i++) {
//            char ch = str.charAt(i);
//            if(ch >= '0' && ch <= '9' && ch > max) {
//                max = ch;
//            }
//        }
//        System.out.println(max);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        String str = "aabcddzzeff";
//        String result = "";
//        int j = 0;
//        result += str.charAt(j);
//        for (int i=1; i<str.length(); i++){
//            if(str.charAt(i)!=result.charAt(j)){
//                result += str.charAt(i);
//                j++;
//            }
//        }
//        System.out.println(result);
//    }
//}

public class Main {
    public static void main(String[] args) {
        String s1="hello";
        for(int i =0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int count =0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==ch);
                count++;
            }
            if(count==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
