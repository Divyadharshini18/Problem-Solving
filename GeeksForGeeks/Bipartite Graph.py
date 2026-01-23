from collections import deque
class Solution:
    def isBipartite(self, V, edges):
        # code here
        adj=[ [] for _ in range(V) ]
        for u,v in edges:
            adj[u].append(v)
            adj[v].append(u)
        co=[-1]*V
        for i in range(V):
            if co[i]==-1:
                if not self.dfs(i,0,adj,co):
                    return False
        return True
        
    def dfs(self,ver,c,adj,co):
        co[ver]=c
        for a in adj[ver]:
            if co[a]==-1:
                if not self.dfs(a,1-c,adj,co):
                    return False
            elif co[a]==c:
                return False
        return True