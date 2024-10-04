class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         ArrayList<Integer> sortedList = new ArrayList<>();
        ArrayList<Integer> unsortedList = new ArrayList<>();
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
          for (int num : arr2) {
            if (frequencyMap.containsKey(num)) {
                for (int i = 0; i < frequencyMap.get(num); i++) {
                    sortedList.add(num);
                }
                frequencyMap.remove(num); 
            }
        }
        
        for (int num : frequencyMap.keySet()) {
            for (int i = 0; i < frequencyMap.get(num); i++) {
                unsortedList.add(num);
            }
        }
        
        unsortedList.sort(null);
        
        sortedList.addAll(unsortedList);
        int res[]=new int[sortedList.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=sortedList.get(i);
        }
        return res;
    }
}