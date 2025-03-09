public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int sec=seconds%60;
        int minute=seconds/60;
        int min=minute%60;
        int hour=minute/60;
        return String.format("%02d:%02d:%02d",hour,min,sec);
    }
}