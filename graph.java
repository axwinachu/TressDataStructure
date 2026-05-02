import java.util.ArrayList;

class graph{
    class edges{
        int source;
        int destination;
        edges(int source,int destination){
            this.source=source;
            this.destination=destination;
        }
        public void createGraph(ArrayList<edges>[] garph,int size){
           for(int i=0;i<size;i++){ 
            garph[i]=new ArrayList<>();
           }

           garph[0].add(new edges(0,2));
        }
    }

    public static void main(String[] args) {
        ArrayList<graph>[] graph=new ArrayList[4];
        
    }
}