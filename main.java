public class main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(11);

        graph.tambahKota("Paris");
        graph.tambahKota("Brussels ");
        graph.tambahKota("Bristol");
        graph.tambahKota("Zurich");
        graph.tambahKota("Amsterdam");
        graph.tambahKota("Vienna");
        graph.tambahKota("Prague");
        graph.tambahKota("Hamburg");
        graph.tambahKota("Hamburg");
        graph.tambahKota("Warsaw");
        graph.tambahKota("Warsaw");
        graph.tambahKota(" Budapest"); 
        


        

        graph.tambahJalur("paris", "Brussels");
        graph.tambahJalur("paris", "Brussels");
        

        System.out.println();
        graph.bfs("Paris");

        System.out.println();
        graph.dfs("Paris");
    }
}
