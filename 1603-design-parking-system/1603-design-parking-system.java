class ParkingSystem {
    
    private int[] spacesEvailable = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        spacesEvailable[0] = big;
        spacesEvailable[1] = medium;
        spacesEvailable[2] = small;
    }
    
    public boolean addCar(int carType) {
        if (spacesEvailable[carType-1] == 0) 
            return false;
        spacesEvailable[carType-1]--;
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */