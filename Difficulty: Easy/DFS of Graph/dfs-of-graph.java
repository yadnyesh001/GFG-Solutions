//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(adj);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfsResult = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfs(0, adj, visited, dfsResult);
        return dfsResult;
    }
    
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsResult) {
        visited[node] = true;
        dfsResult.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, dfsResult);
            }
        }
    }
}