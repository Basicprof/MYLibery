public class Graph {

    //максимальное количество вершин в графе
    private final int VERTEX_MAX = 100;
    //массив для хранения вершин
    private Vertex[] vertexList;
    //текущее количество вершин в графе
    private int vertexCount;
    //матрица смежности
    private int[][] matrix;

    public Graph()
    {
        matrix = new int[VERTEX_MAX][VERTEX_MAX];
        //перед началом работы заполняем матрицу смежности нулями
        for(int i = 0; i < VERTEX_MAX; i++)
            for(int j = 0; j < VERTEX_MAX; j++)
                matrix[i][j] = 0;
        vertexCount = 0;
        vertexList = new Vertex[VERTEX_MAX];
    }


    //добавление вершины
    public void addVertex(String label)
    {
        vertexList[vertexCount++] = new Vertex(label);
    }

    //добавление ребра
    public void addEdge(int begin, int end)
    {
        matrix[begin][end] = 1;
        matrix[end][begin] = 0;
    }
}