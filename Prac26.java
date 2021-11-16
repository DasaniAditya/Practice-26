// Two City Scheduling 

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        if(costs == null || costs.length == 0) {
            return 0;
        }
        Arrays.sort(costs, (a,b) -> (a[0] - a[1]) - (b[0] - b[1]));
        int result = 0;
        int n = costs.length;
        System.out.println(Arrays.deepToString(costs));
        for(int i = 0; i < n; i++) {
            if(i < n/2) {
                result += costs[i][0];
            } else {
                result += costs[i][1];
            }
        }
        return result;
    }
}


//Decode Slanted Cipher

class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(encodedText == null || encodedText.length() == 0) {
            return "";
        }
        int cols = encodedText.length() / rows;
        int idx = 0;
        char[][] matrix = new char[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = encodedText.charAt(idx++);
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < matrix[0].length; j++) {
            int i = 0;
            int temp = j;
            while(i < matrix.length && temp < matrix[0].length) {
                sb.append(matrix[i][temp]);
                i++;
                temp++;
            }
        }
        String ans = sb.toString();
        int j = ans.length()-1;
        while(ans.charAt(j) == ' ') {
            j--;
        }
        return ans.substring(0, j + 1);
    }
}