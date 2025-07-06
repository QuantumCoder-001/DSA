package array;

import java.util.Scanner;

class Operations{
    int[] arr;
    int size;
    public Operations(int size){
        this.size = size;
        arr = new int[size];
    }
    public void Display(){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public int Find(int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public void Deletion(int num){
        int y = Find(num);
        if(y==-1){
            System.out.println("Number does not Exist");
        }
        else{
            for(int k = y;k<size-1; k++){
                arr[k] = arr[k+1];
            }
        }
        arr[size-1] = 0;
    }
    public void Insertion(int num, int index){
        if(index>=size){
            System.out.println("Index out of Size");
        }
        else{
            for(int k = size-1;k>index; k--){
                arr[k] = arr[k-1];
            }
        }
        arr[index] = num;
    }
}
public class Array_CRUD_Operations {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Operations op = new Operations(size);
        while(true) {
            System.out.println("MENU");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter the Element to Insert");
                    int num = sc.nextInt();
                    System.out.println("Enter the Index");
                    int index = sc.nextInt();
                    op.Insertion(num,index);
                }
                case 2 ->{
                    System.out.println("Enter the Element to Delete");
                    int num = sc.nextInt();
                    op.Deletion(num);
                }
                case 3 -> {
                    System.out.println("Enter the Number to Find");
                    int num = sc.nextInt();
                    int i = op.Find(num);
                    if(i==-1){
                        System.out.println("Not Found");
                    }
                    else{
                        System.out.println("Found at Index:"+i);
                    };
                }
                case 4 -> op.Display();
                case 5 -> {
                    System.out.println("Exiting");
                    sc.close();
                    return;
                }
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}
