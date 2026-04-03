package Array.Single;
import java.util.Scanner;

public class program {
    static int size;
    static int arr[] =new int[100];
    static void insertionatbeg(int key){
        for(int i = size-1;i>=0;i--){
            arr[i+1] = arr[i];

        }
        arr[0] = key;
        size++;
    }
    static void insertionatend(int key){
        arr[size+1] = key;
        size++;
    }
    static void insertionatsome(int key,int pos){
        for(int i = size-1;i>=pos-1;i--){
            arr[i+1] = arr[i];


        }
            arr[pos-1] = key;
            size++;
    }
    static void deletionfrombeg(){
        for(int i = 0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
    static void deletionfromend(){
        size--;
    }
    static void deletionatsome(int pos2){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a new array---->");
        System.out.println("Enter Size of array: ");
        size = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("press 1 for insertion:");
        System.out.println("press 2 for deletion:");
        System.out.println("press 3 for display:");
        int what = sc.nextInt();
        if(what==1){
            System.out.println("press 1 for insertion at beg");
            System.out.println("press 2 for insertion at end");
            System.out.println("press 3 for insertion at specific place");
            int what2 = sc.nextInt();
            if(what2==1){
                System.out.println("Provide Key: ");
                int key1  = sc.nextInt();
                insertionatbeg(key1);
            }
            else if(what2==2){
                System.out.println("Provide Key: ");
                int key2  = sc.nextInt();
                insertionatend(key2);
            }
            else if(what2==3){
                System.out.println("Provide Key and Position: ");
                int key3  = sc.nextInt();
                int pos = sc.nextInt();
                insertionatsome(key3, pos);
            }

        }
        else if(what==2){
            System.out.println("press 1 for deletion at beg");
            System.out.println("press 2 for deletion at end");
            System.out.println("press 3 for deletion at specific place");
            int what3 = sc.nextInt();
            if(what3==1){

            }
        }
        
        
        for(int i= 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
