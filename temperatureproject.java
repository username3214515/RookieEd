public static void main(String[] args) {
        double[] testHighs = new double[] {56.3, 42.6, 71.4, 65.0, 59.4, 51.6, 69.4};
        double[] testLows = new double[] {44.2, 37.4, 67.3, 48.9, 43.5, 32.58, 63.7};
        weeklyforecast(testHighs,testLows);
    }
    public static void weeklyforecast(double[] highs,double[] lows){
        System.out.println("Weekly Average Temperature: "+(int)(sum(highs)+sum(lows))/14);
        System.out.println("Highest:  "+"Lowest:");
        String[] daysOfWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (int i=0; i<highs.length; i++){
            System.out.println(highs[i]+"      "+lows[i]);
        }
    }
    public static double sum(double[] arr){
        double result=0;
        for (int i=0; i<arr.length; i++){
            result+=arr[i];
        }
        return result;
    }