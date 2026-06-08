class infiniteNumberSequence{

    public long psi(int k){
        long p = 1;
        for(int i=0;i<k;i++) p *= 10; 
        return (100L - k*p + (k-1)*p*10) / 90;
    }

    public int K(long n){
        int i = 2;
        while(n >= psi(i)){
            i++;
        }
        return i-1;
    }

    public long NF(long n, int k){
        return (n - (n - psi(k)) % k);
    }

    public int findNthDigit(int n) {

        if(n < 10) return n;

        long N = n;

        int k = K(N);
        long Nf = NF(N, k);
        long Psi = psi(k);

        long number = (long)Math.pow(10, k-1) + (Nf - Psi)/k;

        String Df = Long.toString(number);

        return Df.charAt((int)(n - Nf)) - '0';
    }
}