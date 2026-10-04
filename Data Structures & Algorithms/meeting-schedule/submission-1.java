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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        //Now scan the intervals
        List<Interval> output = new ArrayList<>();
        for(Interval i : intervals){
            if(!output.isEmpty() && i.start < output.get(output.size()-1).end){
                return false; // conflict found
            }
            output.add(i);
        }
        return true;
    }
}
