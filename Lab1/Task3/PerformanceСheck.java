class PerformanceСheck {
    public static void main(String[] args) {
        long begin = new java.util.Date().getTime();
        long i = 0;
        while (i < 100000000) {
            i += 1;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);
    }
}
