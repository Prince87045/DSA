/*
  Find the trappped water in a bar graph
  trapped water=(water level-height)*width
  water level=min(maxLeftBoundary,maxRightBoundary)
  make an array for max right and left boundary Array
 */
public class TrappingWater {
    public static int trappedWater(int height[]){
        int n=height.length;

        //max left Boundary array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //max Right boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        //loops
        for(int i=0;i<n;i++){
            //for watelevel
            int waterlevel=Math.min(leftMax[i],rightMax[i]);

            //for trappedWater
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int totalTrap=trappedWater(height);
        System.out.println("total trapped rain water is "+totalTrap+" units");
    }
}
