class OrderedStream {

    int ptr;
    String [] result;
    public OrderedStream(int n) {
        ptr = 0;
        result = new String [n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<String>();
        result[idKey-1] = value;
        
        while (ptr < result.length && result[ptr] != null) {    
            list.add(result[ptr]);
            ptr++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */