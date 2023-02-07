import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberBase nb = new NumberBase();
        nb.addPropertyChangeListener(new HexaObserver());
        nb.addPropertyChangeListener(new OctalObserver());
        nb.addPropertyChangeListener(new BinaryObserver());
        nb.addPropertyChangeListener(new AsciiObserver());

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your desired three numbers separated with a comma: ");
        String typedNums = sc.nextLine();
        String[] numbers = typedNums.split(",");
        

        int index = 0;
        while (index < numbers.length){
            int typedNum = Integer.parseInt(numbers[index]);
            if(typedNum < 97 || typedNum > 122){
                System.out.println("Your given input should be between the range of 97 and 122");
                break;
            }
            nb.setValue(typedNum);
            index++;
        }
    }
}