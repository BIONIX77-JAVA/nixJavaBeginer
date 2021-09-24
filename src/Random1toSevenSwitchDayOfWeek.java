public class Random1toSevenSwitchDayOfWeek {
    public static void main(String[] args) {
        final int min = 1;
        final int max = 7;
        final int numToSwitch = rndNum(min, max);
        switch (numToSwitch) {
            case 1:
                System.out.println("This day is Monday");
                break;
            case 2:
                System.out.println("This day is Tuesday");
                break;
            case 3:
                System.out.println("This day is Wednesday");
                break;
            case 4:
                System.out.println("This day is Thursday");
                break;
            case 5:
                System.out.println("This day is Friday");
                break;
            case 6:
                System.out.println("This day is Saturday");
                break;
            case 7:
                System.out.println("This day is Sunday");
                break;
            default:
                break;
        }
    }

    private static int rndNum(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
