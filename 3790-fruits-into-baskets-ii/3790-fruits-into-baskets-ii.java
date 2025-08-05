

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> fruit = Arrays.stream(fruits)
                                    .boxed()
                                    .collect(Collectors.toList());

        List<Integer> basket = Arrays.stream(baskets)
                                     .boxed()
                                     .collect(Collectors.toList());

        int i = 0, j = 0;

        while (i < fruit.size()) {
            if (basket.isEmpty()) break;

            if (j >= basket.size()) {
                i++;
                j = 0;
                continue;
            }

            if (fruit.get(i) <= basket.get(j)) {
                basket.remove(j); // remove basket
                fruit.remove(i);  // remove fruit
                j = 0;
                i = 0; // restart from beginning
            } else {
                j++;
            }
        }

        return fruit.size();
    }
}
