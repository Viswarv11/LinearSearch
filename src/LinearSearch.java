import java.util.Scanner;

public class LinearSearch {
    public static int occurence(int [] array,int size,int value){
        int count=0;
        for (int i = 0; i < size; i++) {
            if(array[i]==value){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("Enter a number to find ocuurences");
        int value=scanner.nextInt();
        System.out.println("The number of occurences of the value is :"+occurence(array,size,value));
    }
}
