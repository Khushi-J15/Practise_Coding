class Exponent {

    public static void main(String[] args){
        System.out.print(myPow(2.0, 10));
    }

    public static double myPow(double x, int n) {
        long exp = n;  // use long to avoid overflow
        if(exp < 0){
            x = 1 / x;
            exp = -exp;
        }

        return pow(x , exp);

    }

    public static double pow(double base, long exp){

        double res = 1.0;

        while(exp > 0){
            if(exp % 2 == 1) res = res * base;
            base = base * base;
            exp /= 2;
        }

        return res;
    }
}
