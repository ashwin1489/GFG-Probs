class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,Comparator.comparingInt(i->i[0]));
        List<int []>result = new ArrayList<>();
        
        int [] newInterval = arr[0];
        result.add(newInterval);
        
        for(int [] interval: arr){
            if(interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return new ArrayList<>(result);
        
        
    }
}