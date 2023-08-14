/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int mat[][] = new int[0][0];
    public void right(int i, int j, int m, int n, ListNode head){
        if(head==null){
            return;
        }
        if((i<0 || i>=m) || (j<0 || j>=n)){
            return;
        }
        if(j==n-1 || mat[i][j+1]!=-1){
            mat[i][j] = head.val;
            down(i+1,j,m,n,head.next);
            return;
        }
        mat[i][j] = head.val;
        right(i,j+1,m,n,head.next);
    }
    public void down(int i,int j,int m, int n, ListNode head){
        if(head==null){
            return;
        }
        if((i<0 || i>=m) || (j<0 || j>=n)){
            return;
        }
        if(i==m-1 || mat[i+1][j]!=-1){
            mat[i][j] = head.val;
            left(i,j-1,m,n,head.next);
            return;
        }
        mat[i][j] = head.val;
        down(i+1,j,m,n,head.next);
    }
    public void left(int i, int j, int m, int n, ListNode head){
        if(head==null){
            return;
        }
        if((i<0 || i>=m) || (j<0 || j>=n)){
            return;
        }
        if(j==0 || mat[i][j-1]!=-1){
            mat[i][j] = head.val;
            up(i-1,j,m,n,head.next);
            return;
        }
        mat[i][j] = head.val;
        left(i,j-1,m,n,head.next);
    }
    public void up(int i, int j, int m, int n, ListNode head){
        if(head==null){
            return;
        }
        if((i<0 || i>=m) || (j<0 || j>=n)){
            return;
        }
        if(i==0 || mat[i-1][j]!=-1){
            mat[i][j] = head.val;
            right(i,j+1,m,n,head.next);
            return;
        }
        mat[i][j] = head.val;
        up(i-1,j,m,n,head.next);
    }
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        mat = new int[m][n];
        int d = head.val;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = -1;
            }
        }
        right(0,0,m,n,head);
        mat[0][0] = d;
        return mat;
    }
}