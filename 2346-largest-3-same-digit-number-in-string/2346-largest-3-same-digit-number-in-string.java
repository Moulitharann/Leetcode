class Solution {
    public String largestGoodInteger(String num) {

        if (num == null || num.isEmpty()) {
            return "";
        }

        ArrayList<String> list = new ArrayList<>();
        String res = "";

        for (int i = 0; i < num.length(); i++) {
            res = "";
            for (int j = i + 1; j < i + 4; j++) {
                if (j < num.length() && num.charAt(i) == num.charAt(j)) {
                    res += num.substring(i, j);
                    if (j == (i + 2)) {
                        list.add(num.substring(i, i + 3));
                    }
                } else {
                    break;
                }
            }
        }

        return list.stream()
                .filter(s -> s.matches("\\d+"))
                .max(Comparator.comparingInt(Integer::parseInt))
                .orElse("");
    }
}
