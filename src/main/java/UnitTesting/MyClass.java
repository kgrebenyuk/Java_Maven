package UnitTesting;

public class MyClass {
    //public double [] arrayOfdouble;
    private double sumOfArray = 0;

    public double averageOfArray(double [] arrayOfdouble ){
        for (double i : arrayOfdouble){
                 sumOfArray += i;
        }
        return sumOfArray / arrayOfdouble.length;
    }

    public boolean ifMatrixIsSquare(int array[][]){

        if(array.length == array[0].length){
            return true;
        }
        else{
            return false;
        }
    }
}

