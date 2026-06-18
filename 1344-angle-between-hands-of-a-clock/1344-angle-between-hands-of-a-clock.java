class Solution {
    public double angleClock(int hour, int minutes) {
        double angMin = 360/(60/(double)(minutes));
        System.out.println(angMin);
        double angHour = 30*(((double)(hour)%12)+((double)(minutes)/60));
        System.out.println(angHour);
        double angle = Math.abs(angMin-angHour);
        if(360-angle<angle)
            return 360-angle;
        else
            return angle;
    }
}