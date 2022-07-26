public class Conditions {

    public static void main(String[] args) {

        int testScore = 51;

        if (testScore > 50) {

            System.out.println("Congrats");
        } else if ( testScore == 50){
            System.out.println("Not Sure");
        }
        else {
            System.out.println("Fail");
        }

        switch (testScore){

            case 0 :
                System.out.println("Test Taken");
                break;
            case 100 :
                System.out.println("Top");
                break;
            default :
                System.out.println("Normal");
                break;
        }

        int maxScore = 100;

        if (testScore > 50 && testScore < maxScore) {

            System.out.println();
        }

    }
}
