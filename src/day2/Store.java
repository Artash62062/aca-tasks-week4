package day2;

public class Store {
    int countOfWorkers;
    String name;
    String phoneNum;
    int [] productNumbers;

    public Store() {
    }

    public Store(int countOfWorkers, String name, String phoneNum, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNum = phoneNum;
        this.productNumbers = productNumbers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if(countOfWorkers<2||countOfWorkers>50) {
            System.out.println("We dont have such space in office");
            return;
        }
        this.countOfWorkers = countOfWorkers;
    }

    public void setName(String name) {
        if(name.length()<3){
            System.out.println("name must have at last 3 characters");
            return;
        }
        this.name = name;
    }

    public boolean sellProduct (int productNum) {
        for (int productNumber : productNumbers) {
            if (productNum == productNumber) {
                return true;
            }
        }
        return false;
    }

    public void setPhoneNum(String phoneNum) {
        if(!isPhoneNumValid(phoneNum)) {
            System.out.println("Invalid Phone Num");
        }
        this.phoneNum = phoneNum;
    }

    public void setProductNumbers(int[] productNumbers) {
        this.productNumbers = productNumbers;
    }

    private static boolean isPhoneNumValid(String phoneNum){
        for (int i = 0; i < phoneNum.length(); i++) {
            if(!Character.isDigit(phoneNum.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
