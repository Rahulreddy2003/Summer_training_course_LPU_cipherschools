public class lec_15{
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    static void add_one(int x){
        x=x+1;
    }
    static void add_one(int temp_arr[]){
        for(int i=0;i<temp_arr.length;i++){
            temp_arr[i]++;
        }
    }
    public static void main(String[] args) {
        int size=5;
        int arr[]=new int[size];// array declaration syntax

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        print(arr);
        for(int i=0;i<size;i++){
            arr[i]=i+1;
        }
        print(arr);
        int arr2[]={13,53,22};
        print(arr2);

        //to increase the size of the array we need to create a duplicate array and copy all of the elements from the existing array
        int copy_arr[]=new int[2*size];
        for(int i=0;i<size;i++){
            copy_arr[i]=arr[i];//copying the elements of the arr in copy_arr
        }
        copy_arr[5]=69;
        copy_arr[6]=70;
        print(copy_arr);

        //pass by value
        int x=10;
        add_one(x);
        System.out.println(x); // will print 10


        int temp_arr[]={1,2,3,4,5};
        add_one(temp_arr);// will increase all of the elements why one in the original array
        for(int i=0;i<temp_arr.length;i++){
            System.out.print(temp_arr[i]+" ");
        }
    }
}
