import java.util.*;
class Main{
    // static double distance(int a1,int a2,int b1,int b2){
    //     return Math.sqrt(((b1-a1)*(b1-a1)) - ((b2-a2)*(b2-a2)));
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int x1 = arr[0][0], y1 = arr[0][1];
        int x2 = arr[1][0], y2 = arr[1][1];
        int x3 = arr[2][0], y3 = arr[2][1];
        
        System.out.println(0.5 * (Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))));
    }
}
