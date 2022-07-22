public class Fibonacci {
    private int length;
    public int [] sequence;

    public Fibonacci (int _length){
        length = _length;
        sequence = new int[_length];
    }

    public void generate(){
        int a = 0, b = 0, sum = 1;

        for(int i = 0; i < length; i++){
            b = sum;
            sum = sum + a;
            a = b;
            sequence[i] = a;
        }

        for (Integer element : sequence) {
            System.out.print(element + " ");
        }
    }

}
