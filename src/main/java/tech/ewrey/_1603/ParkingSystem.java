package tech.ewrey._1603;

public class ParkingSystem {

    int bigCounter;
    int mediumCounter;
    int smallCounter;

    public ParkingSystem(int big, int medium, int small) {
        this.bigCounter = big;
        this.mediumCounter = medium;
        this.smallCounter = small;
    }

    public boolean addCar(int carType) {
        return switch (carType) {
            case 1 -> {
                if (bigCounter > 0) {
                    bigCounter--;
                    yield true;
                } else yield false;
            }

            case 2 -> {
                if (mediumCounter > 0) {
                    mediumCounter--;
                    yield true;
                } else yield false;
            }

            case 3 -> {
                if (smallCounter > 0) {
                    smallCounter--;
                    yield true;
                } else yield false;
            }

            default -> false;
        };
    }

}
