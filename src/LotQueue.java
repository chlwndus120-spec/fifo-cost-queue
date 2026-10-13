public class LotQueue {
    Node head;
    Node tail;

    public void enqueue(int qnt,int unitCost){
        Node node=new Node();
        node.qnt=qnt;
        node.unitCost=unitCost;

        if(head==null){
            head=node;
            tail=head;
        }else{
            tail.next=node;
            tail=node;
        }
    }

    public void dequeue(){
        if(head==null) return;
        head=head.next;
        if(head==null){
            tail=null;
        }
    }

    public int getSaleCost(int sale){
        int cost=0;

        int total=0;
        Node cur=head;

        while(cur!=null){
            total+=cur.qnt;
            cur=cur.next;
        }
        if(total<sale) return -1;

        while(sale>0){
            if(head.qnt<=sale){
                cost+=head.unitCost*head.qnt;
                sale-=head.qnt;
                dequeue();
            }else{
                cost+=sale*head.unitCost;
                head.qnt-=sale;
                sale=0;
            }
        }
        return cost;
    }
}
