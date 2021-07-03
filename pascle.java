class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] row = new Integer[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++) {
                row[j] = tri.get(i - 1).get(j - 1) + tri.get(i - 1).get(j);
            }
            tri.add(Arrays.asList(row));
        }
        return tri;
    }
}