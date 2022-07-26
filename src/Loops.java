public class Loops {

    public static void main(String[] args) {

        System.out.println("Hello");

        for (int i=50; i<56; i++) {
            System.out.println(i*3);
        }

        int[] numbers = {12,5,6,7,8,10};
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int counter=0;
        while(counter <10) {
            System.out.println("Hello");
            counter++;
        }

        System.out.println("Finished");

        int[] numbers2 = {12,5,6,7,8,10};

        int counter2=0;
        while(numbers2[counter2] < 7) {
            System.out.println(numbers2[counter2]);
            counter2++;
        }

    }

}
