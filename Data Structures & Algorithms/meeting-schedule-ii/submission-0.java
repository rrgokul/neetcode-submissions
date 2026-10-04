/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        Interval prev = null;
        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();
        
        for(Interval i : intervals){
            starts.add(i.start);
            ends.add(i.end);
        }
        Collections.sort(starts);
        Collections.sort(ends);
        int res=0, count=0, s=0, e=0;
        while(s < intervals.size()){
            if(starts.get(s) < ends.get(e)){
                s++;
                count++;
            } else {
                e++;
                count--;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
