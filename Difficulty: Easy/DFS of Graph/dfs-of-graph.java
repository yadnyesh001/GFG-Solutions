class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        boolean visited[] = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();
        dfsRec(adj, visited, 0, res);
        return res;
    }
    
    static void dfsRec(ArrayList<ArrayList<Integer>> adj,
           boolean[] visited, int s, ArrayList<Integer> res)
    {
        visited[s] = true;
        res.add(s);

        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i, res);
            }
        }
    }
}