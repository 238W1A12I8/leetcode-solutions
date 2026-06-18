class Solution {
    public double angleClock(int hour, int minutes) {
        double n=hour+minutes/60.0;
        double n1=(11.0*n)%12.0;
        return Math.min(n1,12.0-n1)*30.0;
    }
}