package graph;

public interface Graph {
   
     /**
	 * Adds the specified edge to this graph, going from the origin to the end of the vertex.
	 * @param start
	 * @param end
	 * @param edge
	 * @return boolean to see if it has been succesfully uploaded
	 */
   
    public boolean addEdgeToGraph(Vertex start, Vertex end, Edge edge);
     /**
	 * Adds the specified vertex to the graph
	 * @param vertex
	 * @return boolean to see if it has been succesfully uploaded
	 */
    
    public boolean addVertexToGraph(Vertex vertex);
    
    /**
   *  Returns true if v is a valid vertex number; false otherwise.
   *  @param v the vertex.
   *  @return boolean indicating existence of vertex number v.
   */
  public boolean validVertex(Vertex v);
    /**
     * checks if the edge is directed or undirected
     * @param edge
     * @returns edge
     */
    
    
    public boolean isDirected( Edge edge);
    /**
	 * Returns true if this graph contains the specified edge.
	 * @param edge
	 * @return boolean
	 */
    public boolean containsEdge( Edge edge );
    /**
     * returns the edge making the connection start to end
     * @param start
     * @param end
     * @returns edge
     */
     public Edge getEdge(Vertex start, Vertex end);
     
    /**
   *  Deletes the edge (origin, destination).  If the edge existed, decrements
   *    the edge count.
   *  @param end the origin vertex.
   *  @param start the destination vertex.
   */
  public void removeEdge(Vertex end, Vertex start);
     /**
   *  Returns true if edge (origin, destination) exists; false otherwise.
   *  @param start the origin vertex.
   *  @param end the destination vertex.
   *  @return boolean indicating the presence of edge (origin, destination).
   */
  public boolean hasEdge(Vertex end, Vertex start) ;    
        
 }    