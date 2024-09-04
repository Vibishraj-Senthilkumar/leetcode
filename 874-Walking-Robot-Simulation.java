class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] ans = new int[2];
        int max = 0;

        // Start facing North
        boolean isNorth = true;
        boolean isEast = false;
        boolean isWest = false;
        boolean isSouth = false;

        // Store obstacles in a set for quick lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int i = 0; i < commands.length; i++) {
            if (isNorth) {
                if (commands[i] == -1) {
                    isEast = true;
                    isNorth = false;
                } else if (commands[i] == -2) {
                    isWest = true;
                    isNorth = false;
                } else {
                    for (int step = 0; step < commands[i]; step++) {
                        if (!obstacleSet.contains(ans[0] + "," + (ans[1] + 1))) {
                            ans[1] += 1; // Move north
                        } else {
                            break;
                        }
                    }
                }
            } else if (isEast) {
                if (commands[i] == -1) {
                    isSouth = true;
                    isEast = false;
                } else if (commands[i] == -2) {
                    isNorth = true;
                    isEast = false;
                } else {
                    for (int step = 0; step < commands[i]; step++) {
                        if (!obstacleSet.contains((ans[0] + 1) + "," + ans[1])) {
                            ans[0] += 1; // Move east
                        } else {
                            break;
                        }
                    }
                }
            } else if (isSouth) {
                if (commands[i] == -1) {
                    isWest = true;
                    isSouth = false;
                } else if (commands[i] == -2) {
                    isEast = true;
                    isSouth = false;
                } else {
                    for (int step = 0; step < commands[i]; step++) {
                        if (!obstacleSet.contains(ans[0] + "," + (ans[1] - 1))) {
                            ans[1] -= 1; // Move south
                        } else {
                            break;
                        }
                    }
                }
            } else if (isWest) {
                if (commands[i] == -1) {
                    isNorth = true;
                    isWest = false;
                } else if (commands[i] == -2) {
                    isSouth = true;
                    isWest = false;
                } else {
                    for (int step = 0; step < commands[i]; step++) {
                        if (!obstacleSet.contains((ans[0] - 1) + "," + ans[1])) {
                            ans[0] -= 1; // Move west
                        } else {
                            break;
                        }
                    }
                }
            }
            max = Math.max(max, (ans[0] * ans[0]) + (ans[1] * ans[1]));
        }
        return max;
    }
}
