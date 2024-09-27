class MyCalendarTwo {
    TreeMap<Integer, Integer> calcy;

    public MyCalendarTwo() {
        calcy = new TreeMap<>();
    }

    public boolean book(int start, int end) {
         calcy.put(start, calcy.getOrDefault(start, 0) + 1);
        calcy.put(end, calcy.getOrDefault(end, 0) - 1);
        
       
        int activeEvents = 0;
        for (int val : calcy.values()) {
            activeEvents += val;
            if (activeEvents >= 3) {
                
                calcy.put(start, calcy.get(start) - 1);
                calcy.put(end, calcy.get(end) + 1);
                
                if (calcy.get(start) == 0) calcy.remove(start);
                if (calcy.get(end) == 0) calcy.remove(end);
                
                return false;
            }
        }
        return true;
    }
}
