public class shortestpath {
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    }

    public static double getshortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }
        return Math.sqrt((x * x) + (y * y));
    }

}
