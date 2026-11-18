public class RobotSimulator {
    public static String attemptString(int[] arr){
        String answer="";
        for (int i=0;i<arr.length;i++){
            answer+="Attempt"+" "+(i+1)+": "+arr[i]+"\n";
        }
        return answer;
    }
    public static int totalScore(int[] arr){
        int result=0;
        for (int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
    }
    public static String performanceCategory(int[] scores){
        if (totalScore(scores)<10){
            return "Performance: Poor";
        }
        else if (totalScore(scores)<=24){
            return "Performance: Needs Improvement";
        }
        else if (totalScore(scores)<=39){
            return "Performance: Good";
        }
        else if (totalScore(scores)>40){
            return "Performance: Excellent";
        }
        return "idk";
    }
    public static void main(String[] args) {
        int[] scores = {2, 0, 5, 3, 0, 5, 2, 5, 0, 3};
        IO.println(performanceCategory(scores));
    }
}
