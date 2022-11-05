/*  Nearby Cars
    Given N points in a 2D plane which are locations of N cars.
    If we are at origin print the nearest K cars.
    C0={3,3}           distSq=18
    C1={5,-1}                 26
    C2={-2,4}                 20
    ans--C0 and C2
 */
import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x,int y,int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Point p2){  //ascending order
        return this.distSq-p2.distSq;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distSq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
