class Solution {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        String[][] map = new String[park.length][park[0].length()];


        for (int i = 0; i < park.length; i++) {
            String[] str = park[i].split("");

            for (int j = 0; j < str.length; j++) {
                map[i][j] = str[j];

                if ("S".equals(map[i][j])) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }


        for (String route : routes) {
            String[] temp = route.split(" ");
            int number = Integer.parseInt(temp[1]);

            int x = answer[0];
            int y = answer[1];
            while (number != 0) {
                if ("N".equals(temp[0])) {
                    if (validatePosition(map, x - 1, y)) {
                        x -= 1;
                    } else {
                        x = answer[0];
                        break;
                    }
                } else if ("S".equals(temp[0])) {
                    if (validatePosition(map, x + 1, y)) {
                        x += 1;
                    } else {
                        x = answer[0];
                        break;
                    }
                } else if ("W".equals(temp[0])) {
                    if (validatePosition(map, x, y - 1)) {
                        y -= 1;
                    } else {
                        y = answer[1];
                        break;
                    }
                } else if ("E".equals(temp[0])) {
                    if (validatePosition(map, x, y + 1)) {
                        y += 1;
                    } else {
                        y = answer[1];
                        break;
                    }
                }

                number -= 1;
            }

            answer[0] = x;
            answer[1] = y;
        }

        return answer;
    }

    private static boolean validatePosition(String[][] map, int x, int y) {
        if (0 > x || x >= map.length || 0 > y || y >= map[0].length) {
            return false;
        }

        return !"X".equals(map[x][y]);
    }
}