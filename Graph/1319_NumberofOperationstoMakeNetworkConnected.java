class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }
        for(int [] c: connections) {
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(c[0]);
        }
        boolean[] connected = new boolean[n];
        int components = 0;

        for(int i=0;i<n;i++) {
            if(!connected[i]) {
                dfs(i, graph, connected);
                components++;
            }
        }
        return components-1;
    }
    private void dfs(int node, List<List<Integer>> graph, boolean[] connected) {
        connected[node] = true;
        for(int v: graph.get(node)) {
            if(!connected[v]) {
                dfs(v, graph, connected);
            }
        }
    }
}