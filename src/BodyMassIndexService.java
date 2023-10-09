public class BodyMassIndexService {
    public int calculate(int mass, int heightAnotherType){

        int heightTwoTimes = heightAnotherType * heightAnotherType;
        int bmi = mass / heightTwoTimes;

        return bmi;
    }

}
