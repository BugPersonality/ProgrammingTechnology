class Alphabet {
    public static void main(String[] args) {
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            count += 1;
            if (count % 5 == 0) {
                System.out.print(i + "\n");
            }
            else {
                System.out.print(i + " ");
            }
            
        }
    }
}
