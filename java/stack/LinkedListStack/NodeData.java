package DataStructures.Stack.LinkedListStack;

public class NodeData {
    private int number;

    public NodeData(int num){
        this.number = num;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        this.number=num;
    }

    public int compareTo(NodeData nodeData){
        return Integer.compare(this.number, nodeData.number);
//        OR...
/*
        if (nodeData.number == this.number) return 0;
        if (nodeData.number > this.number) return  -1;
        if (nodeData.number < this.number) return 1;
*/
    }

    @Override
    public String toString() {
        return "NodeData{" +
                "number=" + number +
                '}';
    }
}
