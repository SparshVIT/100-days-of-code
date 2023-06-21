class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //finding max number index
        int l = 0;
        int h = mountainArr.length()-1;
        boolean found_index = false;
        int index = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            int d = mountainArr.get(mid);
            int left = 0;
            if(mid-1>=0){
                left = mountainArr.get(mid-1);
            }
            int right = mountainArr.get(mid+1);
            if(d<=right){
                l = mid+1;
            }
            else if(d>right){
                if(d>left){
                    found_index = true;
                    index = mid;
                    break;
                }
                else{
                    h = mid-1;
                }
            }
        }
        if(found_index == false){
            index = l-1;
        }
        //finding the occurence of number in both subarrays
        l = 0;
        h = index;
        int occurence = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int d = mountainArr.get(mid);
            if(d==target){
                occurence = mid;
                break;
            }
            else if(d<target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        if(occurence==-1){
        l = index+1;
        h = mountainArr.length()-1;
        occurence = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int d = mountainArr.get(mid);
            if(d==target){
                occurence = mid;
                break;
            }
            else if(d>target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        }
        return occurence;
    }
}
