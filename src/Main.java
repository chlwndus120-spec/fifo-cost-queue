//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        LotQueue lotQueue=new LotQueue();
        lotQueue.enqueue(50,5000);
        lotQueue.enqueue(50,5500);

        System.out.println(lotQueue.getSaleCost(70));
        System.out.println(lotQueue.head.qnt);

        System.out.println(lotQueue.getSaleCost(20));
        System.out.println(lotQueue.head.qnt);

        System.out.println(lotQueue.getSaleCost(100)); // -1 (10개밖에 없음)
        System.out.println(lotQueue.head.qnt);

        LotQueue empty=new LotQueue();
        System.out.println(empty.getSaleCost(100));
    }
}