class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        boolean visited[] = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        int src = 0;
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        q.add(src);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            list.add(curr);
            
            for(int x : adj.get(curr)){
                if(!visited[x]){
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
        return list;
    }
}