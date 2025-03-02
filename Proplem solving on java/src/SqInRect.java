import java.util.ArrayList;
import java.util.List;
public class SqInRect {
    public static List<Integer> sqInRect(int lng, int width) {
        if (lng==width) return null;
        ArrayList<Integer> List= new ArrayList<>();
        while (lng != width){
            if (lng>width){
                List.add(width);
                lng=lng-width;
            }else {
                List.add(lng);
                width=width-lng;
            }
        }
        List.add(lng);

        return List;
    }
}
