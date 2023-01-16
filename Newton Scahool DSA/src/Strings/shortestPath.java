package Strings;

public class shortestPath {
    public static float calShortestPath( String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            } else if (dir == 'W') {
                x--;
            }else {
                x++;
            }
        }
        int Y2 = y*y;
        int X2 = x*x;
        return (float) Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(calShortestPath(path));
    }
}
